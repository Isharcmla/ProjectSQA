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

public class Flat3Map_put_1944740725953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190524;
     Object term190838;
     Object term191264;
     Object term191272;

    public Flat3Map_put_1944740725953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190524 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term190616 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term190654 = newInstance(Class.forName("java.lang.Object"));
        Object term190746 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term190524, term190524.getClass(), "delegateMap", null);
        setIntField(term190524, term190524.getClass(), "size", 3);
        setIntField(term190524, term190524.getClass(), "hash3", 0);
        setField(term190616, term190616.getClass(), "delegateMap", null);
        setIntField(term190616, term190616.getClass(), "size", -4);
        setField(term190524, term190524.getClass(), "key3", term190616);
        setIntField(term190524, term190524.getClass(), "hash2", 0);
        setField(term190524, term190524.getClass(), "key2", term190654);
        setIntField(term190524, term190524.getClass(), "hash1", 0);
        setField(term190524, term190524.getClass(), "key1", term190746);
        term190838 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term190838, term190838.getClass(), "delegateMap", null);
        setIntField(term190838, term190838.getClass(), "size", 3);
        setIntField(term190838, term190838.getClass(), "hash3", 0);
        setField(term190838, term190838.getClass(), "value3", null);
        setIntField(term190838, term190838.getClass(), "hash2", 0);
        setField(term190838, term190838.getClass(), "value2", null);
        setIntField(term190838, term190838.getClass(), "hash1", 0);
        setField(term190838, term190838.getClass(), "value1", null);
        term191264 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term191265 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term191266 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term191267 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term191268 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term191269 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term191270 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term191271 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term191264, term191264.getClass(), "size", 0);
        setIntField(term191264, term191264.getClass(), "hash1", 0);
        setIntField(term191264, term191264.getClass(), "hash2", 0);
        setIntField(term191264, term191264.getClass(), "hash3", 0);
        setField(term191264, term191264.getClass(), "key1", null);
        setField(term191264, term191264.getClass(), "key2", null);
        setField(term191264, term191264.getClass(), "key3", null);
        setField(term191264, term191264.getClass(), "value1", null);
        setField(term191264, term191264.getClass(), "value2", null);
        setField(term191264, term191264.getClass(), "value3", null);
        setFloatField(term191265, term191265.getClass(), "loadFactor", 0.75F);
        setIntField(term191265, term191265.getClass(), "size", 4);
        setField(term191268, term191268.getClass(), "next", null);
        setField(term191268, term191268.getClass(), "key", null);
        setField(term191268, term191268.getClass(), "value", null);
        setField(term191267, term191267.getClass(), "next", term191268);
        setIntField(term191269, term191269.getClass(), "size", 3);
        setIntField(term191269, term191269.getClass(), "hash1", 0);
        setIntField(term191269, term191269.getClass(), "hash2", 0);
        setIntField(term191269, term191269.getClass(), "hash3", 0);
        setField(term191269, term191269.getClass(), "key1", null);
        setField(term191269, term191269.getClass(), "key2", null);
        setField(term191269, term191269.getClass(), "key3", null);
        setField(term191269, term191269.getClass(), "value1", null);
        setField(term191269, term191269.getClass(), "value2", null);
        setField(term191269, term191269.getClass(), "value3", null);
        setField(term191269, term191269.getClass(), "delegateMap", null);
        setField(term191267, term191267.getClass(), "key", term191269);
        setField(term191267, term191267.getClass(), "value", null);
        setElement(term191266, 0, term191267);
        setField(term191270, term191270.getClass(), "next", null);
        setField(term191270, term191270.getClass(), "key", term191271);
        setField(term191270, term191270.getClass(), "value", null);
        setElement(term191266, 8, term191270);
        setField(term191265, term191265.getClass(), "data", term191266);
        setIntField(term191265, term191265.getClass(), "threshold", 12);
        setIntField(term191265, term191265.getClass(), "modCount", 4);
        setField(term191265, term191265.getClass(), "entrySet", null);
        setField(term191265, term191265.getClass(), "keySet", null);
        setField(term191265, term191265.getClass(), "values", null);
        setField(term191265, term191265.getClass(), "keySet", null);
        setField(term191265, term191265.getClass(), "values", null);
        setField(term191264, term191264.getClass(), "delegateMap", term191265);
        term191272 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term191272, term191272.getClass(), "size", 3);
        setIntField(term191272, term191272.getClass(), "hash1", 0);
        setIntField(term191272, term191272.getClass(), "hash2", 0);
        setIntField(term191272, term191272.getClass(), "hash3", 0);
        setField(term191272, term191272.getClass(), "key1", null);
        setField(term191272, term191272.getClass(), "key2", null);
        setField(term191272, term191272.getClass(), "key3", null);
        setField(term191272, term191272.getClass(), "value1", null);
        setField(term191272, term191272.getClass(), "value2", null);
        setField(term191272, term191272.getClass(), "value3", null);
        setField(term191272, term191272.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term190838;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term190524, args);
        assertTrue(recursiveEquals(term190524, term191264));
        assertTrue(recursiveEquals(term190838, term191272));
        assertTrue(recursiveEquals(retValue, null));
    }

};
