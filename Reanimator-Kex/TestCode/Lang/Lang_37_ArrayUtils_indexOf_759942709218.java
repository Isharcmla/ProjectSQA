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

public class ArrayUtils_indexOf_759942709218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474;
     Object term478;
     Object term479;
     Object term12366;
     Object term12370;

    public ArrayUtils_indexOf_759942709218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474 = (Object[]) newArray("java.lang.Object", 3);
        Object term475 = newInstance(Class.forName("java.lang.Object"));
        Object term476 = newInstance(Class.forName("java.lang.Object"));
        Object term477 = newInstance(Class.forName("java.lang.Object"));
        setElement(term474, 0, term475);
        setElement(term474, 1, term476);
        setElement(term474, 2, term477);
        term478 = newInstance(Class.forName("java.lang.Object"));
        term479 = new Integer(-1145578966);
        term12366 = (Object[]) newArray("java.lang.Object", 3);
        Object term12367 = newInstance(Class.forName("java.lang.Object"));
        Object term12368 = newInstance(Class.forName("java.lang.Object"));
        Object term12369 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12366, 0, term12367);
        setElement(term12366, 1, term12368);
        setElement(term12366, 2, term12369);
        term12370 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term474;
        args[1] = term478;
        args[2] = term479;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term474, term12366));
        assertTrue(recursiveEquals(term478, term12370));
        assertTrue(recursiveEquals(term479, -1145578966));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


