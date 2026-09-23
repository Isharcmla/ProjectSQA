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

public class FunctionType_tryMergeFunctionPiecewise_2003411845447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368540;
     Object term369050;

    public FunctionType_tryMergeFunctionPiecewise_2003411845447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term370063 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term370062 = ((Class) term370063).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term370062).setAccessible(true);
        Object enum629 = ((Field) term370062).get((Object) null);
        term368540 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term368634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term368704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term368704, term368704.getClass(), "first", term368704);
        setField(term368704, term368704.getClass(), "jsType", null);
        setField(term368704, term368704.getClass(), "next", null);
        setField(term368634, term368634.getClass(), "parameters", term368704);
        setField(term368814, term368814.getClass(), "kind", enum629);
        setField(term368634, term368634.getClass(), "returnType", term368814);
        setField(term368540, term368540.getClass(), "call", term368634);
        term369050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term369144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term369214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term369284, term369284.getClass(), "jsType", null);
        setField(term369284, term369284.getClass(), "next", null);
        setField(term369214, term369214.getClass(), "first", term369284);
        setField(term369144, term369144.getClass(), "parameters", term369214);
        setField(term369144, term369144.getClass(), "returnType", term369394);
        setField(term369050, term369050.getClass(), "call", term369144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term369050;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term368540, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


