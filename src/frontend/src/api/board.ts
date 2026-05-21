import axios from 'axios';

const BASE_URL = '/api/boards';

export const getBoards = async () => {
    const response = await axios.get(BASE_URL);
    return response.data;
}

export const getBoardById = async (id: string) => {
    const response = await axios.get(`${BASE_URL}/${id}`);
    return response.data;
}

export const createBoard = async (board: any) => {
    const response = await axios.post(BASE_URL, board);
    return response.data;
}

export const updateBoard = async (id: string, board: any) => {
    const response = await axios.put(`${BASE_URL}/${id}`, board);
    return response.data;
}

export const deleteBoard = async (id: string) => {
    await axios.delete(`${BASE_URL}/${id}`);
}
