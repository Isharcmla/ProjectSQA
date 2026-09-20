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

public class Flat3Map_containsValue_2053071372752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152083;

    public Flat3Map_containsValue_2053071372752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152083 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term152138 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term152083, term152083.getClass(), "delegateMap", null);
        setIntField(term152083, term152083.getClass(), "size", 2);
        setIntField(term152138, term152138.getClass(), "size", 2);
        setField(term152083, term152083.getClass(), "value1", term152138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term152083;
        try {
            callMethod(klass, "containsValue", argTypes, term152083, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
