import React, { useEffect, useState } from 'react';
import { getBoardById } from '../api/board';
import { useParams } from 'react-router-dom';

const BoardDetailPage: React.FC = () => {
    const { id } = useParams<{ id: string }>();
    const [board, setBoard] = useState(null);

    useEffect(() => {
        const fetchData = async () => {
            const result = await getBoardById(id);
            setBoard(result);
        };
        fetchData();
    }, [id]);

    if (!board) {
        return <div>Loading...</div>;
    }

    return (
        <div>
            <h1>{board.title}</h1>
            <p>{board.content}</p>
            <p>작성자: {board.writerId}</p>
        </div>
    );
};

export default BoardDetailPage;
