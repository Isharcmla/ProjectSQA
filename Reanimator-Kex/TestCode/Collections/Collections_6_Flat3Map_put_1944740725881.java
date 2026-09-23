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
import java.lang.Object;

public class Flat3Map_put_1944740725881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232269;
     Object term232361;

    public Flat3Map_put_1944740725881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232269 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term232269, term232269.getClass(), "delegateMap", null);
        setIntField(term232269, term232269.getClass(), "size", 3);
        setIntField(term232269, term232269.getClass(), "hash3", 0);
        setField(term232269, term232269.getClass(), "key3", null);
        setIntField(term232269, term232269.getClass(), "hash2", 0);
        setField(term232269, term232269.getClass(), "key2", null);
        setIntField(term232269, term232269.getClass(), "hash1", 0);
        setField(term232269, term232269.getClass(), "key1", term232269);
        setField(term232269, term232269.getClass(), "value3", null);
        term232361 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term232455 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term232583 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyOrderedIterator"));
        setField(term232361, term232361.getClass(), "delegateMap", null);
        setIntField(term232361, term232361.getClass(), "size", 3);
        setIntField(term232361, term232361.getClass(), "hash3", 0);
        setField(term232361, term232361.getClass(), "value3", null);
        setIntField(term232361, term232361.getClass(), "hash2", 0);
        setField(term232361, term232361.getClass(), "value2", null);
        setIntField(term232361, term232361.getClass(), "hash1", 0);
        setIntField(term232455, term232455.getClass(), "size", 0);
        setField(term232361, term232361.getClass(), "value1", term232455);
        setField(term232361, term232361.getClass(), "key3", null);
        setField(term232361, term232361.getClass(), "key2", term232583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term232361;
        args[1] = null;
        callMethod(klass, "put", argTypes, term232269, args);
    }

};


