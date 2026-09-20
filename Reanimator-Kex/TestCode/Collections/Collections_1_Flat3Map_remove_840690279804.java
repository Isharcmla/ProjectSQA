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

public class Flat3Map_remove_840690279804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163564;
     Object term164560;
     Object term164561;

    public Flat3Map_remove_840690279804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163564 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term163564, term163564.getClass(), "delegateMap", null);
        setIntField(term163564, term163564.getClass(), "size", 0);
        term164560 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term164560, term164560.getClass(), "size", 0);
        setIntField(term164560, term164560.getClass(), "hash1", 0);
        setIntField(term164560, term164560.getClass(), "hash2", 0);
        setIntField(term164560, term164560.getClass(), "hash3", 0);
        setField(term164560, term164560.getClass(), "key1", null);
        setField(term164560, term164560.getClass(), "key2", null);
        setField(term164560, term164560.getClass(), "key3", null);
        setField(term164560, term164560.getClass(), "value1", null);
        setField(term164560, term164560.getClass(), "value2", null);
        setField(term164560, term164560.getClass(), "value3", null);
        setField(term164560, term164560.getClass(), "delegateMap", null);
        term164561 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term164561, term164561.getClass(), "size", 0);
        setIntField(term164561, term164561.getClass(), "hash1", 0);
        setIntField(term164561, term164561.getClass(), "hash2", 0);
        setIntField(term164561, term164561.getClass(), "hash3", 0);
        setField(term164561, term164561.getClass(), "key1", null);
        setField(term164561, term164561.getClass(), "key2", null);
        setField(term164561, term164561.getClass(), "key3", null);
        setField(term164561, term164561.getClass(), "value1", null);
        setField(term164561, term164561.getClass(), "value2", null);
        setField(term164561, term164561.getClass(), "value3", null);
        setField(term164561, term164561.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term163564;
        Object retValue = callMethod(klass, "remove", argTypes, term163564, args);
        assertTrue(recursiveEquals(term163564, term164560));
        assertTrue(recursiveEquals(term163564, term164561));
        assertTrue(recursiveEquals(retValue, null));
    }

};
