public class TelevisorStatus {

            public static void main(String[] args) {


            Televisor televisor = new Televisor();
            //wyświetlenie początkowego statusu telewizora
            System.out.println("Status początkowy telewizora to: ");
            televisor.showStatus();

            //włączenie telewizora
            televisor.turnOn();
            televisor.showStatus();

            //wyłączenie telewizora
            televisor.turnOff();
            televisor.showStatus();

    }
}
