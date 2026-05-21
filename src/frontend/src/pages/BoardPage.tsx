import React, { useEffect, useState } from 'react';
import { getBoards } from '../api/board';

const BoardPage: React.FC = () => {
    const [boards, setBoards] = useState([]);

    useEffect(() => {
        const fetchData = async () => {
            const result = await getBoards();
            setBoards(result);
        };
        fetchData();
    }, []);

    return (
        <div>
            <h1>게시판 목록</h1>
            <ul>
                {boards.map(board => (
                    <li key={board.id}>{board.title}</li>
                ))}
            </ul>
        </div>
    );
};

export default BoardPage;
