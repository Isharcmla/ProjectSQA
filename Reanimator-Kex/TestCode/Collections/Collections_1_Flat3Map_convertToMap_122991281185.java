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

public class Flat3Map_convertToMap_122991281185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16499;
     Object term17222;

    public Flat3Map_convertToMap_122991281185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16499 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term16609 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term16499, term16499.getClass(), "delegateMap", term16609);
        setIntField(term16499, term16499.getClass(), "size", 3);
        term17222 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term17223 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term17224 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term17225 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term17226 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term17222, term17222.getClass(), "size", 0);
        setIntField(term17222, term17222.getClass(), "hash1", 0);
        setIntField(term17222, term17222.getClass(), "hash2", 0);
        setIntField(term17222, term17222.getClass(), "hash3", 0);
        setField(term17222, term17222.getClass(), "key1", null);
        setField(term17222, term17222.getClass(), "key2", null);
        setField(term17222, term17222.getClass(), "key3", null);
        setField(term17222, term17222.getClass(), "value1", null);
        setField(term17222, term17222.getClass(), "value2", null);
        setField(term17222, term17222.getClass(), "value3", null);
        setFloatField(term17223, term17223.getClass(), "loadFactor", 0.75F);
        setIntField(term17223, term17223.getClass(), "size", 1);
        setField(term17225, term17225.getClass(), "next", null);
        setField(term17225, term17225.getClass(), "key", term17226);
        setField(term17225, term17225.getClass(), "value", null);
        setElement(term17224, 0, term17225);
        setField(term17223, term17223.getClass(), "data", term17224);
        setIntField(term17223, term17223.getClass(), "threshold", 12);
        setIntField(term17223, term17223.getClass(), "modCount", 1);
        setField(term17223, term17223.getClass(), "entrySet", null);
        setField(term17223, term17223.getClass(), "keySet", null);
        setField(term17223, term17223.getClass(), "values", null);
        setField(term17223, term17223.getClass(), "keySet", null);
        setField(term17223, term17223.getClass(), "values", null);
        setField(term17222, term17222.getClass(), "delegateMap", term17223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term16499, args);
        assertTrue(recursiveEquals(term16499, term17222));
    }

};
