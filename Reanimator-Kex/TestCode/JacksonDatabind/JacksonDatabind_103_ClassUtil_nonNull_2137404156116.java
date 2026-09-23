package com.fasterxml.jackson.databind.util;

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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.util.EqualityUtils.*;

public class ClassUtil_nonNull_2137404156116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37629;
     Object term37630;
     Object term126238;
     Object term126239;
     Object term126236;

    public ClassUtil_nonNull_2137404156116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37629 = newInstance(Class.forName("java.lang.Object"));
        term37630 = newInstance(Class.forName("java.lang.Object"));
        term126238 = newInstance(Class.forName("java.lang.Object"));
        term126239 = newInstance(Class.forName("java.lang.Object"));
        term126236 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term37629;
        args[1] = term37630;
        Object retValue = callMethod(klass, "nonNull", argTypes, null, args);
        assertTrue(recursiveEquals(term37629, term126238));
        assertTrue(recursiveEquals(term37630, term126239));
        assertTrue(recursiveEquals(retValue, term126236));
    }

};


