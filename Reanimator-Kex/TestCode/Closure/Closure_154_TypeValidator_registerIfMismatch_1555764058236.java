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

public class TypeValidator_registerIfMismatch_1555764058236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74589;
     Object term74693;
     Object term74791;

    public TypeValidator_registerIfMismatch_1555764058236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74589 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term74693 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term74791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term74693;
        args[1] = term74791;
        try {
            callMethod(klass, "registerIfMismatch", argTypes, term74589, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


