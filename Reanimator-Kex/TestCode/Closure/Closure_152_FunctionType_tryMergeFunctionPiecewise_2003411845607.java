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

public class FunctionType_tryMergeFunctionPiecewise_2003411845607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598013;
     Object term598605;

    public FunctionType_tryMergeFunctionPiecewise_2003411845607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term600149 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term600148 = ((Class) term600149).getDeclaredField((String) "ORDINARY");
        ((Field) term600148).setAccessible(true);
        Object enum924 = ((Field) term600148).get((Object) null);
        term598013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term598107 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term598804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term598839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term598347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term598839, term598839.getClass(), "jsType", null);
        setField(term598839, term598839.getClass(), "next", null);
        setField(term598804, term598804.getClass(), "first", term598839);
        setField(term598804, term598804.getClass(), "jsType", null);
        setField(term598804, term598804.getClass(), "next", null);
        setField(term598107, term598107.getClass(), "parameters", term598804);
        setField(term598347, term598347.getClass(), "kind", enum924);
        setField(term598347, term598347.getClass(), "typeOfThis", term598013);
        setField(term598107, term598107.getClass(), "returnType", term598347);
        setField(term598013, term598013.getClass(), "call", term598107);
        Class<? extends Object> term600440 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term600439 = ((Class) term600440).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term600439).setAccessible(true);
        Object enum925 = ((Field) term600439).get((Object) null);
        term598605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term598699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term598769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term598939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term598769, term598769.getClass(), "first", term598804);
        setField(term598699, term598699.getClass(), "parameters", term598769);
        setField(term598939, term598939.getClass(), "kind", enum925);
        setField(term598939, term598939.getClass(), "typeOfThis", null);
        setField(term598699, term598699.getClass(), "returnType", term598939);
        setField(term598605, term598605.getClass(), "call", term598699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term598605;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term598013, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


