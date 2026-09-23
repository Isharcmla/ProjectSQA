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

public class Flat3Map_put_19447407251015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287330;
     Object term287642;
     Object term287906;
     Object term287907;

    public Flat3Map_put_19447407251015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287330 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term287422 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term287550 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyOrderedIterator"));
        setField(term287330, term287330.getClass(), "delegateMap", null);
        setIntField(term287330, term287330.getClass(), "size", 3);
        setIntField(term287330, term287330.getClass(), "hash3", 0);
        setField(term287422, term287422.getClass(), "delegateMap", null);
        setIntField(term287422, term287422.getClass(), "size", 3);
        setField(term287422, term287422.getClass(), "key3", term287550);
        setField(term287422, term287422.getClass(), "key2", null);
        setField(term287422, term287422.getClass(), "value2", null);
        setField(term287330, term287330.getClass(), "key3", term287422);
        setIntField(term287330, term287330.getClass(), "hash2", 0);
        setField(term287330, term287330.getClass(), "key2", null);
        setIntField(term287330, term287330.getClass(), "hash1", -1);
        term287642 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term287736 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term287642, term287642.getClass(), "delegateMap", null);
        setIntField(term287642, term287642.getClass(), "size", 3);
        setIntField(term287642, term287642.getClass(), "hash3", 0);
        setField(term287642, term287642.getClass(), "value3", null);
        setIntField(term287642, term287642.getClass(), "hash2", 0);
        setIntField(term287736, term287736.getClass(), "size", 0);
        setField(term287642, term287642.getClass(), "value2", term287736);
        setIntField(term287642, term287642.getClass(), "hash1", 0);
        setField(term287642, term287642.getClass(), "value1", null);
        setField(term287642, term287642.getClass(), "key3", null);
        setField(term287642, term287642.getClass(), "key2", null);
        term287906 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term287906, term287906.getClass(), "size", 0);
        setIntField(term287906, term287906.getClass(), "hash1", 0);
        setIntField(term287906, term287906.getClass(), "hash2", 0);
        setIntField(term287906, term287906.getClass(), "hash3", 0);
        setField(term287906, term287906.getClass(), "key1", null);
        setField(term287906, term287906.getClass(), "key2", null);
        setField(term287906, term287906.getClass(), "key3", null);
        setField(term287906, term287906.getClass(), "value1", null);
        setField(term287906, term287906.getClass(), "value2", null);
        setField(term287906, term287906.getClass(), "value3", null);
        setField(term287906, term287906.getClass(), "delegateMap", true);
        term287907 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term287907, term287907.getClass(), "size", 3);
        setIntField(term287907, term287907.getClass(), "hash1", 0);
        setIntField(term287907, term287907.getClass(), "hash2", 0);
        setIntField(term287907, term287907.getClass(), "hash3", 0);
        setField(term287907, term287907.getClass(), "key1", null);
        setField(term287907, term287907.getClass(), "key2", null);
        setField(term287907, term287907.getClass(), "key3", null);
        setField(term287907, term287907.getClass(), "value1", null);
        setField(term287907, term287907.getClass(), "value2", null);
        setField(term287907, term287907.getClass(), "value3", null);
        setField(term287907, term287907.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term287642;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term287330, args);
        assertTrue(recursiveEquals(term287330, term287906));
        assertTrue(recursiveEquals(term287642, term287907));
        assertTrue(recursiveEquals(retValue, null));
    }

};


