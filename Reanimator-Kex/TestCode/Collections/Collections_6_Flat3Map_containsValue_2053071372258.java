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
import java.util.HashMap;

public class Flat3Map_containsValue_2053071372258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42191;
     Object term42369;
     Object term42611;
     Object term42614;

    public Flat3Map_containsValue_2053071372258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term42277 = new HashMap();
        term42191 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term42229 = newInstance(Class.forName("java.lang.Object"));
        setField(term42191, term42191.getClass(), "delegateMap", null);
        setIntField(term42191, term42191.getClass(), "size", 2);
        setField(term42191, term42191.getClass(), "value2", term42229);
        setField(term42191, term42191.getClass(), "value1", term42277);
        term42369 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term42369, term42369.getClass(), "delegateMap", null);
        HashMap term42612 = new HashMap();
        term42611 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term42613 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term42611, term42611.getClass(), "size", 2);
        setIntField(term42611, term42611.getClass(), "hash1", 0);
        setIntField(term42611, term42611.getClass(), "hash2", 0);
        setIntField(term42611, term42611.getClass(), "hash3", 0);
        setField(term42611, term42611.getClass(), "key1", null);
        setField(term42611, term42611.getClass(), "key2", null);
        setField(term42611, term42611.getClass(), "key3", null);
        setField(term42611, term42611.getClass(), "value1", term42612);
        setField(term42611, term42611.getClass(), "value2", term42613);
        setField(term42611, term42611.getClass(), "value3", null);
        setField(term42611, term42611.getClass(), "delegateMap", null);
        term42614 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term42614, term42614.getClass(), "size", 0);
        setIntField(term42614, term42614.getClass(), "hash1", 0);
        setIntField(term42614, term42614.getClass(), "hash2", 0);
        setIntField(term42614, term42614.getClass(), "hash3", 0);
        setField(term42614, term42614.getClass(), "key1", null);
        setField(term42614, term42614.getClass(), "key2", null);
        setField(term42614, term42614.getClass(), "key3", null);
        setField(term42614, term42614.getClass(), "value1", null);
        setField(term42614, term42614.getClass(), "value2", null);
        setField(term42614, term42614.getClass(), "value3", null);
        setField(term42614, term42614.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term42369;
        callMethod(klass, "containsValue", argTypes, term42191, args);
        assertTrue(recursiveEquals(term42191, term42611));
        assertTrue(recursiveEquals(term42369, term42614));
    }

};


