package com.JersyExample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path(value = "/Student")
public class StudentController {
	
	@GET
	@Path(value = "/{name}/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	 public  Student getStudent(@PathParam("name") String name, @PathParam("id")int id ) {
		Student st = new Student ();
		st.setId(id);
		st.setName(name);
		return st;
	}

}
