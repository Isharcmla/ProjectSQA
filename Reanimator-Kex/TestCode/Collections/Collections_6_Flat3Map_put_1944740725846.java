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

public class Flat3Map_put_1944740725846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219984;
     Object term220076;

    public Flat3Map_put_1944740725846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219984 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term219984, term219984.getClass(), "delegateMap", null);
        setIntField(term219984, term219984.getClass(), "size", 3);
        setIntField(term219984, term219984.getClass(), "hash3", 0);
        setField(term219984, term219984.getClass(), "key3", null);
        setIntField(term219984, term219984.getClass(), "hash2", 0);
        setField(term219984, term219984.getClass(), "key2", null);
        setIntField(term219984, term219984.getClass(), "hash1", 0);
        setField(term219984, term219984.getClass(), "key1", term219984);
        setField(term219984, term219984.getClass(), "value3", null);
        term220076 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term220170 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term220298 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyOrderedIterator"));
        setField(term220076, term220076.getClass(), "delegateMap", null);
        setIntField(term220076, term220076.getClass(), "size", 3);
        setIntField(term220076, term220076.getClass(), "hash3", 0);
        setField(term220076, term220076.getClass(), "value3", null);
        setIntField(term220076, term220076.getClass(), "hash2", 0);
        setField(term220076, term220076.getClass(), "value2", null);
        setIntField(term220076, term220076.getClass(), "hash1", 0);
        setIntField(term220170, term220170.getClass(), "size", 0);
        setField(term220076, term220076.getClass(), "value1", term220170);
        setField(term220076, term220076.getClass(), "key3", null);
        setField(term220076, term220076.getClass(), "key2", null);
        setField(term220076, term220076.getClass(), "key1", term220298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term220076;
        args[1] = null;
        callMethod(klass, "put", argTypes, term219984, args);
    }

};


