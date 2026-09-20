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
import java.util.HashMap;

public class Flat3Map_put_1944740725851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171506;
     Object term172393;

    public Flat3Map_put_1944740725851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term171960 = new HashMap();
        term171506 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term171598 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term171690 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term171782 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term171912 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term172090 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term171506, term171506.getClass(), "delegateMap", null);
        setIntField(term171506, term171506.getClass(), "size", 3);
        setField(term171598, term171598.getClass(), "delegateMap", null);
        setIntField(term171598, term171598.getClass(), "size", 0);
        setField(term171506, term171506.getClass(), "key3", term171598);
        setField(term171690, term171690.getClass(), "delegateMap", null);
        setIntField(term171690, term171690.getClass(), "size", 0);
        setField(term171506, term171506.getClass(), "key2", term171690);
        setField(term171782, term171782.getClass(), "delegateMap", null);
        setIntField(term171782, term171782.getClass(), "size", 0);
        setField(term171506, term171506.getClass(), "key1", term171782);
        setField(term171506, term171506.getClass(), "value3", term171912);
        setField(term171506, term171506.getClass(), "value2", term171960);
        setField(term171506, term171506.getClass(), "value1", term172090);
        setIntField(term171506, term171506.getClass(), "hash3", 0);
        setIntField(term171506, term171506.getClass(), "hash2", 0);
        setIntField(term171506, term171506.getClass(), "hash1", 0);
        term172393 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term172394 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term172395 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term172396 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term172397 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term172398 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term172393, term172393.getClass(), "size", 0);
        setIntField(term172393, term172393.getClass(), "hash1", 0);
        setIntField(term172393, term172393.getClass(), "hash2", 0);
        setIntField(term172393, term172393.getClass(), "hash3", 0);
        setField(term172393, term172393.getClass(), "key1", null);
        setField(term172393, term172393.getClass(), "key2", null);
        setField(term172393, term172393.getClass(), "key3", null);
        setField(term172393, term172393.getClass(), "value1", null);
        setField(term172393, term172393.getClass(), "value2", null);
        setField(term172393, term172393.getClass(), "value3", null);
        setFloatField(term172394, term172394.getClass(), "loadFactor", 0.75F);
        setIntField(term172394, term172394.getClass(), "size", 2);
        setField(term172397, term172397.getClass(), "next", null);
        setField(term172397, term172397.getClass(), "key", null);
        setField(term172397, term172397.getClass(), "value", null);
        setField(term172396, term172396.getClass(), "next", term172397);
        setField(term172396, term172396.getClass(), "key", term172398);
        setField(term172396, term172396.getClass(), "value", null);
        setElement(term172395, 0, term172396);
        setField(term172394, term172394.getClass(), "data", term172395);
        setIntField(term172394, term172394.getClass(), "threshold", 12);
        setIntField(term172394, term172394.getClass(), "modCount", 2);
        setField(term172394, term172394.getClass(), "entrySet", null);
        setField(term172394, term172394.getClass(), "keySet", null);
        setField(term172394, term172394.getClass(), "values", null);
        setField(term172394, term172394.getClass(), "keySet", null);
        setField(term172394, term172394.getClass(), "values", null);
        setField(term172393, term172393.getClass(), "delegateMap", term172394);
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
        Object retValue = callMethod(klass, "put", argTypes, term171506, args);
        assertTrue(recursiveEquals(term171506, term172393));
        assertTrue(recursiveEquals(retValue, null));
    }

};
