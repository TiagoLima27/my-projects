package io.codeforall.bootcamp.gameobject.enemy;

import io.codeforall.bootcamp.Destroyable;
import io.codeforall.bootcamp.gameobject.GameObject;

/**
 * An enemy class containing generic enemy functionality and meant for subclassing
 */
public abstract class Enemy extends GameObject implements Destroyable {


    public int health;
    private int destroyed;

    /**
     * Generic enemy constructor
     *
     * @param health the initial health
     */
    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public boolean isDead() {
        return health <= 0;
    }

    /**
     * Removes health according to the hit damage
     *
     * @param damage the damage impact
     */
    public void hit(int damage) {

        health = Math.max(health - damage, 0);
    }

    @Override
    public boolean isDestroyed() {

        return false;
    }


    /**
     * @see GameObject#getMessage()
     */
    @Override
    public String getMessage() {
        return "Tango Acquired. Taking it down!";
    }

}
