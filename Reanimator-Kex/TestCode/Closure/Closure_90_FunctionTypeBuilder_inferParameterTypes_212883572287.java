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

public class FunctionTypeBuilder_inferParameterTypes_212883572287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108404;
     Object term108750;

    public FunctionTypeBuilder_inferParameterTypes_212883572287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108404 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term108522 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term108642 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroupWarningsGuard"));
        setField(term108404, term108404.getClass(), "parametersNode", null);
        setField(term108404, term108404.getClass(), "typeRegistry", null);
        setField(term108404, term108404.getClass(), "templateTypeName", "");
        setField(term108404, term108404.getClass(), "fnName", null);
        setField(term108522, term108522.getClass(), "warningsGuard", term108642);
        setField(term108404, term108404.getClass(), "compiler", term108522);
        setField(term108404, term108404.getClass(), "sourceName", "");
        setField(term108404, term108404.getClass(), "errorRoot", null);
        term108750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term108750, term108750.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term108750;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term108404, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


