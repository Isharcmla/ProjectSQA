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

public class MultiValueMap_containsValue_1961451802171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41463;

    public MultiValueMap_containsValue_1961451802171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41463 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term41565 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term41667 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term41667, term41667.getClass(), "map", term41667);
        setField(term41565, term41565.getClass(), "map", term41667);
        setField(term41463, term41463.getClass(), "map", term41565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "containsValue", argTypes, term41463, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


