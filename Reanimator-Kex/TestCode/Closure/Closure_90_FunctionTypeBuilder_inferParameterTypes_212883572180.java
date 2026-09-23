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

public class FunctionTypeBuilder_inferParameterTypes_212883572180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72263;
     Object term72635;

    public FunctionTypeBuilder_inferParameterTypes_212883572180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72263 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term72333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term72555 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term72333, term72333.getClass(), "first", null);
        setField(term72263, term72263.getClass(), "parametersNode", term72333);
        setField(term72263, term72263.getClass(), "typeRegistry", term72437);
        setField(term72263, term72263.getClass(), "templateTypeName", "");
        setField(term72263, term72263.getClass(), "fnName", null);
        setField(term72263, term72263.getClass(), "compiler", term72555);
        setField(term72263, term72263.getClass(), "sourceName", null);
        setField(term72263, term72263.getClass(), "errorRoot", null);
        term72635 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term72635, term72635.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term72635;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term72263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


