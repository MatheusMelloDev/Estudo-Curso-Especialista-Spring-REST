package com.algaworks.algafood.core.validation;

import java.math.BigDecimal;

<<<<<<< HEAD
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
=======
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6

public class MultiploValidator implements ConstraintValidator<Multiplo, Number> {

	private int numeroMultiplo;
	
	@Override
	public void initialize(Multiplo constraintAnnotation) {
		this.numeroMultiplo = constraintAnnotation.numero();
	}
	
	@Override
	public boolean isValid(Number value, ConstraintValidatorContext context) {
		boolean valido = true;
		
		if (value != null) {
			var valorDecimal = BigDecimal.valueOf(value.doubleValue());
			var multiploDecimal = BigDecimal.valueOf(this.numeroMultiplo);
			var resto = valorDecimal.remainder(multiploDecimal);
			
			valido = BigDecimal.ZERO.compareTo(resto) == 0;
		}
		
		return valido;
	}

}
