package exercicioBanco.main;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import exercicioBanco.banco.Cheque;
import exercicioBanco.banco.Cliente;
import exercicioBanco.banco.Conta;
import exercicioBanco.banco.ContaCorrente;
import exercicioBanco.banco.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Conta cc1 = new ContaCorrente(100.0, 500.0);
		Conta cp1 = new ContaPoupanca(0.5, 0.0);

		Cliente cli = new Cliente(1, "João", "123456", "789654", cc1);

		cc1.depositar(200.00);
		cc1.sacar(210.0);
		((ContaCorrente) cc1).depositarCheque(new Cheque(100.00, "Banco do Brasil", OffsetDateTime.now()));

		cp1.depositar(200.00);
		cp1.sacar(100.00);
		((ContaPoupanca) cp1).recolherJuros();
		
		sc.close();
		
		
// --------------------------------------------Datas---------------------------------------------------
		
		// Hora UTC atual
        OffsetDateTime utc = OffsetDateTime.now(ZoneOffset.UTC);
       
        LocalDateTime localDateTime = utc.toLocalDateTime();
        System.out.println("***** utc " + localDateTime);
        
        // Hora Brasil
        OffsetDateTime off = OffsetDateTime.now();
        LocalDateTime localDateTim = off.toLocalDateTime();
        System.out.println("***** off " + localDateTim + "   -- "+off); 
        
        // Hora Brasil formatada
        DateTimeFormatter br = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println(" formats as " + br.format(localDateTim)); //27-08-2020 01:06

        // Hora UTC formatada
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println(" formats as " + dTF.format(localDateTime)); //27-08-2020 04:06

        // OBTER a hora UTC para a data atual
        Date now= new Date();
        LocalDateTime utcDateTimeForCurrentDateTime = Instant.ofEpochMilli(now.getTime()).atZone(ZoneId.of("UTC")).toLocalDateTime();
        DateTimeFormatter dTF2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println(" formats as " + dTF2.format(utcDateTimeForCurrentDateTime)); //27-08-2020 04:06
	}

}
