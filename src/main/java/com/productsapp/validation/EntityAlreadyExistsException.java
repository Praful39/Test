package com.productsapp.validation;

import org.springframework.util.StringUtils;
public final class EntityAlreadyExistsException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EntityAlreadyExistsException(Class clazz, Long id) {
        super(String.format("%s already exists with id=%s", StringUtils.capitalize(clazz.getSimpleName()), id));
    }
}
