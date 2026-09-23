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

public class MultiValueMap_removeMapping_1478808130182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44892;

    public MultiValueMap_removeMapping_1478808130182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44892 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term44994 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term45096 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term45096, term45096.getClass(), "map", term45096);
        setField(term44994, term44994.getClass(), "map", term45096);
        setField(term44892, term44892.getClass(), "map", term44994);
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
            callMethod(klass, "removeMapping", argTypes, term44892, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


