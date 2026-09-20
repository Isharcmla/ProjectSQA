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

public class Flat3Map_containsValue_2053071372775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157274;

    public Flat3Map_containsValue_2053071372775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157274 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term157332 = newInstance(Class.forName("org.apache.commons.collections.map.ReferenceIdentityMap"));
        setField(term157274, term157274.getClass(), "delegateMap", term157332);
        setIntField(term157274, term157274.getClass(), "size", 2);
        setField(term157274, term157274.getClass(), "value2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term157274;
        try {
            callMethod(klass, "containsValue", argTypes, term157274, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
