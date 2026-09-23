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
import java.lang.Integer;

public class MultiValueMap_createCollection_143304154143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term825;
     Object term826;

    public MultiValueMap_createCollection_143304154143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term825 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term825, term825.getClass(), "collectionFactory", null);
        setField(term825, term825.getClass(), "valuesView", null);
        setField(term825, term825.getClass(), "map", null);
        term826 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term826;
        try {
            callMethod(klass, "createCollection", argTypes, term825, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


