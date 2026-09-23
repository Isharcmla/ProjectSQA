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

public class FunctionType_tryMergeFunctionPiecewise_2003411845537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493494;
     Object term494198;

    public FunctionType_tryMergeFunctionPiecewise_2003411845537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term495671 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term495670 = ((Class) term495671).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term495670).setAccessible(true);
        Object enum794 = ((Field) term495670).get((Object) null);
        term493494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term493588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term493658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term493728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term493836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term494088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term493728, term493728.getClass(), "jsType", null);
        setField(term493728, term493728.getClass(), "next", null);
        setField(term493658, term493658.getClass(), "first", term493728);
        setField(term493588, term493588.getClass(), "parameters", term493658);
        setField(term493836, term493836.getClass(), "kind", enum794);
        setField(term493836, term493836.getClass(), "registry", term494088);
        setField(term493588, term493588.getClass(), "returnType", term493836);
        setField(term493494, term493494.getClass(), "call", term493588);
        Class<? extends Object> term495971 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term495970 = ((Class) term495971).getDeclaredField((String) "INTERFACE");
        ((Field) term495970).setAccessible(true);
        Object enum795 = ((Field) term495970).get((Object) null);
        term494198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term494292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term494362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term494432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term494532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term494432, term494432.getClass(), "jsType", null);
        setField(term494432, term494432.getClass(), "next", null);
        setField(term494362, term494362.getClass(), "first", term494432);
        setField(term494292, term494292.getClass(), "parameters", term494362);
        setField(term494532, term494532.getClass(), "kind", enum795);
        setField(term494292, term494292.getClass(), "returnType", term494532);
        setField(term494198, term494198.getClass(), "call", term494292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term494198;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term493494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


