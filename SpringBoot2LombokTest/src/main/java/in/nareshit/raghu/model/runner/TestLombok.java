package in.nareshit.raghu.model.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;

@Component
public class TestLombok implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setSid(100);
		s.setSname("Ajeet");
		System.out.println(s);
		System.out.println(s.getSid()+"----------"+s.getSname());
			
		}
	
		
		

	}


