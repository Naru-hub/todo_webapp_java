package com.example.webapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.webapp.entity.ToDo;

/**
 * ToDo：リポジトリ
 */
@Mapper
public interface ToDoMapper {
	/**
	 * 全ての「すること」を取得
	 */
	List<ToDo> selectAll();
	
	/**
	 * 指定されたIDに対応する「すること」を取得
	 */
	ToDo selectById(@Param("id") Integer id);
	
	/**
	 * 「すること」を登録
	 */
	void insert(ToDo toDo);
	
	/**
	 * 「すること」を更新
	 */
	void update(ToDo toDo);
	
	/**
	 *  指定されたIDの「すること」を削除
	 */
	void delete(@Param("id") Integer id);
}
