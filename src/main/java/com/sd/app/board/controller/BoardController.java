package com.sd.app.board.controller;

import com.sd.app.board.dto.BoardCreateRequestDTO;
import com.sd.app.board.dto.BoardDetailResponseDTO;
import com.sd.app.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 게시판 REST API 컨트롤러
@RestController
@RequestMapping("/api/boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping
    public ResponseEntity<BoardDetailResponseDTO> createBoard(@RequestBody BoardCreateRequestDTO request) {
        BoardDetailResponseDTO createdBoard = boardService.createBoard(request);
        return new ResponseEntity<>(createdBoard, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BoardDetailResponseDTO>> getAllBoards() {
        List<BoardDetailResponseDTO> boards = boardService.getAllBoards();
        return new ResponseEntity<>(boards, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BoardDetailResponseDTO> getBoardById(@PathVariable Long id) {
        BoardDetailResponseDTO board = boardService.getBoardById(id);
        return board != null ? new ResponseEntity<>(board, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BoardDetailResponseDTO> updateBoard(@PathVariable Long id, @RequestBody BoardCreateRequestDTO request) {
        BoardDetailResponseDTO updatedBoard = boardService.updateBoard(id, request);
        return updatedBoard != null ? new ResponseEntity<>(updatedBoard, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBoard(@PathVariable Long id) {
        boardService.deleteBoard(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
