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

public class Flat3Map_remove_840690279159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27225;
     Object term27252;

    public Flat3Map_remove_840690279159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27225 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term27225, term27225.getClass(), "delegateMap", null);
        setIntField(term27225, term27225.getClass(), "size", 1);
        term27252 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term27252, term27252.getClass(), "size", 0);
        setIntField(term27252, term27252.getClass(), "hash1", 0);
        setIntField(term27252, term27252.getClass(), "hash2", 0);
        setIntField(term27252, term27252.getClass(), "hash3", 0);
        setField(term27252, term27252.getClass(), "key1", null);
        setField(term27252, term27252.getClass(), "key2", null);
        setField(term27252, term27252.getClass(), "key3", null);
        setField(term27252, term27252.getClass(), "value1", null);
        setField(term27252, term27252.getClass(), "value2", null);
        setField(term27252, term27252.getClass(), "value3", null);
        setField(term27252, term27252.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "remove", argTypes, term27225, args);
        assertTrue(recursiveEquals(term27225, term27252));
        assertTrue(recursiveEquals(retValue, null));
    }

};


