package in.nareshit.raghu.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
@ToString
@RequiredArgsConstructor
public class Product {
	@NonNull
	private Integer id;
	@NonNull
	private String code;

}
