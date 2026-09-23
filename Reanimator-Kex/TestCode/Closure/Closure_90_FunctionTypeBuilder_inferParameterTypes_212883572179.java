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

public class FunctionTypeBuilder_inferParameterTypes_212883572179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71222;
     Object term71496;

    public FunctionTypeBuilder_inferParameterTypes_212883572179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71222 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term71378 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term71222, term71222.getClass(), "parametersNode", null);
        setField(term71222, term71222.getClass(), "typeRegistry", null);
        setField(term71222, term71222.getClass(), "templateTypeName", "");
        setField(term71222, term71222.getClass(), "fnName", "");
        setField(term71222, term71222.getClass(), "compiler", term71378);
        setField(term71222, term71222.getClass(), "sourceName", "");
        setField(term71222, term71222.getClass(), "errorRoot", null);
        term71496 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term71496, term71496.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term71496;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term71222, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


