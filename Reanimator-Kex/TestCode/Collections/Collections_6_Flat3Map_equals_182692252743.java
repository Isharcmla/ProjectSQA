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

public class Flat3Map_equals_182692252743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6036;
     Object term6052;
     Object term13962;
     Object term13970;

    public Flat3Map_equals_182692252743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6036 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term6041 = newInstance(Class.forName("java.lang.Object"));
        Object term6042 = newInstance(Class.forName("java.lang.Object"));
        Object term6043 = newInstance(Class.forName("java.lang.Object"));
        Object term6044 = newInstance(Class.forName("java.lang.Object"));
        Object term6045 = newInstance(Class.forName("java.lang.Object"));
        Object term6046 = newInstance(Class.forName("java.lang.Object"));
        Object term6047 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term6036, term6036.getClass(), "size", 1973060703);
        setIntField(term6036, term6036.getClass(), "hash1", -138239905);
        setIntField(term6036, term6036.getClass(), "hash2", 1709474063);
        setIntField(term6036, term6036.getClass(), "hash3", 1406617209);
        setField(term6036, term6036.getClass(), "key1", term6041);
        setField(term6036, term6036.getClass(), "key2", term6042);
        setField(term6036, term6036.getClass(), "key3", term6043);
        setField(term6036, term6036.getClass(), "value1", term6044);
        setField(term6036, term6036.getClass(), "value2", term6045);
        setField(term6036, term6036.getClass(), "value3", term6046);
        setFloatField(term6047, term6047.getClass(), "loadFactor", 0.0F);
        setIntField(term6047, term6047.getClass(), "size", 0);
        setField(term6047, term6047.getClass(), "data", null);
        setIntField(term6047, term6047.getClass(), "threshold", 0);
        setIntField(term6047, term6047.getClass(), "modCount", 0);
        setField(term6047, term6047.getClass(), "entrySet", null);
        setField(term6047, term6047.getClass(), "keySet", null);
        setField(term6047, term6047.getClass(), "values", null);
        setField(term6047, term6047.getClass(), "keySet", null);
        setField(term6047, term6047.getClass(), "values", null);
        setField(term6036, term6036.getClass(), "delegateMap", term6047);
        term6052 = newInstance(Class.forName("java.lang.Object"));
        term13962 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term13963 = newInstance(Class.forName("java.lang.Object"));
        Object term13964 = newInstance(Class.forName("java.lang.Object"));
        Object term13965 = newInstance(Class.forName("java.lang.Object"));
        Object term13966 = newInstance(Class.forName("java.lang.Object"));
        Object term13967 = newInstance(Class.forName("java.lang.Object"));
        Object term13968 = newInstance(Class.forName("java.lang.Object"));
        Object term13969 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term13962, term13962.getClass(), "size", 1973060703);
        setIntField(term13962, term13962.getClass(), "hash1", -138239905);
        setIntField(term13962, term13962.getClass(), "hash2", 1709474063);
        setIntField(term13962, term13962.getClass(), "hash3", 1406617209);
        setField(term13962, term13962.getClass(), "key1", term13963);
        setField(term13962, term13962.getClass(), "key2", term13964);
        setField(term13962, term13962.getClass(), "key3", term13965);
        setField(term13962, term13962.getClass(), "value1", term13966);
        setField(term13962, term13962.getClass(), "value2", term13967);
        setField(term13962, term13962.getClass(), "value3", term13968);
        setFloatField(term13969, term13969.getClass(), "loadFactor", 0.0F);
        setIntField(term13969, term13969.getClass(), "size", 0);
        setField(term13969, term13969.getClass(), "data", null);
        setIntField(term13969, term13969.getClass(), "threshold", 0);
        setIntField(term13969, term13969.getClass(), "modCount", 0);
        setField(term13969, term13969.getClass(), "entrySet", null);
        setField(term13969, term13969.getClass(), "keySet", null);
        setField(term13969, term13969.getClass(), "values", null);
        setField(term13969, term13969.getClass(), "keySet", null);
        setField(term13969, term13969.getClass(), "values", null);
        setField(term13962, term13962.getClass(), "delegateMap", term13969);
        term13970 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6052;
        Object retValue = callMethod(klass, "equals", argTypes, term6036, args);
        assertTrue(recursiveEquals(term6036, term13962));
        assertTrue(recursiveEquals(term6052, term13970));
        assertTrue(recursiveEquals(retValue, false));
    }

};


