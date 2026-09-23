package org.apache.commons.collections4.map;

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
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_removeMapping_280388149163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58118;

    public MultiValueMap_removeMapping_280388149163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58118 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term58222 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term58326 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term58430 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term58326, term58326.getClass(), "map", term58430);
        setField(term58222, term58222.getClass(), "map", term58326);
        setField(term58118, term58118.getClass(), "map", term58222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "removeMapping", argTypes, term58118, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


