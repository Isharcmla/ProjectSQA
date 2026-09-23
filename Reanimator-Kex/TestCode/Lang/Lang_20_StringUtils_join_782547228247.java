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

public class StringUtils_join_782547228247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1762;
     Object term10495;

    public StringUtils_join_782547228247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1762 = (Object[]) newArray("java.lang.Object", 6);
        Object term1763 = newInstance(Class.forName("java.lang.Object"));
        Object term1764 = newInstance(Class.forName("java.lang.Object"));
        Object term1765 = newInstance(Class.forName("java.lang.Object"));
        Object term1766 = newInstance(Class.forName("java.lang.Object"));
        Object term1767 = newInstance(Class.forName("java.lang.Object"));
        Object term1768 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1762, 0, term1763);
        setElement(term1762, 1, term1764);
        setElement(term1762, 2, term1765);
        setElement(term1762, 3, term1766);
        setElement(term1762, 4, term1767);
        setElement(term1762, 5, term1768);
        term10495 = (Object[]) newArray("java.lang.Object", 6);
        Object term10496 = newInstance(Class.forName("java.lang.Object"));
        Object term10497 = newInstance(Class.forName("java.lang.Object"));
        Object term10498 = newInstance(Class.forName("java.lang.Object"));
        Object term10499 = newInstance(Class.forName("java.lang.Object"));
        Object term10500 = newInstance(Class.forName("java.lang.Object"));
        Object term10501 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10495, 0, term10496);
        setElement(term10495, 1, term10497);
        setElement(term10495, 2, term10498);
        setElement(term10495, 3, term10499);
        setElement(term10495, 4, term10500);
        setElement(term10495, 5, term10501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1762;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term1762, term10495));
        assertTrue(recursiveEquals(retValue, "java.lang.Object@3555dcf6java.lang.Object@7d862a4fjava.lang.Object@58032db9java.lang.Object@bab60aajava.lang.Object@53694f6djava.lang.Object@5b8e6d43"));
    }

};


