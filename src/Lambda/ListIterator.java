package Lambda;/*
 * Lambda.ListIterator.java
 *
 * Computer Science 112, Boston University
 */

/*
 * An interface for an iterator that iterates over a Lambda.List.
 */
public interface ListIterator {
    /*
     * does the iterator have additional items to visit?
     */
    boolean hasNext();

    /*
     * return a reference to the next Object in the iteration
     */
    Object next();
}
