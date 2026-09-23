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

public class FunctionType_tryMergeFunctionPiecewise_2003411845549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510617;
     Object term511197;

    public FunctionType_tryMergeFunctionPiecewise_2003411845549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term512197 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term512196 = ((Class) term512197).getDeclaredField((String) "ORDINARY");
        ((Field) term512196).setAccessible(true);
        Object enum818 = ((Field) term512196).get((Object) null);
        term510617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term510711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term510781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term510851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term510961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term510851, term510851.getClass(), "jsType", null);
        setField(term510851, term510851.getClass(), "next", null);
        setField(term510781, term510781.getClass(), "first", term510851);
        setField(term510711, term510711.getClass(), "parameters", term510781);
        setField(term510961, term510961.getClass(), "kind", enum818);
        setField(term510711, term510711.getClass(), "returnType", term510961);
        setField(term510617, term510617.getClass(), "call", term510711);
        term511197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term511291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term511361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term511431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term511541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term511431, term511431.getClass(), "jsType", null);
        setField(term511431, term511431.getClass(), "next", null);
        setField(term511361, term511361.getClass(), "first", term511431);
        setField(term511291, term511291.getClass(), "parameters", term511361);
        setField(term511291, term511291.getClass(), "returnType", term511541);
        setField(term511197, term511197.getClass(), "call", term511291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term511197;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term510617, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


