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

public class Flat3Map_put_1944740725915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184402;
     Object term184534;
     Object term184535;

    public Flat3Map_put_1944740725915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184402 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term184402, term184402.getClass(), "delegateMap", null);
        setIntField(term184402, term184402.getClass(), "size", 2);
        setIntField(term184402, term184402.getClass(), "hash2", 0);
        setField(term184402, term184402.getClass(), "value2", null);
        setIntField(term184402, term184402.getClass(), "hash1", 0);
        setField(term184402, term184402.getClass(), "value1", null);
        term184534 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term184534, term184534.getClass(), "size", 3);
        setIntField(term184534, term184534.getClass(), "hash1", 0);
        setIntField(term184534, term184534.getClass(), "hash2", 0);
        setIntField(term184534, term184534.getClass(), "hash3", 0);
        setField(term184534, term184534.getClass(), "key1", null);
        setField(term184534, term184534.getClass(), "key2", null);
        setField(term184534, term184534.getClass(), "key3", term184534);
        setField(term184534, term184534.getClass(), "value1", null);
        setField(term184534, term184534.getClass(), "value2", null);
        setField(term184534, term184534.getClass(), "value3", null);
        setField(term184534, term184534.getClass(), "delegateMap", null);
        term184535 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term184535, term184535.getClass(), "size", 3);
        setIntField(term184535, term184535.getClass(), "hash1", 0);
        setIntField(term184535, term184535.getClass(), "hash2", 0);
        setIntField(term184535, term184535.getClass(), "hash3", 0);
        setField(term184535, term184535.getClass(), "key1", null);
        setField(term184535, term184535.getClass(), "key2", null);
        setField(term184535, term184535.getClass(), "key3", term184535);
        setField(term184535, term184535.getClass(), "value1", null);
        setField(term184535, term184535.getClass(), "value2", null);
        setField(term184535, term184535.getClass(), "value3", null);
        setField(term184535, term184535.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term184402;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term184402, args);
        assertTrue(recursiveEquals(term184402, term184534));
        assertTrue(recursiveEquals(term184402, term184535));
        assertTrue(recursiveEquals(retValue, null));
    }

};
