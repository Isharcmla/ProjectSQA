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
import java.util.HashMap;

public class Flat3Map_get_229621781483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90051;
     Object term90267;
     Object term90364;
     Object term90368;

    public Flat3Map_get_229621781483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term90175 = new HashMap();
        term90051 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term90089 = newInstance(Class.forName("java.lang.Object"));
        Object term90127 = newInstance(Class.forName("java.lang.Object"));
        setField(term90051, term90051.getClass(), "delegateMap", null);
        setIntField(term90051, term90051.getClass(), "size", 3);
        setIntField(term90051, term90051.getClass(), "hash3", 0);
        setField(term90051, term90051.getClass(), "key3", term90089);
        setIntField(term90051, term90051.getClass(), "hash2", 0);
        setField(term90051, term90051.getClass(), "key2", term90127);
        setIntField(term90051, term90051.getClass(), "hash1", 0);
        setField(term90051, term90051.getClass(), "key1", term90175);
        term90267 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term90267, term90267.getClass(), "delegateMap", null);
        setIntField(term90267, term90267.getClass(), "size", 3);
        setIntField(term90267, term90267.getClass(), "hash3", 0);
        setField(term90267, term90267.getClass(), "value3", null);
        setIntField(term90267, term90267.getClass(), "hash2", 0);
        setField(term90267, term90267.getClass(), "value2", null);
        setIntField(term90267, term90267.getClass(), "hash1", 0);
        setField(term90267, term90267.getClass(), "value1", null);
        HashMap term90365 = new HashMap();
        term90364 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term90366 = newInstance(Class.forName("java.lang.Object"));
        Object term90367 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term90364, term90364.getClass(), "size", 3);
        setIntField(term90364, term90364.getClass(), "hash1", 0);
        setIntField(term90364, term90364.getClass(), "hash2", 0);
        setIntField(term90364, term90364.getClass(), "hash3", 0);
        setField(term90364, term90364.getClass(), "key1", term90365);
        setField(term90364, term90364.getClass(), "key2", term90366);
        setField(term90364, term90364.getClass(), "key3", term90367);
        setField(term90364, term90364.getClass(), "value1", null);
        setField(term90364, term90364.getClass(), "value2", null);
        setField(term90364, term90364.getClass(), "value3", null);
        setField(term90364, term90364.getClass(), "delegateMap", null);
        term90368 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term90368, term90368.getClass(), "size", 3);
        setIntField(term90368, term90368.getClass(), "hash1", 0);
        setIntField(term90368, term90368.getClass(), "hash2", 0);
        setIntField(term90368, term90368.getClass(), "hash3", 0);
        setField(term90368, term90368.getClass(), "key1", null);
        setField(term90368, term90368.getClass(), "key2", null);
        setField(term90368, term90368.getClass(), "key3", null);
        setField(term90368, term90368.getClass(), "value1", null);
        setField(term90368, term90368.getClass(), "value2", null);
        setField(term90368, term90368.getClass(), "value3", null);
        setField(term90368, term90368.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term90267;
        Object retValue = callMethod(klass, "get", argTypes, term90051, args);
        assertTrue(recursiveEquals(term90051, term90364));
        assertTrue(recursiveEquals(term90267, term90368));
        assertTrue(recursiveEquals(retValue, null));
    }

};


