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

public class Flat3Map_equals_1826922527354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64020;
     Object term64214;
     Object term64756;
     Object term64758;

    public Flat3Map_equals_1826922527354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64020 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64122 = newInstance(Class.forName("java.util.stream.ReduceOps$CountingSink$OfDouble"));
        setField(term64020, term64020.getClass(), "delegateMap", null);
        setIntField(term64020, term64020.getClass(), "size", 2);
        setField(term64020, term64020.getClass(), "key2", null);
        setField(term64020, term64020.getClass(), "value2", null);
        setField(term64020, term64020.getClass(), "key1", term64122);
        term64214 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term64214, term64214.getClass(), "delegateMap", null);
        setIntField(term64214, term64214.getClass(), "size", 2);
        setField(term64214, term64214.getClass(), "key2", null);
        setField(term64214, term64214.getClass(), "value2", null);
        term64756 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64757 = newInstance(Class.forName("java.util.stream.ReduceOps$CountingSink$OfDouble"));
        setIntField(term64756, term64756.getClass(), "size", 2);
        setIntField(term64756, term64756.getClass(), "hash1", 0);
        setIntField(term64756, term64756.getClass(), "hash2", 0);
        setIntField(term64756, term64756.getClass(), "hash3", 0);
        setLongField(term64757, term64757.getClass(), "count", 0L);
        setField(term64757, term64757.getClass(), "state", null);
        setField(term64756, term64756.getClass(), "key1", term64757);
        setField(term64756, term64756.getClass(), "key2", null);
        setField(term64756, term64756.getClass(), "key3", null);
        setField(term64756, term64756.getClass(), "value1", null);
        setField(term64756, term64756.getClass(), "value2", null);
        setField(term64756, term64756.getClass(), "value3", null);
        setField(term64756, term64756.getClass(), "delegateMap", null);
        term64758 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term64758, term64758.getClass(), "size", 2);
        setIntField(term64758, term64758.getClass(), "hash1", 0);
        setIntField(term64758, term64758.getClass(), "hash2", 0);
        setIntField(term64758, term64758.getClass(), "hash3", 0);
        setField(term64758, term64758.getClass(), "key1", null);
        setField(term64758, term64758.getClass(), "key2", null);
        setField(term64758, term64758.getClass(), "key3", null);
        setField(term64758, term64758.getClass(), "value1", null);
        setField(term64758, term64758.getClass(), "value2", null);
        setField(term64758, term64758.getClass(), "value3", null);
        setField(term64758, term64758.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term64214;
        Object retValue = callMethod(klass, "equals", argTypes, term64020, args);
        assertTrue(recursiveEquals(term64020, term64756));
        assertTrue(recursiveEquals(term64214, term64758));
        assertTrue(recursiveEquals(retValue, false));
    }

};
