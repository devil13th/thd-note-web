package com.thd.note.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.thd.tool.bean.Page;

@Repository
public class JdbcDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public Logger logger = LoggerFactory.getLogger(this.getClass());
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Map<String,Object>> query(String sql,Object[] params,Integer currentPage ,Integer pageSize){
		if(currentPage !=null && pageSize != null && pageSize.compareTo(0)!=0 ){
			if(currentPage > 0){
				sql += " limit " + ((currentPage-1)*pageSize) + "," + pageSize ;
			}else{
				sql += " limit 0," + pageSize ;
			}
			
		}
		return this.jdbcTemplate.queryForList(sql, params);
	}
	
	public List<Map<String,Object>> query(String sql,Object[] params,Page p){
		logger.info("execute query SQL : " + sql);
		logger.info("execute query SQL PARAMS : " );
		if(params!=null){
			for(Object obj : params ){
				System.out.println(obj);
			}
		}
		if(p!= null && p.getCurrentPage() > 0 && p.getPageSize() > 0){
			p.setListSize(this.queryCount(sql, params));
			return this.query(sql, params,p.getCurrentPage(),p.getPageSize());
		}else{
			return this.query(sql, params,null,null);
		}
	}
	
	public int queryCount(String sql,Object[] params){
		String ctSql = "select count(*) from (" + sql + ") as result";
		
		logger.info("execute query SQL : " + ctSql);
		logger.info("execute query SQL PARAMS : " );
		if(params!=null){
			for(Object obj : params ){
				System.out.println(obj);
			}
		}
		
		
		Map r = this.jdbcTemplate.queryForMap(ctSql,params);
		return Integer.parseInt(r.get("ct").toString());
	}
}
