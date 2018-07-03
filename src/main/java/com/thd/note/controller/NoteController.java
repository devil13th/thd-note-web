package com.thd.note.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thd.note.pojo.Note;
import com.thd.note.service.NoteService;
import com.thd.tool.bean.AjaxReturnBean;

@RestController
@RequestMapping(value="/note")
public class NoteController {
	
	@Resource
	private NoteService noteService;
	/**
	 * url http://127.0.0.1:8899/note/note/queryNote/1
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/queryNote/{id}")
	public Note queryNote(@PathVariable String id){
		System.out.println("queryNote()");
		Note note = noteService.queryNoteById(id);
		System.out.println(note);
		return note;
	}
	/**
	 * url http://127.0.0.1:8899/note/note/queryNote
	 * @return
	 */
	@RequestMapping(value="/queryNote")
	public List queryNote(){
		System.out.println("queryNote()");
		return this.noteService.queryNote();
	}
	
	/**
	 * url http://127.0.0.1:8899/note/note/saveNote?title=xx&content=xxx
	 * @return
	 */
	@RequestMapping(value="/saveNote")
	public AjaxReturnBean saveNote(Note note){
		System.out.println("saveNote()");
		AjaxReturnBean arb = new  AjaxReturnBean();
		arb.setStatus("SUCCESS");
		arb.setMessage("保存成功");
		try{
			this.noteService.saveNote(note);
		}catch(Exception e){
			e.printStackTrace();
			arb.setStatus("Failure");
			arb.setMessage("保存失败");
		}
		
		return arb;
	}
	
	/**
	 * url http://127.0.0.1:8899/note/note/deleteNote/1
	 * @return
	 */
	@RequestMapping(value="/deleteNote/{id}")
	public AjaxReturnBean deleteNote(@PathVariable String id){
		System.out.println("deleteNote()");
		AjaxReturnBean arb = new  AjaxReturnBean();
		arb.setStatus("SUCCESS");
		arb.setMessage("删除成功");
		try{
			this.noteService.deleteNote(id);
		}catch(Exception e){
			e.printStackTrace();
			arb.setStatus("Failure");
			arb.setMessage("删除失败");
		}
		
		return arb;
	}
	
	
	/**
	 * url http://127.0.0.1:8899/note/note/testTransaction/1
	 * @return
	 */
	@RequestMapping(value="/testTransaction/{id}")
	public AjaxReturnBean testTransaction(@PathVariable String id){
		System.out.println("testTransaction()");
		AjaxReturnBean arb = new  AjaxReturnBean();
		arb.setStatus("SUCCESS");
		arb.setMessage("操作成功");
		try{
			this.noteService.testTransaction(id);
		}catch(Exception e){
			e.printStackTrace();
			arb.setStatus("Failure");
			arb.setMessage(e.getMessage());
		}
		
		return arb;
	}
	
	
}
