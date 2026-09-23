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

public class Flat3Map_put_1944740725750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181948;
     Object term182454;
     Object term190155;
     Object term190157;

    public Flat3Map_put_1944740725750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181948 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term182040 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term182132 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term182230 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        Object term182324 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term182362 = newInstance(Class.forName("java.lang.Object"));
        setField(term181948, term181948.getClass(), "delegateMap", null);
        setIntField(term181948, term181948.getClass(), "size", 3);
        setIntField(term181948, term181948.getClass(), "hash3", 2033738752);
        setField(term182040, term182040.getClass(), "delegateMap", null);
        setIntField(term182040, term182040.getClass(), "size", 3);
        setField(term182132, term182132.getClass(), "delegateMap", null);
        setIntField(term182132, term182132.getClass(), "size", 0);
        setField(term182040, term182040.getClass(), "key3", term182132);
        setField(term182040, term182040.getClass(), "key2", null);
        setField(term182040, term182040.getClass(), "value2", null);
        setIntField(term182040, term182040.getClass(), "hash3", 2046955520);
        setIntField(term182230, term182230.getClass(), "size", 0);
        setField(term182040, term182040.getClass(), "value3", term182230);
        setIntField(term182040, term182040.getClass(), "hash2", 0);
        setIntField(term182040, term182040.getClass(), "hash1", 201719808);
        setField(term182040, term182040.getClass(), "value1", null);
        setField(term181948, term181948.getClass(), "key3", term182040);
        setIntField(term181948, term181948.getClass(), "hash2", -2033738753);
        setIntField(term181948, term181948.getClass(), "hash1", 2033738752);
        setField(term181948, term181948.getClass(), "key1", null);
        setField(term181948, term181948.getClass(), "value3", term182324);
        setField(term181948, term181948.getClass(), "key2", null);
        setField(term181948, term181948.getClass(), "value2", null);
        setField(term181948, term181948.getClass(), "value1", term182362);
        term182454 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term182546 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term182454, term182454.getClass(), "delegateMap", null);
        setIntField(term182454, term182454.getClass(), "size", 3);
        setIntField(term182454, term182454.getClass(), "hash3", 816898048);
        setField(term182454, term182454.getClass(), "value3", null);
        setIntField(term182454, term182454.getClass(), "hash2", 1216349184);
        setField(term182454, term182454.getClass(), "value2", null);
        setIntField(term182454, term182454.getClass(), "hash1", 491520);
        setField(term182454, term182454.getClass(), "value1", null);
        setField(term182454, term182454.getClass(), "key3", null);
        setField(term182546, term182546.getClass(), "delegateMap", null);
        setIntField(term182546, term182546.getClass(), "size", 0);
        setField(term182454, term182454.getClass(), "key2", term182546);
        term190155 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term190156 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setIntField(term190155, term190155.getClass(), "size", 0);
        setIntField(term190155, term190155.getClass(), "hash1", 0);
        setIntField(term190155, term190155.getClass(), "hash2", 0);
        setIntField(term190155, term190155.getClass(), "hash3", 0);
        setField(term190155, term190155.getClass(), "key1", null);
        setField(term190155, term190155.getClass(), "key2", null);
        setField(term190155, term190155.getClass(), "key3", null);
        setField(term190155, term190155.getClass(), "value1", null);
        setField(term190155, term190155.getClass(), "value2", null);
        setField(term190155, term190155.getClass(), "value3", null);
        setFloatField(term190156, term190156.getClass(), "loadFactor", 0.75F);
        setIntField(term190156, term190156.getClass(), "size", 3);
        setField(term190156, term190156.getClass(), "data", true);
        setIntField(term190156, term190156.getClass(), "threshold", 12);
        setIntField(term190156, term190156.getClass(), "modCount", 3);
        setField(term190156, term190156.getClass(), "entrySet", null);
        setField(term190156, term190156.getClass(), "keySet", null);
        setField(term190156, term190156.getClass(), "values", null);
        setField(term190156, term190156.getClass(), "keySet", null);
        setField(term190156, term190156.getClass(), "values", null);
        setField(term190155, term190155.getClass(), "delegateMap", term190156);
        term190157 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term190157, term190157.getClass(), "size", 3);
        setIntField(term190157, term190157.getClass(), "hash1", 491520);
        setIntField(term190157, term190157.getClass(), "hash2", 1216349184);
        setIntField(term190157, term190157.getClass(), "hash3", 816898048);
        setField(term190157, term190157.getClass(), "key1", null);
        setField(term190157, term190157.getClass(), "key2", null);
        setField(term190157, term190157.getClass(), "key3", null);
        setField(term190157, term190157.getClass(), "value1", null);
        setField(term190157, term190157.getClass(), "value2", null);
        setField(term190157, term190157.getClass(), "value3", null);
        setField(term190157, term190157.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term182454;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term181948, args);
        assertTrue(recursiveEquals(term181948, term190155));
        assertTrue(recursiveEquals(term182454, term190157));
        assertTrue(recursiveEquals(retValue, null));
    }

};


