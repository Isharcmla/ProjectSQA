package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DisambiguateProperties_recordInvalidationError_132072408170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19850;
     Object term19944;

    public DisambiguateProperties_recordInvalidationError_132072408170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19850 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        term19944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term19944;
        args[1] = null;
        try {
            callMethod(klass, "recordInvalidationError", argTypes, term19850, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


