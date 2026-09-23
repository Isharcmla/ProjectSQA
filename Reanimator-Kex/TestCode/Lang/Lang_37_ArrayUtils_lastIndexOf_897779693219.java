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

public class ArrayUtils_lastIndexOf_897779693219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481;
     Object term488;
     Object term12400;
     Object term12407;

    public ArrayUtils_lastIndexOf_897779693219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481 = (Object[]) newArray("java.lang.Object", 6);
        Object term482 = newInstance(Class.forName("java.lang.Object"));
        Object term483 = newInstance(Class.forName("java.lang.Object"));
        Object term484 = newInstance(Class.forName("java.lang.Object"));
        Object term485 = newInstance(Class.forName("java.lang.Object"));
        Object term486 = newInstance(Class.forName("java.lang.Object"));
        Object term487 = newInstance(Class.forName("java.lang.Object"));
        setElement(term481, 0, term482);
        setElement(term481, 1, term483);
        setElement(term481, 2, term484);
        setElement(term481, 3, term485);
        setElement(term481, 4, term486);
        setElement(term481, 5, term487);
        term488 = newInstance(Class.forName("java.lang.Object"));
        term12400 = (Object[]) newArray("java.lang.Object", 6);
        Object term12401 = newInstance(Class.forName("java.lang.Object"));
        Object term12402 = newInstance(Class.forName("java.lang.Object"));
        Object term12403 = newInstance(Class.forName("java.lang.Object"));
        Object term12404 = newInstance(Class.forName("java.lang.Object"));
        Object term12405 = newInstance(Class.forName("java.lang.Object"));
        Object term12406 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12400, 0, term12401);
        setElement(term12400, 1, term12402);
        setElement(term12400, 2, term12403);
        setElement(term12400, 3, term12404);
        setElement(term12400, 4, term12405);
        setElement(term12400, 5, term12406);
        term12407 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term481;
        args[1] = term488;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term481, term12400));
        assertTrue(recursiveEquals(term488, term12407));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


