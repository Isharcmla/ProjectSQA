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

public class Flat3Map_containsValue_20530713721105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219411;
     Object term219651;

    public Flat3Map_containsValue_20530713721105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219411 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term219449 = newInstance(Class.forName("java.lang.Object"));
        Object term219559 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term219411, term219411.getClass(), "delegateMap", null);
        setIntField(term219411, term219411.getClass(), "size", 3);
        setField(term219411, term219411.getClass(), "value3", term219449);
        setField(term219411, term219411.getClass(), "value2", term219449);
        setIntField(term219559, term219559.getClass(), "size", 1);
        setField(term219411, term219411.getClass(), "value1", term219559);
        term219651 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term219651, term219651.getClass(), "delegateMap", null);
        setIntField(term219651, term219651.getClass(), "size", 1);
        setField(term219651, term219651.getClass(), "key1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term219651;
        try {
            callMethod(klass, "containsValue", argTypes, term219411, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
