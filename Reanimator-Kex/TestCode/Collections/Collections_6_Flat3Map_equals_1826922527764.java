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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_equals_1826922527764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192365;
     Object term192511;

    public Flat3Map_equals_1826922527764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192365 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term192419 = newInstance(Class.forName("java.lang.AssertionError"));
        setField(term192365, term192365.getClass(), "delegateMap", null);
        setIntField(term192365, term192365.getClass(), "size", 3);
        setField(term192365, term192365.getClass(), "key3", null);
        setField(term192365, term192365.getClass(), "value3", null);
        setField(term192365, term192365.getClass(), "key2", null);
        setField(term192365, term192365.getClass(), "value2", null);
        setField(term192365, term192365.getClass(), "key1", term192419);
        term192511 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term192565 = newInstance(Class.forName("java.lang.AssertionError"));
        setField(term192511, term192511.getClass(), "delegateMap", null);
        setIntField(term192511, term192511.getClass(), "size", 3);
        setField(term192511, term192511.getClass(), "key3", term192565);
        setField(term192511, term192511.getClass(), "key2", null);
        setField(term192511, term192511.getClass(), "value2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term192511;
        callMethod(klass, "equals", argTypes, term192365, args);
    }

};


