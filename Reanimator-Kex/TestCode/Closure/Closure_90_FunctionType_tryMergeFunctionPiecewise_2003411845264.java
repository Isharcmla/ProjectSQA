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

public class FunctionType_tryMergeFunctionPiecewise_2003411845264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153494;
     Object term154196;

    public FunctionType_tryMergeFunctionPiecewise_2003411845264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term156434 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term156433 = ((Class) term156434).getDeclaredField((String) "ORDINARY");
        ((Field) term156433).setAccessible(true);
        Object enum292 = ((Field) term156433).get((Object) null);
        term153494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term153588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term154395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term154430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term153828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term154086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term154430, term154430.getClass(), "jsType", null);
        setField(term154430, term154430.getClass(), "next", null);
        setField(term154395, term154395.getClass(), "first", term154430);
        setField(term154395, term154395.getClass(), "jsType", null);
        setField(term154395, term154395.getClass(), "next", null);
        setField(term153588, term153588.getClass(), "parameters", term154395);
        setField(term153828, term153828.getClass(), "kind", enum292);
        setField(term153828, term153828.getClass(), "typeOfThis", term154086);
        setField(term153588, term153588.getClass(), "returnType", term153828);
        setField(term153494, term153494.getClass(), "call", term153588);
        Class<? extends Object> term156725 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term156724 = ((Class) term156725).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term156724).setAccessible(true);
        Object enum293 = ((Field) term156724).get((Object) null);
        term154196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term154290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term154360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term154530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term154360, term154360.getClass(), "first", term154395);
        setField(term154290, term154290.getClass(), "parameters", term154360);
        setField(term154530, term154530.getClass(), "kind", enum293);
        setField(term154530, term154530.getClass(), "typeOfThis", null);
        setField(term154290, term154290.getClass(), "returnType", term154530);
        setField(term154196, term154196.getClass(), "call", term154290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term154196;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term153494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


