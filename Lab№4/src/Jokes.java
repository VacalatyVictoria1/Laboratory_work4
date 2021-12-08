import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.net.URL;
import java.nio.charset.Charset;

public class Jokes implements Serializable {
    private ArrayList<Joke> jokes;

    public Jokes(ArrayList<Joke> jokes) {
        this.jokes = jokes;
    }

    public Jokes(){
        jokes = new ArrayList<>();
    }

    public ArrayList<Joke> getJokes() {
        return jokes;
    }

    public void setJokes(ArrayList<Joke> jokes) {
        this.jokes = jokes;
    }

    public void add(Joke joke) {
        this.jokes.add(joke);
    }

    @Override
    public String toString(){

        String result = "";
        for (Joke j : jokes) {
            result += j + System.lineSeparator();
        }
        return result;
    }

}