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

public class Flat3Map_convertToMap_1229912811120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20160;
     Object term20647;

    public Flat3Map_convertToMap_1229912811120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20160 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term20270 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term20362 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term20454 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term20160, term20160.getClass(), "delegateMap", term20270);
        setIntField(term20160, term20160.getClass(), "size", 1);
        setField(term20160, term20160.getClass(), "key1", term20362);
        setField(term20160, term20160.getClass(), "value1", term20454);
        term20647 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term20648 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term20649 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term20650 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term20651 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term20652 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term20647, term20647.getClass(), "size", 0);
        setIntField(term20647, term20647.getClass(), "hash1", 0);
        setIntField(term20647, term20647.getClass(), "hash2", 0);
        setIntField(term20647, term20647.getClass(), "hash3", 0);
        setField(term20647, term20647.getClass(), "key1", null);
        setField(term20647, term20647.getClass(), "key2", null);
        setField(term20647, term20647.getClass(), "key3", null);
        setField(term20647, term20647.getClass(), "value1", null);
        setField(term20647, term20647.getClass(), "value2", null);
        setField(term20647, term20647.getClass(), "value3", null);
        setFloatField(term20648, term20648.getClass(), "loadFactor", 0.75F);
        setIntField(term20648, term20648.getClass(), "size", 1);
        setField(term20650, term20650.getClass(), "next", null);
        setIntField(term20651, term20651.getClass(), "size", 0);
        setIntField(term20651, term20651.getClass(), "hash1", 0);
        setIntField(term20651, term20651.getClass(), "hash2", 0);
        setIntField(term20651, term20651.getClass(), "hash3", 0);
        setField(term20651, term20651.getClass(), "key1", null);
        setField(term20651, term20651.getClass(), "key2", null);
        setField(term20651, term20651.getClass(), "key3", null);
        setField(term20651, term20651.getClass(), "value1", null);
        setField(term20651, term20651.getClass(), "value2", null);
        setField(term20651, term20651.getClass(), "value3", null);
        setField(term20651, term20651.getClass(), "delegateMap", null);
        setField(term20650, term20650.getClass(), "key", term20651);
        setIntField(term20652, term20652.getClass(), "size", 0);
        setIntField(term20652, term20652.getClass(), "hash1", 0);
        setIntField(term20652, term20652.getClass(), "hash2", 0);
        setIntField(term20652, term20652.getClass(), "hash3", 0);
        setField(term20652, term20652.getClass(), "key1", null);
        setField(term20652, term20652.getClass(), "key2", null);
        setField(term20652, term20652.getClass(), "key3", null);
        setField(term20652, term20652.getClass(), "value1", null);
        setField(term20652, term20652.getClass(), "value2", null);
        setField(term20652, term20652.getClass(), "value3", null);
        setField(term20652, term20652.getClass(), "delegateMap", null);
        setField(term20650, term20650.getClass(), "value", term20652);
        setElement(term20649, 0, term20650);
        setField(term20648, term20648.getClass(), "data", term20649);
        setIntField(term20648, term20648.getClass(), "threshold", 12);
        setIntField(term20648, term20648.getClass(), "modCount", 1);
        setField(term20648, term20648.getClass(), "entrySet", null);
        setField(term20648, term20648.getClass(), "keySet", null);
        setField(term20648, term20648.getClass(), "values", null);
        setField(term20648, term20648.getClass(), "keySet", null);
        setField(term20648, term20648.getClass(), "values", null);
        setField(term20647, term20647.getClass(), "delegateMap", term20648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term20160, args);
        assertTrue(recursiveEquals(term20160, term20647));
    }

};
