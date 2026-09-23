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

public class MultiValueMap_iterator_133492057941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729;

    public MultiValueMap_iterator_133492057941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term729 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term729, term729.getClass(), "collectionFactory", null);
        setField(term729, term729.getClass(), "valuesView", null);
        setField(term729, term729.getClass(), "map", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "iterator", argTypes, term729, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


