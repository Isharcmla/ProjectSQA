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

public class Flat3Map_remove_840690279874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176037;
     Object term176445;
     Object term176446;

    public Flat3Map_remove_840690279874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176037 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term176037, term176037.getClass(), "delegateMap", null);
        setIntField(term176037, term176037.getClass(), "size", 3);
        setIntField(term176037, term176037.getClass(), "hash3", 0);
        setField(term176037, term176037.getClass(), "value3", null);
        setIntField(term176037, term176037.getClass(), "hash2", 0);
        setField(term176037, term176037.getClass(), "value2", null);
        setIntField(term176037, term176037.getClass(), "hash1", 0);
        setField(term176037, term176037.getClass(), "value1", null);
        term176445 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term176445, term176445.getClass(), "size", 3);
        setIntField(term176445, term176445.getClass(), "hash1", 0);
        setIntField(term176445, term176445.getClass(), "hash2", 0);
        setIntField(term176445, term176445.getClass(), "hash3", 0);
        setField(term176445, term176445.getClass(), "key1", null);
        setField(term176445, term176445.getClass(), "key2", null);
        setField(term176445, term176445.getClass(), "key3", null);
        setField(term176445, term176445.getClass(), "value1", null);
        setField(term176445, term176445.getClass(), "value2", null);
        setField(term176445, term176445.getClass(), "value3", null);
        setField(term176445, term176445.getClass(), "delegateMap", null);
        term176446 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term176446, term176446.getClass(), "size", 3);
        setIntField(term176446, term176446.getClass(), "hash1", 0);
        setIntField(term176446, term176446.getClass(), "hash2", 0);
        setIntField(term176446, term176446.getClass(), "hash3", 0);
        setField(term176446, term176446.getClass(), "key1", null);
        setField(term176446, term176446.getClass(), "key2", null);
        setField(term176446, term176446.getClass(), "key3", null);
        setField(term176446, term176446.getClass(), "value1", null);
        setField(term176446, term176446.getClass(), "value2", null);
        setField(term176446, term176446.getClass(), "value3", null);
        setField(term176446, term176446.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term176037;
        Object retValue = callMethod(klass, "remove", argTypes, term176037, args);
        assertTrue(recursiveEquals(term176037, term176445));
        assertTrue(recursiveEquals(term176037, term176446));
        assertTrue(recursiveEquals(retValue, null));
    }

};
