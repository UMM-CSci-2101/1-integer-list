package umm2101;

public class GoofyThing {
    int favoriteNumber;
    String favoriteClass;

    public GoofyThing() {
        favoriteNumber = 3;
        favoriteClass = "CSci 2101";
    }

    public GoofyThing(int num, String favoriteClass) {
        this.favoriteNumber = num;
        this.favoriteClass = favoriteClass;
    }

    public String jump() {
        StringBuilder s = new StringBuilder("");
        for (int i=0; i<favoriteNumber; i++) {
            s.append("jump");
        }
        return s.toString();
    }

    public String rollOver() {
        String s = favoriteClass;
        return s+s;
    }

    public String getFavoriteClass() {
        return this.favoriteClass;
    }

    
    
}
