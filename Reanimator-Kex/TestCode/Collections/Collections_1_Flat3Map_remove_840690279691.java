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

public class Flat3Map_remove_840690279691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136490;
     Object term136582;
     Object term136599;
     Object term136600;

    public Flat3Map_remove_840690279691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136490 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term136490, term136490.getClass(), "delegateMap", null);
        setIntField(term136490, term136490.getClass(), "size", 1073741824);
        term136582 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term136599 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term136599, term136599.getClass(), "size", 1073741824);
        setIntField(term136599, term136599.getClass(), "hash1", 0);
        setIntField(term136599, term136599.getClass(), "hash2", 0);
        setIntField(term136599, term136599.getClass(), "hash3", 0);
        setField(term136599, term136599.getClass(), "key1", null);
        setField(term136599, term136599.getClass(), "key2", null);
        setField(term136599, term136599.getClass(), "key3", null);
        setField(term136599, term136599.getClass(), "value1", null);
        setField(term136599, term136599.getClass(), "value2", null);
        setField(term136599, term136599.getClass(), "value3", null);
        setField(term136599, term136599.getClass(), "delegateMap", null);
        term136600 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term136600, term136600.getClass(), "size", 0);
        setIntField(term136600, term136600.getClass(), "hash1", 0);
        setIntField(term136600, term136600.getClass(), "hash2", 0);
        setIntField(term136600, term136600.getClass(), "hash3", 0);
        setField(term136600, term136600.getClass(), "key1", null);
        setField(term136600, term136600.getClass(), "key2", null);
        setField(term136600, term136600.getClass(), "key3", null);
        setField(term136600, term136600.getClass(), "value1", null);
        setField(term136600, term136600.getClass(), "value2", null);
        setField(term136600, term136600.getClass(), "value3", null);
        setField(term136600, term136600.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term136582;
        Object retValue = callMethod(klass, "remove", argTypes, term136490, args);
        assertTrue(recursiveEquals(term136490, term136599));
        assertTrue(recursiveEquals(term136582, term136600));
        assertTrue(recursiveEquals(retValue, null));
    }

};
