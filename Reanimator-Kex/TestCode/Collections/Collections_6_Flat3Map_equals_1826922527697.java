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
import java.util.HashMap;

public class Flat3Map_equals_1826922527697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167043;
     Object term167183;

    public Flat3Map_equals_1826922527697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term167091 = new HashMap();
        term167043 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term167043, term167043.getClass(), "delegateMap", null);
        setIntField(term167043, term167043.getClass(), "size", 3);
        setField(term167043, term167043.getClass(), "key3", null);
        setField(term167043, term167043.getClass(), "value3", null);
        setField(term167043, term167043.getClass(), "key2", term167091);
        term167183 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term167183, term167183.getClass(), "delegateMap", null);
        setIntField(term167183, term167183.getClass(), "size", 3);
        setField(term167183, term167183.getClass(), "key3", null);
        setField(term167183, term167183.getClass(), "value3", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term167183;
        callMethod(klass, "equals", argTypes, term167043, args);
    }

};


