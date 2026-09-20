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

public class Flat3Map_get_229621781583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111538;
     Object term111722;
     Object term111881;
     Object term111883;

    public Flat3Map_get_229621781583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111538 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term111630 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term111538, term111538.getClass(), "delegateMap", null);
        setIntField(term111538, term111538.getClass(), "size", 2);
        setIntField(term111538, term111538.getClass(), "hash2", 0);
        setField(term111630, term111630.getClass(), "delegateMap", null);
        setIntField(term111630, term111630.getClass(), "size", -3);
        setField(term111538, term111538.getClass(), "key2", term111630);
        setIntField(term111538, term111538.getClass(), "hash1", 0);
        setField(term111538, term111538.getClass(), "key1", term111538);
        term111722 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term111722, term111722.getClass(), "delegateMap", null);
        setIntField(term111722, term111722.getClass(), "size", 2);
        setIntField(term111722, term111722.getClass(), "hash2", 0);
        setField(term111722, term111722.getClass(), "value2", null);
        setIntField(term111722, term111722.getClass(), "hash1", 0);
        setField(term111722, term111722.getClass(), "value1", null);
        term111881 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term111882 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term111881, term111881.getClass(), "size", 2);
        setIntField(term111881, term111881.getClass(), "hash1", 0);
        setIntField(term111881, term111881.getClass(), "hash2", 0);
        setIntField(term111881, term111881.getClass(), "hash3", 0);
        setField(term111881, term111881.getClass(), "key1", term111881);
        setIntField(term111882, term111882.getClass(), "size", -3);
        setIntField(term111882, term111882.getClass(), "hash1", 0);
        setIntField(term111882, term111882.getClass(), "hash2", 0);
        setIntField(term111882, term111882.getClass(), "hash3", 0);
        setField(term111882, term111882.getClass(), "key1", null);
        setField(term111882, term111882.getClass(), "key2", null);
        setField(term111882, term111882.getClass(), "key3", null);
        setField(term111882, term111882.getClass(), "value1", null);
        setField(term111882, term111882.getClass(), "value2", null);
        setField(term111882, term111882.getClass(), "value3", null);
        setField(term111882, term111882.getClass(), "delegateMap", null);
        setField(term111881, term111881.getClass(), "key2", term111882);
        setField(term111881, term111881.getClass(), "key3", null);
        setField(term111881, term111881.getClass(), "value1", null);
        setField(term111881, term111881.getClass(), "value2", null);
        setField(term111881, term111881.getClass(), "value3", null);
        setField(term111881, term111881.getClass(), "delegateMap", null);
        term111883 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term111883, term111883.getClass(), "size", 2);
        setIntField(term111883, term111883.getClass(), "hash1", 0);
        setIntField(term111883, term111883.getClass(), "hash2", 0);
        setIntField(term111883, term111883.getClass(), "hash3", 0);
        setField(term111883, term111883.getClass(), "key1", null);
        setField(term111883, term111883.getClass(), "key2", null);
        setField(term111883, term111883.getClass(), "key3", null);
        setField(term111883, term111883.getClass(), "value1", null);
        setField(term111883, term111883.getClass(), "value2", null);
        setField(term111883, term111883.getClass(), "value3", null);
        setField(term111883, term111883.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term111722;
        Object retValue = callMethod(klass, "get", argTypes, term111538, args);
        assertTrue(recursiveEquals(term111538, term111881));
        assertTrue(recursiveEquals(term111722, term111883));
        assertTrue(recursiveEquals(retValue, null));
    }

};
