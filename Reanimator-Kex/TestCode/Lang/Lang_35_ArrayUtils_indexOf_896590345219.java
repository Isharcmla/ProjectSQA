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

public class ArrayUtils_indexOf_896590345219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475;
     Object term484;
     Object term12384;
     Object term12393;

    public ArrayUtils_indexOf_896590345219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475 = (Object[]) newArray("java.lang.Object", 8);
        Object term476 = newInstance(Class.forName("java.lang.Object"));
        Object term477 = newInstance(Class.forName("java.lang.Object"));
        Object term478 = newInstance(Class.forName("java.lang.Object"));
        Object term479 = newInstance(Class.forName("java.lang.Object"));
        Object term480 = newInstance(Class.forName("java.lang.Object"));
        Object term481 = newInstance(Class.forName("java.lang.Object"));
        Object term482 = newInstance(Class.forName("java.lang.Object"));
        Object term483 = newInstance(Class.forName("java.lang.Object"));
        setElement(term475, 0, term476);
        setElement(term475, 1, term477);
        setElement(term475, 2, term478);
        setElement(term475, 3, term479);
        setElement(term475, 4, term480);
        setElement(term475, 5, term481);
        setElement(term475, 6, term482);
        setElement(term475, 7, term483);
        term484 = newInstance(Class.forName("java.lang.Object"));
        term12384 = (Object[]) newArray("java.lang.Object", 8);
        Object term12385 = newInstance(Class.forName("java.lang.Object"));
        Object term12386 = newInstance(Class.forName("java.lang.Object"));
        Object term12387 = newInstance(Class.forName("java.lang.Object"));
        Object term12388 = newInstance(Class.forName("java.lang.Object"));
        Object term12389 = newInstance(Class.forName("java.lang.Object"));
        Object term12390 = newInstance(Class.forName("java.lang.Object"));
        Object term12391 = newInstance(Class.forName("java.lang.Object"));
        Object term12392 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12384, 0, term12385);
        setElement(term12384, 1, term12386);
        setElement(term12384, 2, term12387);
        setElement(term12384, 3, term12388);
        setElement(term12384, 4, term12389);
        setElement(term12384, 5, term12390);
        setElement(term12384, 6, term12391);
        setElement(term12384, 7, term12392);
        term12393 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term475;
        args[1] = term484;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term475, term12384));
        assertTrue(recursiveEquals(term484, term12393));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


