package kr.board.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import kr.board.entity.Board;

@Mapper // Mapper 로 인식하기 위한 어노테이션
public interface BoardMapper {
	
	@Select("SELECT * FROM  BOARD ORDER BY INDATE DESC")
	public ArrayList<Board> boardList();

	@Insert("INSERT INTO BOARD(TITLE, CONTENTS, WRITER) VALUES(#{title}, #{contents}, #{writer})")
	public void boardInsert(Board vo);
	
	@Select("SELECT * FROM BOARD WHERE IDX = #{idx}")
	public Board boardContents(int idx);
	
}
