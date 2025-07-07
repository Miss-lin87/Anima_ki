package se.linda.Anima_Ki;

import lombok.Data;

@Data
public class Player {
    private int MKPoints;

    public Player(int MKPoints) {
        this.MKPoints = MKPoints;
    }
}
