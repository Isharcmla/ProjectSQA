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

public class Flat3Map_remove_840690279831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168106;
     Object term168198;
     Object term168518;
     Object term168519;

    public Flat3Map_remove_840690279831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168106 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term168106, term168106.getClass(), "delegateMap", null);
        setIntField(term168106, term168106.getClass(), "size", 1073741824);
        term168198 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term168198, term168198.getClass(), "delegateMap", null);
        setIntField(term168198, term168198.getClass(), "size", 1);
        term168518 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term168518, term168518.getClass(), "size", 1073741824);
        setIntField(term168518, term168518.getClass(), "hash1", 0);
        setIntField(term168518, term168518.getClass(), "hash2", 0);
        setIntField(term168518, term168518.getClass(), "hash3", 0);
        setField(term168518, term168518.getClass(), "key1", null);
        setField(term168518, term168518.getClass(), "key2", null);
        setField(term168518, term168518.getClass(), "key3", null);
        setField(term168518, term168518.getClass(), "value1", null);
        setField(term168518, term168518.getClass(), "value2", null);
        setField(term168518, term168518.getClass(), "value3", null);
        setField(term168518, term168518.getClass(), "delegateMap", null);
        term168519 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term168519, term168519.getClass(), "size", 1);
        setIntField(term168519, term168519.getClass(), "hash1", 0);
        setIntField(term168519, term168519.getClass(), "hash2", 0);
        setIntField(term168519, term168519.getClass(), "hash3", 0);
        setField(term168519, term168519.getClass(), "key1", null);
        setField(term168519, term168519.getClass(), "key2", null);
        setField(term168519, term168519.getClass(), "key3", null);
        setField(term168519, term168519.getClass(), "value1", null);
        setField(term168519, term168519.getClass(), "value2", null);
        setField(term168519, term168519.getClass(), "value3", null);
        setField(term168519, term168519.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term168198;
        Object retValue = callMethod(klass, "remove", argTypes, term168106, args);
        assertTrue(recursiveEquals(term168106, term168518));
        assertTrue(recursiveEquals(term168198, term168519));
        assertTrue(recursiveEquals(retValue, null));
    }

};
