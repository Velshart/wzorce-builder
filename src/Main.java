public class Main {
    public static void main(String[] args) {
        Plant plant = new Plant.PlantBuilder("Juka", "Aloesowa")
                .requiresSunnyPlace(true)
                .requiresHighHumidity(false)
                .build();

        System.out.println(plant.toString());
    }
}