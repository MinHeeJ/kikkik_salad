package com.sd.app.board.mapper;

import com.sd.app.board.dto.BoardCreateRequestDTO;
import com.sd.app.board.dto.BoardDetailResponseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

// MyBatis 매퍼 인터페이스
@Mapper
public interface BoardMapper {

    void insertBoard(BoardCreateRequestDTO boardCreateRequestDTO);

    List<BoardDetailResponseDTO> getAllBoards();

    BoardDetailResponseDTO getBoardById(Long id);

    void updateBoard(@Param("id") Long id, @Param("board") BoardCreateRequestDTO boardCreateRequestDTO);

    void softDeleteBoard(Long id);
}
