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

public class Flat3Map_entrySet_94413123780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16827;
     Object term17093;
     Object term17092;

    public Flat3Map_entrySet_94413123780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16827 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term16827, term16827.getClass(), "delegateMap", null);
        term17093 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term17093, term17093.getClass(), "size", 0);
        setIntField(term17093, term17093.getClass(), "hash1", 0);
        setIntField(term17093, term17093.getClass(), "hash2", 0);
        setIntField(term17093, term17093.getClass(), "hash3", 0);
        setField(term17093, term17093.getClass(), "key1", null);
        setField(term17093, term17093.getClass(), "key2", null);
        setField(term17093, term17093.getClass(), "key3", null);
        setField(term17093, term17093.getClass(), "value1", null);
        setField(term17093, term17093.getClass(), "value2", null);
        setField(term17093, term17093.getClass(), "value3", null);
        setField(term17093, term17093.getClass(), "delegateMap", null);
        term17092 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map$EntrySet"));
        Object term17087 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term17087, term17087.getClass(), "size", 0);
        setIntField(term17087, term17087.getClass(), "hash1", 0);
        setIntField(term17087, term17087.getClass(), "hash2", 0);
        setIntField(term17087, term17087.getClass(), "hash3", 0);
        setField(term17087, term17087.getClass(), "key1", null);
        setField(term17087, term17087.getClass(), "key2", null);
        setField(term17087, term17087.getClass(), "key3", null);
        setField(term17087, term17087.getClass(), "value1", null);
        setField(term17087, term17087.getClass(), "value2", null);
        setField(term17087, term17087.getClass(), "value3", null);
        setField(term17087, term17087.getClass(), "delegateMap", null);
        setField(term17092, term17092.getClass(), "parent", term17087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "entrySet", argTypes, term16827, args);
        assertTrue(recursiveEquals(term16827, term17093));
        assertTrue(recursiveEquals(retValue, term17092));
    }

};


