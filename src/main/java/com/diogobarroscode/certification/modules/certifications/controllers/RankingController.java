package com.diogobarroscode.certification.modules.certifications.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diogobarroscode.certification.modules.certifications.useCases.Top10RankingUseCase;
import com.diogobarroscode.certification.modules.students.entities.CertificationStudentEntity;

@RestController
@RequestMapping("/ranking")
public class RankingController {

	@Autowired
	private Top10RankingUseCase top10RankingUseCase;
	
	public List<CertificationStudentEntity> top10(){
		return this.top10RankingUseCase.execute();
	}
	
}
