package com.test.howtodoinjava.lombok;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

import static java.lang.System.*;

//@Getter
//@Setter
//@NoArgsConstructor
//@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class LombokModel {
	private @NonNull String name;
	private @NonNull String age;
	private @NonNull String address;

	// No Getters and Setters, hashCode, Equal-- even though
	// we can refer it from client code.
	// This is how we are taking help from 
	// Lombok to get rid of boiler plate
	// code.
public static void main(String[] args) {
	LombokModel lombokModel = new LombokModelBuilder()
		.name("Sajal")
		.address("India")
		.age("100")
		.build();
	
	System.out.println(lombokModel);
	
	Person p1 = Person.builder().name("aa").age("100").address("addr").build();
	
	out.println(p1);
		
}
}	

