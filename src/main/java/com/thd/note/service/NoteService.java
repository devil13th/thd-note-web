package com.thd.note.service;

import java.util.List;

import com.thd.note.pojo.Note;
public interface NoteService {
	/**
	 * 根据id查询note
	 * @param id 主键
	 * @return
	 */
	public Note queryNoteById(String id);
	/**
	 * 查询所有note
	 * @return
	 */
	public List queryNote();
	/**
	 * 保存note
	 * @param note 实体
	 */
	public void saveNote(Note note);
	/**
	 * 根据id删除note
	 * @param id 主键
	 */
	public void deleteNote(String id);
	/**
	 * 测试事务
	 * @param id
	 */
	public void testTransaction(String id);
	
}
