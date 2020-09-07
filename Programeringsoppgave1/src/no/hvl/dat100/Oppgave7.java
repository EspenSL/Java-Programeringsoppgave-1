package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

import static java.lang.Integer.*;

public class Oppgave7 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			int poeng = parseInt(showInputDialog("Skriv inn poengsum"));
			char karakter = ' ';
		
		if ((poeng <= 39) && (poeng >= 0)) {
			karakter = 'F';
			showMessageDialog(null, "Eleven fikk karakteren: " + karakter);
		} else if ((poeng <= 49) && (poeng >= 40)) {
			karakter = 'E';
			showMessageDialog(null, "Eleven fikk karakteren: " + karakter);
		} else if ((poeng <= 59) && (poeng >= 50)) {
			karakter = 'D';
			showMessageDialog(null, "Eleven fikk karakteren: " + karakter);
		} else if ((poeng <= 79) && (poeng >= 60)) {
			karakter ='C';
			showMessageDialog(null, "Eleven fikk karakteren: " + karakter);
		} else if ((poeng <= 89) && (poeng >= 80)) {
			karakter = 'B';
			showMessageDialog(null, "Eleven fikk karakteren: " + karakter);
		} else if ((poeng <= 100) && (poeng >= 90)) {
			karakter = 'A';
			showMessageDialog(null, "Eleven fikk karakteren: " + karakter);
		} else if ((poeng < 100) || (poeng >0)) {
			if (i > 0) {
				i--;
			}
			showMessageDialog(null, "Tast inn et tall mellom 0 og 100");
		}
		karakter = 0;
 		
		}}

}
