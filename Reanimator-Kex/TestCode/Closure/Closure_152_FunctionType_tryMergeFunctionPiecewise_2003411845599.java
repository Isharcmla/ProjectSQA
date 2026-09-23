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

public class FunctionType_tryMergeFunctionPiecewise_2003411845599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587031;
     Object term587645;

    public FunctionType_tryMergeFunctionPiecewise_2003411845599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term588771 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term588770 = ((Class) term588771).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term588770).setAccessible(true);
        Object enum910 = ((Field) term588770).get((Object) null);
        term587031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term587125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term587195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term587305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term587557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term587195, term587195.getClass(), "first", term587195);
        setField(term587195, term587195.getClass(), "jsType", null);
        setField(term587195, term587195.getClass(), "next", null);
        setField(term587125, term587125.getClass(), "parameters", term587195);
        setField(term587305, term587305.getClass(), "kind", enum910);
        setField(term587305, term587305.getClass(), "registry", term587557);
        setField(term587125, term587125.getClass(), "returnType", term587305);
        setField(term587031, term587031.getClass(), "call", term587125);
        term587645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term587739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term587809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term587879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term587989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term587879, term587879.getClass(), "jsType", null);
        setField(term587879, term587879.getClass(), "next", null);
        setField(term587809, term587809.getClass(), "first", term587879);
        setField(term587739, term587739.getClass(), "parameters", term587809);
        setField(term587989, term587989.getClass(), "kind", enum910);
        setField(term587739, term587739.getClass(), "returnType", term587989);
        setField(term587645, term587645.getClass(), "call", term587739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term587645;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term587031, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


