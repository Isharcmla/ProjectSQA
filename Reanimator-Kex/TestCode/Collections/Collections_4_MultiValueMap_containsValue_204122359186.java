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
import java.lang.StackOverflowError;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_containsValue_204122359186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45896;

    public MultiValueMap_containsValue_204122359186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45896 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term45998 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term46100 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term46100, term46100.getClass(), "map", term46100);
        setField(term45998, term45998.getClass(), "map", term46100);
        setField(term45896, term45896.getClass(), "map", term45998);
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
            callMethod(klass, "containsValue", argTypes, term45896, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


