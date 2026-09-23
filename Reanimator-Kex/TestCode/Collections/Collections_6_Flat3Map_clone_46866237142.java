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

public class Flat3Map_clone_46866237142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6020;
     Object term13926;
     Object term13905;

    public Flat3Map_clone_46866237142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6020 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term6025 = newInstance(Class.forName("java.lang.Object"));
        Object term6026 = newInstance(Class.forName("java.lang.Object"));
        Object term6027 = newInstance(Class.forName("java.lang.Object"));
        Object term6028 = newInstance(Class.forName("java.lang.Object"));
        Object term6029 = newInstance(Class.forName("java.lang.Object"));
        Object term6030 = newInstance(Class.forName("java.lang.Object"));
        Object term6031 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term6020, term6020.getClass(), "size", 1964967720);
        setIntField(term6020, term6020.getClass(), "hash1", 1351900243);
        setIntField(term6020, term6020.getClass(), "hash2", -330897705);
        setIntField(term6020, term6020.getClass(), "hash3", 1065595802);
        setField(term6020, term6020.getClass(), "key1", term6025);
        setField(term6020, term6020.getClass(), "key2", term6026);
        setField(term6020, term6020.getClass(), "key3", term6027);
        setField(term6020, term6020.getClass(), "value1", term6028);
        setField(term6020, term6020.getClass(), "value2", term6029);
        setField(term6020, term6020.getClass(), "value3", term6030);
        setFloatField(term6031, term6031.getClass(), "loadFactor", 0.0F);
        setIntField(term6031, term6031.getClass(), "size", 0);
        setField(term6031, term6031.getClass(), "data", null);
        setIntField(term6031, term6031.getClass(), "threshold", 0);
        setIntField(term6031, term6031.getClass(), "modCount", 0);
        setField(term6031, term6031.getClass(), "entrySet", null);
        setField(term6031, term6031.getClass(), "keySet", null);
        setField(term6031, term6031.getClass(), "values", null);
        setField(term6031, term6031.getClass(), "keySet", null);
        setField(term6031, term6031.getClass(), "values", null);
        setField(term6020, term6020.getClass(), "delegateMap", term6031);
        term13926 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term13927 = newInstance(Class.forName("java.lang.Object"));
        Object term13928 = newInstance(Class.forName("java.lang.Object"));
        Object term13929 = newInstance(Class.forName("java.lang.Object"));
        Object term13930 = newInstance(Class.forName("java.lang.Object"));
        Object term13931 = newInstance(Class.forName("java.lang.Object"));
        Object term13932 = newInstance(Class.forName("java.lang.Object"));
        Object term13933 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term13926, term13926.getClass(), "size", 1964967720);
        setIntField(term13926, term13926.getClass(), "hash1", 1351900243);
        setIntField(term13926, term13926.getClass(), "hash2", -330897705);
        setIntField(term13926, term13926.getClass(), "hash3", 1065595802);
        setField(term13926, term13926.getClass(), "key1", term13927);
        setField(term13926, term13926.getClass(), "key2", term13928);
        setField(term13926, term13926.getClass(), "key3", term13929);
        setField(term13926, term13926.getClass(), "value1", term13930);
        setField(term13926, term13926.getClass(), "value2", term13931);
        setField(term13926, term13926.getClass(), "value3", term13932);
        setFloatField(term13933, term13933.getClass(), "loadFactor", 0.0F);
        setIntField(term13933, term13933.getClass(), "size", 0);
        setField(term13933, term13933.getClass(), "data", null);
        setIntField(term13933, term13933.getClass(), "threshold", 0);
        setIntField(term13933, term13933.getClass(), "modCount", 0);
        setField(term13933, term13933.getClass(), "entrySet", null);
        setField(term13933, term13933.getClass(), "keySet", null);
        setField(term13933, term13933.getClass(), "values", null);
        setField(term13933, term13933.getClass(), "keySet", null);
        setField(term13933, term13933.getClass(), "values", null);
        setField(term13926, term13926.getClass(), "delegateMap", term13933);
        term13905 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term13910 = newInstance(Class.forName("java.lang.Object"));
        Object term13911 = newInstance(Class.forName("java.lang.Object"));
        Object term13912 = newInstance(Class.forName("java.lang.Object"));
        Object term13913 = newInstance(Class.forName("java.lang.Object"));
        Object term13914 = newInstance(Class.forName("java.lang.Object"));
        Object term13915 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term13905, term13905.getClass(), "size", 1964967720);
        setIntField(term13905, term13905.getClass(), "hash1", 1351900243);
        setIntField(term13905, term13905.getClass(), "hash2", -330897705);
        setIntField(term13905, term13905.getClass(), "hash3", 1065595802);
        setField(term13905, term13905.getClass(), "key1", term13910);
        setField(term13905, term13905.getClass(), "key2", term13911);
        setField(term13905, term13905.getClass(), "key3", term13912);
        setField(term13905, term13905.getClass(), "value1", term13913);
        setField(term13905, term13905.getClass(), "value2", term13914);
        setField(term13905, term13905.getClass(), "value3", term13915);
        setField(term13905, term13905.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term6020, args);
        assertTrue(recursiveEquals(term6020, term13926));
        assertTrue(recursiveEquals(retValue, term13905));
    }

};


