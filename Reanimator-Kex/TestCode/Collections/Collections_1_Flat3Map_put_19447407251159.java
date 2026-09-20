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

public class Flat3Map_put_19447407251159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253920;
     Object term254939;

    public Flat3Map_put_19447407251159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253920 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term254030 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term251589 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 431);
        setField(term254030, term254030.getClass(), "data", term251589);
        setIntField(term254030, term254030.getClass(), "modCount", 0);
        setIntField(term254030, term254030.getClass(), "size", 0);
        setIntField(term254030, term254030.getClass(), "threshold", 1);
        setField(term253920, term253920.getClass(), "delegateMap", term254030);
        term254939 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term254940 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term254941 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 862);
        Object term254942 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term254943 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term254939, term254939.getClass(), "size", 0);
        setIntField(term254939, term254939.getClass(), "hash1", 0);
        setIntField(term254939, term254939.getClass(), "hash2", 0);
        setIntField(term254939, term254939.getClass(), "hash3", 0);
        setField(term254939, term254939.getClass(), "key1", null);
        setField(term254939, term254939.getClass(), "key2", null);
        setField(term254939, term254939.getClass(), "key3", null);
        setField(term254939, term254939.getClass(), "value1", null);
        setField(term254939, term254939.getClass(), "value2", null);
        setField(term254939, term254939.getClass(), "value3", null);
        setFloatField(term254940, term254940.getClass(), "loadFactor", 0.0F);
        setIntField(term254940, term254940.getClass(), "size", 1);
        setField(term254942, term254942.getClass(), "next", null);
        setField(term254942, term254942.getClass(), "key", term254943);
        setField(term254942, term254942.getClass(), "value", null);
        setElement(term254941, 336, term254942);
        setField(term254940, term254940.getClass(), "data", term254941);
        setIntField(term254940, term254940.getClass(), "threshold", 0);
        setIntField(term254940, term254940.getClass(), "modCount", 2);
        setField(term254940, term254940.getClass(), "entrySet", null);
        setField(term254940, term254940.getClass(), "keySet", null);
        setField(term254940, term254940.getClass(), "values", null);
        setField(term254940, term254940.getClass(), "keySet", null);
        setField(term254940, term254940.getClass(), "values", null);
        setField(term254939, term254939.getClass(), "delegateMap", term254940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term253920, args);
        assertTrue(recursiveEquals(term253920, term254939));
        assertTrue(recursiveEquals(retValue, null));
    }

};
