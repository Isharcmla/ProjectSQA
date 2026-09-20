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

public class Flat3Map_convertToMap_1229912811268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47452;
     Object term48366;

    public Flat3Map_convertToMap_1229912811268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47452 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term47562 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term47654 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term47784 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term47878 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term47452, term47452.getClass(), "delegateMap", term47562);
        setIntField(term47452, term47452.getClass(), "size", 3);
        setField(term47654, term47654.getClass(), "delegateMap", null);
        setIntField(term47654, term47654.getClass(), "size", 0);
        setField(term47452, term47452.getClass(), "key3", term47654);
        setField(term47452, term47452.getClass(), "value3", term47784);
        setField(term47452, term47452.getClass(), "key2", null);
        setField(term47452, term47452.getClass(), "value2", term47878);
        term48366 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term48367 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term48368 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term48369 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term48370 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term48371 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term48366, term48366.getClass(), "size", 0);
        setIntField(term48366, term48366.getClass(), "hash1", 0);
        setIntField(term48366, term48366.getClass(), "hash2", 0);
        setIntField(term48366, term48366.getClass(), "hash3", 0);
        setField(term48366, term48366.getClass(), "key1", null);
        setField(term48366, term48366.getClass(), "key2", null);
        setField(term48366, term48366.getClass(), "key3", null);
        setField(term48366, term48366.getClass(), "value1", null);
        setField(term48366, term48366.getClass(), "value2", null);
        setField(term48366, term48366.getClass(), "value3", null);
        setFloatField(term48367, term48367.getClass(), "loadFactor", 0.75F);
        setIntField(term48367, term48367.getClass(), "size", 2);
        setField(term48370, term48370.getClass(), "next", null);
        setField(term48370, term48370.getClass(), "key", null);
        setField(term48370, term48370.getClass(), "value", null);
        setField(term48369, term48369.getClass(), "next", term48370);
        setField(term48369, term48369.getClass(), "key", term48371);
        setField(term48369, term48369.getClass(), "value", null);
        setElement(term48368, 0, term48369);
        setField(term48367, term48367.getClass(), "data", term48368);
        setIntField(term48367, term48367.getClass(), "threshold", 12);
        setIntField(term48367, term48367.getClass(), "modCount", 2);
        setField(term48367, term48367.getClass(), "entrySet", null);
        setField(term48367, term48367.getClass(), "keySet", null);
        setField(term48367, term48367.getClass(), "values", null);
        setField(term48367, term48367.getClass(), "keySet", null);
        setField(term48367, term48367.getClass(), "values", null);
        setField(term48366, term48366.getClass(), "delegateMap", term48367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term47452, args);
        assertTrue(recursiveEquals(term47452, term48366));
    }

};
