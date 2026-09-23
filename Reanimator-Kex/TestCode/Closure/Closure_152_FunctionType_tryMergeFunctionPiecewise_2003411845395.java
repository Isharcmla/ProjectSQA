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

public class FunctionType_tryMergeFunctionPiecewise_2003411845395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300137;
     Object term300833;

    public FunctionType_tryMergeFunctionPiecewise_2003411845395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term302261 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term302260 = ((Class) term302261).getDeclaredField((String) "INTERFACE");
        ((Field) term302260).setAccessible(true);
        Object enum520 = ((Field) term302260).get((Object) null);
        term300137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term300231 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term300301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term300371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term300471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term300723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term300371, term300371.getClass(), "jsType", null);
        setField(term300371, term300371.getClass(), "next", null);
        setField(term300301, term300301.getClass(), "first", term300371);
        setField(term300231, term300231.getClass(), "parameters", term300301);
        setField(term300471, term300471.getClass(), "kind", enum520);
        setField(term300471, term300471.getClass(), "registry", term300723);
        setField(term300231, term300231.getClass(), "returnType", term300471);
        setField(term300137, term300137.getClass(), "call", term300231);
        Class<? extends Object> term302555 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term302554 = ((Class) term302555).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term302554).setAccessible(true);
        Object enum521 = ((Field) term302554).get((Object) null);
        term300833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term300927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term300997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term301067, term301067.getClass(), "jsType", null);
        setField(term301067, term301067.getClass(), "next", null);
        setField(term300997, term300997.getClass(), "first", term301067);
        setField(term300927, term300927.getClass(), "parameters", term300997);
        setField(term301177, term301177.getClass(), "kind", enum521);
        setField(term300927, term300927.getClass(), "returnType", term301177);
        setField(term300833, term300833.getClass(), "call", term300927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term300833;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term300137, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


