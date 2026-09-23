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

public class FunctionTypeBuilder_inferParameterTypes_212883572128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37831;
     Object term38057;

    public FunctionTypeBuilder_inferParameterTypes_212883572128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37831 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term37949 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term37831, term37831.getClass(), "parametersNode", null);
        setField(term37831, term37831.getClass(), "typeRegistry", null);
        setField(term37831, term37831.getClass(), "templateTypeName", "");
        setField(term37831, term37831.getClass(), "fnName", null);
        setField(term37831, term37831.getClass(), "compiler", term37949);
        setField(term37831, term37831.getClass(), "sourceName", "");
        setField(term37831, term37831.getClass(), "errorRoot", null);
        term38057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term38057, term38057.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term38057;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term37831, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


