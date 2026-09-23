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

public class FunctionType_tryMergeFunctionPiecewise_2003411845604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592935;
     Object term593631;

    public FunctionType_tryMergeFunctionPiecewise_2003411845604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term596121 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term596120 = ((Class) term596121).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term596120).setAccessible(true);
        Object enum918 = ((Field) term596120).get((Object) null);
        term592935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term593029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term593099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term593169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term593920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term593531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term593169, term593169.getClass(), "jsType", null);
        setField(term593169, term593169.getClass(), "next", null);
        setField(term593099, term593099.getClass(), "first", term593169);
        setField(term593029, term593029.getClass(), "parameters", term593099);
        setField(term593920, term593920.getClass(), "kind", enum918);
        setField(term593029, term593029.getClass(), "returnType", term593920);
        setBooleanField(term593029, term593029.getClass(), "returnTypeInferred", false);
        setField(term592935, term592935.getClass(), "call", term593029);
        setField(term592935, term592935.getClass(), "typeOfThis", null);
        setField(term592935, term592935.getClass(), "registry", term593531);
        term593631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term593725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term593795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term593865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term593865, term593865.getClass(), "jsType", null);
        setField(term593865, term593865.getClass(), "next", null);
        setField(term593795, term593795.getClass(), "first", term593865);
        setField(term593725, term593725.getClass(), "parameters", term593795);
        setField(term593725, term593725.getClass(), "returnType", term593920);
        setBooleanField(term593725, term593725.getClass(), "returnTypeInferred", true);
        setField(term593631, term593631.getClass(), "call", term593725);
        setField(term593631, term593631.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term593631;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term592935, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


