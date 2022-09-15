package com.medical.appoinments;

import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import static ui.UIMenu.*;

public class Main {
	public static void main(String[] args) {
		showMenu();
//		Doctor myDoctor = new Doctor();
//		Doctor myDoctor1 = new Doctor("Samantha");
//		myDoctor.showName();
//		myDoctor.showId();
//		myDoctor.name = "Marlon Nieves";
//		myDoctor.showName();

		/*
		 * Doctor MydoctorAnn = new Doctor(); myDoctor.showId();
		 */

		// showMenu();
		// Doctor myDoctor = new Doctor("Marlon", "Cardiologo");
		// System.out.println(myDoctor.name + myDoctor.especiality);

//		int i = 0;
//		int b = 2;
//		b = i;
//		System.out.println(b);
//		
//		Patient myPatient = new Patient("Samantha", "samantha@gmail.com");
//		Patient myPatient2 = new Patient("mantha", "mantha@gmail.com");
//		System.out.println(myPatient.getName());
//		System.out.println(myPatient2.getName());
//		myPatient2 = myPatient;
		/*
		 * myPatient.setWeight(80); System.out.println(myPatient.getWeight());
		 * 
		 * myPatient.setPhoneNumber("12345678");
		 * System.out.println(myPatient.getPhoneNumber());
		 */

		/** final= algo que no va a cambiar */
		/** static= elemento para globalizar */
//		Doctor myDoctor = new Doctor("Marlon Nieves", "marlon@gmail.com");
//		myDoctor.addAvailableAppointment(new Date(), "4pm");
//		myDoctor.addAvailableAppointment(new Date(), "6am");
//		myDoctor.addAvailableAppointment(new Date(), "10am");
//		System.out.println(myDoctor);
//
//		User user = new Doctor("Anahi", "ana@gmail.com");
//		user.showDataUser();
//
//		User userPa = new Patient("Anahi", "ana@gmail.com");
//		userPa.showDataUser();

		
		/**USANDO CLASES ANONIMAS
		 * */
//		User user1 = new User("Marlon", "marlon@gmail.com") {
//			@Override
//			public void showDataUser() {
//				System.out.println("Doctor\n");
//				System.out.println("Hospital: Cruz Verde");
//				System.out.println("Departemento: Geriatria");
//
//			}
//		};
//		user1.showDataUser();
//		
//		ISchedulable iSchedulable = new ISchedulable() {
//			@Override
//			public void schedule(Date date, String time) {
//				// TODO Auto-generated method stub
//				
//			}
//		};

//		for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
//			System.out.println(aA.getDate() + " " + aA.getTime());
//		}
//		System.out.println();
//		System.out.println();
//		Patient patient = new Patient("Alejandra", "alejandra@mail.com");
//		System.out.println();
//		System.out.println(patient.toString());
	}

}
