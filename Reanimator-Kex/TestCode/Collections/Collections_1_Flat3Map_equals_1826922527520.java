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

public class Flat3Map_equals_1826922527520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98152;
     Object term98244;

    public Flat3Map_equals_1826922527520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98152 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term98152, term98152.getClass(), "delegateMap", null);
        setIntField(term98152, term98152.getClass(), "size", 1);
        term98244 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term98338 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setIntField(term98338, term98338.getClass(), "size", 1);
        setField(term98244, term98244.getClass(), "delegateMap", term98338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term98244;
        try {
            callMethod(klass, "equals", argTypes, term98152, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
