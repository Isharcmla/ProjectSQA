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

public class MultiValueMap_containsValue_204122359100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19315;

    public MultiValueMap_containsValue_204122359100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19315 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term19417 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term19519 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term19417, term19417.getClass(), "map", term19519);
        setField(term19315, term19315.getClass(), "map", term19417);
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
            callMethod(klass, "containsValue", argTypes, term19315, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


