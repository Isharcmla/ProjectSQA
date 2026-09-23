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

public class MultiValueMap_getCollection_2049933466108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22301;

    public MultiValueMap_getCollection_2049933466108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22301 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term22403 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term22505 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term22403, term22403.getClass(), "map", term22505);
        setField(term22301, term22301.getClass(), "map", term22403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getCollection", argTypes, term22301, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


