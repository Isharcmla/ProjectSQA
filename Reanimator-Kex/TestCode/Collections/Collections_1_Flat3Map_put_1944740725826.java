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

public class Flat3Map_put_1944740725826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167457;
     Object term167818;
     Object term167820;

    public Flat3Map_put_1944740725826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167457 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term167512 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term167457, term167457.getClass(), "delegateMap", null);
        setIntField(term167457, term167457.getClass(), "size", 1);
        setIntField(term167457, term167457.getClass(), "hash1", 0);
        setField(term167457, term167457.getClass(), "value1", term167512);
        term167818 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term167819 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term167818, term167818.getClass(), "size", 2);
        setIntField(term167818, term167818.getClass(), "hash1", 0);
        setIntField(term167818, term167818.getClass(), "hash2", 0);
        setIntField(term167818, term167818.getClass(), "hash3", 0);
        setField(term167818, term167818.getClass(), "key1", null);
        setField(term167818, term167818.getClass(), "key2", term167818);
        setField(term167818, term167818.getClass(), "key3", null);
        setFloatField(term167819, term167819.getClass(), "loadFactor", 0.0F);
        setIntField(term167819, term167819.getClass(), "size", 0);
        setField(term167819, term167819.getClass(), "data", null);
        setIntField(term167819, term167819.getClass(), "threshold", 0);
        setIntField(term167819, term167819.getClass(), "modCount", 0);
        setField(term167819, term167819.getClass(), "entrySet", null);
        setField(term167819, term167819.getClass(), "keySet", null);
        setField(term167819, term167819.getClass(), "values", null);
        setField(term167819, term167819.getClass(), "keySet", null);
        setField(term167819, term167819.getClass(), "values", null);
        setField(term167818, term167818.getClass(), "value1", term167819);
        setField(term167818, term167818.getClass(), "value2", null);
        setField(term167818, term167818.getClass(), "value3", null);
        setField(term167818, term167818.getClass(), "delegateMap", null);
        term167820 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term167821 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term167820, term167820.getClass(), "size", 2);
        setIntField(term167820, term167820.getClass(), "hash1", 0);
        setIntField(term167820, term167820.getClass(), "hash2", 0);
        setIntField(term167820, term167820.getClass(), "hash3", 0);
        setField(term167820, term167820.getClass(), "key1", null);
        setField(term167820, term167820.getClass(), "key2", term167820);
        setField(term167820, term167820.getClass(), "key3", null);
        setFloatField(term167821, term167821.getClass(), "loadFactor", 0.0F);
        setIntField(term167821, term167821.getClass(), "size", 0);
        setField(term167821, term167821.getClass(), "data", null);
        setIntField(term167821, term167821.getClass(), "threshold", 0);
        setIntField(term167821, term167821.getClass(), "modCount", 0);
        setField(term167821, term167821.getClass(), "entrySet", null);
        setField(term167821, term167821.getClass(), "keySet", null);
        setField(term167821, term167821.getClass(), "values", null);
        setField(term167821, term167821.getClass(), "keySet", null);
        setField(term167821, term167821.getClass(), "values", null);
        setField(term167820, term167820.getClass(), "value1", term167821);
        setField(term167820, term167820.getClass(), "value2", null);
        setField(term167820, term167820.getClass(), "value3", null);
        setField(term167820, term167820.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term167457;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term167457, args);
        assertTrue(recursiveEquals(term167457, term167818));
        assertTrue(recursiveEquals(term167457, term167820));
        assertTrue(recursiveEquals(retValue, null));
    }

};
