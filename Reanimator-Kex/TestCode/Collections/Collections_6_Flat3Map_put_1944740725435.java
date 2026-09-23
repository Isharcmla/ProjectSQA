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

public class Flat3Map_put_1944740725435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78681;
     Object term78757;
     Object term78776;
     Object term78778;

    public Flat3Map_put_1944740725435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78681 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term78681, term78681.getClass(), "delegateMap", null);
        setIntField(term78681, term78681.getClass(), "size", 1);
        term78757 = newInstance(Class.forName("java.util.stream.SliceOps$SliceTask"));
        term78776 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78777 = newInstance(Class.forName("java.util.stream.SliceOps$SliceTask"));
        setIntField(term78776, term78776.getClass(), "size", 2);
        setIntField(term78776, term78776.getClass(), "hash1", 0);
        setIntField(term78776, term78776.getClass(), "hash2", 1759304042);
        setIntField(term78776, term78776.getClass(), "hash3", 0);
        setField(term78776, term78776.getClass(), "key1", null);
        setField(term78777, term78777.getClass(), "op", null);
        setField(term78777, term78777.getClass(), "generator", null);
        setLongField(term78777, term78777.getClass(), "targetOffset", 0L);
        setLongField(term78777, term78777.getClass(), "targetSize", 0L);
        setLongField(term78777, term78777.getClass(), "thisNodeSize", 0L);
        setBooleanField(term78777, term78777.getClass(), "completed", false);
        setField(term78777, term78777.getClass(), "sharedResult", null);
        setBooleanField(term78777, term78777.getClass(), "canceled", false);
        setField(term78777, term78777.getClass(), "helper", null);
        setField(term78777, term78777.getClass(), "spliterator", null);
        setField(term78777, term78777.getClass(), "leftChild", null);
        setField(term78777, term78777.getClass(), "rightChild", null);
        setField(term78777, term78777.getClass(), "localResult", null);
        setField(term78777, term78777.getClass(), "completer", null);
        setIntField(term78777, term78777.getClass(), "pending", 0);
        setIntField(term78777, term78777.getClass(), "status", 0);
        setField(term78776, term78776.getClass(), "key2", term78777);
        setField(term78776, term78776.getClass(), "key3", null);
        setField(term78776, term78776.getClass(), "value1", null);
        setField(term78776, term78776.getClass(), "value2", null);
        setField(term78776, term78776.getClass(), "value3", null);
        setField(term78776, term78776.getClass(), "delegateMap", null);
        term78778 = newInstance(Class.forName("java.util.stream.SliceOps$SliceTask"));
        setField(term78778, term78778.getClass(), "op", null);
        setField(term78778, term78778.getClass(), "generator", null);
        setLongField(term78778, term78778.getClass(), "targetOffset", 0L);
        setLongField(term78778, term78778.getClass(), "targetSize", 0L);
        setLongField(term78778, term78778.getClass(), "thisNodeSize", 0L);
        setBooleanField(term78778, term78778.getClass(), "completed", false);
        setField(term78778, term78778.getClass(), "sharedResult", null);
        setBooleanField(term78778, term78778.getClass(), "canceled", false);
        setField(term78778, term78778.getClass(), "helper", null);
        setField(term78778, term78778.getClass(), "spliterator", null);
        setField(term78778, term78778.getClass(), "leftChild", null);
        setField(term78778, term78778.getClass(), "rightChild", null);
        setField(term78778, term78778.getClass(), "localResult", null);
        setField(term78778, term78778.getClass(), "completer", null);
        setIntField(term78778, term78778.getClass(), "pending", 0);
        setIntField(term78778, term78778.getClass(), "status", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term78757;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term78681, args);
        assertTrue(recursiveEquals(term78681, term78776));
        assertTrue(recursiveEquals(term78757, term78778));
        assertTrue(recursiveEquals(retValue, null));
    }

};


