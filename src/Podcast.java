public class Podcast extends Song {
    private String temat;

    public Podcast(String title, String temat) {
        super(title);
        this.temat = temat;
    }

    public String getTemat() {
        return temat;
    }

    @Override
    public String toString() {
        return "Podcast: " + getTitle() + " (host: " + temat + ")";
    }
}
