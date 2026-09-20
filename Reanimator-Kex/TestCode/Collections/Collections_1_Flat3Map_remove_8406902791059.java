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

public class Flat3Map_remove_8406902791059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210851;
     Object term211027;
     Object term211093;
     Object term211095;

    public Flat3Map_remove_8406902791059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210851 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term210889 = newInstance(Class.forName("java.lang.Object"));
        term211027 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term210851, term210851.getClass(), "delegateMap", null);
        setIntField(term210851, term210851.getClass(), "size", 2);
        setIntField(term210851, term210851.getClass(), "hash2", 0);
        setField(term210851, term210851.getClass(), "key2", term210889);
        setIntField(term210851, term210851.getClass(), "hash1", 0);
        setField(term211027, term211027.getClass(), "delegateMap", null);
        setIntField(term211027, term211027.getClass(), "size", 2);
        setIntField(term211027, term211027.getClass(), "hash2", 0);
        setField(term211027, term211027.getClass(), "value2", null);
        setIntField(term211027, term211027.getClass(), "hash1", 0);
        setField(term211027, term211027.getClass(), "value1", null);
        setField(term210851, term210851.getClass(), "key1", term211027);
        term211093 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term211094 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term211093, term211093.getClass(), "size", 1);
        setIntField(term211093, term211093.getClass(), "hash1", 0);
        setIntField(term211093, term211093.getClass(), "hash2", 0);
        setIntField(term211093, term211093.getClass(), "hash3", 0);
        setField(term211093, term211093.getClass(), "key1", term211094);
        setField(term211093, term211093.getClass(), "key2", null);
        setField(term211093, term211093.getClass(), "key3", null);
        setField(term211093, term211093.getClass(), "value1", null);
        setField(term211093, term211093.getClass(), "value2", null);
        setField(term211093, term211093.getClass(), "value3", null);
        setField(term211093, term211093.getClass(), "delegateMap", null);
        term211095 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term211095, term211095.getClass(), "size", 2);
        setIntField(term211095, term211095.getClass(), "hash1", 0);
        setIntField(term211095, term211095.getClass(), "hash2", 0);
        setIntField(term211095, term211095.getClass(), "hash3", 0);
        setField(term211095, term211095.getClass(), "key1", null);
        setField(term211095, term211095.getClass(), "key2", null);
        setField(term211095, term211095.getClass(), "key3", null);
        setField(term211095, term211095.getClass(), "value1", null);
        setField(term211095, term211095.getClass(), "value2", null);
        setField(term211095, term211095.getClass(), "value3", null);
        setField(term211095, term211095.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term211027;
        Object retValue = callMethod(klass, "remove", argTypes, term210851, args);
        assertTrue(recursiveEquals(term210851, term211093));
        assertTrue(recursiveEquals(term211027, term211095));
        assertTrue(recursiveEquals(retValue, null));
    }

};
