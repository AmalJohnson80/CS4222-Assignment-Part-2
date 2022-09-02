public class PlayListDriver {
    public static void main(String[]args){
        String favourites = null;
        PlayList myPlayList = new PlayList(null);
        myPlayList.add(new Track("Sweet but a Psycho","Ava Max", 2018, 208));
        myPlayList.add(new Track("2002", "Anne-Marie", 2018, 187));
        myPlayList.add(new Track("Wake me Up", "Avicii", 2013, 273));
        myPlayList.add(new Track("My Heart will go on", "Celine Dion", 1997, 311));
        myPlayList.add(new Track("Memories", "Maroon 5", 2019, 189 ));
        myPlayList.add(new Track("Girls like You", "Maroon 5", 2018, 235));
        myPlayList.add(new Track("Friends", "Anne-Marie, Marshmello", 2018, 202));
        myPlayList.add(new Track("Shotgun", "George Ezra", 2018, 206));
        myPlayList.add(new Track("Happier", "Marshmello, Bastille", 2018, 234));
        myPlayList.add(new Track("Dancing Queen", "ABBA", 1976, 232));
        System.out.println("Play NOT shuffled...");
        myPlayList.playAll(false);
        System.out.println();
        System.out.println("Play shuffled...");
        myPlayList.playAll(true);
        System.out.println();
        System.out.println("Play NOT shuffled (but notice the sequence)...");
        myPlayList.playAll(false);


        System.out.println(myPlayList.remove("QUEEN"));
        System.out.println(myPlayList.remove("ill"));
        System.out.println(myPlayList.remove("sHOTGUN"));
        

    }
}
