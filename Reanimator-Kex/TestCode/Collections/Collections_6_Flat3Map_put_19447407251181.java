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

public class Flat3Map_put_19447407251181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367404;
     Object term367840;

    public Flat3Map_put_19447407251181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367404 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term367496 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term367534 = newInstance(Class.forName("java.lang.Object"));
        Object term367572 = newInstance(Class.forName("java.lang.Object"));
        Object term367610 = newInstance(Class.forName("java.lang.Object"));
        term367840 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term367886 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term367404, term367404.getClass(), "delegateMap", null);
        setIntField(term367404, term367404.getClass(), "size", 3);
        setIntField(term367404, term367404.getClass(), "hash3", 0);
        setField(term367496, term367496.getClass(), "delegateMap", null);
        setIntField(term367496, term367496.getClass(), "size", 3);
        setField(term367496, term367496.getClass(), "key3", term367534);
        setField(term367496, term367496.getClass(), "key2", null);
        setField(term367496, term367496.getClass(), "value2", null);
        setIntField(term367496, term367496.getClass(), "hash3", -1);
        setIntField(term367496, term367496.getClass(), "hash2", -1);
        setIntField(term367496, term367496.getClass(), "hash1", 0);
        setField(term367496, term367496.getClass(), "key1", term367572);
        setField(term367404, term367404.getClass(), "key3", term367496);
        setIntField(term367404, term367404.getClass(), "hash2", 0);
        setField(term367404, term367404.getClass(), "key2", term367610);
        setIntField(term367404, term367404.getClass(), "hash1", 0);
        setField(term367840, term367840.getClass(), "delegateMap", null);
        setIntField(term367840, term367840.getClass(), "size", 3);
        setIntField(term367840, term367840.getClass(), "hash3", 0);
        setField(term367840, term367840.getClass(), "value3", null);
        setIntField(term367840, term367840.getClass(), "hash2", 0);
        setField(term367840, term367840.getClass(), "value2", null);
        setIntField(term367840, term367840.getClass(), "hash1", 0);
        setField(term367840, term367840.getClass(), "value1", null);
        setField(term367840, term367840.getClass(), "key3", null);
        setField(term367886, term367886.getClass(), "delegateMap", null);
        setIntField(term367886, term367886.getClass(), "size", 2);
        setIntField(term367886, term367886.getClass(), "hash2", 0);
        setField(term367886, term367886.getClass(), "value2", null);
        setIntField(term367886, term367886.getClass(), "hash1", 0);
        setField(term367886, term367886.getClass(), "value1", null);
        setField(term367840, term367840.getClass(), "key2", term367886);
        setField(term367404, term367404.getClass(), "key1", term367840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term367840;
        args[1] = null;
        callMethod(klass, "put", argTypes, term367404, args);
    }

};


