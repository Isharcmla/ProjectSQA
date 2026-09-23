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

public class Flat3Map_keySet_88438301668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15778;
     Object term16033;
     Object term16032;

    public Flat3Map_keySet_88438301668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15778 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term15778, term15778.getClass(), "delegateMap", null);
        term16033 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term16033, term16033.getClass(), "size", 0);
        setIntField(term16033, term16033.getClass(), "hash1", 0);
        setIntField(term16033, term16033.getClass(), "hash2", 0);
        setIntField(term16033, term16033.getClass(), "hash3", 0);
        setField(term16033, term16033.getClass(), "key1", null);
        setField(term16033, term16033.getClass(), "key2", null);
        setField(term16033, term16033.getClass(), "key3", null);
        setField(term16033, term16033.getClass(), "value1", null);
        setField(term16033, term16033.getClass(), "value2", null);
        setField(term16033, term16033.getClass(), "value3", null);
        setField(term16033, term16033.getClass(), "delegateMap", null);
        term16032 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map$KeySet"));
        Object term16027 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term16027, term16027.getClass(), "size", 0);
        setIntField(term16027, term16027.getClass(), "hash1", 0);
        setIntField(term16027, term16027.getClass(), "hash2", 0);
        setIntField(term16027, term16027.getClass(), "hash3", 0);
        setField(term16027, term16027.getClass(), "key1", null);
        setField(term16027, term16027.getClass(), "key2", null);
        setField(term16027, term16027.getClass(), "key3", null);
        setField(term16027, term16027.getClass(), "value1", null);
        setField(term16027, term16027.getClass(), "value2", null);
        setField(term16027, term16027.getClass(), "value3", null);
        setField(term16027, term16027.getClass(), "delegateMap", null);
        setField(term16032, term16032.getClass(), "parent", term16027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "keySet", argTypes, term15778, args);
        assertTrue(recursiveEquals(term15778, term16033));
        assertTrue(recursiveEquals(retValue, term16032));
    }

};


