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
import java.lang.Integer;

public class ArrayUtils_lastIndexOf_1740654549220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489;
     Object term498;
     Object term499;
     Object term12442;
     Object term12451;

    public ArrayUtils_lastIndexOf_1740654549220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489 = (Object[]) newArray("java.lang.Object", 8);
        Object term490 = newInstance(Class.forName("java.lang.Object"));
        Object term491 = newInstance(Class.forName("java.lang.Object"));
        Object term492 = newInstance(Class.forName("java.lang.Object"));
        Object term493 = newInstance(Class.forName("java.lang.Object"));
        Object term494 = newInstance(Class.forName("java.lang.Object"));
        Object term495 = newInstance(Class.forName("java.lang.Object"));
        Object term496 = newInstance(Class.forName("java.lang.Object"));
        Object term497 = newInstance(Class.forName("java.lang.Object"));
        setElement(term489, 0, term490);
        setElement(term489, 1, term491);
        setElement(term489, 2, term492);
        setElement(term489, 3, term493);
        setElement(term489, 4, term494);
        setElement(term489, 5, term495);
        setElement(term489, 6, term496);
        setElement(term489, 7, term497);
        term498 = newInstance(Class.forName("java.lang.Object"));
        term499 = new Integer(679763016);
        term12442 = (Object[]) newArray("java.lang.Object", 8);
        Object term12443 = newInstance(Class.forName("java.lang.Object"));
        Object term12444 = newInstance(Class.forName("java.lang.Object"));
        Object term12445 = newInstance(Class.forName("java.lang.Object"));
        Object term12446 = newInstance(Class.forName("java.lang.Object"));
        Object term12447 = newInstance(Class.forName("java.lang.Object"));
        Object term12448 = newInstance(Class.forName("java.lang.Object"));
        Object term12449 = newInstance(Class.forName("java.lang.Object"));
        Object term12450 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12442, 0, term12443);
        setElement(term12442, 1, term12444);
        setElement(term12442, 2, term12445);
        setElement(term12442, 3, term12446);
        setElement(term12442, 4, term12447);
        setElement(term12442, 5, term12448);
        setElement(term12442, 6, term12449);
        setElement(term12442, 7, term12450);
        term12451 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term489;
        args[1] = term498;
        args[2] = term499;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term489, term12442));
        assertTrue(recursiveEquals(term498, term12451));
        assertTrue(recursiveEquals(term499, 679763016));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


