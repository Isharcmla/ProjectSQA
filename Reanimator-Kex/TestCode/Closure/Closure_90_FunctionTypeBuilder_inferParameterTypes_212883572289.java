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

public class FunctionTypeBuilder_inferParameterTypes_212883572289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109828;
     Object term110156;

    public FunctionTypeBuilder_inferParameterTypes_212883572289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109828 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term109914 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term110070 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term109914, term109914.getClass(), "first", null);
        setField(term109828, term109828.getClass(), "parametersNode", term109914);
        setField(term109828, term109828.getClass(), "typeRegistry", null);
        setField(term109828, term109828.getClass(), "templateTypeName", "");
        setField(term109828, term109828.getClass(), "fnName", "");
        setField(term109828, term109828.getClass(), "compiler", term110070);
        setField(term109828, term109828.getClass(), "sourceName", null);
        setField(term109828, term109828.getClass(), "errorRoot", null);
        term110156 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term110156, term110156.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term110156;
        args[1] = null;
        callMethod(klass, "inferParameterTypes", argTypes, term109828, args);
    }

};


