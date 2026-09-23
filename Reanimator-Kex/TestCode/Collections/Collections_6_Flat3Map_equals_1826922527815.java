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
import java.lang.Object;

public class Flat3Map_equals_1826922527815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207043;
     Object term207215;
     Object term214663;

    public Flat3Map_equals_1826922527815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207043 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term207123 = newInstance(Class.forName("java.nio.file.StandardWatchEventKinds"));
        setField(term207043, term207043.getClass(), "delegateMap", null);
        setIntField(term207043, term207043.getClass(), "size", 3);
        setField(term207043, term207043.getClass(), "key3", term207123);
        term207215 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term207215, term207215.getClass(), "delegateMap", null);
        setIntField(term207215, term207215.getClass(), "size", 3);
        setIntField(term207215, term207215.getClass(), "hash3", -1);
        setIntField(term207215, term207215.getClass(), "hash2", -1);
        setIntField(term207215, term207215.getClass(), "hash1", 0);
        term214663 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term214664 = newInstance(Class.forName("java.nio.file.StandardWatchEventKinds"));
        setIntField(term214663, term214663.getClass(), "size", 3);
        setIntField(term214663, term214663.getClass(), "hash1", 0);
        setIntField(term214663, term214663.getClass(), "hash2", 0);
        setIntField(term214663, term214663.getClass(), "hash3", 5);
        setField(term214663, term214663.getClass(), "key1", null);
        setField(term214663, term214663.getClass(), "key2", null);
        setField(term214663, term214663.getClass(), "key3", term214664);
        setField(term214663, term214663.getClass(), "value1", null);
        setField(term214663, term214663.getClass(), "value2", null);
        setField(term214663, term214663.getClass(), "value3", null);
        setField(term214663, term214663.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term207215;
        Object retValue = callMethod(klass, "equals", argTypes, term207043, args);
        assertTrue(recursiveEquals(term207043, term214663));
        assertTrue(recursiveEquals(term207215, 652129701));
        assertTrue(recursiveEquals(retValue, false));
    }

};


