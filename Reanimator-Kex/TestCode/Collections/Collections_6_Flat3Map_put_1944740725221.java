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

public class Flat3Map_put_1944740725221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36514;
     Object term36536;
     Object term36537;

    public Flat3Map_put_1944740725221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36514 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term36514, term36514.getClass(), "delegateMap", null);
        setIntField(term36514, term36514.getClass(), "size", 1);
        term36536 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term36536, term36536.getClass(), "size", 2);
        setIntField(term36536, term36536.getClass(), "hash1", 0);
        setIntField(term36536, term36536.getClass(), "hash2", 0);
        setIntField(term36536, term36536.getClass(), "hash3", 0);
        setField(term36536, term36536.getClass(), "key1", null);
        setField(term36536, term36536.getClass(), "key2", term36536);
        setField(term36536, term36536.getClass(), "key3", null);
        setField(term36536, term36536.getClass(), "value1", null);
        setField(term36536, term36536.getClass(), "value2", null);
        setField(term36536, term36536.getClass(), "value3", null);
        setField(term36536, term36536.getClass(), "delegateMap", null);
        term36537 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term36537, term36537.getClass(), "size", 2);
        setIntField(term36537, term36537.getClass(), "hash1", 0);
        setIntField(term36537, term36537.getClass(), "hash2", 0);
        setIntField(term36537, term36537.getClass(), "hash3", 0);
        setField(term36537, term36537.getClass(), "key1", null);
        setField(term36537, term36537.getClass(), "key2", term36537);
        setField(term36537, term36537.getClass(), "key3", null);
        setField(term36537, term36537.getClass(), "value1", null);
        setField(term36537, term36537.getClass(), "value2", null);
        setField(term36537, term36537.getClass(), "value3", null);
        setField(term36537, term36537.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term36514;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term36514, args);
        assertTrue(recursiveEquals(term36514, term36536));
        assertTrue(recursiveEquals(term36514, term36537));
        assertTrue(recursiveEquals(retValue, null));
    }

};


