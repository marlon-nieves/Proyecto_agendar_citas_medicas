package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cl1 = new Cliente("Antonio banderas", "00001", 25000);
		Cliente cl2 = new Cliente("Julio Iglesias", "00002", 55000);
		Cliente cl3 = new Cliente("Marlon Nieves", "00003", 50000);
		Cliente cl4 = new Cliente("Samantha Nieves", "00004", 55000);
		Cliente cl5 = new Cliente("Samantha Nieves", "00004", 55000);

		Set<Cliente> clientesBanco = new HashSet<Cliente>();
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		
		clientesBanco.add(cl5);

		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
		}
//		Iterator<Cliente> it = clientesBanco.iterator();
//		while(it.hasNext()) {
//			String nombre_cliente = it.next().getNombre();
//			System.out.println(nombre_cliente);
//		}
	}

}
