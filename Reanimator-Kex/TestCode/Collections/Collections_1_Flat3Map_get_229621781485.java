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

public class Flat3Map_get_229621781485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91389;
     Object term91573;
     Object term91814;
     Object term91816;

    public Flat3Map_get_229621781485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91389 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term91481 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term91389, term91389.getClass(), "delegateMap", null);
        setIntField(term91389, term91389.getClass(), "size", 2);
        setIntField(term91389, term91389.getClass(), "hash2", 0);
        setField(term91389, term91389.getClass(), "key2", null);
        setIntField(term91389, term91389.getClass(), "hash1", 0);
        setField(term91481, term91481.getClass(), "delegateMap", null);
        setIntField(term91481, term91481.getClass(), "size", 2);
        setField(term91389, term91389.getClass(), "key1", term91481);
        term91573 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term91683 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term91721 = newInstance(Class.forName("java.lang.Object"));
        setField(term91573, term91573.getClass(), "delegateMap", null);
        setIntField(term91573, term91573.getClass(), "size", 2);
        setIntField(term91573, term91573.getClass(), "hash2", 0);
        setIntField(term91683, term91683.getClass(), "size", 0);
        setField(term91573, term91573.getClass(), "value2", term91683);
        setIntField(term91573, term91573.getClass(), "hash1", 0);
        setField(term91573, term91573.getClass(), "value1", null);
        setField(term91573, term91573.getClass(), "key2", term91721);
        term91814 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term91815 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term91814, term91814.getClass(), "size", 2);
        setIntField(term91814, term91814.getClass(), "hash1", 0);
        setIntField(term91814, term91814.getClass(), "hash2", 0);
        setIntField(term91814, term91814.getClass(), "hash3", 0);
        setIntField(term91815, term91815.getClass(), "size", 2);
        setIntField(term91815, term91815.getClass(), "hash1", 0);
        setIntField(term91815, term91815.getClass(), "hash2", 0);
        setIntField(term91815, term91815.getClass(), "hash3", 0);
        setField(term91815, term91815.getClass(), "key1", null);
        setField(term91815, term91815.getClass(), "key2", null);
        setField(term91815, term91815.getClass(), "key3", null);
        setField(term91815, term91815.getClass(), "value1", null);
        setField(term91815, term91815.getClass(), "value2", null);
        setField(term91815, term91815.getClass(), "value3", null);
        setField(term91815, term91815.getClass(), "delegateMap", null);
        setField(term91814, term91814.getClass(), "key1", term91815);
        setField(term91814, term91814.getClass(), "key2", null);
        setField(term91814, term91814.getClass(), "key3", null);
        setField(term91814, term91814.getClass(), "value1", null);
        setField(term91814, term91814.getClass(), "value2", null);
        setField(term91814, term91814.getClass(), "value3", null);
        setField(term91814, term91814.getClass(), "delegateMap", null);
        term91816 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term91817 = newInstance(Class.forName("java.lang.Object"));
        Object term91818 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term91816, term91816.getClass(), "size", 2);
        setIntField(term91816, term91816.getClass(), "hash1", 0);
        setIntField(term91816, term91816.getClass(), "hash2", 0);
        setIntField(term91816, term91816.getClass(), "hash3", 0);
        setField(term91816, term91816.getClass(), "key1", null);
        setField(term91816, term91816.getClass(), "key2", term91817);
        setField(term91816, term91816.getClass(), "key3", null);
        setField(term91816, term91816.getClass(), "value1", null);
        setFloatField(term91818, term91818.getClass(), "loadFactor", 0.0F);
        setIntField(term91818, term91818.getClass(), "size", 0);
        setField(term91818, term91818.getClass(), "data", null);
        setIntField(term91818, term91818.getClass(), "threshold", 0);
        setIntField(term91818, term91818.getClass(), "modCount", 0);
        setField(term91818, term91818.getClass(), "entrySet", null);
        setField(term91818, term91818.getClass(), "keySet", null);
        setField(term91818, term91818.getClass(), "values", null);
        setField(term91818, term91818.getClass(), "keySet", null);
        setField(term91818, term91818.getClass(), "values", null);
        setField(term91816, term91816.getClass(), "value2", term91818);
        setField(term91816, term91816.getClass(), "value3", null);
        setField(term91816, term91816.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term91573;
        Object retValue = callMethod(klass, "get", argTypes, term91389, args);
        assertTrue(recursiveEquals(term91389, term91814));
        assertTrue(recursiveEquals(term91573, term91816));
        assertTrue(recursiveEquals(retValue, null));
    }

};
