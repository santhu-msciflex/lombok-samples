package com.test.howtodoinjava.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
@EqualsAndHashCode
//@Generated
@Builder
public class Person {
	
	private @NonNull String age;
	private @NonNull String name;
	private @NonNull String address;
}
