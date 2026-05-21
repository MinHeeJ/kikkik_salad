package com.sd.app.board.service.impl;

import com.sd.app.board.dto.BoardDTO;
import com.sd.app.board.service.BoardService;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

// 게시판 서비스 구현
public class BoardServiceImpl implements BoardService {

    private List<BoardDTO> boardList = new ArrayList<>();

    @Override
    public BoardDTO createBoard(BoardDTO boardDTO) {
        boardDTO.setId((long) (boardList.size() + 1));
        boardDTO.setCreatedAt(LocalDateTime.now());
        boardDTO.setUpdatedAt(LocalDateTime.now());
        boardList.add(boardDTO);
        return boardDTO;
    }

    @Override
    public List<BoardDTO> getAllBoards() {
        return new ArrayList<>(boardList);
    }

    @Override
    public BoardDTO getBoardById(Long id) {
        return boardList.stream()
                .filter(board -> board.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public BoardDTO updateBoard(Long id, BoardDTO boardDTO) {
        BoardDTO existingBoard = getBoardById(id);
        if (existingBoard != null) {
            existingBoard.setTitle(boardDTO.getTitle());
            existingBoard.setContent(boardDTO.getContent());
            existingBoard.setUpdatedAt(LocalDateTime.now());
        }
        return existingBoard;
    }

    @Override
    public void deleteBoard(Long id) {
        boardList.removeIf(board -> board.getId().equals(id));
    }
}
