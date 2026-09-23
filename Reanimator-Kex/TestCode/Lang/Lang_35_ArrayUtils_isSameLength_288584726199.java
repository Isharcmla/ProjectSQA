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

public class ArrayUtils_isSameLength_288584726199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218;
     Object term221;
     Object term11583;
     Object term11586;

    public ArrayUtils_isSameLength_288584726199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218 = (Object[]) newArray("java.lang.Object", 2);
        Object term219 = newInstance(Class.forName("java.lang.Object"));
        Object term220 = newInstance(Class.forName("java.lang.Object"));
        setElement(term218, 0, term219);
        setElement(term218, 1, term220);
        term221 = (Object[]) newArray("java.lang.Object", 8);
        Object term222 = newInstance(Class.forName("java.lang.Object"));
        Object term223 = newInstance(Class.forName("java.lang.Object"));
        Object term224 = newInstance(Class.forName("java.lang.Object"));
        Object term225 = newInstance(Class.forName("java.lang.Object"));
        Object term226 = newInstance(Class.forName("java.lang.Object"));
        Object term227 = newInstance(Class.forName("java.lang.Object"));
        Object term228 = newInstance(Class.forName("java.lang.Object"));
        Object term229 = newInstance(Class.forName("java.lang.Object"));
        setElement(term221, 0, term222);
        setElement(term221, 1, term223);
        setElement(term221, 2, term224);
        setElement(term221, 3, term225);
        setElement(term221, 4, term226);
        setElement(term221, 5, term227);
        setElement(term221, 6, term228);
        setElement(term221, 7, term229);
        term11583 = (Object[]) newArray("java.lang.Object", 2);
        Object term11584 = newInstance(Class.forName("java.lang.Object"));
        Object term11585 = newInstance(Class.forName("java.lang.Object"));
        setElement(term11583, 0, term11584);
        setElement(term11583, 1, term11585);
        term11586 = (Object[]) newArray("java.lang.Object", 8);
        Object term11587 = newInstance(Class.forName("java.lang.Object"));
        Object term11588 = newInstance(Class.forName("java.lang.Object"));
        Object term11589 = newInstance(Class.forName("java.lang.Object"));
        Object term11590 = newInstance(Class.forName("java.lang.Object"));
        Object term11591 = newInstance(Class.forName("java.lang.Object"));
        Object term11592 = newInstance(Class.forName("java.lang.Object"));
        Object term11593 = newInstance(Class.forName("java.lang.Object"));
        Object term11594 = newInstance(Class.forName("java.lang.Object"));
        setElement(term11586, 0, term11587);
        setElement(term11586, 1, term11588);
        setElement(term11586, 2, term11589);
        setElement(term11586, 3, term11590);
        setElement(term11586, 4, term11591);
        setElement(term11586, 5, term11592);
        setElement(term11586, 6, term11593);
        setElement(term11586, 7, term11594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term218;
        args[1] = term221;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term218, term11583));
        assertTrue(recursiveEquals(term221, term11586));
        assertTrue(recursiveEquals(retValue, false));
    }

};


