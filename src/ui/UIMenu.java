package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import model.Doctor;
import model.Patient;

public class UIMenu {
	public static final String[] MONTS = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
			"Septiembre", "Octubre", "Noviembre", "Diciembre" };
	public static Doctor doctorLogged;
	public static Patient patientLogged;

	public static void showMenu() {
		System.out.println("Welcome to My Appointments");
		System.out.println("Selecciona la opcion deseada");
		int response = 0;
		do {
			System.out.println("1. Doctor");
			System.out.println("2. Patient");
			System.out.println("0. Salir");

			Scanner tc = new Scanner(System.in);
			response = Integer.valueOf(tc.nextLine());

			switch (response) {
			case 1:
				System.out.println("Doctor");
				response = 0;
				authUser(1);
				break;
			case 2:
				response = 0;
				authUser(2);
				break;
			case 0:
				System.out.println("Thanks you for visit");
				break;
			default:
				System.out.println("Please select a correct answer");
			}

		} while (response != 0);
	}

	private static void authUser(int userType) {
		/**
		 * userType = 1 => Doctor userType = 2 => Patient
		 */
		/** Lista de doctores autencticados */
		ArrayList<Doctor> doctors = new ArrayList<>();
		doctors.add(new Doctor("Juan Pablo Soto", "juan@gmail.com"));
		doctors.add(new Doctor("Alvaro Soto", "alvaro@gmail.com"));
		doctors.add(new Doctor("Nelson Manjarres", "nelson@gmail.com"));

		/** Lista de pacientes autencticados */
		ArrayList<Patient> patients = new ArrayList<>();
		patients.add(new Patient("Marlon Nieves", "marlon@gamil.com"));
		patients.add(new Patient("Samantha Nieves", "samantha@gamil.com"));
		patients.add(new Patient("Dayanna Nieves", "dayanna@gamil.com"));

		boolean emailCorrrect = false;
		do {
			System.out.println("Insert your email for example: [a@gamil.com]");
			Scanner tc = new Scanner(System.in);
			String email = tc.nextLine();
			if (userType == 1) {
				for (Doctor d : doctors) {
					if (d.getEmail().equals(email)) {
						emailCorrrect = true;
						// obtener los datos del usuario lo
						doctorLogged = d;
						// mostrar el menu del doctor
						UIDoctorMenu.showDoctorMenu();
					}
				}

			}
			if (userType == 2) {
				for (Patient p : patients) {
					if (p.getEmail().equals(email)) {
						emailCorrrect = true;
						patientLogged = p;
						// mostrar el menu del paciente
						UIPatientMenu.showPatientMenu();

					}

				}

			}

		} while (!emailCorrrect);
	}

	static void showPatientMenu() {
		int response = 0;
		do {
			System.out.println("\n\n");
			System.out.println("Patien");
			System.out.println("1. Book an appointments");
			System.out.println("2. My appointments");
			System.out.println("0. Return");
			Scanner tc = new Scanner(System.in);
			response = Integer.valueOf(tc.nextLine());
			switch (response) {
			case 1:
				System.out.println("::Book an appointment");
				for (int i = 0; i < 4; i++) {
					System.out.println(i + ". " + MONTS[i]);
				}
				break;
			case 2:
				System.out.println("::My appointments");
				break;
			case 0:
				showMenu();
				break;
			}
		} while (response != 0);

	}

}
