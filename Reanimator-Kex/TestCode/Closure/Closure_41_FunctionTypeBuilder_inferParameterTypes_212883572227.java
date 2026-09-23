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

public class FunctionTypeBuilder_inferParameterTypes_212883572227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72925;
     Object term73367;
     Object term73447;

    public FunctionTypeBuilder_inferParameterTypes_212883572227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72925 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term73029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term73185 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term73297 = newInstance(Class.forName("com.google.javascript.jscomp.SuppressDocWarningsGuard"));
        setField(term72925, term72925.getClass(), "parametersNode", null);
        setField(term72925, term72925.getClass(), "typeRegistry", term73029);
        setField(term72925, term72925.getClass(), "templateTypeName", "");
        setField(term72925, term72925.getClass(), "fnName", "");
        setField(term73185, term73185.getClass(), "warningsGuard", term73297);
        setField(term72925, term72925.getClass(), "compiler", term73185);
        setField(term72925, term72925.getClass(), "sourceName", "");
        setField(term72925, term72925.getClass(), "errorRoot", null);
        term73367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term73367, term73367.getClass(), "first", null);
        term73447 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term73447, term73447.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term73367;
        args[1] = term73447;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term72925, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


