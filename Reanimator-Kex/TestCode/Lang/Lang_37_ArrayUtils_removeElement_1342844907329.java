package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;

public class ArrayUtils_removeElement_1342844907329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1799;
     Object term1806;
     Object term23631;
     Object term23638;
     Object term23630;

    public ArrayUtils_removeElement_1342844907329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1799 = (Object[]) newArray("java.lang.Object", 6);
        Object term1800 = newInstance(Class.forName("java.lang.Object"));
        Object term1801 = newInstance(Class.forName("java.lang.Object"));
        Object term1802 = newInstance(Class.forName("java.lang.Object"));
        Object term1803 = newInstance(Class.forName("java.lang.Object"));
        Object term1804 = newInstance(Class.forName("java.lang.Object"));
        Object term1805 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1799, 0, term1800);
        setElement(term1799, 1, term1801);
        setElement(term1799, 2, term1802);
        setElement(term1799, 3, term1803);
        setElement(term1799, 4, term1804);
        setElement(term1799, 5, term1805);
        term1806 = newInstance(Class.forName("java.lang.Object"));
        term23631 = (Object[]) newArray("java.lang.Object", 6);
        Object term23632 = newInstance(Class.forName("java.lang.Object"));
        Object term23633 = newInstance(Class.forName("java.lang.Object"));
        Object term23634 = newInstance(Class.forName("java.lang.Object"));
        Object term23635 = newInstance(Class.forName("java.lang.Object"));
        Object term23636 = newInstance(Class.forName("java.lang.Object"));
        Object term23637 = newInstance(Class.forName("java.lang.Object"));
        setElement(term23631, 0, term23632);
        setElement(term23631, 1, term23633);
        setElement(term23631, 2, term23634);
        setElement(term23631, 3, term23635);
        setElement(term23631, 4, term23636);
        setElement(term23631, 5, term23637);
        term23638 = newInstance(Class.forName("java.lang.Object"));
        term23630 = (Object[]) newArray("java.lang.Object", 6);
        Object term23612 = newInstance(Class.forName("java.lang.Object"));
        Object term23613 = newInstance(Class.forName("java.lang.Object"));
        Object term23614 = newInstance(Class.forName("java.lang.Object"));
        Object term23615 = newInstance(Class.forName("java.lang.Object"));
        Object term23616 = newInstance(Class.forName("java.lang.Object"));
        Object term23617 = newInstance(Class.forName("java.lang.Object"));
        setElement(term23630, 0, term23612);
        setElement(term23630, 1, term23613);
        setElement(term23630, 2, term23614);
        setElement(term23630, 3, term23615);
        setElement(term23630, 4, term23616);
        setElement(term23630, 5, term23617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term1799;
        args[1] = term1806;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1799, term23631));
        assertTrue(recursiveEquals(term1806, term23638));
        assertTrue(recursiveEquals(retValue, term23630));
    }

};


