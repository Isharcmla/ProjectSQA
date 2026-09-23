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

public class FunctionBuilder_copyFromOtherFunction_842235135103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74205;
     Object term74313;

    public FunctionBuilder_copyFromOtherFunction_842235135103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term74205, term74205.getClass(), "name", null);
        setField(term74205, term74205.getClass(), "sourceNode", null);
        setField(term74205, term74205.getClass(), "parametersNode", null);
        setField(term74205, term74205.getClass(), "returnType", null);
        term74313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term74407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term74507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term74313, term74313.getClass(), "className", null);
        setField(term74313, term74313.getClass(), "source", null);
        setField(term74407, term74407.getClass(), "parameters", null);
        setField(term74407, term74407.getClass(), "returnType", null);
        setField(term74313, term74313.getClass(), "call", term74407);
        setField(term74313, term74313.getClass(), "typeOfThis", term74507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term74313;
        try {
            callMethod(klass, "copyFromOtherFunction", argTypes, term74205, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


