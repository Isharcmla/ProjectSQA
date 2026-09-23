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

public class ArrayUtils_contains_1849521215221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501;
     Object term511;
     Object term12491;
     Object term12501;

    public ArrayUtils_contains_1849521215221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501 = (Object[]) newArray("java.lang.Object", 9);
        Object term502 = newInstance(Class.forName("java.lang.Object"));
        Object term503 = newInstance(Class.forName("java.lang.Object"));
        Object term504 = newInstance(Class.forName("java.lang.Object"));
        Object term505 = newInstance(Class.forName("java.lang.Object"));
        Object term506 = newInstance(Class.forName("java.lang.Object"));
        Object term507 = newInstance(Class.forName("java.lang.Object"));
        Object term508 = newInstance(Class.forName("java.lang.Object"));
        Object term509 = newInstance(Class.forName("java.lang.Object"));
        Object term510 = newInstance(Class.forName("java.lang.Object"));
        setElement(term501, 0, term502);
        setElement(term501, 1, term503);
        setElement(term501, 2, term504);
        setElement(term501, 3, term505);
        setElement(term501, 4, term506);
        setElement(term501, 5, term507);
        setElement(term501, 6, term508);
        setElement(term501, 7, term509);
        setElement(term501, 8, term510);
        term511 = newInstance(Class.forName("java.lang.Object"));
        term12491 = (Object[]) newArray("java.lang.Object", 9);
        Object term12492 = newInstance(Class.forName("java.lang.Object"));
        Object term12493 = newInstance(Class.forName("java.lang.Object"));
        Object term12494 = newInstance(Class.forName("java.lang.Object"));
        Object term12495 = newInstance(Class.forName("java.lang.Object"));
        Object term12496 = newInstance(Class.forName("java.lang.Object"));
        Object term12497 = newInstance(Class.forName("java.lang.Object"));
        Object term12498 = newInstance(Class.forName("java.lang.Object"));
        Object term12499 = newInstance(Class.forName("java.lang.Object"));
        Object term12500 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12491, 0, term12492);
        setElement(term12491, 1, term12493);
        setElement(term12491, 2, term12494);
        setElement(term12491, 3, term12495);
        setElement(term12491, 4, term12496);
        setElement(term12491, 5, term12497);
        setElement(term12491, 6, term12498);
        setElement(term12491, 7, term12499);
        setElement(term12491, 8, term12500);
        term12501 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term501;
        args[1] = term511;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term501, term12491));
        assertTrue(recursiveEquals(term511, term12501));
        assertTrue(recursiveEquals(retValue, false));
    }

};


