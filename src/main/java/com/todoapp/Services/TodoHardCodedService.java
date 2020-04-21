package com.todoapp.Services;
import com.todoapp.Entity.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {
   private static List<todo> todos=new ArrayList();
   private static int idCounter=0;
   static {
	   todos.add(new todo(++idCounter,"dhia","learn to dance",new Date(),false));
	   todos.add(new todo(++idCounter,"chedi","learn orthopidiste",new Date(),true));
	   todos.add(new todo(++idCounter,"fedi","learn to sleep",new Date(),false));
	   todos.add(new todo(++idCounter,"ali","learn to learning quran",new Date(),true));
   }
   
   public List<todo> findAll(){
	   return todos;
   }
   
   public todo removeById(long id){
	   todo todo=findById(id);
	   if(todo==null) {
		   return null;
	   }
	  if(  todos.remove(todo)) return todo;
	    return null;
	    
   }
   
   public todo findById(Long id) {
	   for (todo todo:todos) {
		   if (todo.getId()==id) {
			   return todo;
		   }
	   }
	   return null;
   }
}
