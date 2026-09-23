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
import java.lang.StackOverflowError;
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_totalSize_1484206854119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18974;

    public MultiValueMap_totalSize_1484206854119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18974 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term19078 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term19078, term19078.getClass(), "valuesView", null);
        setField(term19078, term19078.getClass(), "map", term19078);
        setField(term18974, term18974.getClass(), "map", term19078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "totalSize", argTypes, term18974, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


