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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionTypeBuilder_inferParameterTypes_1660322551295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112153;
     Object term112497;

    public FunctionTypeBuilder_inferParameterTypes_1660322551295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112153 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term112309 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term112417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term112153, term112153.getClass(), "parametersNode", null);
        setField(term112153, term112153.getClass(), "typeRegistry", null);
        setField(term112153, term112153.getClass(), "templateTypeName", "");
        setField(term112153, term112153.getClass(), "fnName", "");
        setField(term112153, term112153.getClass(), "compiler", term112309);
        setField(term112153, term112153.getClass(), "sourceName", "");
        setField(term112153, term112153.getClass(), "errorRoot", term112417);
        term112497 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term112497, term112497.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term112497;
        callMethod(klass, "inferParameterTypes", argTypes, term112153, args);
    }

};


