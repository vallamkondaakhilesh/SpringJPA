package com.dxc.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.beans.Exam;
import com.dxc.respository.ExamRepository;

@Controller
public class ExamController {
	@Autowired
	ExamRepository examRepository;
	
	
	@RequestMapping("displayexam")
	public ModelAndView displaystudents() {
		ModelAndView modelAndView = new ModelAndView("displayexam");
		List<Exam> exams = (List<Exam>) examRepository.findAll();
		modelAndView.addObject("exam", exams);
		return modelAndView;

	}
	@RequestMapping("addexam")
	public String newexamform() {
		return "addexam";
	}
	@RequestMapping("saveexam")
	public String addExam(@RequestParam("id") String id, @RequestParam("name") String name)
			throws ParseException {
		Exam exam = new Exam(id, name);
		examRepository.save(exam);
		return "redirect:/displayexam";
	}
	@RequestMapping("editexam")
	public String editexamform() {
		return "editexam";
	}

	@RequestMapping("updateexam")
	public String update(@RequestParam("id") String id, @RequestParam("name") String name
			) throws ParseException {
		Exam exam = new Exam(id, name);
		examRepository.save(exam);
		return "redirect:/displayexam";
	}

	@RequestMapping("examdelete")
	public String deleteExam(@RequestParam("id") String id) {
		examRepository.deleteById(id);
		return "redirect:/displayexam";
	}
}
