public class Plant {

    private String name;
    private String variety;

    private boolean likesSunnyPlaces;

    private boolean likesHighHumidity;

    public Plant(PlantBuilder plantBuilder) {
        this.name = plantBuilder.name;
        this.variety = plantBuilder.variety;
        this.likesSunnyPlaces = plantBuilder.likesSunnyPlaces;
        this.likesHighHumidity = plantBuilder.likesHighHumidity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public boolean isLikesSunnyPlaces() {
        return likesSunnyPlaces;
    }

    public void setLikesSunnyPlaces(boolean likesSunnyPlaces) {
        this.likesSunnyPlaces = likesSunnyPlaces;
    }

    public boolean isLikesHighHumidity() {
        return likesHighHumidity;
    }

    public void setLikesHighHumidity(boolean likesHighHumidity) {
        this.likesHighHumidity = likesHighHumidity;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", variety='" + variety + '\'' +
                ", likesSunnyPlaces=" + likesSunnyPlaces +
                ", likesHighHumidity=" + likesHighHumidity +
                '}';
    }

    public static class PlantBuilder {
        private final String name;
        private final String variety;

        private boolean likesSunnyPlaces;

        private boolean likesHighHumidity;

        public PlantBuilder(String name, String variety) {
            this.name = name;
            this.variety = variety;
        }

        public PlantBuilder requiresSunnyPlace(boolean likesSunnyPlaces) {
            this.likesSunnyPlaces = likesSunnyPlaces;
            return this;
        }

        public PlantBuilder requiresHighHumidity(boolean likesHighHumidity) {
            this.likesHighHumidity = likesHighHumidity;
            return this;
        }

        public Plant build() {
            return new Plant(this);
        }
    }
}
