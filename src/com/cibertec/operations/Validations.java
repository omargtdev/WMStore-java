package com.cibertec.operations;

import javax.swing.JOptionPane;

public class Validations {

	public boolean isNumber(String toValidate, String input) {
		try {
			Double.parseDouble(toValidate);
			return true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(
					null, 
					"Debes colocar un numero valido!", 
					input,
					JOptionPane.WARNING_MESSAGE 
				);
			
			return false;
		}
	}
	
	public boolean isInt(String toValidate, String input) {
		try {
			Integer.parseInt(toValidate);
			return true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(
					null, 
					"Debes colocar un numero entero!", 
					input,
					JOptionPane.WARNING_MESSAGE 
				);
			
			return false;
		}
	}
	
	
	public boolean isString(String toValidate, String input) {
		try {
			Double.parseDouble(toValidate);
			JOptionPane.showMessageDialog(
					null, 
					"Debes colocar una cadena texto", 
					input,
					JOptionPane.WARNING_MESSAGE 
				);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}
	}
	
	public boolean isNotEmpty(String toValidate, String input) {
		if(toValidate.trim().equals("")) {
			JOptionPane.showMessageDialog(
					null, 
					"Debes de rellenar el campo!",
					input,
					JOptionPane.WARNING_MESSAGE 
				);
			
			return false;
		}
		
		return true;
	}
}
