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

public class Flat3Map_containsValue_2053071372357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60270;
     Object term60456;
     Object term60653;
     Object term60655;

    public Flat3Map_containsValue_2053071372357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60270 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60364 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term60270, term60270.getClass(), "delegateMap", null);
        setIntField(term60270, term60270.getClass(), "size", 2);
        setField(term60270, term60270.getClass(), "value2", term60364);
        term60456 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60550 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term60456, term60456.getClass(), "delegateMap", term60550);
        term60653 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60654 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setIntField(term60653, term60653.getClass(), "size", 2);
        setIntField(term60653, term60653.getClass(), "hash1", 0);
        setIntField(term60653, term60653.getClass(), "hash2", 0);
        setIntField(term60653, term60653.getClass(), "hash3", 0);
        setField(term60653, term60653.getClass(), "key1", null);
        setField(term60653, term60653.getClass(), "key2", null);
        setField(term60653, term60653.getClass(), "key3", null);
        setField(term60653, term60653.getClass(), "value1", null);
        setFloatField(term60654, term60654.getClass(), "loadFactor", 0.0F);
        setIntField(term60654, term60654.getClass(), "size", 0);
        setField(term60654, term60654.getClass(), "data", null);
        setIntField(term60654, term60654.getClass(), "threshold", 0);
        setIntField(term60654, term60654.getClass(), "modCount", 0);
        setField(term60654, term60654.getClass(), "entrySet", null);
        setField(term60654, term60654.getClass(), "keySet", null);
        setField(term60654, term60654.getClass(), "values", null);
        setField(term60654, term60654.getClass(), "keySet", null);
        setField(term60654, term60654.getClass(), "values", null);
        setField(term60653, term60653.getClass(), "value2", term60654);
        setField(term60653, term60653.getClass(), "value3", null);
        setField(term60653, term60653.getClass(), "delegateMap", null);
        term60655 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60656 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setIntField(term60655, term60655.getClass(), "size", 0);
        setIntField(term60655, term60655.getClass(), "hash1", 0);
        setIntField(term60655, term60655.getClass(), "hash2", 0);
        setIntField(term60655, term60655.getClass(), "hash3", 0);
        setField(term60655, term60655.getClass(), "key1", null);
        setField(term60655, term60655.getClass(), "key2", null);
        setField(term60655, term60655.getClass(), "key3", null);
        setField(term60655, term60655.getClass(), "value1", null);
        setField(term60655, term60655.getClass(), "value2", null);
        setField(term60655, term60655.getClass(), "value3", null);
        setFloatField(term60656, term60656.getClass(), "loadFactor", 0.0F);
        setIntField(term60656, term60656.getClass(), "size", 0);
        setField(term60656, term60656.getClass(), "data", null);
        setIntField(term60656, term60656.getClass(), "threshold", 0);
        setIntField(term60656, term60656.getClass(), "modCount", 0);
        setField(term60656, term60656.getClass(), "entrySet", null);
        setField(term60656, term60656.getClass(), "keySet", null);
        setField(term60656, term60656.getClass(), "values", null);
        setField(term60656, term60656.getClass(), "keySet", null);
        setField(term60656, term60656.getClass(), "values", null);
        setField(term60655, term60655.getClass(), "delegateMap", term60656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term60456;
        callMethod(klass, "containsValue", argTypes, term60270, args);
        assertTrue(recursiveEquals(term60270, term60653));
        assertTrue(recursiveEquals(term60456, term60655));
    }

};


