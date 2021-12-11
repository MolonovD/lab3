import java.util.Objects;
import java.util.stream.Stream;

public interface Professions {
    String profession();
}
class Painter implements Professions{
    private final String job = "художник";
    public String profession(){
        return "не получилось " + job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Painter painter = (Painter) o;
        return Objects.equals(job, painter.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job);
    }

    @Override
    public String toString() {
        return "Painter{" +
                "job='" + job + '\'' +
                '}';
    }
}

class Poet implements Professions{
    private String job;
    public String profession() {
        return this.job;
    }

    public Poet (){
        this.job = "Поэт";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poet poet = (Poet) o;
        return Objects.equals(job, poet.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job);
    }

    @Override
    public String toString() {
        return "Poet{" +
                "job='" + job + '\'' +
                '}';
    }
}

