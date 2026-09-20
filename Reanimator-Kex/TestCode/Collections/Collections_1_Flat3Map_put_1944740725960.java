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

public class Flat3Map_put_1944740725960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192143;
     Object term193415;
     Object term193420;

    public Flat3Map_put_1944740725960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192143 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term192198 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term192143, term192143.getClass(), "delegateMap", null);
        setIntField(term192143, term192143.getClass(), "size", 3);
        setIntField(term192143, term192143.getClass(), "hash3", 0);
        setField(term192143, term192143.getClass(), "value3", null);
        setIntField(term192143, term192143.getClass(), "hash2", 0);
        setIntField(term192198, term192198.getClass(), "size", 0);
        setField(term192143, term192143.getClass(), "value2", term192198);
        setIntField(term192143, term192143.getClass(), "hash1", 0);
        setField(term192143, term192143.getClass(), "value1", null);
        term193415 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term193416 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term193417 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term193418 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term193419 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term193415, term193415.getClass(), "size", 0);
        setIntField(term193415, term193415.getClass(), "hash1", 0);
        setIntField(term193415, term193415.getClass(), "hash2", 0);
        setIntField(term193415, term193415.getClass(), "hash3", 0);
        setField(term193415, term193415.getClass(), "key1", null);
        setField(term193415, term193415.getClass(), "key2", null);
        setField(term193415, term193415.getClass(), "key3", null);
        setField(term193415, term193415.getClass(), "value1", null);
        setField(term193415, term193415.getClass(), "value2", null);
        setField(term193415, term193415.getClass(), "value3", null);
        setFloatField(term193416, term193416.getClass(), "loadFactor", 0.75F);
        setIntField(term193416, term193416.getClass(), "size", 2);
        setField(term193419, term193419.getClass(), "next", null);
        setField(term193419, term193419.getClass(), "key", null);
        setField(term193419, term193419.getClass(), "value", null);
        setField(term193418, term193418.getClass(), "next", term193419);
        setField(term193418, term193418.getClass(), "key", term193415);
        setField(term193418, term193418.getClass(), "value", null);
        setElement(term193417, 0, term193418);
        setField(term193416, term193416.getClass(), "data", term193417);
        setIntField(term193416, term193416.getClass(), "threshold", 12);
        setIntField(term193416, term193416.getClass(), "modCount", 2);
        setField(term193416, term193416.getClass(), "entrySet", null);
        setField(term193416, term193416.getClass(), "keySet", null);
        setField(term193416, term193416.getClass(), "values", null);
        setField(term193416, term193416.getClass(), "keySet", null);
        setField(term193416, term193416.getClass(), "values", null);
        setField(term193415, term193415.getClass(), "delegateMap", term193416);
        term193420 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term193421 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term193422 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term193423 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term193424 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term193420, term193420.getClass(), "size", 0);
        setIntField(term193420, term193420.getClass(), "hash1", 0);
        setIntField(term193420, term193420.getClass(), "hash2", 0);
        setIntField(term193420, term193420.getClass(), "hash3", 0);
        setField(term193420, term193420.getClass(), "key1", null);
        setField(term193420, term193420.getClass(), "key2", null);
        setField(term193420, term193420.getClass(), "key3", null);
        setField(term193420, term193420.getClass(), "value1", null);
        setField(term193420, term193420.getClass(), "value2", null);
        setField(term193420, term193420.getClass(), "value3", null);
        setFloatField(term193421, term193421.getClass(), "loadFactor", 0.75F);
        setIntField(term193421, term193421.getClass(), "size", 2);
        setField(term193424, term193424.getClass(), "next", null);
        setField(term193424, term193424.getClass(), "key", null);
        setField(term193424, term193424.getClass(), "value", null);
        setField(term193423, term193423.getClass(), "next", term193424);
        setField(term193423, term193423.getClass(), "key", term193420);
        setField(term193423, term193423.getClass(), "value", null);
        setElement(term193422, 0, term193423);
        setField(term193421, term193421.getClass(), "data", term193422);
        setIntField(term193421, term193421.getClass(), "threshold", 12);
        setIntField(term193421, term193421.getClass(), "modCount", 2);
        setField(term193421, term193421.getClass(), "entrySet", null);
        setField(term193421, term193421.getClass(), "keySet", null);
        setField(term193421, term193421.getClass(), "values", null);
        setField(term193421, term193421.getClass(), "keySet", null);
        setField(term193421, term193421.getClass(), "values", null);
        setField(term193420, term193420.getClass(), "delegateMap", term193421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term192143;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term192143, args);
        assertTrue(recursiveEquals(term192143, term193415));
        assertTrue(recursiveEquals(term192143, term193420));
        assertTrue(recursiveEquals(retValue, null));
    }

};
