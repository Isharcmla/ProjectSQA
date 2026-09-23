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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105098;
     Object term105206;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105098 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term105206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term105206;
        args[1] = null;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term105098, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


