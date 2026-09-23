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

public class Flat3Map_put_1944740725944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257408;
     Object term258000;

    public Flat3Map_put_1944740725944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257408 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term257500 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term257594 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term256913 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term257724 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term257816 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term257908 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term257408, term257408.getClass(), "delegateMap", null);
        setIntField(term257408, term257408.getClass(), "size", 3);
        setIntField(term257408, term257408.getClass(), "hash3", 1001980562);
        setField(term257408, term257408.getClass(), "key3", null);
        setIntField(term257408, term257408.getClass(), "hash2", 1001980562);
        setField(term257408, term257408.getClass(), "key2", null);
        setIntField(term257408, term257408.getClass(), "hash1", 1001980562);
        setIntField(term257594, term257594.getClass(), "size", 536870912);
        setField(term257724, term257724.getClass(), "next", null);
        setField(term257816, term257816.getClass(), "delegateMap", null);
        setField(term257724, term257724.getClass(), "key", term257816);
        setField(term257724, term257724.getClass(), "value", null);
        setElement(term256913, 6, term257724);
        setField(term257594, term257594.getClass(), "data", term256913);
        setIntField(term257594, term257594.getClass(), "modCount", 0);
        setField(term257500, term257500.getClass(), "delegateMap", term257594);
        setIntField(term257500, term257500.getClass(), "size", 3);
        setField(term257500, term257500.getClass(), "key3", null);
        setField(term257500, term257500.getClass(), "value3", null);
        setIntField(term257500, term257500.getClass(), "hash3", -1);
        setIntField(term257500, term257500.getClass(), "hash2", -1);
        setIntField(term257500, term257500.getClass(), "hash1", -1);
        setField(term257408, term257408.getClass(), "key1", term257500);
        setField(term257408, term257408.getClass(), "value3", term257908);
        setField(term257408, term257408.getClass(), "value2", term257408);
        setField(term257408, term257408.getClass(), "value1", null);
        term258000 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term258094 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term258222 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyOrderedIterator"));
        setField(term258000, term258000.getClass(), "delegateMap", null);
        setIntField(term258000, term258000.getClass(), "size", 3);
        setIntField(term258000, term258000.getClass(), "hash3", -216218110);
        setField(term258000, term258000.getClass(), "value3", null);
        setIntField(term258000, term258000.getClass(), "hash2", 84673040);
        setField(term258000, term258000.getClass(), "value2", null);
        setIntField(term258000, term258000.getClass(), "hash1", 1133525632);
        setIntField(term258094, term258094.getClass(), "size", 0);
        setField(term258000, term258000.getClass(), "value1", term258094);
        setField(term258000, term258000.getClass(), "key3", null);
        setField(term258000, term258000.getClass(), "key2", term258222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term258000;
        args[1] = null;
        callMethod(klass, "put", argTypes, term257408, args);
    }

};


