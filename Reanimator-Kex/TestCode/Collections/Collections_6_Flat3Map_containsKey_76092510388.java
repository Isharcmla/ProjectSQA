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

public class Flat3Map_containsKey_76092510388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67229;
     Object term67369;
     Object term67817;
     Object term67818;

    public Flat3Map_containsKey_76092510388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67229 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term67229, term67229.getClass(), "delegateMap", null);
        setIntField(term67229, term67229.getClass(), "size", 2);
        term67369 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator"));
        term67817 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term67817, term67817.getClass(), "size", 2);
        setIntField(term67817, term67817.getClass(), "hash1", 0);
        setIntField(term67817, term67817.getClass(), "hash2", 0);
        setIntField(term67817, term67817.getClass(), "hash3", 0);
        setField(term67817, term67817.getClass(), "key1", null);
        setField(term67817, term67817.getClass(), "key2", null);
        setField(term67817, term67817.getClass(), "key3", null);
        setField(term67817, term67817.getClass(), "value1", null);
        setField(term67817, term67817.getClass(), "value2", null);
        setField(term67817, term67817.getClass(), "value3", null);
        setField(term67817, term67817.getClass(), "delegateMap", null);
        term67818 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator"));
        setField(term67818, term67818.getClass(), "parent", null);
        setIntField(term67818, term67818.getClass(), "hashIndex", 0);
        setField(term67818, term67818.getClass(), "last", null);
        setField(term67818, term67818.getClass(), "next", null);
        setIntField(term67818, term67818.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term67369;
        callMethod(klass, "containsKey", argTypes, term67229, args);
        assertTrue(recursiveEquals(term67229, term67817));
        assertTrue(recursiveEquals(term67369, term67818));
    }

};


