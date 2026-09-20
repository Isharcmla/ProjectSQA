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

public class Flat3Map_remove_8406902791081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214570;
     Object term214662;
     Object term214985;
     Object term214986;

    public Flat3Map_remove_8406902791081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214570 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term214570, term214570.getClass(), "delegateMap", null);
        setIntField(term214570, term214570.getClass(), "size", 3);
        setIntField(term214570, term214570.getClass(), "hash3", -1);
        setIntField(term214570, term214570.getClass(), "hash2", 0);
        setField(term214570, term214570.getClass(), "key2", term214570);
        term214662 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term214772 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term214662, term214662.getClass(), "delegateMap", null);
        setIntField(term214662, term214662.getClass(), "size", 3);
        setIntField(term214662, term214662.getClass(), "hash3", 0);
        setIntField(term214772, term214772.getClass(), "size", 0);
        setField(term214662, term214662.getClass(), "value3", term214772);
        setIntField(term214662, term214662.getClass(), "hash2", 0);
        setField(term214662, term214662.getClass(), "value2", null);
        setIntField(term214662, term214662.getClass(), "hash1", 0);
        setField(term214662, term214662.getClass(), "value1", null);
        term214985 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term214985, term214985.getClass(), "size", 3);
        setIntField(term214985, term214985.getClass(), "hash1", 0);
        setIntField(term214985, term214985.getClass(), "hash2", 0);
        setIntField(term214985, term214985.getClass(), "hash3", -1);
        setField(term214985, term214985.getClass(), "key1", null);
        setField(term214985, term214985.getClass(), "key2", term214985);
        setField(term214985, term214985.getClass(), "key3", null);
        setField(term214985, term214985.getClass(), "value1", null);
        setField(term214985, term214985.getClass(), "value2", null);
        setField(term214985, term214985.getClass(), "value3", null);
        setField(term214985, term214985.getClass(), "delegateMap", null);
        term214986 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term214987 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term214986, term214986.getClass(), "size", 3);
        setIntField(term214986, term214986.getClass(), "hash1", 0);
        setIntField(term214986, term214986.getClass(), "hash2", 0);
        setIntField(term214986, term214986.getClass(), "hash3", 0);
        setField(term214986, term214986.getClass(), "key1", null);
        setField(term214986, term214986.getClass(), "key2", null);
        setField(term214986, term214986.getClass(), "key3", null);
        setField(term214986, term214986.getClass(), "value1", null);
        setField(term214986, term214986.getClass(), "value2", null);
        setFloatField(term214987, term214987.getClass(), "loadFactor", 0.0F);
        setIntField(term214987, term214987.getClass(), "size", 0);
        setField(term214987, term214987.getClass(), "data", null);
        setIntField(term214987, term214987.getClass(), "threshold", 0);
        setIntField(term214987, term214987.getClass(), "modCount", 0);
        setField(term214987, term214987.getClass(), "entrySet", null);
        setField(term214987, term214987.getClass(), "keySet", null);
        setField(term214987, term214987.getClass(), "values", null);
        setField(term214987, term214987.getClass(), "keySet", null);
        setField(term214987, term214987.getClass(), "values", null);
        setField(term214986, term214986.getClass(), "value3", term214987);
        setField(term214986, term214986.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term214662;
        Object retValue = callMethod(klass, "remove", argTypes, term214570, args);
        assertTrue(recursiveEquals(term214570, term214985));
        assertTrue(recursiveEquals(term214662, term214986));
        assertTrue(recursiveEquals(retValue, null));
    }

};
