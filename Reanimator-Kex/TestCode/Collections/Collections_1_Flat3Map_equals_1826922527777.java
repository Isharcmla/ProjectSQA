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

public class Flat3Map_equals_1826922527777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157752;
     Object term158004;
     Object term158204;
     Object term158207;

    public Flat3Map_equals_1826922527777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157752 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term157862 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term157912 = newInstance(Class.forName("java.util.zip.ZipUtils"));
        setField(term157752, term157752.getClass(), "delegateMap", null);
        setIntField(term157752, term157752.getClass(), "size", 2);
        setField(term157752, term157752.getClass(), "key2", null);
        setIntField(term157862, term157862.getClass(), "size", 0);
        setField(term157752, term157752.getClass(), "value2", term157862);
        setField(term157752, term157752.getClass(), "key1", term157912);
        term158004 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term158114 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term158004, term158004.getClass(), "delegateMap", null);
        setIntField(term158004, term158004.getClass(), "size", 2);
        setField(term158004, term158004.getClass(), "key2", null);
        setIntField(term158114, term158114.getClass(), "size", 0);
        setField(term158004, term158004.getClass(), "value2", term158114);
        term158204 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term158205 = newInstance(Class.forName("java.util.zip.ZipUtils"));
        Object term158206 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term158204, term158204.getClass(), "size", 2);
        setIntField(term158204, term158204.getClass(), "hash1", 0);
        setIntField(term158204, term158204.getClass(), "hash2", 0);
        setIntField(term158204, term158204.getClass(), "hash3", 0);
        setField(term158204, term158204.getClass(), "key1", term158205);
        setField(term158204, term158204.getClass(), "key2", null);
        setField(term158204, term158204.getClass(), "key3", null);
        setField(term158204, term158204.getClass(), "value1", null);
        setFloatField(term158206, term158206.getClass(), "loadFactor", 0.0F);
        setIntField(term158206, term158206.getClass(), "size", 0);
        setField(term158206, term158206.getClass(), "data", null);
        setIntField(term158206, term158206.getClass(), "threshold", 0);
        setIntField(term158206, term158206.getClass(), "modCount", 0);
        setField(term158206, term158206.getClass(), "entrySet", null);
        setField(term158206, term158206.getClass(), "keySet", null);
        setField(term158206, term158206.getClass(), "values", null);
        setField(term158206, term158206.getClass(), "keySet", null);
        setField(term158206, term158206.getClass(), "values", null);
        setField(term158204, term158204.getClass(), "value2", term158206);
        setField(term158204, term158204.getClass(), "value3", null);
        setField(term158204, term158204.getClass(), "delegateMap", null);
        term158207 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term158208 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term158207, term158207.getClass(), "size", 2);
        setIntField(term158207, term158207.getClass(), "hash1", 0);
        setIntField(term158207, term158207.getClass(), "hash2", 0);
        setIntField(term158207, term158207.getClass(), "hash3", 0);
        setField(term158207, term158207.getClass(), "key1", null);
        setField(term158207, term158207.getClass(), "key2", null);
        setField(term158207, term158207.getClass(), "key3", null);
        setField(term158207, term158207.getClass(), "value1", null);
        setFloatField(term158208, term158208.getClass(), "loadFactor", 0.0F);
        setIntField(term158208, term158208.getClass(), "size", 0);
        setField(term158208, term158208.getClass(), "data", null);
        setIntField(term158208, term158208.getClass(), "threshold", 0);
        setIntField(term158208, term158208.getClass(), "modCount", 0);
        setField(term158208, term158208.getClass(), "entrySet", null);
        setField(term158208, term158208.getClass(), "keySet", null);
        setField(term158208, term158208.getClass(), "values", null);
        setField(term158208, term158208.getClass(), "keySet", null);
        setField(term158208, term158208.getClass(), "values", null);
        setField(term158207, term158207.getClass(), "value2", term158208);
        setField(term158207, term158207.getClass(), "value3", null);
        setField(term158207, term158207.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term158004;
        Object retValue = callMethod(klass, "equals", argTypes, term157752, args);
        assertTrue(recursiveEquals(term157752, term158204));
        assertTrue(recursiveEquals(term158004, term158207));
        assertTrue(recursiveEquals(retValue, false));
    }

};
