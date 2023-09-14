package in.nareshit.raghu.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Product {
	@NonNull
	private Integer id;
	private String code;

}
