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

public class Flat3Map_remove_8406902791048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209358;
     Object term209390;
     Object term209602;
     Object term209603;

    public Flat3Map_remove_8406902791048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209358 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term209358, term209358.getClass(), "delegateMap", null);
        setIntField(term209358, term209358.getClass(), "size", 3);
        setIntField(term209358, term209358.getClass(), "hash3", 0);
        term209390 = newInstance(Class.forName("java.nio.Bits"));
        term209602 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term209602, term209602.getClass(), "size", 3);
        setIntField(term209602, term209602.getClass(), "hash1", 0);
        setIntField(term209602, term209602.getClass(), "hash2", 0);
        setIntField(term209602, term209602.getClass(), "hash3", 0);
        setField(term209602, term209602.getClass(), "key1", null);
        setField(term209602, term209602.getClass(), "key2", null);
        setField(term209602, term209602.getClass(), "key3", null);
        setField(term209602, term209602.getClass(), "value1", null);
        setField(term209602, term209602.getClass(), "value2", null);
        setField(term209602, term209602.getClass(), "value3", null);
        setField(term209602, term209602.getClass(), "delegateMap", null);
        term209603 = newInstance(Class.forName("java.nio.Bits"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term209390;
        Object retValue = callMethod(klass, "remove", argTypes, term209358, args);
        assertTrue(recursiveEquals(term209358, term209602));
        assertTrue(recursiveEquals(term209390, term209603));
        assertTrue(recursiveEquals(retValue, null));
    }

};
