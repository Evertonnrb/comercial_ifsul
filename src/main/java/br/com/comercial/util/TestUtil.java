package br.com.comercial.util;

import javax.persistence.Persistence;

public class TestUtil {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("comercialPU");
	}
}
