import java.io.Serializable;
import java.util.Comparator;

public class Joke implements Serializable
{
    private long id;
    private String type;
    private String setup;
    private String punchline;
    private final static long serialVersionUID = -6971730863675616464L;


    public Joke() {
    }


    public Joke(long id, String type, String setup, String punchline) {
        super();
        this.id = id;
        this.type = type;
        this.setup = setup;
        this.punchline = punchline;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nType: " + type + "\nSetup: " + setup + "\nPunchline: " + punchline;
    }

    public static Comparator<Joke> byIdAsc = Comparator.comparing(o -> o.id);

}