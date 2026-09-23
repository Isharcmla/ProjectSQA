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

public class Flat3Map_put_1944740725956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263673;
     Object term264236;
     Object term264238;

    public Flat3Map_put_1944740725956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263673 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term263728 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term263673, term263673.getClass(), "delegateMap", null);
        setIntField(term263673, term263673.getClass(), "size", 2);
        setIntField(term263673, term263673.getClass(), "hash2", 0);
        setIntField(term263728, term263728.getClass(), "size", 0);
        setField(term263673, term263673.getClass(), "value2", term263728);
        setIntField(term263673, term263673.getClass(), "hash1", 0);
        setField(term263673, term263673.getClass(), "value1", null);
        setField(term263673, term263673.getClass(), "key2", null);
        setField(term263673, term263673.getClass(), "key1", term263673);
        term264236 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term264237 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term264236, term264236.getClass(), "size", 2);
        setIntField(term264236, term264236.getClass(), "hash1", 0);
        setIntField(term264236, term264236.getClass(), "hash2", 0);
        setIntField(term264236, term264236.getClass(), "hash3", 0);
        setField(term264236, term264236.getClass(), "key1", term264236);
        setField(term264236, term264236.getClass(), "key2", null);
        setField(term264236, term264236.getClass(), "key3", null);
        setField(term264236, term264236.getClass(), "value1", null);
        setFloatField(term264237, term264237.getClass(), "loadFactor", 0.0F);
        setIntField(term264237, term264237.getClass(), "size", 0);
        setField(term264237, term264237.getClass(), "data", null);
        setIntField(term264237, term264237.getClass(), "threshold", 0);
        setIntField(term264237, term264237.getClass(), "modCount", 0);
        setField(term264237, term264237.getClass(), "entrySet", null);
        setField(term264237, term264237.getClass(), "keySet", null);
        setField(term264237, term264237.getClass(), "values", null);
        setField(term264237, term264237.getClass(), "keySet", null);
        setField(term264237, term264237.getClass(), "values", null);
        setField(term264236, term264236.getClass(), "value2", term264237);
        setField(term264236, term264236.getClass(), "value3", null);
        setField(term264236, term264236.getClass(), "delegateMap", null);
        term264238 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term264239 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term264238, term264238.getClass(), "size", 2);
        setIntField(term264238, term264238.getClass(), "hash1", 0);
        setIntField(term264238, term264238.getClass(), "hash2", 0);
        setIntField(term264238, term264238.getClass(), "hash3", 0);
        setField(term264238, term264238.getClass(), "key1", term264238);
        setField(term264238, term264238.getClass(), "key2", null);
        setField(term264238, term264238.getClass(), "key3", null);
        setField(term264238, term264238.getClass(), "value1", null);
        setFloatField(term264239, term264239.getClass(), "loadFactor", 0.0F);
        setIntField(term264239, term264239.getClass(), "size", 0);
        setField(term264239, term264239.getClass(), "data", null);
        setIntField(term264239, term264239.getClass(), "threshold", 0);
        setIntField(term264239, term264239.getClass(), "modCount", 0);
        setField(term264239, term264239.getClass(), "entrySet", null);
        setField(term264239, term264239.getClass(), "keySet", null);
        setField(term264239, term264239.getClass(), "values", null);
        setField(term264239, term264239.getClass(), "keySet", null);
        setField(term264239, term264239.getClass(), "values", null);
        setField(term264238, term264238.getClass(), "value2", term264239);
        setField(term264238, term264238.getClass(), "value3", null);
        setField(term264238, term264238.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term263673;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term263673, args);
        assertTrue(recursiveEquals(term263673, term264236));
        assertTrue(recursiveEquals(term263673, term264238));
        assertTrue(recursiveEquals(retValue, null));
    }

};


