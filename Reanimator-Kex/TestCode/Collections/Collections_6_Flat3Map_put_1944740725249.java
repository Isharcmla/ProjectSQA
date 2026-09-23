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

public class Flat3Map_put_1944740725249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41313;
     Object term41455;
     Object term41456;

    public Flat3Map_put_1944740725249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41313 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term41359 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term41313, term41313.getClass(), "delegateMap", null);
        setIntField(term41313, term41313.getClass(), "size", 0);
        setIntField(term41313, term41313.getClass(), "hash1", 0);
        setField(term41313, term41313.getClass(), "key1", term41359);
        term41455 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term41455, term41455.getClass(), "size", 1);
        setIntField(term41455, term41455.getClass(), "hash1", 0);
        setIntField(term41455, term41455.getClass(), "hash2", 0);
        setIntField(term41455, term41455.getClass(), "hash3", 0);
        setField(term41455, term41455.getClass(), "key1", term41455);
        setField(term41455, term41455.getClass(), "key2", null);
        setField(term41455, term41455.getClass(), "key3", null);
        setField(term41455, term41455.getClass(), "value1", null);
        setField(term41455, term41455.getClass(), "value2", null);
        setField(term41455, term41455.getClass(), "value3", null);
        setField(term41455, term41455.getClass(), "delegateMap", null);
        term41456 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term41456, term41456.getClass(), "size", 1);
        setIntField(term41456, term41456.getClass(), "hash1", 0);
        setIntField(term41456, term41456.getClass(), "hash2", 0);
        setIntField(term41456, term41456.getClass(), "hash3", 0);
        setField(term41456, term41456.getClass(), "key1", term41456);
        setField(term41456, term41456.getClass(), "key2", null);
        setField(term41456, term41456.getClass(), "key3", null);
        setField(term41456, term41456.getClass(), "value1", null);
        setField(term41456, term41456.getClass(), "value2", null);
        setField(term41456, term41456.getClass(), "value3", null);
        setField(term41456, term41456.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term41313;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term41313, args);
        assertTrue(recursiveEquals(term41313, term41455));
        assertTrue(recursiveEquals(term41313, term41456));
        assertTrue(recursiveEquals(retValue, null));
    }

};


