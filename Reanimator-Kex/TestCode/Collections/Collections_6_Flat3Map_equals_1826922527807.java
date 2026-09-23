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
import java.lang.Object;

public class Flat3Map_equals_1826922527807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204247;
     Object term204479;

    public Flat3Map_equals_1826922527807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term204503 = new HashMap();
        term204247 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term204387 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term204247, term204247.getClass(), "delegateMap", null);
        setIntField(term204247, term204247.getClass(), "size", 3);
        setField(term204247, term204247.getClass(), "key3", term204503);
        setField(term204247, term204247.getClass(), "value3", term204387);
        term204479 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term204541 = newInstance(Class.forName("java.lang.Object"));
        setField(term204479, term204479.getClass(), "delegateMap", null);
        setIntField(term204479, term204479.getClass(), "size", 3);
        setIntField(term204479, term204479.getClass(), "hash3", 0);
        setField(term204479, term204479.getClass(), "key3", term204503);
        setField(term204479, term204479.getClass(), "value3", term204541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term204479;
        callMethod(klass, "equals", argTypes, term204247, args);
        assertTrue(recursiveEquals(term204479, (byte) 32));
    }

};


