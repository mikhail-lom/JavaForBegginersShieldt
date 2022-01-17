package qpack;

//Insert queue of symbols interface
public interface ICharQ {
    //Symbol insertion
    void put(char ch);

    //Symbol extraction
    char get();
}
