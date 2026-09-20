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

public class Flat3Map_get_229621781559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107465;
     Object term107649;
     Object term108050;
     Object term108052;

    public Flat3Map_get_229621781559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107465 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107557 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term107465, term107465.getClass(), "delegateMap", null);
        setIntField(term107465, term107465.getClass(), "size", 2);
        setIntField(term107465, term107465.getClass(), "hash2", 0);
        setField(term107465, term107465.getClass(), "key2", null);
        setIntField(term107465, term107465.getClass(), "hash1", 0);
        setField(term107557, term107557.getClass(), "delegateMap", null);
        setIntField(term107557, term107557.getClass(), "size", 2);
        setIntField(term107557, term107557.getClass(), "hash2", -1);
        setIntField(term107557, term107557.getClass(), "hash1", 0);
        setField(term107465, term107465.getClass(), "key1", term107557);
        term107649 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107759 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term107797 = newInstance(Class.forName("java.lang.Object"));
        setField(term107649, term107649.getClass(), "delegateMap", null);
        setIntField(term107649, term107649.getClass(), "size", 2);
        setIntField(term107649, term107649.getClass(), "hash2", 0);
        setIntField(term107759, term107759.getClass(), "size", 0);
        setField(term107649, term107649.getClass(), "value2", term107759);
        setIntField(term107649, term107649.getClass(), "hash1", 0);
        setField(term107649, term107649.getClass(), "value1", null);
        setField(term107649, term107649.getClass(), "key2", term107797);
        term108050 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term108051 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term108050, term108050.getClass(), "size", 2);
        setIntField(term108050, term108050.getClass(), "hash1", 0);
        setIntField(term108050, term108050.getClass(), "hash2", 0);
        setIntField(term108050, term108050.getClass(), "hash3", 0);
        setIntField(term108051, term108051.getClass(), "size", 2);
        setIntField(term108051, term108051.getClass(), "hash1", 0);
        setIntField(term108051, term108051.getClass(), "hash2", -1);
        setIntField(term108051, term108051.getClass(), "hash3", 0);
        setField(term108051, term108051.getClass(), "key1", null);
        setField(term108051, term108051.getClass(), "key2", null);
        setField(term108051, term108051.getClass(), "key3", null);
        setField(term108051, term108051.getClass(), "value1", null);
        setField(term108051, term108051.getClass(), "value2", null);
        setField(term108051, term108051.getClass(), "value3", null);
        setField(term108051, term108051.getClass(), "delegateMap", null);
        setField(term108050, term108050.getClass(), "key1", term108051);
        setField(term108050, term108050.getClass(), "key2", null);
        setField(term108050, term108050.getClass(), "key3", null);
        setField(term108050, term108050.getClass(), "value1", null);
        setField(term108050, term108050.getClass(), "value2", null);
        setField(term108050, term108050.getClass(), "value3", null);
        setField(term108050, term108050.getClass(), "delegateMap", null);
        term108052 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term108053 = newInstance(Class.forName("java.lang.Object"));
        Object term108054 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term108052, term108052.getClass(), "size", 2);
        setIntField(term108052, term108052.getClass(), "hash1", 0);
        setIntField(term108052, term108052.getClass(), "hash2", 0);
        setIntField(term108052, term108052.getClass(), "hash3", 0);
        setField(term108052, term108052.getClass(), "key1", null);
        setField(term108052, term108052.getClass(), "key2", term108053);
        setField(term108052, term108052.getClass(), "key3", null);
        setField(term108052, term108052.getClass(), "value1", null);
        setFloatField(term108054, term108054.getClass(), "loadFactor", 0.0F);
        setIntField(term108054, term108054.getClass(), "size", 0);
        setField(term108054, term108054.getClass(), "data", null);
        setIntField(term108054, term108054.getClass(), "threshold", 0);
        setIntField(term108054, term108054.getClass(), "modCount", 0);
        setField(term108054, term108054.getClass(), "entrySet", null);
        setField(term108054, term108054.getClass(), "keySet", null);
        setField(term108054, term108054.getClass(), "values", null);
        setField(term108054, term108054.getClass(), "keySet", null);
        setField(term108054, term108054.getClass(), "values", null);
        setField(term108052, term108052.getClass(), "value2", term108054);
        setField(term108052, term108052.getClass(), "value3", null);
        setField(term108052, term108052.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term107649;
        Object retValue = callMethod(klass, "get", argTypes, term107465, args);
        assertTrue(recursiveEquals(term107465, term108050));
        assertTrue(recursiveEquals(term107649, term108052));
        assertTrue(recursiveEquals(retValue, null));
    }

};
