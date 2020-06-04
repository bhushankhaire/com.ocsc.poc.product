package com.ocsc.poc.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GetProductDetails {

	@Getter
	@Setter
	private List<Integer> productIdList;
}
