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

public class MultiValueMap_containsValue_196145180273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12526;

    public MultiValueMap_containsValue_196145180273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12526 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term12628 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term12730 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term12628, term12628.getClass(), "map", term12730);
        setField(term12526, term12526.getClass(), "map", term12628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "containsValue", argTypes, term12526, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


