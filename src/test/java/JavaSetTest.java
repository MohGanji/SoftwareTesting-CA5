import org.junit.Test;
import java.util.TreeSet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JavaSetTest {

    @Test
    public void contains_test1(){    // TTTT
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(10);
        tree.add(15);
        assertTrue(tree.contains(10));
    }

    @Test
    public void contains_test2() {    // FTTT
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(10);
        tree.add(15);
        assertFalse(tree.contains(50));
    }

    @Test(expected = NullPointerException.class)
    public void contains_test3() {    // TTTF
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.contains(null);
    }

    @Test
    public void add_test1(){    // TT
        TreeSet<Integer> tree = new TreeSet<Integer>();
        assertTrue(tree.add(10));
    }

    @Test(expected = ClassCastException.class)
    public void add_test2(){    // FT
        TreeSet<Integer> tree = new TreeSet<Integer>();
        Object o = "10";
        tree.add((Integer) o);
    }

    @Test(expected = NullPointerException.class)
    public void add_test3(){    // TF
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(null);
    }

    @Test
    public void remove_test1(){    // TTTT
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(10);
        assertTrue(tree.remove(10));
    }

    @Test
    public void remove_test2(){    // FTTT
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(10);
        assertFalse(tree.remove(15));
    }

    @Test(expected = ClassCastException.class)
    public void remove_test3(){    // TFTT
        TreeSet<Integer> tree = new TreeSet<Integer>();
        Object o = "10";
        tree.remove((Integer) o);
    }

    @Test
    public void remove_test4(){    // TTFT
        TreeSet<Integer> tree = new TreeSet<Integer>();
        assertFalse(tree.remove(10));
    }

    @Test(expected = NullPointerException.class)
    public void remove_test5(){    // TTTF
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.remove(null);
    }

    @Test
    public void containsAll_test1(){    // TTTT
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(10);
        tree.add(15);
        TreeSet<Integer> tree2 = new TreeSet<Integer>();
        tree2.add(10);
        tree2.add(15);
        assertTrue(tree.containsAll(tree2));
    }

    @Test(expected = ClassCastException.class)
    public void containsAll_test2(){    // FTTT
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(10);
        TreeSet<String> tree2 = new TreeSet<String>();
        tree2.add("10");
        tree.containsAll(tree2);
    }

    @Test
    public void containsAll_test3(){    // TFTT
        TreeSet<Integer> tree = new TreeSet<Integer>();
        TreeSet<Integer> tree2 = new TreeSet<Integer>();
        assertTrue(tree.containsAll(tree2));
    }

    @Test
    public void containsAll_test4(){    // TTFT
        TreeSet<Integer> tree = new TreeSet<Integer>();
        TreeSet<Integer> tree2 = new TreeSet<Integer>();
        tree.add(10);
        tree2.add(10);
        tree2.add(15);
        assertFalse(tree.containsAll(tree2));
    }

    @Test(expected = NullPointerException.class)
    public void containsAll_test5(){    // TTTF
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.containsAll(null);
    }
}
