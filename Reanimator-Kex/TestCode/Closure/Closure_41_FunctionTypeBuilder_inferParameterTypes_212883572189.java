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

public class FunctionTypeBuilder_inferParameterTypes_212883572189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58764;
     Object term59000;

    public FunctionTypeBuilder_inferParameterTypes_212883572189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58764 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term58920 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term58764, term58764.getClass(), "parametersNode", null);
        setField(term58764, term58764.getClass(), "typeRegistry", null);
        setField(term58764, term58764.getClass(), "templateTypeName", "");
        setField(term58764, term58764.getClass(), "fnName", "");
        setField(term58764, term58764.getClass(), "compiler", term58920);
        setField(term58764, term58764.getClass(), "sourceName", null);
        setField(term58764, term58764.getClass(), "errorRoot", null);
        term59000 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term59000, term59000.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term59000;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term58764, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


