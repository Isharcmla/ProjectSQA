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

public class Flat3Map_put_1944740725815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165949;
     Object term165971;
     Object term165972;

    public Flat3Map_put_1944740725815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165949 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term165949, term165949.getClass(), "delegateMap", null);
        setIntField(term165949, term165949.getClass(), "size", 1);
        setIntField(term165949, term165949.getClass(), "hash1", -1);
        setField(term165949, term165949.getClass(), "value1", null);
        term165971 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term165971, term165971.getClass(), "size", 2);
        setIntField(term165971, term165971.getClass(), "hash1", -1);
        setIntField(term165971, term165971.getClass(), "hash2", -1);
        setIntField(term165971, term165971.getClass(), "hash3", 0);
        setField(term165971, term165971.getClass(), "key1", null);
        setField(term165971, term165971.getClass(), "key2", term165971);
        setField(term165971, term165971.getClass(), "key3", null);
        setField(term165971, term165971.getClass(), "value1", null);
        setField(term165971, term165971.getClass(), "value2", null);
        setField(term165971, term165971.getClass(), "value3", null);
        setField(term165971, term165971.getClass(), "delegateMap", null);
        term165972 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term165972, term165972.getClass(), "size", 2);
        setIntField(term165972, term165972.getClass(), "hash1", -1);
        setIntField(term165972, term165972.getClass(), "hash2", -1);
        setIntField(term165972, term165972.getClass(), "hash3", 0);
        setField(term165972, term165972.getClass(), "key1", null);
        setField(term165972, term165972.getClass(), "key2", term165972);
        setField(term165972, term165972.getClass(), "key3", null);
        setField(term165972, term165972.getClass(), "value1", null);
        setField(term165972, term165972.getClass(), "value2", null);
        setField(term165972, term165972.getClass(), "value3", null);
        setField(term165972, term165972.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term165949;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term165949, args);
        assertTrue(recursiveEquals(term165949, term165971));
        assertTrue(recursiveEquals(term165949, term165972));
        assertTrue(recursiveEquals(retValue, null));
    }

};
