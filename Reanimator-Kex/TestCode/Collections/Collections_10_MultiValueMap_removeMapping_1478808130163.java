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

public class MultiValueMap_removeMapping_1478808130163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35445;

    public MultiValueMap_removeMapping_1478808130163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35445 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term35547 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term35649 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term35751 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term35649, term35649.getClass(), "map", term35751);
        setField(term35547, term35547.getClass(), "map", term35649);
        setField(term35445, term35445.getClass(), "map", term35547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "removeMapping", argTypes, term35445, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


