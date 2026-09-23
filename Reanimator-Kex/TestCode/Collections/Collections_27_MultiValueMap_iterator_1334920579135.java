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

public class MultiValueMap_iterator_1334920579135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23950;

    public MultiValueMap_iterator_1334920579135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23950 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term24054 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term24158 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term24054, term24054.getClass(), "map", term24158);
        setField(term23950, term23950.getClass(), "map", term24054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "iterator", argTypes, term23950, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


