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
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531920;
     Object term532682;

    public FunctionType_tryMergeFunctionPiecewise_2003411845563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term533748 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term533747 = ((Class) term533748).getDeclaredField((String) "ORDINARY");
        ((Field) term533747).setAccessible(true);
        Object enum838 = ((Field) term533747).get((Object) null);
        term531920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term532014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term532811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term532846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term532264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term532500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term532594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term532846, term532846.getClass(), "jsType", null);
        setField(term532846, term532846.getClass(), "next", null);
        setField(term532811, term532811.getClass(), "first", term532846);
        setField(term532014, term532014.getClass(), "parameters", term532811);
        setField(term532264, term532264.getClass(), "kind", enum838);
        setField(term532264, term532264.getClass(), "typeOfThis", term532500);
        setField(term532264, term532264.getClass(), "call", term532594);
        setField(term532014, term532014.getClass(), "returnType", term532264);
        setField(term531920, term531920.getClass(), "call", term532014);
        term532682 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term532776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term532956 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term532776, term532776.getClass(), "parameters", term532811);
        setField(term532956, term532956.getClass(), "kind", enum838);
        setField(term532956, term532956.getClass(), "typeOfThis", null);
        setField(term532776, term532776.getClass(), "returnType", term532956);
        setField(term532682, term532682.getClass(), "call", term532776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term532682;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term531920, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


