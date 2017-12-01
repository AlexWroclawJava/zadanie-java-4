class Televisor {

       int status;
       // Status 0 oznacza wyłączony Telewizor

        Televisor(){
        }


        void turnOn(){
            status++;
            System.out.println("Telewizor włączony");
        }

        void turnOff(){
            status--;
            System.out.println("Telewizor wyłączony");
        }

        void showStatus(){
            System.out.println("Obecny status to: " + status + "\n");
        }

}
