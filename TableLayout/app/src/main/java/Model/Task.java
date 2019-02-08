package Model;

import android.graphics.Color;

public class Task {

    private String description;
    private int colour;

    public Task(String description) {
        this.description = description;
        this.colour = Color.BLACK;
    }

    public Task(String description, int colour) {
        this.description = description;
        this.colour = colour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
