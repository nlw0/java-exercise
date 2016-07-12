import java.util.Iterator;

class IteratorWithHead {
    private Integer x;
    private Iterator<Integer> it;

    private int count = 1;

    private int skip;

    public IteratorWithHead(Iterator<Integer> it_) {
        this(it_, 0);
    }

    public IteratorWithHead(Iterator<Integer> it_, int skip_) {
        it = it_;
        skip = skip_;
        next();
    }

    public boolean nonEmpty() {
        return it.hasNext() || (count > 0);
    }

    public void next() {
        if (it.hasNext()) {
            x = it.next();
            int ii;
            for (ii = 0; ii < skip; ii++)
                if (it.hasNext()) it.next();
        } else {
            count--;
        }
    }

    public Integer head() {
        return x;
    }
}
