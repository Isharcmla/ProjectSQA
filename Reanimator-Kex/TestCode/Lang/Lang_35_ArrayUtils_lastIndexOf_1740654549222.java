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

public class ArrayUtils_lastIndexOf_1740654549222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500;
     Object term509;
     Object term510;
     Object term12488;
     Object term12497;

    public ArrayUtils_lastIndexOf_1740654549222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term500 = (Object[]) newArray("java.lang.Object", 8);
        Object term501 = newInstance(Class.forName("java.lang.Object"));
        Object term502 = newInstance(Class.forName("java.lang.Object"));
        Object term503 = newInstance(Class.forName("java.lang.Object"));
        Object term504 = newInstance(Class.forName("java.lang.Object"));
        Object term505 = newInstance(Class.forName("java.lang.Object"));
        Object term506 = newInstance(Class.forName("java.lang.Object"));
        Object term507 = newInstance(Class.forName("java.lang.Object"));
        Object term508 = newInstance(Class.forName("java.lang.Object"));
        setElement(term500, 0, term501);
        setElement(term500, 1, term502);
        setElement(term500, 2, term503);
        setElement(term500, 3, term504);
        setElement(term500, 4, term505);
        setElement(term500, 5, term506);
        setElement(term500, 6, term507);
        setElement(term500, 7, term508);
        term509 = newInstance(Class.forName("java.lang.Object"));
        term510 = new Integer(679763016);
        term12488 = (Object[]) newArray("java.lang.Object", 8);
        Object term12489 = newInstance(Class.forName("java.lang.Object"));
        Object term12490 = newInstance(Class.forName("java.lang.Object"));
        Object term12491 = newInstance(Class.forName("java.lang.Object"));
        Object term12492 = newInstance(Class.forName("java.lang.Object"));
        Object term12493 = newInstance(Class.forName("java.lang.Object"));
        Object term12494 = newInstance(Class.forName("java.lang.Object"));
        Object term12495 = newInstance(Class.forName("java.lang.Object"));
        Object term12496 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12488, 0, term12489);
        setElement(term12488, 1, term12490);
        setElement(term12488, 2, term12491);
        setElement(term12488, 3, term12492);
        setElement(term12488, 4, term12493);
        setElement(term12488, 5, term12494);
        setElement(term12488, 6, term12495);
        setElement(term12488, 7, term12496);
        term12497 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term500;
        args[1] = term509;
        args[2] = term510;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term500, term12488));
        assertTrue(recursiveEquals(term509, term12497));
        assertTrue(recursiveEquals(term510, 679763016));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


