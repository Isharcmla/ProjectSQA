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

public class MultiValueMap_size_1076345013125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28106;

    public MultiValueMap_size_1076345013125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28106 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term28208 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term28310 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term28412 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term28310, term28310.getClass(), "map", term28412);
        setField(term28208, term28208.getClass(), "map", term28310);
        setField(term28106, term28106.getClass(), "map", term28208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "size", argTypes, term28106, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


