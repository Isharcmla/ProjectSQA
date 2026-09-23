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

public class Flat3Map_put_1944740725293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48412;
     Object term48839;
     Object term48841;

    public Flat3Map_put_1944740725293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48412 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term48467 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term48412, term48412.getClass(), "delegateMap", null);
        setIntField(term48412, term48412.getClass(), "size", 1);
        setIntField(term48412, term48412.getClass(), "hash1", 0);
        setField(term48412, term48412.getClass(), "value1", term48467);
        term48839 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term48840 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term48839, term48839.getClass(), "size", 2);
        setIntField(term48839, term48839.getClass(), "hash1", 0);
        setIntField(term48839, term48839.getClass(), "hash2", 0);
        setIntField(term48839, term48839.getClass(), "hash3", 0);
        setField(term48839, term48839.getClass(), "key1", null);
        setField(term48839, term48839.getClass(), "key2", term48839);
        setField(term48839, term48839.getClass(), "key3", null);
        setFloatField(term48840, term48840.getClass(), "loadFactor", 0.0F);
        setIntField(term48840, term48840.getClass(), "size", 0);
        setField(term48840, term48840.getClass(), "data", null);
        setIntField(term48840, term48840.getClass(), "threshold", 0);
        setIntField(term48840, term48840.getClass(), "modCount", 0);
        setField(term48840, term48840.getClass(), "entrySet", null);
        setField(term48840, term48840.getClass(), "keySet", null);
        setField(term48840, term48840.getClass(), "values", null);
        setField(term48840, term48840.getClass(), "keySet", null);
        setField(term48840, term48840.getClass(), "values", null);
        setField(term48839, term48839.getClass(), "value1", term48840);
        setField(term48839, term48839.getClass(), "value2", null);
        setField(term48839, term48839.getClass(), "value3", null);
        setField(term48839, term48839.getClass(), "delegateMap", null);
        term48841 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term48842 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term48841, term48841.getClass(), "size", 2);
        setIntField(term48841, term48841.getClass(), "hash1", 0);
        setIntField(term48841, term48841.getClass(), "hash2", 0);
        setIntField(term48841, term48841.getClass(), "hash3", 0);
        setField(term48841, term48841.getClass(), "key1", null);
        setField(term48841, term48841.getClass(), "key2", term48841);
        setField(term48841, term48841.getClass(), "key3", null);
        setFloatField(term48842, term48842.getClass(), "loadFactor", 0.0F);
        setIntField(term48842, term48842.getClass(), "size", 0);
        setField(term48842, term48842.getClass(), "data", null);
        setIntField(term48842, term48842.getClass(), "threshold", 0);
        setIntField(term48842, term48842.getClass(), "modCount", 0);
        setField(term48842, term48842.getClass(), "entrySet", null);
        setField(term48842, term48842.getClass(), "keySet", null);
        setField(term48842, term48842.getClass(), "values", null);
        setField(term48842, term48842.getClass(), "keySet", null);
        setField(term48842, term48842.getClass(), "values", null);
        setField(term48841, term48841.getClass(), "value1", term48842);
        setField(term48841, term48841.getClass(), "value2", null);
        setField(term48841, term48841.getClass(), "value3", null);
        setField(term48841, term48841.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term48412;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term48412, args);
        assertTrue(recursiveEquals(term48412, term48839));
        assertTrue(recursiveEquals(term48412, term48841));
        assertTrue(recursiveEquals(retValue, null));
    }

};


