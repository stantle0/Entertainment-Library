package br.com.caelum.financas.util;

import javax.persistence.Persistence;

public class DoNothing {
	public static void main(String[] args) {
		Persistence
		.createEntityManagerFactory("financas");
	}
}
