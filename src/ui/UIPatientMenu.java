package ui;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import model.Doctor;

public class UIPatientMenu {

	public static void showPatientMenu() {
		int response = 0;
		do {

			System.out.println("\n\n");
			System.out.println("Patient");
			System.out.println("Welcome: " + UIMenu.patientLogged.getName());
			System.out.println("1. Book an appointment");
			System.out.println("2. My Appointments");
			System.out.println("0. Logout");

			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());

			switch (response) {
			case 1:
				showBookAppointmentMenu();
				break;
			case 2:
				showPatientMyAppointments();
				break;
			case 0:
				UIMenu.showMenu();
				break;
			}

		} while (response != 0);
	}

	private static void showBookAppointmentMenu() {
		int response = 0;
		do {
			System.out.println("::Book an appointment");
			System.out.println(":: Select date: ");
			/**
			 * Mostrar las fechas de los doctores que agendaron fechas o dejaron fechas
			 * disponibles
			 */
			/** Map=> Numeracion de la lista de fechas */
			// Indice de la fecha que selecione el paciente
			Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
			int k = 0;
			for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
				ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments
						.get(i).getAvailableAppointments();
				Map<Integer, Doctor> doctorAppointment = new TreeMap<>();
				for (int j = 0; j < availableAppointments.size(); j++) {
					k++;
					System.out.println(k + ". " + availableAppointments.get(j).getDate());
					doctorAppointment.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
					doctors.put(Integer.valueOf(k), doctorAppointment);
				}
			}
			Scanner tc = new Scanner(System.in);
			int responseDateSelected = Integer.valueOf(tc.nextLine());

			Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
			Integer indixDate = 0;
			Doctor doctorSelected = new Doctor("", "");
			for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
				indixDate = doc.getKey();
				doctorSelected = doc.getValue();
			}
			System.out.println(doctorSelected.getName() + ". Date: "
					+ doctorSelected.getAvailableAppointments().get(indixDate).getDate() + ". Time: "
					+ doctorSelected.getAvailableAppointments().get(indixDate).getTime());
			System.out.println("Confirm you appointment: \n1. Yes \n2. Change Data");
			response = Integer.valueOf(tc.nextLine());

			if (response == 1) {
				UIMenu.patientLogged.addAppointmentDoctors(doctorSelected,
						doctorSelected.getAvailableAppointments().get(indixDate).getDate(null),
						doctorSelected.getAvailableAppointments().get(indixDate).getTime());

				showPatientMenu();
			}

		} while (response != 0);
	}

	private static void showPatientMyAppointments() {
		int response = 0;
		do {
			System.out.println("::My Appointments");
			if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0) {
				System.out.println("Don't have appointments");
				break;
			}
			for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
				int j = i + 1;
				System.out.println(j + ". " +
				"Date:" + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
				"Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() + 
				"\n Doctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor());

			}
			System.out.println("0. Return");

		} while (response != 0);
	}
}
