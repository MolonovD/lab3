public class Main {
    public static void main(String[] args) {
        Painter painter = new Painter();
        Poet poet = new Poet();

        Pieces pieces = new Pieces();
        Poems poems = new Poems();
        Street street = new Street();
        Names names = new Names();
        Portrait portrait = new Portrait();

        Gunka gunka = new Gunka(portrait, pieces);
        Neznaika neznaika = new Neznaika(painter, poet, poems, street);
        Pudik pudik = new Pudik(poet, poems, names);
        Tsvetik tsvetik = new Tsvetik(poet);
        All all = new All(poet);


        System.out.println(gunka.tookPortrait());
        System.out.println(gunka.toreItToPiecesAndSaid());
        System.out.println(neznaika.didntBecomeAPainter());
        System.out.println(neznaika.decidedToBecomeAPoet());
        System.out.println(neznaika.composePoems());
        System.out.println(neznaika.heHadAFamiliarPoet());
        System.out.println(neznaika.whichLivedOnAOduvanchikovStreet());
        System.out.println(pudik.thisPoetNameIsPudikForReal());
        System.out.println(all.allPoetsReallyLikesBeautifulNames());
        System.out.println(pudik.thatsWhyWhenPudikStartedToWriteAPoems());
        System.out.println(pudik.heChoseAnotherName());
        System.out.println(tsvetik.andCallYourselfByTsvetik());
    }
}
