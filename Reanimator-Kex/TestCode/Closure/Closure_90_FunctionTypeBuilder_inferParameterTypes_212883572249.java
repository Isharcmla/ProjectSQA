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

public class FunctionTypeBuilder_inferParameterTypes_212883572249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95219;
     Object term95585;
     Object term95665;

    public FunctionTypeBuilder_inferParameterTypes_212883572249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95219 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term95289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95515 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term95359, term95359.getClass(), "first", null);
        setIntField(term95359, term95359.getClass(), "type", 0);
        setField(term95359, term95359.getClass(), "parent", null);
        setIntField(term95359, term95359.getClass(), "sourcePosition", 0);
        setField(term95289, term95289.getClass(), "first", term95359);
        setField(term95219, term95219.getClass(), "parametersNode", term95289);
        setField(term95219, term95219.getClass(), "typeRegistry", null);
        setField(term95219, term95219.getClass(), "templateTypeName", "");
        setField(term95219, term95219.getClass(), "fnName", "");
        setField(term95219, term95219.getClass(), "compiler", term95515);
        setField(term95219, term95219.getClass(), "sourceName", "");
        setField(term95219, term95219.getClass(), "errorRoot", null);
        term95585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95585, term95585.getClass(), "first", null);
        term95665 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term95665, term95665.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term95585;
        args[1] = term95665;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term95219, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


