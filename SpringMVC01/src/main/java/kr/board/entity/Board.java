package kr.board.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data // 게터 세터 자동으로 만들어줌
@AllArgsConstructor // 모든 인자를 받는 생성자를 만들어줌
@NoArgsConstructor // 기본생성자를 만들어줌
@ToString // toString 메서드 자동으로 만들어줌
public class Board {
	private int idx; // 번호
	private String title; // 제목
	private String contents; // 내용
	private String Writer; // 작성자
	private String indate; // 작성일
	private int count; // 조회수
	

}
