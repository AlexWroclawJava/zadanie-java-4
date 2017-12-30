class Televisor {

       boolean status = false;
       // Status false oznacza domyślny status na początku czyli wyłączony Telewizor

        Televisor(){
        }

        void turnOn(){
            System.out.println("\nWłączanie telewizora");
            status = true;
        }
        void turnOff(){
             System.out.println("\nWyłączanie telewizora");
             status = false;
        }
        void showStatus(){
            if (status){
                System.out.println("TV został włączony");
            } else {
                System.out.println("TV został wyłączony");
            }
        }
}
