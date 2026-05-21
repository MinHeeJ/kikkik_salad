package com.sd.app.board.service.impl;

import com.sd.app.board.dto.BoardCreateRequestDTO;
import com.sd.app.board.dto.BoardDetailResponseDTO;
import com.sd.app.board.mapper.BoardMapper;
import com.sd.app.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// 게시판 서비스 구현
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public BoardDetailResponseDTO createBoard(BoardCreateRequestDTO request) {
        boardMapper.insertBoard(request);
        return boardMapper.getBoardById(request.getId());
    }

    @Override
    public List<BoardDetailResponseDTO> getAllBoards() {
        return boardMapper.getAllBoards().stream()
                .sorted((b1, b2) -> b2.getCreatedAt().compareTo(b1.getCreatedAt()))
                .collect(Collectors.toList());
    }

    @Override
    public BoardDetailResponseDTO getBoardById(Long id) {
        return boardMapper.getBoardById(id);
    }

    @Override
    public BoardDetailResponseDTO updateBoard(Long id, BoardCreateRequestDTO request) {
        BoardDetailResponseDTO existingBoard = getBoardById(id);
        if (existingBoard == null || !existingBoard.getWriterId().equals(request.getWriterId())) {
            return null;  // 타인의 게시글 수정을 시도한 경우 실패 반환
        }
        boardMapper.updateBoard(id, request);
        return getBoardById(id);
    }

    @Override
    public void deleteBoard(Long id) {
        boardMapper.softDeleteBoard(id);
    }
}
