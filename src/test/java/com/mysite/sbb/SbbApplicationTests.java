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

	@Autowired
	private AnswerRepository answerRepository;

/*
	sbb%: "sbb"로 시작하는 문자열
	%sbb: "sbb"로 끝나는 문자열
	%sbb%: "sbb"를 포함하는 문자열
	*/
	@Test
	void testJpa() {
		 Optional<Question> oq = this.questionRepository.findById(2);
		 assertTrue(oq.isPresent());
		 Question q = oq.get();

		Answer a = new Answer();
		a.setContent("네 자동으로 생성됩니다.");
		a.setQuestion(q); //어떤 질문의 답변인지 알기위해서 Ouestion 객체가 필요하다.
	}


}
