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

public class Flat3Map_equals_1826922527812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205803;
     Object term205943;

    public Flat3Map_equals_1826922527812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term205851 = new HashMap();
        term205803 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term205803, term205803.getClass(), "delegateMap", null);
        setIntField(term205803, term205803.getClass(), "size", 3);
        setField(term205803, term205803.getClass(), "key3", term205851);
        HashMap term205991 = new HashMap();
        term205943 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term205943, term205943.getClass(), "delegateMap", null);
        setIntField(term205943, term205943.getClass(), "size", 3);
        setIntField(term205943, term205943.getClass(), "hash3", 0);
        setField(term205943, term205943.getClass(), "key3", term205991);
        setIntField(term205943, term205943.getClass(), "hash2", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term205943;
        Object retValue = callMethod(klass, "equals", argTypes, term205803, args);
        assertTrue(recursiveEquals(term205943, 0));
        assertTrue(recursiveEquals(retValue, true));
    }

};


