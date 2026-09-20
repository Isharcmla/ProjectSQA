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

public class Flat3Map_equals_1826922527443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81198;
     Object term81290;

    public Flat3Map_equals_1826922527443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81198 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term81198, term81198.getClass(), "delegateMap", null);
        setIntField(term81198, term81198.getClass(), "size", 1);
        term81290 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term81388 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setIntField(term81388, term81388.getClass(), "size", 1);
        setField(term81290, term81290.getClass(), "delegateMap", term81388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term81290;
        try {
            callMethod(klass, "equals", argTypes, term81198, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
