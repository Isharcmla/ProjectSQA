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

public class Flat3Map_hashCode_201935809444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6053;
     Object term14003;

    public Flat3Map_hashCode_201935809444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6053 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term6058 = newInstance(Class.forName("java.lang.Object"));
        Object term6059 = newInstance(Class.forName("java.lang.Object"));
        Object term6060 = newInstance(Class.forName("java.lang.Object"));
        Object term6061 = newInstance(Class.forName("java.lang.Object"));
        Object term6062 = newInstance(Class.forName("java.lang.Object"));
        Object term6063 = newInstance(Class.forName("java.lang.Object"));
        Object term6064 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term6053, term6053.getClass(), "size", -1551355284);
        setIntField(term6053, term6053.getClass(), "hash1", -1381970335);
        setIntField(term6053, term6053.getClass(), "hash2", 1213549815);
        setIntField(term6053, term6053.getClass(), "hash3", -1518419301);
        setField(term6053, term6053.getClass(), "key1", term6058);
        setField(term6053, term6053.getClass(), "key2", term6059);
        setField(term6053, term6053.getClass(), "key3", term6060);
        setField(term6053, term6053.getClass(), "value1", term6061);
        setField(term6053, term6053.getClass(), "value2", term6062);
        setField(term6053, term6053.getClass(), "value3", term6063);
        setFloatField(term6064, term6064.getClass(), "loadFactor", 0.0F);
        setIntField(term6064, term6064.getClass(), "size", 0);
        setField(term6064, term6064.getClass(), "data", null);
        setIntField(term6064, term6064.getClass(), "threshold", 0);
        setIntField(term6064, term6064.getClass(), "modCount", 0);
        setField(term6064, term6064.getClass(), "entrySet", null);
        setField(term6064, term6064.getClass(), "keySet", null);
        setField(term6064, term6064.getClass(), "values", null);
        setField(term6064, term6064.getClass(), "keySet", null);
        setField(term6064, term6064.getClass(), "values", null);
        setField(term6053, term6053.getClass(), "delegateMap", term6064);
        term14003 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term14004 = newInstance(Class.forName("java.lang.Object"));
        Object term14005 = newInstance(Class.forName("java.lang.Object"));
        Object term14006 = newInstance(Class.forName("java.lang.Object"));
        Object term14007 = newInstance(Class.forName("java.lang.Object"));
        Object term14008 = newInstance(Class.forName("java.lang.Object"));
        Object term14009 = newInstance(Class.forName("java.lang.Object"));
        Object term14010 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term14003, term14003.getClass(), "size", -1551355284);
        setIntField(term14003, term14003.getClass(), "hash1", -1381970335);
        setIntField(term14003, term14003.getClass(), "hash2", 1213549815);
        setIntField(term14003, term14003.getClass(), "hash3", -1518419301);
        setField(term14003, term14003.getClass(), "key1", term14004);
        setField(term14003, term14003.getClass(), "key2", term14005);
        setField(term14003, term14003.getClass(), "key3", term14006);
        setField(term14003, term14003.getClass(), "value1", term14007);
        setField(term14003, term14003.getClass(), "value2", term14008);
        setField(term14003, term14003.getClass(), "value3", term14009);
        setFloatField(term14010, term14010.getClass(), "loadFactor", 0.0F);
        setIntField(term14010, term14010.getClass(), "size", 0);
        setField(term14010, term14010.getClass(), "data", null);
        setIntField(term14010, term14010.getClass(), "threshold", 0);
        setIntField(term14010, term14010.getClass(), "modCount", 0);
        setField(term14010, term14010.getClass(), "entrySet", null);
        setField(term14010, term14010.getClass(), "keySet", null);
        setField(term14010, term14010.getClass(), "values", null);
        setField(term14010, term14010.getClass(), "keySet", null);
        setField(term14010, term14010.getClass(), "values", null);
        setField(term14003, term14003.getClass(), "delegateMap", term14010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term6053, args);
        assertTrue(recursiveEquals(term6053, term14003));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


