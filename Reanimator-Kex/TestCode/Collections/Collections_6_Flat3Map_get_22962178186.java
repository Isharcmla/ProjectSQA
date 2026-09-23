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

public class Flat3Map_get_22962178186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17397;
     Object term17553;

    public Flat3Map_get_22962178186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17397 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term17507 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term17397, term17397.getClass(), "delegateMap", term17507);
        term17553 = newInstance(Class.forName("java.util.Properties"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17553;
        try {
            callMethod(klass, "get", argTypes, term17397, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


