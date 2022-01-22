package com.productsapp.validation;

import org.springframework.util.StringUtils;
public class EntityNotFoundException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EntityNotFoundException(Class clazz, Long id) {
        super(String.format("%s was not found with id=%s", StringUtils.capitalize(clazz.getSimpleName()), id));
    }

}
