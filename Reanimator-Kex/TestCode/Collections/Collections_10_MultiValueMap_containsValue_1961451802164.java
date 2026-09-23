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

public class MultiValueMap_containsValue_1961451802164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35868;

    public MultiValueMap_containsValue_1961451802164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35868 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term35970 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term36072 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term36072, term36072.getClass(), "map", term36072);
        setField(term35970, term35970.getClass(), "map", term36072);
        setField(term35868, term35868.getClass(), "map", term35970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "containsValue", argTypes, term35868, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


