package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="my.app")
public class MyDataRunner implements CommandLineRunner {
	private Integer id;
	private String code;
	private double version;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Runner [id=" + id + ", code=" + code + ", version=" + version + "]";
	}
	

}
