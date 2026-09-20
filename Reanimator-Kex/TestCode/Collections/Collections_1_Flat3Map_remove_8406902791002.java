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

public class Flat3Map_remove_8406902791002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200147;
     Object term200331;
     Object term200988;
     Object term200990;

    public Flat3Map_remove_8406902791002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200147 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term200239 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term200147, term200147.getClass(), "delegateMap", null);
        setIntField(term200147, term200147.getClass(), "size", 2);
        setIntField(term200147, term200147.getClass(), "hash2", 0);
        setField(term200147, term200147.getClass(), "key2", null);
        setIntField(term200147, term200147.getClass(), "hash1", 0);
        setField(term200147, term200147.getClass(), "key1", term200239);
        term200331 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term200331, term200331.getClass(), "delegateMap", null);
        setIntField(term200331, term200331.getClass(), "size", 2);
        setIntField(term200331, term200331.getClass(), "hash2", 0);
        setField(term200331, term200331.getClass(), "value2", null);
        setIntField(term200331, term200331.getClass(), "hash1", 0);
        setField(term200331, term200331.getClass(), "value1", null);
        term200988 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term200989 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term200988, term200988.getClass(), "size", 2);
        setIntField(term200988, term200988.getClass(), "hash1", 0);
        setIntField(term200988, term200988.getClass(), "hash2", 0);
        setIntField(term200988, term200988.getClass(), "hash3", 0);
        setIntField(term200989, term200989.getClass(), "size", 0);
        setIntField(term200989, term200989.getClass(), "hash1", 0);
        setIntField(term200989, term200989.getClass(), "hash2", 0);
        setIntField(term200989, term200989.getClass(), "hash3", 0);
        setField(term200989, term200989.getClass(), "key1", null);
        setField(term200989, term200989.getClass(), "key2", null);
        setField(term200989, term200989.getClass(), "key3", null);
        setField(term200989, term200989.getClass(), "value1", null);
        setField(term200989, term200989.getClass(), "value2", null);
        setField(term200989, term200989.getClass(), "value3", null);
        setField(term200989, term200989.getClass(), "delegateMap", null);
        setField(term200988, term200988.getClass(), "key1", term200989);
        setField(term200988, term200988.getClass(), "key2", null);
        setField(term200988, term200988.getClass(), "key3", null);
        setField(term200988, term200988.getClass(), "value1", null);
        setField(term200988, term200988.getClass(), "value2", null);
        setField(term200988, term200988.getClass(), "value3", null);
        setField(term200988, term200988.getClass(), "delegateMap", null);
        term200990 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term200990, term200990.getClass(), "size", 2);
        setIntField(term200990, term200990.getClass(), "hash1", 0);
        setIntField(term200990, term200990.getClass(), "hash2", 0);
        setIntField(term200990, term200990.getClass(), "hash3", 0);
        setField(term200990, term200990.getClass(), "key1", null);
        setField(term200990, term200990.getClass(), "key2", null);
        setField(term200990, term200990.getClass(), "key3", null);
        setField(term200990, term200990.getClass(), "value1", null);
        setField(term200990, term200990.getClass(), "value2", null);
        setField(term200990, term200990.getClass(), "value3", null);
        setField(term200990, term200990.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term200331;
        Object retValue = callMethod(klass, "remove", argTypes, term200147, args);
        assertTrue(recursiveEquals(term200147, term200988));
        assertTrue(recursiveEquals(term200331, term200990));
        assertTrue(recursiveEquals(retValue, null));
    }

};
