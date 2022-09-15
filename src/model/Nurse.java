package model;

public class Nurse extends User {
	private String Speciality;

	public Nurse(String name, String email) {
		super(name, email);
	}

	@Override
	public void showDataUser() {
		System.out.println("Empleado del Hopistal: Cruz Verde");
		System.out.println("Depatamentos: Nutriologia");

	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}

}
