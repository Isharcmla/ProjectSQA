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

public class Flat3Map_get_229621781598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114663;
     Object term114755;
     Object term115260;
     Object term115261;

    public Flat3Map_get_229621781598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114663 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term114663, term114663.getClass(), "delegateMap", null);
        setIntField(term114663, term114663.getClass(), "size", 2);
        setIntField(term114663, term114663.getClass(), "hash2", 0);
        setField(term114663, term114663.getClass(), "key2", term114663);
        term114755 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term114865 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term114903 = newInstance(Class.forName("java.lang.Object"));
        setField(term114755, term114755.getClass(), "delegateMap", null);
        setIntField(term114755, term114755.getClass(), "size", 2);
        setIntField(term114755, term114755.getClass(), "hash2", 0);
        setIntField(term114865, term114865.getClass(), "size", 0);
        setField(term114755, term114755.getClass(), "value2", term114865);
        setIntField(term114755, term114755.getClass(), "hash1", 0);
        setField(term114755, term114755.getClass(), "value1", null);
        setField(term114755, term114755.getClass(), "key2", term114903);
        term115260 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term115260, term115260.getClass(), "size", 2);
        setIntField(term115260, term115260.getClass(), "hash1", 0);
        setIntField(term115260, term115260.getClass(), "hash2", 0);
        setIntField(term115260, term115260.getClass(), "hash3", 0);
        setField(term115260, term115260.getClass(), "key1", null);
        setField(term115260, term115260.getClass(), "key2", term115260);
        setField(term115260, term115260.getClass(), "key3", null);
        setField(term115260, term115260.getClass(), "value1", null);
        setField(term115260, term115260.getClass(), "value2", null);
        setField(term115260, term115260.getClass(), "value3", null);
        setField(term115260, term115260.getClass(), "delegateMap", null);
        term115261 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term115262 = newInstance(Class.forName("java.lang.Object"));
        Object term115263 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term115261, term115261.getClass(), "size", 2);
        setIntField(term115261, term115261.getClass(), "hash1", 0);
        setIntField(term115261, term115261.getClass(), "hash2", 0);
        setIntField(term115261, term115261.getClass(), "hash3", 0);
        setField(term115261, term115261.getClass(), "key1", null);
        setField(term115261, term115261.getClass(), "key2", term115262);
        setField(term115261, term115261.getClass(), "key3", null);
        setField(term115261, term115261.getClass(), "value1", null);
        setFloatField(term115263, term115263.getClass(), "loadFactor", 0.0F);
        setIntField(term115263, term115263.getClass(), "size", 0);
        setField(term115263, term115263.getClass(), "data", null);
        setIntField(term115263, term115263.getClass(), "threshold", 0);
        setIntField(term115263, term115263.getClass(), "modCount", 0);
        setField(term115263, term115263.getClass(), "entrySet", null);
        setField(term115263, term115263.getClass(), "keySet", null);
        setField(term115263, term115263.getClass(), "values", null);
        setField(term115263, term115263.getClass(), "keySet", null);
        setField(term115263, term115263.getClass(), "values", null);
        setField(term115261, term115261.getClass(), "value2", term115263);
        setField(term115261, term115261.getClass(), "value3", null);
        setField(term115261, term115261.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term114755;
        Object retValue = callMethod(klass, "get", argTypes, term114663, args);
        assertTrue(recursiveEquals(term114663, term115260));
        assertTrue(recursiveEquals(term114755, term115261));
        assertTrue(recursiveEquals(retValue, null));
    }

};
