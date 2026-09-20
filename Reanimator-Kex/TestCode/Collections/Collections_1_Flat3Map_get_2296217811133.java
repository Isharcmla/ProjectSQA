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

public class Flat3Map_get_2296217811133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232490;
     Object term232658;
     Object term233714;
     Object term233717;

    public Flat3Map_get_2296217811133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232490 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term232528 = newInstance(Class.forName("java.lang.Object"));
        Object term232566 = newInstance(Class.forName("java.lang.Object"));
        setField(term232490, term232490.getClass(), "delegateMap", null);
        setIntField(term232490, term232490.getClass(), "size", 3);
        setIntField(term232490, term232490.getClass(), "hash3", 0);
        setField(term232490, term232490.getClass(), "key3", term232528);
        setIntField(term232490, term232490.getClass(), "hash2", 0);
        setField(term232490, term232490.getClass(), "key2", term232566);
        setIntField(term232490, term232490.getClass(), "hash1", -1);
        term232658 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term232658, term232658.getClass(), "delegateMap", null);
        setIntField(term232658, term232658.getClass(), "size", 3);
        setIntField(term232658, term232658.getClass(), "hash3", 0);
        setField(term232658, term232658.getClass(), "value3", null);
        setIntField(term232658, term232658.getClass(), "hash2", 0);
        setField(term232658, term232658.getClass(), "value2", null);
        setIntField(term232658, term232658.getClass(), "hash1", 0);
        setField(term232658, term232658.getClass(), "value1", null);
        term233714 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term233715 = newInstance(Class.forName("java.lang.Object"));
        Object term233716 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term233714, term233714.getClass(), "size", 3);
        setIntField(term233714, term233714.getClass(), "hash1", -1);
        setIntField(term233714, term233714.getClass(), "hash2", 0);
        setIntField(term233714, term233714.getClass(), "hash3", 0);
        setField(term233714, term233714.getClass(), "key1", null);
        setField(term233714, term233714.getClass(), "key2", term233715);
        setField(term233714, term233714.getClass(), "key3", term233716);
        setField(term233714, term233714.getClass(), "value1", null);
        setField(term233714, term233714.getClass(), "value2", null);
        setField(term233714, term233714.getClass(), "value3", null);
        setField(term233714, term233714.getClass(), "delegateMap", null);
        term233717 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term233717, term233717.getClass(), "size", 3);
        setIntField(term233717, term233717.getClass(), "hash1", 0);
        setIntField(term233717, term233717.getClass(), "hash2", 0);
        setIntField(term233717, term233717.getClass(), "hash3", 0);
        setField(term233717, term233717.getClass(), "key1", null);
        setField(term233717, term233717.getClass(), "key2", null);
        setField(term233717, term233717.getClass(), "key3", null);
        setField(term233717, term233717.getClass(), "value1", null);
        setField(term233717, term233717.getClass(), "value2", null);
        setField(term233717, term233717.getClass(), "value3", null);
        setField(term233717, term233717.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term232658;
        Object retValue = callMethod(klass, "get", argTypes, term232490, args);
        assertTrue(recursiveEquals(term232490, term233714));
        assertTrue(recursiveEquals(term232658, term233717));
        assertTrue(recursiveEquals(retValue, null));
    }

};
