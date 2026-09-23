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

public class FunctionType_tryMergeFunctionPiecewise_2003411845624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620172;
     Object term620852;

    public FunctionType_tryMergeFunctionPiecewise_2003411845624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term620172 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term620266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term620336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term621051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term620506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term620640 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$2"));
        Object term620744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term621051, term621051.getClass(), "jsType", null);
        setField(term621051, term621051.getClass(), "next", null);
        setField(term620336, term620336.getClass(), "first", term621051);
        setField(term620266, term620266.getClass(), "parameters", term620336);
        setField(term620506, term620506.getClass(), "leastSupertypeVisitor", term620640);
        setField(term620266, term620266.getClass(), "returnType", term620506);
        setBooleanField(term620266, term620266.getClass(), "returnTypeInferred", false);
        setField(term620172, term620172.getClass(), "call", term620266);
        setField(term620172, term620172.getClass(), "typeOfThis", null);
        setField(term620172, term620172.getClass(), "registry", term620744);
        term620852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term620946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term621016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term621159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term621016, term621016.getClass(), "first", term621051);
        setField(term620946, term620946.getClass(), "parameters", term621016);
        setField(term620946, term620946.getClass(), "returnType", term621159);
        setBooleanField(term620946, term620946.getClass(), "returnTypeInferred", false);
        setField(term620852, term620852.getClass(), "call", term620946);
        setField(term620852, term620852.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term620852;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term620172, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


