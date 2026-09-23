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

public class Flat3Map_put_19447407251061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307007;
     Object term307429;
     Object term307436;

    public Flat3Map_put_19447407251061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307007 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term307040 = newInstance(Class.forName("java.util.stream.IntPipeline$5"));
        setField(term307007, term307007.getClass(), "delegateMap", null);
        setIntField(term307007, term307007.getClass(), "size", 3);
        setIntField(term307007, term307007.getClass(), "hash3", 0);
        setField(term307007, term307007.getClass(), "value3", null);
        setIntField(term307007, term307007.getClass(), "hash2", 0);
        setField(term307007, term307007.getClass(), "value2", null);
        setIntField(term307007, term307007.getClass(), "hash1", 0);
        setField(term307007, term307007.getClass(), "value1", term307040);
        term307429 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term307430 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term307431 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term307432 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term307433 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term307434 = newInstance(Class.forName("java.lang.Object"));
        Object term307435 = newInstance(Class.forName("java.util.stream.IntPipeline$5"));
        setIntField(term307429, term307429.getClass(), "size", 0);
        setIntField(term307429, term307429.getClass(), "hash1", 0);
        setIntField(term307429, term307429.getClass(), "hash2", 0);
        setIntField(term307429, term307429.getClass(), "hash3", 0);
        setField(term307429, term307429.getClass(), "key1", null);
        setField(term307429, term307429.getClass(), "key2", null);
        setField(term307429, term307429.getClass(), "key3", null);
        setField(term307429, term307429.getClass(), "value1", null);
        setField(term307429, term307429.getClass(), "value2", null);
        setField(term307429, term307429.getClass(), "value3", null);
        setFloatField(term307430, term307430.getClass(), "loadFactor", 0.75F);
        setIntField(term307430, term307430.getClass(), "size", 2);
        setField(term307432, term307432.getClass(), "next", null);
        setField(term307432, term307432.getClass(), "key", term307429);
        setField(term307432, term307432.getClass(), "value", null);
        setElement(term307431, 0, term307432);
        setField(term307433, term307433.getClass(), "next", null);
        setField(term307433, term307433.getClass(), "key", term307434);
        setField(term307435, term307435.getClass(), "val$mapper", null);
        setField(term307435, term307435.getClass(), "this$0", null);
        setField(term307435, term307435.getClass(), "sourceStage", null);
        setField(term307435, term307435.getClass(), "previousStage", null);
        setIntField(term307435, term307435.getClass(), "sourceOrOpFlags", 0);
        setField(term307435, term307435.getClass(), "nextStage", null);
        setIntField(term307435, term307435.getClass(), "depth", 0);
        setIntField(term307435, term307435.getClass(), "combinedFlags", 0);
        setField(term307435, term307435.getClass(), "sourceSpliterator", null);
        setField(term307435, term307435.getClass(), "sourceSupplier", null);
        setBooleanField(term307435, term307435.getClass(), "linkedOrConsumed", false);
        setBooleanField(term307435, term307435.getClass(), "sourceAnyStateful", false);
        setField(term307435, term307435.getClass(), "sourceCloseAction", null);
        setBooleanField(term307435, term307435.getClass(), "parallel", false);
        setField(term307433, term307433.getClass(), "value", term307435);
        setElement(term307431, 6, term307433);
        setField(term307430, term307430.getClass(), "data", term307431);
        setIntField(term307430, term307430.getClass(), "threshold", 12);
        setIntField(term307430, term307430.getClass(), "modCount", 2);
        setField(term307430, term307430.getClass(), "entrySet", null);
        setField(term307430, term307430.getClass(), "keySet", null);
        setField(term307430, term307430.getClass(), "values", null);
        setField(term307430, term307430.getClass(), "keySet", null);
        setField(term307430, term307430.getClass(), "values", null);
        setField(term307429, term307429.getClass(), "delegateMap", term307430);
        term307436 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term307437 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term307438 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term307439 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term307440 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term307441 = newInstance(Class.forName("java.lang.Object"));
        Object term307442 = newInstance(Class.forName("java.util.stream.IntPipeline$5"));
        setIntField(term307436, term307436.getClass(), "size", 0);
        setIntField(term307436, term307436.getClass(), "hash1", 0);
        setIntField(term307436, term307436.getClass(), "hash2", 0);
        setIntField(term307436, term307436.getClass(), "hash3", 0);
        setField(term307436, term307436.getClass(), "key1", null);
        setField(term307436, term307436.getClass(), "key2", null);
        setField(term307436, term307436.getClass(), "key3", null);
        setField(term307436, term307436.getClass(), "value1", null);
        setField(term307436, term307436.getClass(), "value2", null);
        setField(term307436, term307436.getClass(), "value3", null);
        setFloatField(term307437, term307437.getClass(), "loadFactor", 0.75F);
        setIntField(term307437, term307437.getClass(), "size", 2);
        setField(term307439, term307439.getClass(), "next", null);
        setField(term307439, term307439.getClass(), "key", term307436);
        setField(term307439, term307439.getClass(), "value", null);
        setElement(term307438, 0, term307439);
        setField(term307440, term307440.getClass(), "next", null);
        setField(term307440, term307440.getClass(), "key", term307441);
        setField(term307442, term307442.getClass(), "val$mapper", null);
        setField(term307442, term307442.getClass(), "this$0", null);
        setField(term307442, term307442.getClass(), "sourceStage", null);
        setField(term307442, term307442.getClass(), "previousStage", null);
        setIntField(term307442, term307442.getClass(), "sourceOrOpFlags", 0);
        setField(term307442, term307442.getClass(), "nextStage", null);
        setIntField(term307442, term307442.getClass(), "depth", 0);
        setIntField(term307442, term307442.getClass(), "combinedFlags", 0);
        setField(term307442, term307442.getClass(), "sourceSpliterator", null);
        setField(term307442, term307442.getClass(), "sourceSupplier", null);
        setBooleanField(term307442, term307442.getClass(), "linkedOrConsumed", false);
        setBooleanField(term307442, term307442.getClass(), "sourceAnyStateful", false);
        setField(term307442, term307442.getClass(), "sourceCloseAction", null);
        setBooleanField(term307442, term307442.getClass(), "parallel", false);
        setField(term307440, term307440.getClass(), "value", term307442);
        setElement(term307438, 6, term307440);
        setField(term307437, term307437.getClass(), "data", term307438);
        setIntField(term307437, term307437.getClass(), "threshold", 12);
        setIntField(term307437, term307437.getClass(), "modCount", 2);
        setField(term307437, term307437.getClass(), "entrySet", null);
        setField(term307437, term307437.getClass(), "keySet", null);
        setField(term307437, term307437.getClass(), "values", null);
        setField(term307437, term307437.getClass(), "keySet", null);
        setField(term307437, term307437.getClass(), "values", null);
        setField(term307436, term307436.getClass(), "delegateMap", term307437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term307007;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term307007, args);
        assertTrue(recursiveEquals(term307007, term307429));
        assertTrue(recursiveEquals(term307007, term307436));
        assertTrue(recursiveEquals(retValue, null));
    }

};


