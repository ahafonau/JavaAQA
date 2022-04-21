package lesson_4;

public class Park {
    private Attraction[] attractions;

    public Park(Attraction[] attractions) {
        this.attractions = attractions;
    }

    public class Info {
        public void getInfo(){
            for (Attraction attraction : Park.this.attractions){
                System.out.println(attraction);
            }
        }
    }

}
