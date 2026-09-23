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

public class Flat3Map_put_19447407251189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373163;
     Object term373953;

    public Flat3Map_put_19447407251189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373163 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term373255 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term373349 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term372658 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term373479 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term373621 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator"));
        Object term373731 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        Object term373861 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term373163, term373163.getClass(), "delegateMap", null);
        setIntField(term373163, term373163.getClass(), "size", 3);
        setIntField(term373163, term373163.getClass(), "hash3", 1659813183);
        setIntField(term373163, term373163.getClass(), "hash2", -1659813184);
        setField(term373163, term373163.getClass(), "key2", null);
        setIntField(term373163, term373163.getClass(), "hash1", -1659813184);
        setIntField(term373349, term373349.getClass(), "size", 16777216);
        setField(term373479, term373479.getClass(), "next", null);
        setField(term373479, term373479.getClass(), "key", term373621);
        setField(term373479, term373479.getClass(), "value", null);
        setElement(term372658, 5, term373479);
        setField(term373349, term373349.getClass(), "data", term372658);
        setIntField(term373349, term373349.getClass(), "modCount", 0);
        setField(term373255, term373255.getClass(), "delegateMap", term373349);
        setIntField(term373255, term373255.getClass(), "size", 3);
        setField(term373255, term373255.getClass(), "key3", null);
        setField(term373255, term373255.getClass(), "value3", null);
        setIntField(term373255, term373255.getClass(), "hash3", -1);
        setIntField(term373255, term373255.getClass(), "hash2", -1);
        setIntField(term373255, term373255.getClass(), "hash1", -1);
        setField(term373163, term373163.getClass(), "key1", term373255);
        setField(term373163, term373163.getClass(), "key3", null);
        setField(term373163, term373163.getClass(), "value3", null);
        setField(term373163, term373163.getClass(), "value2", term373731);
        setField(term373163, term373163.getClass(), "value1", term373861);
        term373953 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term374063 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term374187 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map$FlatMapIterator"));
        setField(term373953, term373953.getClass(), "delegateMap", null);
        setIntField(term373953, term373953.getClass(), "size", 3);
        setIntField(term373953, term373953.getClass(), "hash3", 67699360);
        setField(term373953, term373953.getClass(), "value3", null);
        setIntField(term373953, term373953.getClass(), "hash2", 1885405216);
        setField(term373953, term373953.getClass(), "value2", null);
        setIntField(term373953, term373953.getClass(), "hash1", 682049536);
        setIntField(term374063, term374063.getClass(), "size", 0);
        setField(term373953, term373953.getClass(), "value1", term374063);
        setField(term373953, term373953.getClass(), "key3", null);
        setField(term373953, term373953.getClass(), "key2", null);
        setField(term373953, term373953.getClass(), "key1", term374187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term373953;
        args[1] = null;
        callMethod(klass, "put", argTypes, term373163, args);
    }

};


