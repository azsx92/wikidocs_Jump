package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
/*
	sbb%: "sbb"로 시작하는 문자열
	%sbb: "sbb"로 끝나는 문자열
	%sbb%: "sbb"를 포함하는 문자열
	*/
	@Test
	void testJpa() {
		assertEquals(2 , this.questionRepository.count());
		 Optional<Question> oq = this.questionRepository.findById(1);
		 assertTrue(oq.isPresent());
		 Question q = oq.get();
		 this.questionRepository.delete(q);
		assertEquals(1, this.questionRepository.count());

	}


}
