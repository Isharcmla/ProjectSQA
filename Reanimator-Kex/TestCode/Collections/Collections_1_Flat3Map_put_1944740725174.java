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

public class Flat3Map_put_1944740725174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29359;
     Object term29828;

    public Flat3Map_put_1944740725174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29359 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term29359, term29359.getClass(), "delegateMap", null);
        setIntField(term29359, term29359.getClass(), "size", 1);
        term29828 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term29828, term29828.getClass(), "size", 1);
        setIntField(term29828, term29828.getClass(), "hash1", 0);
        setIntField(term29828, term29828.getClass(), "hash2", 0);
        setIntField(term29828, term29828.getClass(), "hash3", 0);
        setField(term29828, term29828.getClass(), "key1", null);
        setField(term29828, term29828.getClass(), "key2", null);
        setField(term29828, term29828.getClass(), "key3", null);
        setField(term29828, term29828.getClass(), "value1", null);
        setField(term29828, term29828.getClass(), "value2", null);
        setField(term29828, term29828.getClass(), "value3", null);
        setField(term29828, term29828.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term29359, args);
        assertTrue(recursiveEquals(term29359, term29828));
        assertTrue(recursiveEquals(retValue, null));
    }

};
