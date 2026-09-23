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

public class Flat3Map_put_19447407251009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285223;
     Object term285483;

    public Flat3Map_put_19447407251009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285223 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term285261 = newInstance(Class.forName("java.lang.Object"));
        Object term285353 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term285391 = newInstance(Class.forName("java.lang.Object"));
        setField(term285223, term285223.getClass(), "delegateMap", null);
        setIntField(term285223, term285223.getClass(), "size", 2);
        setIntField(term285223, term285223.getClass(), "hash2", 0);
        setField(term285223, term285223.getClass(), "key2", term285261);
        setIntField(term285223, term285223.getClass(), "hash1", 0);
        setField(term285353, term285353.getClass(), "delegateMap", null);
        setIntField(term285353, term285353.getClass(), "size", 2);
        setField(term285353, term285353.getClass(), "key2", null);
        setField(term285353, term285353.getClass(), "value2", term285391);
        setField(term285223, term285223.getClass(), "key1", term285353);
        term285483 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term285483, term285483.getClass(), "delegateMap", null);
        setIntField(term285483, term285483.getClass(), "size", 2);
        setIntField(term285483, term285483.getClass(), "hash2", 0);
        setField(term285483, term285483.getClass(), "value2", null);
        setIntField(term285483, term285483.getClass(), "hash1", 0);
        setField(term285483, term285483.getClass(), "value1", null);
        setField(term285483, term285483.getClass(), "key2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term285483;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term285223, args);
        assertTrue(recursiveEquals(term285483, 1));
        assertTrue(recursiveEquals(retValue, null));
    }

};


