package com.sd.app.board.service;

import com.sd.app.board.dto.BoardDTO;
import java.util.List;

// 게시판 서비스 인터페이스
public interface BoardService {
    BoardDTO createBoard(BoardDTO boardDTO);
    List<BoardDTO> getAllBoards();
    BoardDTO getBoardById(Long id);
    BoardDTO updateBoard(Long id, BoardDTO boardDTO);
    void deleteBoard(Long id);
}
