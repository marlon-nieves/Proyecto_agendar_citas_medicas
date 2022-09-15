package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;

public class UIDoctorMenu {
	/** Array para ver los doctores que tienen disponibilidad de citas */
	public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

	public static void showDoctorMenu() {
		int response = 0;
		do {
			System.out.println("\n\n");
			System.out.println("Doctor");
			System.out.println("Welcome: " + UIMenu.doctorLogged.getName());
			System.out.println("1. Add Available Appointment");
			System.out.println("2. My Scheduled Appointments");
			System.out.println("0. Logout");

			Scanner tc = new Scanner(System.in);
			response = Integer.valueOf(tc.nextLine());

			switch (response) {
			case 1:
				showAddAvailableAppointmentMenu();
				
				break;
			case 2:
				break;
			case 0:
				UIMenu.showMenu();
				break;
			}

		} while (response != 0);
	}

	private static void showAddAvailableAppointmentMenu() {
		int response = 0;
		do {
			System.out.println();
			System.out.println("::Add Available Appointment");
			System.out.println(":: Select a Month");

			for (int i = 0; i < 3; i++) {
				int j = i + 1;
				System.out.println(j + ". " + UIMenu.MONTS[i]);

			}
			System.out.println("0. Return");

			Scanner tc = new Scanner(System.in);
			response = Integer.valueOf(tc.nextLine());

			if (response > 0 && response < 4) {
				int monthSelected = response;
				System.out.println(monthSelected + ". " + UIMenu.MONTS[monthSelected - 1]);
				System.out.println("Insert the date available: [dd/mm/yyyy]");
				String date = tc.nextLine();

				// definiendo la fecha para la cita
				System.out.println("Your date is: " + date + "\n1. Correct \n2. Changer date");
				int responseDate = Integer.valueOf(tc.nextLine());
				if (responseDate == 2)
					continue;

				// definiendo la hora para la cita
				int responseTime = 0;
				String time = "";
				do {
					System.out.println("Insert the time available for date: " + date + "[16:00]");
					time = tc.nextLine();
					System.out.println("Your time is: " + time + "\n1. Correct \n2. Changer date");
					responseTime = Integer.valueOf(tc.nextLine());
				} while (responseTime == 2);

				UIMenu.doctorLogged.addAvailableAppointment(date, time);
				checkDoctorAvailableAppointments(UIMenu.doctorLogged);

			} else if (response == 0) {
				showDoctorMenu();
			}
		} while (response != 0);
	}

	// modularizar
	private static void checkDoctorAvailableAppointments(Doctor doctor) {
		if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)) {
			doctorsAvailableAppointments.add(doctor);
		}
	}

}
