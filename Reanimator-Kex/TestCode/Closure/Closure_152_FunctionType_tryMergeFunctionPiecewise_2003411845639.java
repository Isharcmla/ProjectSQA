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

public class FunctionType_tryMergeFunctionPiecewise_2003411845639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640295;
     Object term640011;

    public FunctionType_tryMergeFunctionPiecewise_2003411845639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term641255 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term641254 = ((Class) term641255).getDeclaredField((String) "INTERFACE");
        ((Field) term641254).setAccessible(true);
        Object enum985 = ((Field) term641254).get((Object) null);
        term640295 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term640342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term640377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term640412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term640467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term640412, term640412.getClass(), "jsType", null);
        setField(term640412, term640412.getClass(), "next", null);
        setField(term640377, term640377.getClass(), "first", term640412);
        setField(term640342, term640342.getClass(), "parameters", term640377);
        setField(term640467, term640467.getClass(), "kind", enum985);
        setField(term640342, term640342.getClass(), "returnType", term640467);
        setField(term640295, term640295.getClass(), "call", term640342);
        term640011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term640105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term640175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term640245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term640245, term640245.getClass(), "jsType", null);
        setField(term640245, term640245.getClass(), "next", null);
        setField(term640175, term640175.getClass(), "first", term640245);
        setField(term640105, term640105.getClass(), "parameters", term640175);
        setField(term640105, term640105.getClass(), "returnType", term640295);
        setField(term640011, term640011.getClass(), "call", term640105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term640011;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term640295, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


