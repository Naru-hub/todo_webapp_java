package com.example.webapp.service;

import java.util.List;

import com.example.webapp.entity.ToDo;

/**
 * ToDo:サービス
 */
public interface ToDoService {
	/**
	 * 全「すること」を検索
	 */
	List<ToDo> findAllToDo();

	/**
	 * 指定されたIDの「すること」を検索
	 */
	ToDo findByIdToDo(Integer id);

	/**
	 * 「すること」を新規登録
	 */
	void insertToDo(ToDo toDo);

	/**
	 * 「すること」を更新
	 */
	void updateToDo(ToDo toDo);

	/**
	 * 指定されたIDの「すること」を削除
	 */
	void deleteToDo(Integer id);

}
