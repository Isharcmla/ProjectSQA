package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.util.HashMap;

public class Flat3Map_equals_1826922527811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205476;
     Object term205616;
     Object term214560;

    public Flat3Map_equals_1826922527811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term205524 = new HashMap();
        term205476 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term205476, term205476.getClass(), "delegateMap", null);
        setIntField(term205476, term205476.getClass(), "size", 3);
        setField(term205476, term205476.getClass(), "key3", null);
        setField(term205476, term205476.getClass(), "value3", null);
        setField(term205476, term205476.getClass(), "key2", term205524);
        HashMap term205664 = new HashMap();
        term205616 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term205616, term205616.getClass(), "delegateMap", null);
        setIntField(term205616, term205616.getClass(), "size", 3);
        setField(term205616, term205616.getClass(), "key3", term205664);
        setField(term205616, term205616.getClass(), "key2", null);
        setField(term205616, term205616.getClass(), "value2", null);
        setIntField(term205616, term205616.getClass(), "hash3", 0);
        term214560 = (short[]) newShortArray(32);
        setShortElement(term214560, 0, (short) 14);
        setShortElement(term214560, 1, (short) 15);
        setShortElement(term214560, 2, (short) 7);
        setShortElement(term214560, 3, (short) 3);
        setShortElement(term214560, 4, (short) 3);
        setShortElement(term214560, 8, (short) 7);
        setShortElement(term214560, 9, (short) 2);
        setShortElement(term214560, 10, (short) 3);
        setShortElement(term214560, 14, (short) 1);
        setShortElement(term214560, 15, (short) 4);
        setShortElement(term214560, 16, (short) 4);
        setShortElement(term214560, 17, (short) 3);
        setShortElement(term214560, 18, (short) 4);
        setShortElement(term214560, 19, (short) 4);
        setShortElement(term214560, 20, (short) 1);
        setShortElement(term214560, 21, (short) 2);
        setShortElement(term214560, 22, (short) 3);
        setShortElement(term214560, 23, (short) 3);
        setShortElement(term214560, 24, (short) 13);
        setShortElement(term214560, 25, (short) 1);
        setShortElement(term214560, 26, (short) 2);
        setShortElement(term214560, 27, (short) 12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term205616;
        callMethod(klass, "equals", argTypes, term205476, args);
        assertTrue(recursiveEquals(term205476, term214560));
        assertTrue(recursiveEquals(term205616, (short) 3));
    }

};


