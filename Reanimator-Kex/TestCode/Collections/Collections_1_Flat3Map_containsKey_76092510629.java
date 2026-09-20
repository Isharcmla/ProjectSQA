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

public class Flat3Map_containsKey_76092510629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122651;
     Object term122750;
     Object term122752;

    public Flat3Map_containsKey_76092510629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122651 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122706 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term122651, term122651.getClass(), "delegateMap", null);
        setIntField(term122651, term122651.getClass(), "size", 2);
        setIntField(term122651, term122651.getClass(), "hash2", 0);
        setField(term122651, term122651.getClass(), "value2", null);
        setIntField(term122651, term122651.getClass(), "hash1", 0);
        setField(term122651, term122651.getClass(), "value1", term122706);
        term122750 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122751 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term122750, term122750.getClass(), "size", 2);
        setIntField(term122750, term122750.getClass(), "hash1", 0);
        setIntField(term122750, term122750.getClass(), "hash2", 0);
        setIntField(term122750, term122750.getClass(), "hash3", 0);
        setField(term122750, term122750.getClass(), "key1", null);
        setField(term122750, term122750.getClass(), "key2", null);
        setField(term122750, term122750.getClass(), "key3", null);
        setFloatField(term122751, term122751.getClass(), "loadFactor", 0.0F);
        setIntField(term122751, term122751.getClass(), "size", 0);
        setField(term122751, term122751.getClass(), "data", null);
        setIntField(term122751, term122751.getClass(), "threshold", 0);
        setIntField(term122751, term122751.getClass(), "modCount", 0);
        setField(term122751, term122751.getClass(), "entrySet", null);
        setField(term122751, term122751.getClass(), "keySet", null);
        setField(term122751, term122751.getClass(), "values", null);
        setField(term122751, term122751.getClass(), "keySet", null);
        setField(term122751, term122751.getClass(), "values", null);
        setField(term122750, term122750.getClass(), "value1", term122751);
        setField(term122750, term122750.getClass(), "value2", null);
        setField(term122750, term122750.getClass(), "value3", null);
        setField(term122750, term122750.getClass(), "delegateMap", null);
        term122752 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122753 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term122752, term122752.getClass(), "size", 2);
        setIntField(term122752, term122752.getClass(), "hash1", 0);
        setIntField(term122752, term122752.getClass(), "hash2", 0);
        setIntField(term122752, term122752.getClass(), "hash3", 0);
        setField(term122752, term122752.getClass(), "key1", null);
        setField(term122752, term122752.getClass(), "key2", null);
        setField(term122752, term122752.getClass(), "key3", null);
        setFloatField(term122753, term122753.getClass(), "loadFactor", 0.0F);
        setIntField(term122753, term122753.getClass(), "size", 0);
        setField(term122753, term122753.getClass(), "data", null);
        setIntField(term122753, term122753.getClass(), "threshold", 0);
        setIntField(term122753, term122753.getClass(), "modCount", 0);
        setField(term122753, term122753.getClass(), "entrySet", null);
        setField(term122753, term122753.getClass(), "keySet", null);
        setField(term122753, term122753.getClass(), "values", null);
        setField(term122753, term122753.getClass(), "keySet", null);
        setField(term122753, term122753.getClass(), "values", null);
        setField(term122752, term122752.getClass(), "value1", term122753);
        setField(term122752, term122752.getClass(), "value2", null);
        setField(term122752, term122752.getClass(), "value3", null);
        setField(term122752, term122752.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term122651;
        callMethod(klass, "containsKey", argTypes, term122651, args);
        assertTrue(recursiveEquals(term122651, term122750));
        assertTrue(recursiveEquals(term122651, term122752));
    }

};
