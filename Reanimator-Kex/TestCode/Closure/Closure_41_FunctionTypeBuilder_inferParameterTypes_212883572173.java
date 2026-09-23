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

public class FunctionTypeBuilder_inferParameterTypes_212883572173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51665;
     Object term51853;
     Object term51933;

    public FunctionTypeBuilder_inferParameterTypes_212883572173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51665 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term51783 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term51665, term51665.getClass(), "parametersNode", null);
        setField(term51665, term51665.getClass(), "typeRegistry", null);
        setField(term51665, term51665.getClass(), "templateTypeName", "");
        setField(term51665, term51665.getClass(), "fnName", null);
        setField(term51665, term51665.getClass(), "compiler", term51783);
        setField(term51665, term51665.getClass(), "sourceName", null);
        setField(term51665, term51665.getClass(), "errorRoot", null);
        term51853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51853, term51853.getClass(), "first", null);
        term51933 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term51933, term51933.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term51853;
        args[1] = term51933;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term51665, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


