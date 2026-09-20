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

public class Flat3Map_get_229621781393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72393;
     Object term72523;
     Object term72683;
     Object term72685;

    public Flat3Map_get_229621781393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72393 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term72431 = newInstance(Class.forName("java.lang.Object"));
        setField(term72393, term72393.getClass(), "delegateMap", null);
        setIntField(term72393, term72393.getClass(), "size", 2);
        setIntField(term72393, term72393.getClass(), "hash2", 0);
        setField(term72393, term72393.getClass(), "key2", term72431);
        setField(term72393, term72393.getClass(), "key1", null);
        setField(term72393, term72393.getClass(), "value1", term72393);
        term72523 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term72633 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term72523, term72523.getClass(), "delegateMap", null);
        setIntField(term72523, term72523.getClass(), "size", 2);
        setIntField(term72523, term72523.getClass(), "hash2", 0);
        setIntField(term72633, term72633.getClass(), "size", 0);
        setField(term72523, term72523.getClass(), "value2", term72633);
        setIntField(term72523, term72523.getClass(), "hash1", 0);
        setField(term72523, term72523.getClass(), "value1", null);
        setField(term72523, term72523.getClass(), "key2", null);
        term72683 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term72684 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term72683, term72683.getClass(), "size", 2);
        setIntField(term72683, term72683.getClass(), "hash1", 0);
        setIntField(term72683, term72683.getClass(), "hash2", 0);
        setIntField(term72683, term72683.getClass(), "hash3", 0);
        setField(term72683, term72683.getClass(), "key1", null);
        setField(term72683, term72683.getClass(), "key2", term72684);
        setField(term72683, term72683.getClass(), "key3", null);
        setField(term72683, term72683.getClass(), "value1", term72683);
        setField(term72683, term72683.getClass(), "value2", null);
        setField(term72683, term72683.getClass(), "value3", null);
        setField(term72683, term72683.getClass(), "delegateMap", null);
        term72685 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term72686 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term72685, term72685.getClass(), "size", 2);
        setIntField(term72685, term72685.getClass(), "hash1", 0);
        setIntField(term72685, term72685.getClass(), "hash2", 0);
        setIntField(term72685, term72685.getClass(), "hash3", 0);
        setField(term72685, term72685.getClass(), "key1", null);
        setField(term72685, term72685.getClass(), "key2", null);
        setField(term72685, term72685.getClass(), "key3", null);
        setField(term72685, term72685.getClass(), "value1", null);
        setFloatField(term72686, term72686.getClass(), "loadFactor", 0.0F);
        setIntField(term72686, term72686.getClass(), "size", 0);
        setField(term72686, term72686.getClass(), "data", null);
        setIntField(term72686, term72686.getClass(), "threshold", 0);
        setIntField(term72686, term72686.getClass(), "modCount", 0);
        setField(term72686, term72686.getClass(), "entrySet", null);
        setField(term72686, term72686.getClass(), "keySet", null);
        setField(term72686, term72686.getClass(), "values", null);
        setField(term72686, term72686.getClass(), "keySet", null);
        setField(term72686, term72686.getClass(), "values", null);
        setField(term72685, term72685.getClass(), "value2", term72686);
        setField(term72685, term72685.getClass(), "value3", null);
        setField(term72685, term72685.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term72523;
        Object retValue = callMethod(klass, "get", argTypes, term72393, args);
        assertTrue(recursiveEquals(term72393, term72683));
        assertTrue(recursiveEquals(term72523, term72685));
        assertTrue(recursiveEquals(retValue, null));
    }

};
