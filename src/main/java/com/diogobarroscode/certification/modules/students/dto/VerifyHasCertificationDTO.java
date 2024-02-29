package com.diogobarroscode.certification.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VerifyHasCertificationDTO {

	private String email;
	private String technology;
	
}
