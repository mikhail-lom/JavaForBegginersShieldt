package chapter9.exercise9_1;

//Insert queue of symbols interface
public interface ICharQClone {
    //Symbol insertion
    void put(char ch) throws QueueFullException;

    //Symbol extraction
    char get() throws QueueEmptyException;
}
