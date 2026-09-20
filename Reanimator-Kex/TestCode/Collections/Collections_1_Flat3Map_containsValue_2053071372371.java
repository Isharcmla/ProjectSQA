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

public class Flat3Map_containsValue_2053071372371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67150;
     Object term67298;
     Object term67481;
     Object term67483;

    public Flat3Map_containsValue_2053071372371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67150 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term67260 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term67150, term67150.getClass(), "delegateMap", null);
        setIntField(term67150, term67150.getClass(), "size", 2);
        setField(term67150, term67150.getClass(), "value2", term67260);
        term67298 = newInstance(Class.forName("java.lang.Object"));
        term67481 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term67482 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setIntField(term67481, term67481.getClass(), "size", 2);
        setIntField(term67481, term67481.getClass(), "hash1", 0);
        setIntField(term67481, term67481.getClass(), "hash2", 0);
        setIntField(term67481, term67481.getClass(), "hash3", 0);
        setField(term67481, term67481.getClass(), "key1", null);
        setField(term67481, term67481.getClass(), "key2", null);
        setField(term67481, term67481.getClass(), "key3", null);
        setField(term67481, term67481.getClass(), "value1", null);
        setField(term67482, term67482.getClass(), "header", null);
        setFloatField(term67482, term67482.getClass(), "loadFactor", 0.0F);
        setIntField(term67482, term67482.getClass(), "size", 0);
        setField(term67482, term67482.getClass(), "data", null);
        setIntField(term67482, term67482.getClass(), "threshold", 0);
        setIntField(term67482, term67482.getClass(), "modCount", 0);
        setField(term67482, term67482.getClass(), "entrySet", null);
        setField(term67482, term67482.getClass(), "keySet", null);
        setField(term67482, term67482.getClass(), "values", null);
        setField(term67482, term67482.getClass(), "keySet", null);
        setField(term67482, term67482.getClass(), "values", null);
        setField(term67481, term67481.getClass(), "value2", term67482);
        setField(term67481, term67481.getClass(), "value3", null);
        setField(term67481, term67481.getClass(), "delegateMap", null);
        term67483 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term67298;
        callMethod(klass, "containsValue", argTypes, term67150, args);
        assertTrue(recursiveEquals(term67150, term67481));
        assertTrue(recursiveEquals(term67298, term67483));
    }

};
