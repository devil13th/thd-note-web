package com.thd.note.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thd.note.pojo.Note;
import com.thd.note.service.NoteService;
import com.thd.util.dao.JdbcDao;
import com.thd.util.repository.EntityDao;
@Service
@Transactional
public class NoteServiceImpl implements NoteService {
	@Resource
	private EntityDao entityDao;
	
	@Resource
	private JdbcDao jdbcDao;
	
	
	
	@Override
	 @Transactional(readOnly = true)
	public Note queryNoteById(String id) {
		return (Note)this.entityDao.queryById(Note.class, id);
	}
	@Override
	@Transactional(readOnly = true)
	public List queryNote(){
		return this.jdbcDao.query("select id as id ,title as tit ,content as con ,create_date as crd from note", null,null);
		//return this.jdbcTemplate.queryForList("select id as id ,title as tit ,content as con ,create_date as crd from note");
	}
	
	
	@Override
	public void saveNote(Note note){
		this.entityDao.add(note);
		System.out.println(this.entityDao);
		for(int i = 0 , j = 10 ; i < j ; i++){
			Note n = new Note();
			n.setTitle("tit_" + i);
			n.setContent("content_" + i);
			this.entityDao.add(n);
			if(i == 5){
				//throw new RuntimeException("is 5 !");
			}
			
		}
	}
	@Override
	public void deleteNote(String id){
		this.entityDao.delete(this.queryNoteById(id));
	};
	
	@Override
	public void testTransaction(String id){
		for(int i = 0 , j = 10 ; i < j ; i++){
			Note n = new Note();
			n.setTitle("tit_" + id + "_" + i);
			n.setContent("content_" + id + "_" + i);
			this.entityDao.add(n);
		}
		
		double a = Math.random();
		System.out.println(a);
		if( a > 0.5){
			throw new RuntimeException("随机数 > 0.5 !");
		}
		
		
		this.deleteNote(id);
	};
	
	

}
