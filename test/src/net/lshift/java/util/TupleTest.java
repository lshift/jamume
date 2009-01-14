package net.lshift.java.util;

import static net.lshift.java.util.Lists.list;
import static net.lshift.java.util.Tuples.tuple;
import static net.lshift.java.util.Tuples.map;
import junit.framework.TestCase;

import java.util.List;
import java.util.Map;

public class TupleTest
    extends TestCase
{
    @SuppressWarnings("unchecked")
    public void testStaticInitializers()
    {
        // This basically shows how when I import ThreeTuple.tuple I
        // also import all the overloaded 'tuple' methods in the super
        // classes.
        @SuppressWarnings("unused")
        List<ThreeTuple<Character,Integer,Integer>> l1 = list(
                        tuple('a', 1, 0),
                        tuple('b', 2, 0));
    }
    
    @SuppressWarnings("unchecked")
    public void testMapStaticInitializers()
    {
        @SuppressWarnings("unused")
        Map<Character,Integer> m1 = map(
            list(tuple('a', 1),
                 tuple('b', 2)));
        @SuppressWarnings("unused")
        Map<Character,Integer> m2 = map(
            tuple('a', 1),
            tuple('b', 2)); 
    }
    
    @SuppressWarnings("unchecked")
    public void testEquals()
    {
        assertEquals(tuple('a'), list('a'));
        assertEquals(tuple('a', 1), list('a', 1));
        assertEquals(tuple('a', 1, 0), list('a', 1, 0));
    }
}