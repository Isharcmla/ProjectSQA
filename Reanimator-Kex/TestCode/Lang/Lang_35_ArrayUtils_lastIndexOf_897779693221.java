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

public class ArrayUtils_lastIndexOf_897779693221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492;
     Object term499;
     Object term12446;
     Object term12453;

    public ArrayUtils_lastIndexOf_897779693221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492 = (Object[]) newArray("java.lang.Object", 6);
        Object term493 = newInstance(Class.forName("java.lang.Object"));
        Object term494 = newInstance(Class.forName("java.lang.Object"));
        Object term495 = newInstance(Class.forName("java.lang.Object"));
        Object term496 = newInstance(Class.forName("java.lang.Object"));
        Object term497 = newInstance(Class.forName("java.lang.Object"));
        Object term498 = newInstance(Class.forName("java.lang.Object"));
        setElement(term492, 0, term493);
        setElement(term492, 1, term494);
        setElement(term492, 2, term495);
        setElement(term492, 3, term496);
        setElement(term492, 4, term497);
        setElement(term492, 5, term498);
        term499 = newInstance(Class.forName("java.lang.Object"));
        term12446 = (Object[]) newArray("java.lang.Object", 6);
        Object term12447 = newInstance(Class.forName("java.lang.Object"));
        Object term12448 = newInstance(Class.forName("java.lang.Object"));
        Object term12449 = newInstance(Class.forName("java.lang.Object"));
        Object term12450 = newInstance(Class.forName("java.lang.Object"));
        Object term12451 = newInstance(Class.forName("java.lang.Object"));
        Object term12452 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12446, 0, term12447);
        setElement(term12446, 1, term12448);
        setElement(term12446, 2, term12449);
        setElement(term12446, 3, term12450);
        setElement(term12446, 4, term12451);
        setElement(term12446, 5, term12452);
        term12453 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term492;
        args[1] = term499;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term492, term12446));
        assertTrue(recursiveEquals(term499, term12453));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


