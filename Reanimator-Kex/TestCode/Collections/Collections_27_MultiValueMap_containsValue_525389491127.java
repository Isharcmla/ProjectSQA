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

public class MultiValueMap_containsValue_525389491127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21407;

    public MultiValueMap_containsValue_525389491127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21407 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term21511 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term21615 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term21511, term21511.getClass(), "map", term21615);
        setField(term21407, term21407.getClass(), "map", term21511);
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
            callMethod(klass, "containsValue", argTypes, term21407, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


