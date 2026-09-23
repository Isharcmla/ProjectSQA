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
import java.lang.Object;

public class FunctionTypeBuilder_buildAndRegister_1388474616161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66523;

    public FunctionTypeBuilder_buildAndRegister_1388474616161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66523 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term66615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term66685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66523, term66523.getClass(), "returnType", term66615);
        setField(term66523, term66523.getClass(), "parametersNode", term66685);
        setBooleanField(term66523, term66523.getClass(), "isConstructor", false);
        setBooleanField(term66523, term66523.getClass(), "isInterface", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term66523, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


