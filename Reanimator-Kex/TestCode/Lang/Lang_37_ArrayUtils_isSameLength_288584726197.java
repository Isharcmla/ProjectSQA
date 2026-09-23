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

public class ArrayUtils_isSameLength_288584726197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;
     Object term210;
     Object term11537;
     Object term11540;

    public ArrayUtils_isSameLength_288584726197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207 = (Object[]) newArray("java.lang.Object", 2);
        Object term208 = newInstance(Class.forName("java.lang.Object"));
        Object term209 = newInstance(Class.forName("java.lang.Object"));
        setElement(term207, 0, term208);
        setElement(term207, 1, term209);
        term210 = (Object[]) newArray("java.lang.Object", 8);
        Object term211 = newInstance(Class.forName("java.lang.Object"));
        Object term212 = newInstance(Class.forName("java.lang.Object"));
        Object term213 = newInstance(Class.forName("java.lang.Object"));
        Object term214 = newInstance(Class.forName("java.lang.Object"));
        Object term215 = newInstance(Class.forName("java.lang.Object"));
        Object term216 = newInstance(Class.forName("java.lang.Object"));
        Object term217 = newInstance(Class.forName("java.lang.Object"));
        Object term218 = newInstance(Class.forName("java.lang.Object"));
        setElement(term210, 0, term211);
        setElement(term210, 1, term212);
        setElement(term210, 2, term213);
        setElement(term210, 3, term214);
        setElement(term210, 4, term215);
        setElement(term210, 5, term216);
        setElement(term210, 6, term217);
        setElement(term210, 7, term218);
        term11537 = (Object[]) newArray("java.lang.Object", 2);
        Object term11538 = newInstance(Class.forName("java.lang.Object"));
        Object term11539 = newInstance(Class.forName("java.lang.Object"));
        setElement(term11537, 0, term11538);
        setElement(term11537, 1, term11539);
        term11540 = (Object[]) newArray("java.lang.Object", 8);
        Object term11541 = newInstance(Class.forName("java.lang.Object"));
        Object term11542 = newInstance(Class.forName("java.lang.Object"));
        Object term11543 = newInstance(Class.forName("java.lang.Object"));
        Object term11544 = newInstance(Class.forName("java.lang.Object"));
        Object term11545 = newInstance(Class.forName("java.lang.Object"));
        Object term11546 = newInstance(Class.forName("java.lang.Object"));
        Object term11547 = newInstance(Class.forName("java.lang.Object"));
        Object term11548 = newInstance(Class.forName("java.lang.Object"));
        setElement(term11540, 0, term11541);
        setElement(term11540, 1, term11542);
        setElement(term11540, 2, term11543);
        setElement(term11540, 3, term11544);
        setElement(term11540, 4, term11545);
        setElement(term11540, 5, term11546);
        setElement(term11540, 6, term11547);
        setElement(term11540, 7, term11548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term207;
        args[1] = term210;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term207, term11537));
        assertTrue(recursiveEquals(term210, term11540));
        assertTrue(recursiveEquals(retValue, false));
    }

};


