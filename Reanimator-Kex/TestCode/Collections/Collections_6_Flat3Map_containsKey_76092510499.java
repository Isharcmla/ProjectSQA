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

public class Flat3Map_containsKey_76092510499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93204;
     Object term93344;
     Object term93702;
     Object term93703;

    public Flat3Map_containsKey_76092510499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93204 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term93204, term93204.getClass(), "delegateMap", null);
        setIntField(term93204, term93204.getClass(), "size", 3);
        setIntField(term93204, term93204.getClass(), "hash3", -1);
        setIntField(term93204, term93204.getClass(), "hash2", 0);
        term93344 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator"));
        term93702 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term93702, term93702.getClass(), "size", 3);
        setIntField(term93702, term93702.getClass(), "hash1", 0);
        setIntField(term93702, term93702.getClass(), "hash2", 0);
        setIntField(term93702, term93702.getClass(), "hash3", -1);
        setField(term93702, term93702.getClass(), "key1", null);
        setField(term93702, term93702.getClass(), "key2", null);
        setField(term93702, term93702.getClass(), "key3", null);
        setField(term93702, term93702.getClass(), "value1", null);
        setField(term93702, term93702.getClass(), "value2", null);
        setField(term93702, term93702.getClass(), "value3", null);
        setField(term93702, term93702.getClass(), "delegateMap", null);
        term93703 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator"));
        setField(term93703, term93703.getClass(), "parent", null);
        setIntField(term93703, term93703.getClass(), "hashIndex", 0);
        setField(term93703, term93703.getClass(), "last", null);
        setField(term93703, term93703.getClass(), "next", null);
        setIntField(term93703, term93703.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term93344;
        callMethod(klass, "containsKey", argTypes, term93204, args);
        assertTrue(recursiveEquals(term93204, term93702));
        assertTrue(recursiveEquals(term93344, term93703));
    }

};


