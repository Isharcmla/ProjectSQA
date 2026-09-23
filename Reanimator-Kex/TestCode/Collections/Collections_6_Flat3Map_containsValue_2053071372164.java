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

public class Flat3Map_containsValue_2053071372164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27567;
     Object term27659;
     Object term27829;
     Object term27830;

    public Flat3Map_containsValue_2053071372164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27567 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term27567, term27567.getClass(), "delegateMap", null);
        setIntField(term27567, term27567.getClass(), "size", 3);
        term27659 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term27829 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term27829, term27829.getClass(), "size", 3);
        setIntField(term27829, term27829.getClass(), "hash1", 0);
        setIntField(term27829, term27829.getClass(), "hash2", 0);
        setIntField(term27829, term27829.getClass(), "hash3", 0);
        setField(term27829, term27829.getClass(), "key1", null);
        setField(term27829, term27829.getClass(), "key2", null);
        setField(term27829, term27829.getClass(), "key3", null);
        setField(term27829, term27829.getClass(), "value1", null);
        setField(term27829, term27829.getClass(), "value2", null);
        setField(term27829, term27829.getClass(), "value3", null);
        setField(term27829, term27829.getClass(), "delegateMap", null);
        term27830 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term27830, term27830.getClass(), "size", 0);
        setIntField(term27830, term27830.getClass(), "hash1", 0);
        setIntField(term27830, term27830.getClass(), "hash2", 0);
        setIntField(term27830, term27830.getClass(), "hash3", 0);
        setField(term27830, term27830.getClass(), "key1", null);
        setField(term27830, term27830.getClass(), "key2", null);
        setField(term27830, term27830.getClass(), "key3", null);
        setField(term27830, term27830.getClass(), "value1", null);
        setField(term27830, term27830.getClass(), "value2", null);
        setField(term27830, term27830.getClass(), "value3", null);
        setField(term27830, term27830.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27659;
        callMethod(klass, "containsValue", argTypes, term27567, args);
        assertTrue(recursiveEquals(term27567, term27829));
        assertTrue(recursiveEquals(term27659, term27830));
    }

};


