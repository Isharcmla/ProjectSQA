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

public class Flat3Map_equals_1826922527674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132002;
     Object term132162;
     Object term132688;
     Object term132690;

    public Flat3Map_equals_1826922527674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132002 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term132070 = newInstance(Class.forName("java.util.stream.DoubleStream$1"));
        setField(term132002, term132002.getClass(), "delegateMap", null);
        setIntField(term132002, term132002.getClass(), "size", 2);
        setField(term132002, term132002.getClass(), "key2", term132070);
        term132162 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term132162, term132162.getClass(), "delegateMap", null);
        setIntField(term132162, term132162.getClass(), "size", 2);
        setIntField(term132162, term132162.getClass(), "hash2", -1);
        setIntField(term132162, term132162.getClass(), "hash1", 0);
        term132688 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term132689 = newInstance(Class.forName("java.util.stream.DoubleStream$1"));
        setIntField(term132688, term132688.getClass(), "size", 2);
        setIntField(term132688, term132688.getClass(), "hash1", 0);
        setIntField(term132688, term132688.getClass(), "hash2", 0);
        setIntField(term132688, term132688.getClass(), "hash3", 0);
        setField(term132688, term132688.getClass(), "key1", null);
        setDoubleField(term132689, term132689.getClass(), "prev", 0.0);
        setBooleanField(term132689, term132689.getClass(), "started", false);
        setField(term132689, term132689.getClass(), "val$f", null);
        setDoubleField(term132689, term132689.getClass(), "val$seed", 0.0);
        setIntField(term132689, term132689.getClass(), "characteristics", 0);
        setLongField(term132689, term132689.getClass(), "est", 0L);
        setIntField(term132689, term132689.getClass(), "batch", 0);
        setField(term132688, term132688.getClass(), "key2", term132689);
        setField(term132688, term132688.getClass(), "key3", null);
        setField(term132688, term132688.getClass(), "value1", null);
        setField(term132688, term132688.getClass(), "value2", null);
        setField(term132688, term132688.getClass(), "value3", null);
        setField(term132688, term132688.getClass(), "delegateMap", null);
        term132690 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term132690, term132690.getClass(), "size", 2);
        setIntField(term132690, term132690.getClass(), "hash1", 0);
        setIntField(term132690, term132690.getClass(), "hash2", -1);
        setIntField(term132690, term132690.getClass(), "hash3", 0);
        setField(term132690, term132690.getClass(), "key1", null);
        setField(term132690, term132690.getClass(), "key2", null);
        setField(term132690, term132690.getClass(), "key3", null);
        setField(term132690, term132690.getClass(), "value1", null);
        setField(term132690, term132690.getClass(), "value2", null);
        setField(term132690, term132690.getClass(), "value3", null);
        setField(term132690, term132690.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term132162;
        Object retValue = callMethod(klass, "equals", argTypes, term132002, args);
        assertTrue(recursiveEquals(term132002, term132688));
        assertTrue(recursiveEquals(term132162, term132690));
        assertTrue(recursiveEquals(retValue, false));
    }

};
