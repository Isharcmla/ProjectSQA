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

public class Flat3Map_size_91486821226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;
     Object term6390;

    public Flat3Map_size_91486821226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46 = newInstance(Class.forName("java.lang.Object"));
        Object term47 = newInstance(Class.forName("java.lang.Object"));
        Object term48 = newInstance(Class.forName("java.lang.Object"));
        Object term49 = newInstance(Class.forName("java.lang.Object"));
        Object term50 = newInstance(Class.forName("java.lang.Object"));
        Object term51 = newInstance(Class.forName("java.lang.Object"));
        Object term52 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term41, term41.getClass(), "size", -1465035361);
        setIntField(term41, term41.getClass(), "hash1", 1090617576);
        setIntField(term41, term41.getClass(), "hash2", -1547384488);
        setIntField(term41, term41.getClass(), "hash3", 1442160736);
        setField(term41, term41.getClass(), "key1", term46);
        setField(term41, term41.getClass(), "key2", term47);
        setField(term41, term41.getClass(), "key3", term48);
        setField(term41, term41.getClass(), "value1", term49);
        setField(term41, term41.getClass(), "value2", term50);
        setField(term41, term41.getClass(), "value3", term51);
        setFloatField(term52, term52.getClass(), "loadFactor", 0.0F);
        setIntField(term52, term52.getClass(), "size", 0);
        setField(term52, term52.getClass(), "data", null);
        setIntField(term52, term52.getClass(), "threshold", 0);
        setIntField(term52, term52.getClass(), "modCount", 0);
        setField(term52, term52.getClass(), "entrySet", null);
        setField(term52, term52.getClass(), "keySet", null);
        setField(term52, term52.getClass(), "values", null);
        setField(term52, term52.getClass(), "keySet", null);
        setField(term52, term52.getClass(), "values", null);
        setField(term41, term41.getClass(), "delegateMap", term52);
        term6390 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term6391 = newInstance(Class.forName("java.lang.Object"));
        Object term6392 = newInstance(Class.forName("java.lang.Object"));
        Object term6393 = newInstance(Class.forName("java.lang.Object"));
        Object term6394 = newInstance(Class.forName("java.lang.Object"));
        Object term6395 = newInstance(Class.forName("java.lang.Object"));
        Object term6396 = newInstance(Class.forName("java.lang.Object"));
        Object term6397 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term6390, term6390.getClass(), "size", -1465035361);
        setIntField(term6390, term6390.getClass(), "hash1", 1090617576);
        setIntField(term6390, term6390.getClass(), "hash2", -1547384488);
        setIntField(term6390, term6390.getClass(), "hash3", 1442160736);
        setField(term6390, term6390.getClass(), "key1", term6391);
        setField(term6390, term6390.getClass(), "key2", term6392);
        setField(term6390, term6390.getClass(), "key3", term6393);
        setField(term6390, term6390.getClass(), "value1", term6394);
        setField(term6390, term6390.getClass(), "value2", term6395);
        setField(term6390, term6390.getClass(), "value3", term6396);
        setFloatField(term6397, term6397.getClass(), "loadFactor", 0.0F);
        setIntField(term6397, term6397.getClass(), "size", 0);
        setField(term6397, term6397.getClass(), "data", null);
        setIntField(term6397, term6397.getClass(), "threshold", 0);
        setIntField(term6397, term6397.getClass(), "modCount", 0);
        setField(term6397, term6397.getClass(), "entrySet", null);
        setField(term6397, term6397.getClass(), "keySet", null);
        setField(term6397, term6397.getClass(), "values", null);
        setField(term6397, term6397.getClass(), "keySet", null);
        setField(term6397, term6397.getClass(), "values", null);
        setField(term6390, term6390.getClass(), "delegateMap", term6397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term41, args);
        assertTrue(recursiveEquals(term41, term6390));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


