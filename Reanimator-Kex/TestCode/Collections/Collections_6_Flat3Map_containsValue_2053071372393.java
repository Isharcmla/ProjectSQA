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

public class Flat3Map_containsValue_2053071372393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67959;
     Object term68051;
     Object term68594;
     Object term68595;

    public Flat3Map_containsValue_2053071372393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67959 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term67959, term67959.getClass(), "delegateMap", null);
        setIntField(term67959, term67959.getClass(), "size", 0);
        setField(term67959, term67959.getClass(), "value2", term67959);
        term68051 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term68051, term68051.getClass(), "delegateMap", null);
        setIntField(term68051, term68051.getClass(), "size", 0);
        term68594 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term68594, term68594.getClass(), "size", 0);
        setIntField(term68594, term68594.getClass(), "hash1", 0);
        setIntField(term68594, term68594.getClass(), "hash2", 0);
        setIntField(term68594, term68594.getClass(), "hash3", 0);
        setField(term68594, term68594.getClass(), "key1", null);
        setField(term68594, term68594.getClass(), "key2", null);
        setField(term68594, term68594.getClass(), "key3", null);
        setField(term68594, term68594.getClass(), "value1", null);
        setField(term68594, term68594.getClass(), "value2", term68594);
        setField(term68594, term68594.getClass(), "value3", null);
        setField(term68594, term68594.getClass(), "delegateMap", null);
        term68595 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term68595, term68595.getClass(), "size", 0);
        setIntField(term68595, term68595.getClass(), "hash1", 0);
        setIntField(term68595, term68595.getClass(), "hash2", 0);
        setIntField(term68595, term68595.getClass(), "hash3", 0);
        setField(term68595, term68595.getClass(), "key1", null);
        setField(term68595, term68595.getClass(), "key2", null);
        setField(term68595, term68595.getClass(), "key3", null);
        setField(term68595, term68595.getClass(), "value1", null);
        setField(term68595, term68595.getClass(), "value2", null);
        setField(term68595, term68595.getClass(), "value3", null);
        setField(term68595, term68595.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term68051;
        callMethod(klass, "containsValue", argTypes, term67959, args);
        assertTrue(recursiveEquals(term67959, term68594));
        assertTrue(recursiveEquals(term68051, term68595));
    }

};


