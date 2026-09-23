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

public class MultiValueMap_clear_152616610695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19416;

    public MultiValueMap_clear_152616610695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19416 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term19518 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term19620 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term19518, term19518.getClass(), "map", term19620);
        setField(term19416, term19416.getClass(), "map", term19518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term19416, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


