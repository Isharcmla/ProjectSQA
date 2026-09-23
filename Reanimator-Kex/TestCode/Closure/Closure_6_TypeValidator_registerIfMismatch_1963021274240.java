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

public class TypeValidator_registerIfMismatch_1963021274240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68415;
     Object term68525;
     Object term68635;

    public TypeValidator_registerIfMismatch_1963021274240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68415 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term68525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term68635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term68635, term68635.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[3];
        args[0] = term68525;
        args[1] = term68635;
        args[2] = null;
        try {
            callMethod(klass, "registerIfMismatch", argTypes, term68415, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


