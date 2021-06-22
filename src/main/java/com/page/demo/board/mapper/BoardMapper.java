package com.page.demo.board.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.page.demo.board.dto.BoardDTO;

@Repository
@Mapper
public interface BoardMapper {

	@Insert("insert into board values(board_seq.nextval, #{writer}, #{title}, #{contents}, #{Wdate})")
	public void insert(BoardDTO dto);

	@Select("select * from board")
	public ArrayList<BoardDTO> list();

	@Select("select * from board where idx=#{idx}")
	public BoardDTO selectIdx(int idx);

	@Update("update board set title=#{title}, contents=#{contents} where idx=#{idx}")
	public void update(BoardDTO dto);

	@Delete("delete from board where idx=#{idx}")
	public void delete(int idx);

}
