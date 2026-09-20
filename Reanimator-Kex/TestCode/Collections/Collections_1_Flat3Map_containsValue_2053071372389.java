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

public class Flat3Map_containsValue_2053071372389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71780;

    public Flat3Map_containsValue_2053071372389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71780 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term71829 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setField(term71780, term71780.getClass(), "delegateMap", term71829);
        setIntField(term71780, term71780.getClass(), "size", 3);
        setField(term71780, term71780.getClass(), "value3", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71780;
        try {
            callMethod(klass, "containsValue", argTypes, term71780, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
