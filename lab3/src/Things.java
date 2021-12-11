import java.util.Objects;
import java.util.stream.Stream;

public interface Things {
    String thing();
}
class Portrait implements Things{
    private final String object = "портрет";
    public String thing(){
        return "взял " + object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Portrait portrait = (Portrait) o;
        return Objects.equals(object, portrait.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    @Override
    public String toString() {
        return "Portrait{" +
                "object='" + object + '\'' +
                '}';
    }
}

class Pieces implements Things {
    private final String object = "кусочки";
    public String thing(){
        return "порвал его на " + object + " и сказал";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pieces pieces = (Pieces) o;
        return Objects.equals(object, pieces.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    @Override
    public String toString() {
        return "Pieces{" +
                "object='" + object + '\'' +
                '}';
    }
}

class Poems implements Things{
    private final String object = "стихи";
    public String thing(){
        return  object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poems poems = (Poems) o;
        return Objects.equals(object, poems.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    @Override
    public String toString() {
        return "Poems{" +
                "object='" + object + '\'' +
                '}';
    }
}

class Names implements Things{
    private final String object = "имя";
    public String thing(){
        return  object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Names names = (Names) o;
        return Objects.equals(object, names.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    @Override
    public String toString() {
        return "Names{" +
                "object='" + object + '\'' +
                '}';
    }
}

class Street implements Things{
    private final String object = "улица";
    public String thing(){
        return "жил на " + object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return Objects.equals(object, street.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    @Override
    public String toString() {
        return "Street{" +
                "object='" + object + '\'' +
                '}';
    }
}
