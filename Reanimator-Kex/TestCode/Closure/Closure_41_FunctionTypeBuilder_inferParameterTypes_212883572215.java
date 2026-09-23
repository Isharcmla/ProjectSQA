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

public class FunctionTypeBuilder_inferParameterTypes_212883572215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68027;
     Object term68323;

    public FunctionTypeBuilder_inferParameterTypes_212883572215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68027 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term68097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68253 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term68097, term68097.getClass(), "first", null);
        setField(term68027, term68027.getClass(), "parametersNode", term68097);
        setField(term68027, term68027.getClass(), "typeRegistry", null);
        setField(term68027, term68027.getClass(), "templateTypeName", "");
        setField(term68027, term68027.getClass(), "fnName", "");
        setField(term68027, term68027.getClass(), "compiler", term68253);
        setField(term68027, term68027.getClass(), "sourceName", null);
        setField(term68027, term68027.getClass(), "errorRoot", null);
        term68323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68323, term68323.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term68323;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term68027, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


