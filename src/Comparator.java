import javafx.scene.shape.Circle;

public interface Comparator extends java.util.Comparator<T> {
    int compare(Circle c1, Circle c2);
}
