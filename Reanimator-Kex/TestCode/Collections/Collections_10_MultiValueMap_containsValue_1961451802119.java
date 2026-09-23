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

public class MultiValueMap_containsValue_1961451802119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25603;

    public MultiValueMap_containsValue_1961451802119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25603 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term25705 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term25807 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term25909 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term25807, term25807.getClass(), "map", term25909);
        setField(term25705, term25705.getClass(), "map", term25807);
        setField(term25603, term25603.getClass(), "map", term25705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "containsValue", argTypes, term25603, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


