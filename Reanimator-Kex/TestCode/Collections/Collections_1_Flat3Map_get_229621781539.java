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

public class Flat3Map_get_229621781539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102661;
     Object term102729;
     Object term102730;

    public Flat3Map_get_229621781539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102661 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term102661, term102661.getClass(), "delegateMap", null);
        setIntField(term102661, term102661.getClass(), "size", 3);
        setIntField(term102661, term102661.getClass(), "hash3", 0);
        setField(term102661, term102661.getClass(), "value3", null);
        setIntField(term102661, term102661.getClass(), "hash2", 0);
        setField(term102661, term102661.getClass(), "value2", null);
        setIntField(term102661, term102661.getClass(), "hash1", 0);
        setField(term102661, term102661.getClass(), "value1", null);
        term102729 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term102729, term102729.getClass(), "size", 3);
        setIntField(term102729, term102729.getClass(), "hash1", 0);
        setIntField(term102729, term102729.getClass(), "hash2", 0);
        setIntField(term102729, term102729.getClass(), "hash3", 0);
        setField(term102729, term102729.getClass(), "key1", null);
        setField(term102729, term102729.getClass(), "key2", null);
        setField(term102729, term102729.getClass(), "key3", null);
        setField(term102729, term102729.getClass(), "value1", null);
        setField(term102729, term102729.getClass(), "value2", null);
        setField(term102729, term102729.getClass(), "value3", null);
        setField(term102729, term102729.getClass(), "delegateMap", null);
        term102730 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term102730, term102730.getClass(), "size", 3);
        setIntField(term102730, term102730.getClass(), "hash1", 0);
        setIntField(term102730, term102730.getClass(), "hash2", 0);
        setIntField(term102730, term102730.getClass(), "hash3", 0);
        setField(term102730, term102730.getClass(), "key1", null);
        setField(term102730, term102730.getClass(), "key2", null);
        setField(term102730, term102730.getClass(), "key3", null);
        setField(term102730, term102730.getClass(), "value1", null);
        setField(term102730, term102730.getClass(), "value2", null);
        setField(term102730, term102730.getClass(), "value3", null);
        setField(term102730, term102730.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term102661;
        Object retValue = callMethod(klass, "get", argTypes, term102661, args);
        assertTrue(recursiveEquals(term102661, term102729));
        assertTrue(recursiveEquals(term102661, term102730));
        assertTrue(recursiveEquals(retValue, null));
    }

};
