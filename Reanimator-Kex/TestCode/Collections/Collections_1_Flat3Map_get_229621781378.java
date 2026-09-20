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
import java.util.HashMap;

public class Flat3Map_get_229621781378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68547;
     Object term68827;
     Object term69342;
     Object term69346;

    public Flat3Map_get_229621781378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term68687 = new HashMap();
        HashMap term68735 = new HashMap();
        term68547 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term68639 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term68547, term68547.getClass(), "delegateMap", null);
        setIntField(term68547, term68547.getClass(), "size", 2);
        setIntField(term68547, term68547.getClass(), "hash2", 0);
        setField(term68639, term68639.getClass(), "delegateMap", null);
        setIntField(term68639, term68639.getClass(), "size", 2);
        setField(term68639, term68639.getClass(), "key2", term68687);
        setField(term68639, term68639.getClass(), "key1", term68735);
        setField(term68547, term68547.getClass(), "key2", term68639);
        term68827 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term68827, term68827.getClass(), "delegateMap", null);
        setIntField(term68827, term68827.getClass(), "size", 2);
        setIntField(term68827, term68827.getClass(), "hash2", 0);
        setField(term68827, term68827.getClass(), "value2", null);
        setIntField(term68827, term68827.getClass(), "hash1", 0);
        setField(term68827, term68827.getClass(), "value1", null);
        setField(term68827, term68827.getClass(), "key2", null);
        HashMap term69344 = new HashMap();
        HashMap term69345 = new HashMap();
        term69342 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term69343 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term69342, term69342.getClass(), "size", 2);
        setIntField(term69342, term69342.getClass(), "hash1", 0);
        setIntField(term69342, term69342.getClass(), "hash2", 0);
        setIntField(term69342, term69342.getClass(), "hash3", 0);
        setField(term69342, term69342.getClass(), "key1", null);
        setIntField(term69343, term69343.getClass(), "size", 2);
        setIntField(term69343, term69343.getClass(), "hash1", 0);
        setIntField(term69343, term69343.getClass(), "hash2", 0);
        setIntField(term69343, term69343.getClass(), "hash3", 0);
        setField(term69343, term69343.getClass(), "key1", term69344);
        setField(term69343, term69343.getClass(), "key2", term69345);
        setField(term69343, term69343.getClass(), "key3", null);
        setField(term69343, term69343.getClass(), "value1", null);
        setField(term69343, term69343.getClass(), "value2", null);
        setField(term69343, term69343.getClass(), "value3", null);
        setField(term69343, term69343.getClass(), "delegateMap", null);
        setField(term69342, term69342.getClass(), "key2", term69343);
        setField(term69342, term69342.getClass(), "key3", null);
        setField(term69342, term69342.getClass(), "value1", null);
        setField(term69342, term69342.getClass(), "value2", null);
        setField(term69342, term69342.getClass(), "value3", null);
        setField(term69342, term69342.getClass(), "delegateMap", null);
        term69346 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term69346, term69346.getClass(), "size", 2);
        setIntField(term69346, term69346.getClass(), "hash1", 0);
        setIntField(term69346, term69346.getClass(), "hash2", 0);
        setIntField(term69346, term69346.getClass(), "hash3", 0);
        setField(term69346, term69346.getClass(), "key1", null);
        setField(term69346, term69346.getClass(), "key2", null);
        setField(term69346, term69346.getClass(), "key3", null);
        setField(term69346, term69346.getClass(), "value1", null);
        setField(term69346, term69346.getClass(), "value2", null);
        setField(term69346, term69346.getClass(), "value3", null);
        setField(term69346, term69346.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term68827;
        Object retValue = callMethod(klass, "get", argTypes, term68547, args);
        assertTrue(recursiveEquals(term68547, term69342));
        assertTrue(recursiveEquals(term68827, term69346));
        assertTrue(recursiveEquals(retValue, null));
    }

};
