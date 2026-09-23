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

public class MultiValueMap_getCollection_2049933466116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25787;

    public MultiValueMap_getCollection_2049933466116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25787 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term25889 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term25991 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term26093 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term25991, term25991.getClass(), "map", term26093);
        setField(term25889, term25889.getClass(), "map", term25991);
        setField(term25787, term25787.getClass(), "map", term25889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getCollection", argTypes, term25787, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


