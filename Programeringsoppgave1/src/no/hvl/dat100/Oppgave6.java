package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

import static java.lang.Integer.*;

public class Oppgave6 {

	public static void main(String[] args) {
		
		int brutto = Integer.parseInt(showInputDialog("hva er bruttoinntekten din"));
				double pros1 = 1.9/100;
				double pros2 = 4.2/100;
				double pros3 = 13.2/100;
				double pros4 = 16.2/100;
				double trinn1 = 180800;
				double trinn2 = 254500;
				double trinn3 = 639750;
				double trinn4 = 999550;
				double rest;
				double diff; 
				double restround;
				double trinn_12 = (trinn2 - trinn1)*pros1;
				double trinn_23 = (trinn3 - trinn2)*pros2;
				double trinn_34 = (trinn4 - trinn3)*pros3;
				double skatt;
				if (brutto<=trinn1) {
					showMessageDialog(null, "0 i skatt");
				} else if (brutto<=trinn2) {
					diff = brutto - trinn1;
					rest = diff*pros1; 
					restround = Math.round(rest*100)/100.00;
					showMessageDialog(null, "Du skal betale " + restround + "kr i skatt");
				} else if (brutto<=trinn3) {
					diff = brutto - trinn2;
					rest = diff*pros2;
					restround = Math.round(rest*100)/100.00;
					skatt = restround+trinn_12;
					showMessageDialog(null, "Du skal betale " + skatt + "kr i skatt");
				} else if (brutto<=trinn4) {
					diff = brutto - trinn3;
					rest = diff*pros3;
					restround = Math.round(rest*100)/100.00;
					skatt = restround+trinn_12+trinn_23;
					showMessageDialog(null, "Du skal betale " + skatt + "kr i skatt");
				} else {
					diff = brutto - trinn4;
					rest =diff*pros4;
					restround = Math.round(rest*100)/100.00;
					skatt = restround+trinn_12+trinn_23+trinn_34;
					showMessageDialog(null, "Du skal betale " + skatt + "kr i skatt");
							
				}

	}

}
