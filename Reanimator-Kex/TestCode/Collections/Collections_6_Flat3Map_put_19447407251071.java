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

public class Flat3Map_put_19447407251071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311631;
     Object term311885;
     Object term311939;
     Object term311944;

    public Flat3Map_put_19447407251071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311631 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term311669 = newInstance(Class.forName("java.lang.Object"));
        Object term311707 = newInstance(Class.forName("java.lang.Object"));
        Object term311745 = newInstance(Class.forName("java.lang.Object"));
        Object[] term311501 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term311783 = newInstance(Class.forName("java.lang.Object"));
        Object term311821 = newInstance(Class.forName("java.lang.Object"));
        setField(term311631, term311631.getClass(), "delegateMap", null);
        setIntField(term311631, term311631.getClass(), "size", -2);
        setIntField(term311631, term311631.getClass(), "hash3", 0);
        setIntField(term311631, term311631.getClass(), "hash2", 0);
        setIntField(term311631, term311631.getClass(), "hash1", 0);
        setField(term311631, term311631.getClass(), "key3", term311669);
        setField(term311631, term311631.getClass(), "key2", term311707);
        setField(term311631, term311631.getClass(), "key1", term311745);
        setField(term311631, term311631.getClass(), "value3", term311501);
        setField(term311631, term311631.getClass(), "value2", term311783);
        setField(term311631, term311631.getClass(), "value1", term311821);
        term311885 = newInstance(Class.forName("java.io.ByteArrayOutputStream"));
        term311939 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term311940 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term311941 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term311942 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term311943 = newInstance(Class.forName("java.io.ByteArrayOutputStream"));
        setIntField(term311939, term311939.getClass(), "size", 0);
        setIntField(term311939, term311939.getClass(), "hash1", 0);
        setIntField(term311939, term311939.getClass(), "hash2", 0);
        setIntField(term311939, term311939.getClass(), "hash3", 0);
        setField(term311939, term311939.getClass(), "key1", null);
        setField(term311939, term311939.getClass(), "key2", null);
        setField(term311939, term311939.getClass(), "key3", null);
        setField(term311939, term311939.getClass(), "value1", null);
        setField(term311939, term311939.getClass(), "value2", null);
        setField(term311939, term311939.getClass(), "value3", null);
        setFloatField(term311940, term311940.getClass(), "loadFactor", 0.75F);
        setIntField(term311940, term311940.getClass(), "size", 1);
        setField(term311942, term311942.getClass(), "next", null);
        setField(term311943, term311943.getClass(), "buf", null);
        setIntField(term311943, term311943.getClass(), "count", 0);
        setField(term311942, term311942.getClass(), "key", term311943);
        setField(term311942, term311942.getClass(), "value", null);
        setElement(term311941, 7, term311942);
        setField(term311940, term311940.getClass(), "data", term311941);
        setIntField(term311940, term311940.getClass(), "threshold", 12);
        setIntField(term311940, term311940.getClass(), "modCount", 1);
        setField(term311940, term311940.getClass(), "entrySet", null);
        setField(term311940, term311940.getClass(), "keySet", null);
        setField(term311940, term311940.getClass(), "values", null);
        setField(term311940, term311940.getClass(), "keySet", null);
        setField(term311940, term311940.getClass(), "values", null);
        setField(term311939, term311939.getClass(), "delegateMap", term311940);
        term311944 = newInstance(Class.forName("java.io.ByteArrayOutputStream"));
        setField(term311944, term311944.getClass(), "buf", null);
        setIntField(term311944, term311944.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term311885;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term311631, args);
        assertTrue(recursiveEquals(term311631, term311939));
        assertTrue(recursiveEquals(term311885, term311944));
        assertTrue(recursiveEquals(retValue, null));
    }

};


