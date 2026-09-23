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

public class ArrayUtils_indexOf_896590345217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464;
     Object term473;
     Object term12338;
     Object term12347;

    public ArrayUtils_indexOf_896590345217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464 = (Object[]) newArray("java.lang.Object", 8);
        Object term465 = newInstance(Class.forName("java.lang.Object"));
        Object term466 = newInstance(Class.forName("java.lang.Object"));
        Object term467 = newInstance(Class.forName("java.lang.Object"));
        Object term468 = newInstance(Class.forName("java.lang.Object"));
        Object term469 = newInstance(Class.forName("java.lang.Object"));
        Object term470 = newInstance(Class.forName("java.lang.Object"));
        Object term471 = newInstance(Class.forName("java.lang.Object"));
        Object term472 = newInstance(Class.forName("java.lang.Object"));
        setElement(term464, 0, term465);
        setElement(term464, 1, term466);
        setElement(term464, 2, term467);
        setElement(term464, 3, term468);
        setElement(term464, 4, term469);
        setElement(term464, 5, term470);
        setElement(term464, 6, term471);
        setElement(term464, 7, term472);
        term473 = newInstance(Class.forName("java.lang.Object"));
        term12338 = (Object[]) newArray("java.lang.Object", 8);
        Object term12339 = newInstance(Class.forName("java.lang.Object"));
        Object term12340 = newInstance(Class.forName("java.lang.Object"));
        Object term12341 = newInstance(Class.forName("java.lang.Object"));
        Object term12342 = newInstance(Class.forName("java.lang.Object"));
        Object term12343 = newInstance(Class.forName("java.lang.Object"));
        Object term12344 = newInstance(Class.forName("java.lang.Object"));
        Object term12345 = newInstance(Class.forName("java.lang.Object"));
        Object term12346 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12338, 0, term12339);
        setElement(term12338, 1, term12340);
        setElement(term12338, 2, term12341);
        setElement(term12338, 3, term12342);
        setElement(term12338, 4, term12343);
        setElement(term12338, 5, term12344);
        setElement(term12338, 6, term12345);
        setElement(term12338, 7, term12346);
        term12347 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term464;
        args[1] = term473;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term464, term12338));
        assertTrue(recursiveEquals(term473, term12347));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


