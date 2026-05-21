package com.sd.app.board.service;

import com.sd.app.board.dto.BoardCreateRequestDTO;
import com.sd.app.board.dto.BoardDetailResponseDTO;
import java.util.List;

// 게시판 서비스 인터페이스
public interface BoardService {
    BoardDetailResponseDTO createBoard(BoardCreateRequestDTO request);
    List<BoardDetailResponseDTO> getAllBoards();
    BoardDetailResponseDTO getBoardById(Long id);
    BoardDetailResponseDTO updateBoard(Long id, BoardCreateRequestDTO request);
    void deleteBoard(Long id);
}
