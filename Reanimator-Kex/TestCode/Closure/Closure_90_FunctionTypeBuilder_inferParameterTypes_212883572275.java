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

public class FunctionTypeBuilder_inferParameterTypes_212883572275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104116;
     Object term104342;
     Object term104422;

    public FunctionTypeBuilder_inferParameterTypes_212883572275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104116 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term104234 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term104116, term104116.getClass(), "parametersNode", null);
        setField(term104116, term104116.getClass(), "typeRegistry", null);
        setField(term104116, term104116.getClass(), "templateTypeName", "");
        setField(term104116, term104116.getClass(), "fnName", null);
        setField(term104116, term104116.getClass(), "compiler", term104234);
        setField(term104116, term104116.getClass(), "sourceName", "");
        setField(term104116, term104116.getClass(), "errorRoot", null);
        term104342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term104342, term104342.getClass(), "first", null);
        term104422 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term104422, term104422.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term104342;
        args[1] = term104422;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term104116, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


