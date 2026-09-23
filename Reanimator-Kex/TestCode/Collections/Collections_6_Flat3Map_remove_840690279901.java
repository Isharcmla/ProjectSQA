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

public class Flat3Map_remove_840690279901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238412;
     Object term238610;

    public Flat3Map_remove_840690279901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238412 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term238504 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term238596 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term238412, term238412.getClass(), "delegateMap", null);
        setIntField(term238412, term238412.getClass(), "size", 2);
        setField(term238412, term238412.getClass(), "key2", term238504);
        setField(term238412, term238412.getClass(), "key1", term238596);
        term238610 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term238611 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term238610, term238610.getClass(), "size", 2);
        setIntField(term238610, term238610.getClass(), "hash1", 0);
        setIntField(term238610, term238610.getClass(), "hash2", 0);
        setIntField(term238610, term238610.getClass(), "hash3", 0);
        setIntField(term238611, term238611.getClass(), "size", 0);
        setIntField(term238611, term238611.getClass(), "hash1", 0);
        setIntField(term238611, term238611.getClass(), "hash2", 0);
        setIntField(term238611, term238611.getClass(), "hash3", 0);
        setField(term238611, term238611.getClass(), "key1", null);
        setField(term238611, term238611.getClass(), "key2", null);
        setField(term238611, term238611.getClass(), "key3", null);
        setField(term238611, term238611.getClass(), "value1", null);
        setField(term238611, term238611.getClass(), "value2", null);
        setField(term238611, term238611.getClass(), "value3", null);
        setField(term238611, term238611.getClass(), "delegateMap", null);
        setField(term238610, term238610.getClass(), "key1", term238611);
        setField(term238610, term238610.getClass(), "key2", true);
        setField(term238610, term238610.getClass(), "key3", null);
        setField(term238610, term238610.getClass(), "value1", null);
        setField(term238610, term238610.getClass(), "value2", null);
        setField(term238610, term238610.getClass(), "value3", null);
        setField(term238610, term238610.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "remove", argTypes, term238412, args);
        assertTrue(recursiveEquals(term238412, term238610));
        assertTrue(recursiveEquals(retValue, null));
    }

};


