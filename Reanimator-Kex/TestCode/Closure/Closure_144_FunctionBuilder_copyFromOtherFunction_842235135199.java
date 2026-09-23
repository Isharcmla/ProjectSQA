package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionBuilder_copyFromOtherFunction_842235135199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135648;
     Object term135758;

    public FunctionBuilder_copyFromOtherFunction_842235135199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term135648, term135648.getClass(), "name", null);
        setField(term135648, term135648.getClass(), "sourceNode", null);
        setField(term135648, term135648.getClass(), "parametersNode", null);
        setField(term135648, term135648.getClass(), "returnType", null);
        term135758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term135852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term135952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term135758, term135758.getClass(), "className", null);
        setField(term135758, term135758.getClass(), "source", null);
        setField(term135852, term135852.getClass(), "parameters", null);
        setField(term135852, term135852.getClass(), "returnType", null);
        setField(term135758, term135758.getClass(), "call", term135852);
        setField(term135758, term135758.getClass(), "typeOfThis", term135952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term135758;
        try {
            callMethod(klass, "copyFromOtherFunction", argTypes, term135648, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


