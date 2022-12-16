import com.generic.Transport.Bus;
import com.generic.Transport.Transport;
import com.generic.Transport.Trucks;
import com.generic.Transport.Competing;
import com.generic.Transport.PassengerCars;
import com.generic.Transport.DriverB;
import com.generic.Transport.DriverC;
import com.generic.Transport.DriverD;
import com.javacource.ValidateUtils.*;

import java.sql.Driver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bus ikarus = new Bus("Ikarus", "S-123", 123, 12, 150,
                10);
        System.out.println(ikarus);

        Bus daowo = new Bus("Daowo", "E-234", 130, 20, 130,
                30);
        System.out.println(daowo);

        Bus suzuki = new Bus("Suzuki", "G-456", 170, 40, 170,
                25);

        Bus ford = new Bus("Ford", "d-123", 120, 13, 90,
                25);
        System.out.println(ford);

        PassengerCars toyota = new PassengerCars("Toyota", "Rav4", 150,
                15, 180, 20);
        System.out.println(toyota);

        PassengerCars honda = new PassengerCars("Honda", "greta", 130, 24,
                170, 10);
        System.out.println(honda);

        PassengerCars volvo = new PassengerCars("Volvo", "S-312", 150, 20,
                90, 12);
        System.out.println(volvo);

        PassengerCars kia = new PassengerCars("Kia", "lastochka", 190, 20,
                120, 23);
        System.out.println(kia);

        Trucks man = new Trucks("Man", "Y-109", 120, 23, 120, 14);
        System.out.println(man);

        Trucks kamaz = new Trucks("Kamaz", "t=34", 130, 10, 140, 23);
        System.out.println(kamaz);

        Trucks reno = new Trucks("Reno", "E-500", 120, 34, 120, 23);
        System.out.println(reno);

        Trucks haval = new Trucks("Haval", "Fx7", 190, 23, 150, 12);
        System.out.println(haval);

        new DriverB<PassengerCars>("Иванов Петр Николаевич", true, 12) {
            @Override
            public String refael() {
                return null;
            }
        };
        new DriverC<Bus>("Павлов Сергей Игоревич", true, 10) {
            @Override
            public String refael() {
                return null;
            }
        };
        new DriverD<Trucks>("Угрюмов Фунтик Игоревич", true, 8) {
            @Override
            public String refael() {
                return null;
            }
        };


    }
}