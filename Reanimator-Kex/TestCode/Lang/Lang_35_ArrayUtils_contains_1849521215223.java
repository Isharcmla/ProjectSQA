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

public class ArrayUtils_contains_1849521215223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512;
     Object term522;
     Object term12537;
     Object term12547;

    public ArrayUtils_contains_1849521215223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term512 = (Object[]) newArray("java.lang.Object", 9);
        Object term513 = newInstance(Class.forName("java.lang.Object"));
        Object term514 = newInstance(Class.forName("java.lang.Object"));
        Object term515 = newInstance(Class.forName("java.lang.Object"));
        Object term516 = newInstance(Class.forName("java.lang.Object"));
        Object term517 = newInstance(Class.forName("java.lang.Object"));
        Object term518 = newInstance(Class.forName("java.lang.Object"));
        Object term519 = newInstance(Class.forName("java.lang.Object"));
        Object term520 = newInstance(Class.forName("java.lang.Object"));
        Object term521 = newInstance(Class.forName("java.lang.Object"));
        setElement(term512, 0, term513);
        setElement(term512, 1, term514);
        setElement(term512, 2, term515);
        setElement(term512, 3, term516);
        setElement(term512, 4, term517);
        setElement(term512, 5, term518);
        setElement(term512, 6, term519);
        setElement(term512, 7, term520);
        setElement(term512, 8, term521);
        term522 = newInstance(Class.forName("java.lang.Object"));
        term12537 = (Object[]) newArray("java.lang.Object", 9);
        Object term12538 = newInstance(Class.forName("java.lang.Object"));
        Object term12539 = newInstance(Class.forName("java.lang.Object"));
        Object term12540 = newInstance(Class.forName("java.lang.Object"));
        Object term12541 = newInstance(Class.forName("java.lang.Object"));
        Object term12542 = newInstance(Class.forName("java.lang.Object"));
        Object term12543 = newInstance(Class.forName("java.lang.Object"));
        Object term12544 = newInstance(Class.forName("java.lang.Object"));
        Object term12545 = newInstance(Class.forName("java.lang.Object"));
        Object term12546 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12537, 0, term12538);
        setElement(term12537, 1, term12539);
        setElement(term12537, 2, term12540);
        setElement(term12537, 3, term12541);
        setElement(term12537, 4, term12542);
        setElement(term12537, 5, term12543);
        setElement(term12537, 6, term12544);
        setElement(term12537, 7, term12545);
        setElement(term12537, 8, term12546);
        term12547 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term512;
        args[1] = term522;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term512, term12537));
        assertTrue(recursiveEquals(term522, term12547));
        assertTrue(recursiveEquals(retValue, false));
    }

};


