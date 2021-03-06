package group144.tetin;

/** A class that represent list with unique elements */
public class UniqueList<ElementType> extends List<ElementType> {

    /** Add element in head, but if element already in list a method throws exception
     * @exception AlreadyInListException throws when adds element that already in list
     * */
    void add(ElementType value) throws AlreadyInListException {
        if (ElementInList(value)){
            throw new AlreadyInListException();
        }

        super.add(value);
    }

    /** Add element to list with certain index */
    void add(ElementType value, int index) throws AlreadyInListException {
        if (ElementInList(value)){
            throw new AlreadyInListException();
        }

        super.add(value, index);
    }

}
