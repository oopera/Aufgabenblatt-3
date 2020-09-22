package de.hrw.progra2.assignment3;

public class Vector2D {
    /**
     * x-coordinate of vector
     */
    double x;

    /**
     * y-coordinate of vector
     */
    double y;

    /**
     * Constructor setting coordinates
     *
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Helper method that computes distance between two vectors.
     *
     * @param a first vector
     * @param b second vector
     * @return distance between vectors
     */
    public static double getDistance(Vector2D a, Vector2D b) {
        Vector2D diff = new Vector2D(
                a.getX() - b.getX(),
                a.getY() - b.getY());
        return Math.sqrt(diff.getX() * diff.getX() + diff.getY() * diff.getY());
    }
}

