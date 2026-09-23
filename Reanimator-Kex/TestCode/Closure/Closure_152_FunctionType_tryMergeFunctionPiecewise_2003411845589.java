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

public class FunctionType_tryMergeFunctionPiecewise_2003411845589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571134;
     Object term571644;

    public FunctionType_tryMergeFunctionPiecewise_2003411845589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term573132 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term573131 = ((Class) term573132).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term573131).setAccessible(true);
        Object enum888 = ((Field) term573131).get((Object) null);
        term571134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term571228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term571298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term571408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term571298, term571298.getClass(), "first", term571298);
        setField(term571298, term571298.getClass(), "jsType", null);
        setField(term571298, term571298.getClass(), "next", null);
        setField(term571228, term571228.getClass(), "parameters", term571298);
        setField(term571408, term571408.getClass(), "kind", enum888);
        setField(term571228, term571228.getClass(), "returnType", term571408);
        setField(term571134, term571134.getClass(), "call", term571228);
        Class<? extends Object> term573432 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term573431 = ((Class) term573432).getDeclaredField((String) "ORDINARY");
        ((Field) term573431).setAccessible(true);
        Object enum889 = ((Field) term573431).get((Object) null);
        term571644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term571738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term571808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term571878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term571988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term571878, term571878.getClass(), "jsType", null);
        setField(term571878, term571878.getClass(), "next", null);
        setField(term571808, term571808.getClass(), "first", term571878);
        setField(term571738, term571738.getClass(), "parameters", term571808);
        setField(term571988, term571988.getClass(), "kind", enum889);
        setField(term571738, term571738.getClass(), "returnType", term571988);
        setField(term571644, term571644.getClass(), "call", term571738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term571644;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term571134, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


