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

public class FunctionType_tryMergeFunctionPiecewise_2003411845315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202096;
     Object term202688;

    public FunctionType_tryMergeFunctionPiecewise_2003411845315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term204167 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term204166 = ((Class) term204167).getDeclaredField((String) "ORDINARY");
        ((Field) term204166).setAccessible(true);
        Object enum365 = ((Field) term204166).get((Object) null);
        term202096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term202190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term202260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term202330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term202430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term202330, term202330.getClass(), "jsType", null);
        setField(term202330, term202330.getClass(), "next", null);
        setField(term202260, term202260.getClass(), "first", term202330);
        setField(term202190, term202190.getClass(), "parameters", term202260);
        setField(term202430, term202430.getClass(), "kind", enum365);
        setField(term202190, term202190.getClass(), "returnType", term202430);
        setField(term202096, term202096.getClass(), "call", term202190);
        Class<? extends Object> term204458 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term204457 = ((Class) term204458).getDeclaredField((String) "INTERFACE");
        ((Field) term204457).setAccessible(true);
        Object enum366 = ((Field) term204457).get((Object) null);
        term202688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term202782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term202852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term202922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term202922, term202922.getClass(), "jsType", null);
        setField(term202922, term202922.getClass(), "next", null);
        setField(term202852, term202852.getClass(), "first", term202922);
        setField(term202782, term202782.getClass(), "parameters", term202852);
        setField(term203022, term203022.getClass(), "kind", enum366);
        setField(term202782, term202782.getClass(), "returnType", term203022);
        setField(term202688, term202688.getClass(), "call", term202782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term202688;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term202096, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


