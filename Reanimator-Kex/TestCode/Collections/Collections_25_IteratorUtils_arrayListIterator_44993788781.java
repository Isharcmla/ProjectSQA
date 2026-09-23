package org.apache.commons.collections4;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;
import java.lang.Object;

public class IteratorUtils_arrayListIterator_44993788781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36;
     Object term1691;
     Object term1675;

    public IteratorUtils_arrayListIterator_44993788781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36 = (Object[]) newArray("java.lang.Object", 7);
        Object term37 = newInstance(Class.forName("java.lang.Object"));
        Object term38 = newInstance(Class.forName("java.lang.Object"));
        Object term39 = newInstance(Class.forName("java.lang.Object"));
        Object term40 = newInstance(Class.forName("java.lang.Object"));
        Object term41 = newInstance(Class.forName("java.lang.Object"));
        Object term42 = newInstance(Class.forName("java.lang.Object"));
        Object term43 = newInstance(Class.forName("java.lang.Object"));
        setElement(term36, 0, term37);
        setElement(term36, 1, term38);
        setElement(term36, 2, term39);
        setElement(term36, 3, term40);
        setElement(term36, 4, term41);
        setElement(term36, 5, term42);
        setElement(term36, 6, term43);
        term1691 = (Object[]) newArray("java.lang.Object", 7);
        Object term1692 = newInstance(Class.forName("java.lang.Object"));
        Object term1693 = newInstance(Class.forName("java.lang.Object"));
        Object term1694 = newInstance(Class.forName("java.lang.Object"));
        Object term1695 = newInstance(Class.forName("java.lang.Object"));
        Object term1696 = newInstance(Class.forName("java.lang.Object"));
        Object term1697 = newInstance(Class.forName("java.lang.Object"));
        Object term1698 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1691, 0, term1692);
        setElement(term1691, 1, term1693);
        setElement(term1691, 2, term1694);
        setElement(term1691, 3, term1695);
        setElement(term1691, 4, term1696);
        setElement(term1691, 5, term1697);
        setElement(term1691, 6, term1698);
        term1675 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ObjectArrayListIterator"));
        Object[] term1677 = (Object[]) newArray("java.lang.Object", 7);
        Object term1678 = newInstance(Class.forName("java.lang.Object"));
        Object term1679 = newInstance(Class.forName("java.lang.Object"));
        Object term1680 = newInstance(Class.forName("java.lang.Object"));
        Object term1681 = newInstance(Class.forName("java.lang.Object"));
        Object term1682 = newInstance(Class.forName("java.lang.Object"));
        Object term1683 = newInstance(Class.forName("java.lang.Object"));
        Object term1684 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1675, term1675.getClass(), "lastItemIndex", -1);
        setElement(term1677, 0, term1678);
        setElement(term1677, 1, term1679);
        setElement(term1677, 2, term1680);
        setElement(term1677, 3, term1681);
        setElement(term1677, 4, term1682);
        setElement(term1677, 5, term1683);
        setElement(term1677, 6, term1684);
        setField(term1675, term1675.getClass(), "array", term1677);
        setIntField(term1675, term1675.getClass(), "startIndex", 0);
        setIntField(term1675, term1675.getClass(), "endIndex", 7);
        setIntField(term1675, term1675.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term36;
        Object retValue = callMethod(klass, "arrayListIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term36, term1691));
        assertTrue(recursiveEquals(retValue, term1675));
    }

};


