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

public class FunctionType_tryMergeFunctionPiecewise_2003411845521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474095;
     Object term474605;

    public FunctionType_tryMergeFunctionPiecewise_2003411845521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term475693 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term475692 = ((Class) term475693).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term475692).setAccessible(true);
        Object enum770 = ((Field) term475692).get((Object) null);
        term474095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term474189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term474259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term474259, term474259.getClass(), "first", term474259);
        setField(term474259, term474259.getClass(), "jsType", null);
        setField(term474259, term474259.getClass(), "next", null);
        setField(term474189, term474189.getClass(), "parameters", term474259);
        setField(term474894, term474894.getClass(), "kind", enum770);
        setField(term474189, term474189.getClass(), "returnType", term474894);
        setBooleanField(term474189, term474189.getClass(), "returnTypeInferred", false);
        setField(term474095, term474095.getClass(), "call", term474189);
        setField(term474095, term474095.getClass(), "typeOfThis", null);
        term474605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term474699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term474769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term474839, term474839.getClass(), "jsType", null);
        setField(term474839, term474839.getClass(), "next", null);
        setField(term474769, term474769.getClass(), "first", term474839);
        setField(term474699, term474699.getClass(), "parameters", term474769);
        setField(term474699, term474699.getClass(), "returnType", term474894);
        setBooleanField(term474699, term474699.getClass(), "returnTypeInferred", true);
        setField(term474605, term474605.getClass(), "call", term474699);
        setField(term474605, term474605.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term474605;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term474095, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


