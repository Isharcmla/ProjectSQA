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
import java.util.HashMap;

public class Flat3Map_equals_1826922527657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128305;
     Object term128445;
     Object term128520;
     Object term128523;

    public Flat3Map_equals_1826922527657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term128353 = new HashMap();
        term128305 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term128305, term128305.getClass(), "delegateMap", null);
        setIntField(term128305, term128305.getClass(), "size", 3);
        setField(term128305, term128305.getClass(), "key3", null);
        setField(term128305, term128305.getClass(), "value3", null);
        setField(term128305, term128305.getClass(), "key2", term128353);
        term128445 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term128445, term128445.getClass(), "delegateMap", null);
        setIntField(term128445, term128445.getClass(), "size", 3);
        setField(term128445, term128445.getClass(), "key3", null);
        setField(term128445, term128445.getClass(), "value3", null);
        setIntField(term128445, term128445.getClass(), "hash3", 0);
        setIntField(term128445, term128445.getClass(), "hash2", -1);
        HashMap term128521 = new HashMap();
        term128520 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term128520, term128520.getClass(), "size", 3);
        setIntField(term128520, term128520.getClass(), "hash1", 0);
        setIntField(term128520, term128520.getClass(), "hash2", 0);
        setIntField(term128520, term128520.getClass(), "hash3", 0);
        setField(term128520, term128520.getClass(), "key1", null);
        setField(term128520, term128520.getClass(), "key2", term128521);
        setField(term128520, term128520.getClass(), "key3", null);
        setField(term128520, term128520.getClass(), "value1", null);
        setField(term128520, term128520.getClass(), "value2", null);
        setField(term128520, term128520.getClass(), "value3", null);
        setField(term128520, term128520.getClass(), "delegateMap", null);
        term128523 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term128523, term128523.getClass(), "size", 3);
        setIntField(term128523, term128523.getClass(), "hash1", 0);
        setIntField(term128523, term128523.getClass(), "hash2", -1);
        setIntField(term128523, term128523.getClass(), "hash3", 0);
        setField(term128523, term128523.getClass(), "key1", null);
        setField(term128523, term128523.getClass(), "key2", null);
        setField(term128523, term128523.getClass(), "key3", null);
        setField(term128523, term128523.getClass(), "value1", null);
        setField(term128523, term128523.getClass(), "value2", null);
        setField(term128523, term128523.getClass(), "value3", null);
        setField(term128523, term128523.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term128445;
        Object retValue = callMethod(klass, "equals", argTypes, term128305, args);
        assertTrue(recursiveEquals(term128305, term128520));
        assertTrue(recursiveEquals(term128445, term128523));
        assertTrue(recursiveEquals(retValue, false));
    }

};
