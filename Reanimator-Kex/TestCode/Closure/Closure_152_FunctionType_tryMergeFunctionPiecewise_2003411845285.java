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

public class FunctionType_tryMergeFunctionPiecewise_2003411845285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166490;
     Object term166206;

    public FunctionType_tryMergeFunctionPiecewise_2003411845285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term167443 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term167442 = ((Class) term167443).getDeclaredField((String) "INTERFACE");
        ((Field) term167442).setAccessible(true);
        Object enum301 = ((Field) term167442).get((Object) null);
        term166490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term166537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term166572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term166607, term166607.getClass(), "jsType", null);
        setField(term166607, term166607.getClass(), "next", null);
        setField(term166572, term166572.getClass(), "first", term166607);
        setField(term166537, term166537.getClass(), "parameters", term166572);
        setField(term166657, term166657.getClass(), "kind", enum301);
        setField(term166537, term166537.getClass(), "returnType", term166657);
        setField(term166490, term166490.getClass(), "call", term166537);
        term166206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term166300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term166370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term166440, term166440.getClass(), "jsType", null);
        setField(term166440, term166440.getClass(), "next", null);
        setField(term166370, term166370.getClass(), "first", term166440);
        setField(term166300, term166300.getClass(), "parameters", term166370);
        setField(term166300, term166300.getClass(), "returnType", term166490);
        setField(term166206, term166206.getClass(), "call", term166300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term166206;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term166490, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


