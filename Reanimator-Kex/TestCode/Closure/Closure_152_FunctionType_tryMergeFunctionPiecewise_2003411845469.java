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

public class FunctionType_tryMergeFunctionPiecewise_2003411845469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400553;
     Object term401125;

    public FunctionType_tryMergeFunctionPiecewise_2003411845469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term400647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term400717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term401025 = newInstance(Class.forName("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$1"));
        setField(term400787, term400787.getClass(), "jsType", null);
        setField(term400787, term400787.getClass(), "next", null);
        setField(term400717, term400717.getClass(), "first", term400787);
        setField(term400647, term400647.getClass(), "parameters", term400717);
        setField(term400887, term400887.getClass(), "leastSupertypeVisitor", term401025);
        setField(term400647, term400647.getClass(), "returnType", term400887);
        setField(term400553, term400553.getClass(), "call", term400647);
        term401125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term401219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term401289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term401359, term401359.getClass(), "jsType", null);
        setField(term401359, term401359.getClass(), "next", null);
        setField(term401289, term401289.getClass(), "first", term401359);
        setField(term401219, term401219.getClass(), "parameters", term401289);
        setField(term401219, term401219.getClass(), "returnType", term401469);
        setField(term401125, term401125.getClass(), "call", term401219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term401125;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term400553, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


