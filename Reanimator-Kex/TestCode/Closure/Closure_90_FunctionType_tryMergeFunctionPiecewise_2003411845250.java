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

public class FunctionType_tryMergeFunctionPiecewise_2003411845250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141043;
     Object term141635;

    public FunctionType_tryMergeFunctionPiecewise_2003411845250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term144588 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term144587 = ((Class) term144588).getDeclaredField((String) "ORDINARY");
        ((Field) term144587).setAccessible(true);
        Object enum272 = ((Field) term144587).get((Object) null);
        term141043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term141137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term141207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term141277, term141277.getClass(), "jsType", null);
        setField(term141277, term141277.getClass(), "next", null);
        setField(term141207, term141207.getClass(), "first", term141277);
        setField(term141137, term141137.getClass(), "parameters", term141207);
        setField(term141377, term141377.getClass(), "kind", enum272);
        setField(term141137, term141137.getClass(), "returnType", term141377);
        setField(term141043, term141043.getClass(), "call", term141137);
        Class<? extends Object> term144879 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term144878 = ((Class) term144879).getDeclaredField((String) "INTERFACE");
        ((Field) term144878).setAccessible(true);
        Object enum273 = ((Field) term144878).get((Object) null);
        term141635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term141729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term141799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term141869, term141869.getClass(), "jsType", null);
        setField(term141869, term141869.getClass(), "next", null);
        setField(term141799, term141799.getClass(), "first", term141869);
        setField(term141729, term141729.getClass(), "parameters", term141799);
        setField(term141969, term141969.getClass(), "kind", enum273);
        setField(term141729, term141729.getClass(), "returnType", term141969);
        setField(term141635, term141635.getClass(), "call", term141729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term141635;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term141043, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


