import java.util.Objects;

public abstract class Human {
    private String name = " ";

    public String getName(){
        return this.name;
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString(){
        return name;
    }
}
class Gunka extends Human {
    private Things portrait;
    private Things pieces;
    public Gunka(Things portrait, Things pieces) {
        super ("Гунька");
        this.portrait = portrait;
        this.pieces = pieces;
    }
    public String tookPortrait (){
        return this.getName() + " " + portrait.thing();
    }
    public String toreItToPiecesAndSaid(){
        return this.getName() + " " + pieces.thing();
    }
}
class Neznaika extends Human {
    private Professions painter;
    private Professions poet;
    private Things poems;
    private Things street;
    public Neznaika(Professions painter, Professions poet, Things poems, Things street) {
        super ("Незнайка");
        this.painter = painter;
        this.poet = poet;
        this.poems = poems;
        this.street = street;
    }
    public String didntBecomeAPainter(){
        return "После того как из " + this.getName() + " " + painter.profession();
    }
    public String decidedToBecomeAPoet(){
        return this.getName() + " решил сделаться " + poet.profession();
    }
    public String composePoems(){
        return  "И сочинять " + poems.thing();
    }
    public String heHadAFamiliarPoet(){
        return "У " + this.getName() + " был знакомый " + poet.profession();
    }
    public String whichLivedOnAOduvanchikovStreet(){
        return "Который " + street.thing() + " Одуванчиков";
    }
}
class Pudik extends Human {
    private Professions poet;
    private Things poems;
    private Things names;
    private PudiksName pudiksName;

    public Pudik(Professions poet, Things poems, Things names) {
        super ("Пудик");
        this.pudiksName = PudiksName.pudik;
        this.poet = poet;
        this.poems = poems;
        this.names = names;
    }
    public String thisPoetNameIsPudikForReal(){
        return "Этого " + poet.profession() + "a по-настоящему звали " + pudiksName.getName();
    }
    public String thatsWhyWhenPudikStartedToWriteAPoems(){
        return "Поэтому, когда " + pudiksName.getName() + " начал писать " + poems.thing();
    }
    public String heChoseAnotherName (){
        return pudiksName.getName() + " выбрал" + " себе другое " + names.thing();
    }
}
class Tsvetik extends Human {
    private Professions poet;
    private PudiksName pudiksName;
    public Tsvetik(Professions poet) {
        super ("Цветик");
        this.pudiksName = PudiksName.tsvetik;
        this.poet = poet;
    }
    public String andCallYourselfByTsvetik(){
        return "И стал называться " + pudiksName.getName();
    }
}
class All extends Human {
    Professions poet;
    public All(Professions poet) {
        super ("Все");
        this.poet = poet;}
    public String allPoetsReallyLikesBeautifulNames(){
        return this.getName() + " " + poet.profession() + "ы очень любят красивые имена";
    }
}
enum PudiksName {
    pudik("Пудик"), tsvetik("Цветик");
    private String name;
    PudiksName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}