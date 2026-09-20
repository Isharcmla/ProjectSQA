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

public class Flat3Map_containsKey_76092510105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18564;
     Object term18734;

    public Flat3Map_containsKey_76092510105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18564 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term18674 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term18564, term18564.getClass(), "delegateMap", term18674);
        term18734 = newInstance(Class.forName("java.io.ObjectInputStream$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18734;
        try {
            callMethod(klass, "containsKey", argTypes, term18564, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
