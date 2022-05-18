package Unidad5;

import java.util.Scanner;

import Utils.Print;

public class MethodsTaskClass {
	private static Scanner leer = new Scanner(System.in);
	private static int movs[] = new int[10];
	public static int saldo, ind;

	public static void main(String[] args) {
		login();
	}

	public static void login() {
		String pswd = "";
		int i = 0;
		for (; i < 3 && !(pswd.equals("123")); i++) {
			Print.print("Ingresar contraseña: ");
			pswd = leer.next();
		}
		if (i == 3) {
			Print.ln("Intentos rebasados, gracias por usar cajeros Pony S.A.");
			return;
		}
		menu();
	}

	public static void menu() {
		int opc, monto = 0;
		do {
			Print.ln("");
			Print.ln("1.- Consultar Saldo");
			Print.ln("2.- Depositar");
			Print.ln("3.- Retirar");
			Print.ln("4.- Mostrar utlimos movimientos");
			Print.ln("5.- Cerrar Sesion");
			Print.print("Ingresar opcion: ");

			opc = leer.nextInt();
			switch (opc) {
			case 1:
				Print.ln("Consultar saldo");
				Print.ln("Saldo Actual: $ " + saldo);
				break;
			case 2:
				deposit(monto);
				break;
			case 3:
				retirar(monto);
				break;
			case 4:
				logs();
				break;
			case 5:
				Print.ln("Gracias por usar cajeros Pony S.A.");
				break;
			default:
				Print.ln("Opcion no valida, intente de nuevo");
				break;
			}
		} while (opc != 5);
	}

	private static void deposit(int monto) {
		Print.ln("Depositar");
		Print.print("Ingresar monto a depositar: ");
		monto = leer.nextInt();
		if (monto <= 0) {
			Print.ln("Deposita un valor mayor que 0");
			return;
		} else {
			saldo += monto;
			movs[ind] = monto;
			ind++;
			Print.ln("Nuevo saldo $ " + saldo);
		}
	}

	private static void retirar(int monto) {
		Print.ln("Retirar");
		if (saldo > 0) {
			Print.print("Ingresar monto a retirar: ");
			monto = leer.nextInt();
			if (saldo >= monto) {
				saldo -= monto;
				Print.ln("Nuevo saldo: $ " + saldo);
				movs[ind] = monto * -1;
			} else {
				Print.ln("Saldo insuficiente");
				return;
			}
		} else {
			Print.ln("Fondos insuficientes");
			return;
		}
	}

	private static void logs() {
		Print.ln("Ultimos Movimientos");
		Print.print("[ ");
		for (int i = 0; i < movs.length; i++) {
			if (movs[i] != 0) {
				Print.print(movs[i] + " ");
			}
		}
		Print.print("]");
	}
}
