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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_equals_1826922527402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73910;
     Object term74002;

    public Flat3Map_equals_1826922527402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73910 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term73910, term73910.getClass(), "delegateMap", null);
        setIntField(term73910, term73910.getClass(), "size", 1);
        term74002 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term74112 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term74112, term74112.getClass(), "size", 1);
        setField(term74002, term74002.getClass(), "delegateMap", term74112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term74002;
        try {
            callMethod(klass, "equals", argTypes, term73910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
