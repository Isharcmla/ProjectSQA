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

public class FunctionType_tryMergeFunctionPiecewise_2003411845685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711993;
     Object term712699;

    public FunctionType_tryMergeFunctionPiecewise_2003411845685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term714212 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term714211 = ((Class) term714212).getDeclaredField((String) "INTERFACE");
        ((Field) term714211).setAccessible(true);
        Object enum1081 = ((Field) term714211).get((Object) null);
        term711993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term712087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term712157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term712227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term712337 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term712589 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term712227, term712227.getClass(), "jsType", null);
        setField(term712227, term712227.getClass(), "next", null);
        setField(term712157, term712157.getClass(), "first", term712227);
        setField(term712087, term712087.getClass(), "parameters", term712157);
        setField(term712337, term712337.getClass(), "kind", enum1081);
        setField(term712337, term712337.getClass(), "registry", term712589);
        setField(term712087, term712087.getClass(), "returnType", term712337);
        setField(term711993, term711993.getClass(), "call", term712087);
        Class<? extends Object> term714506 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term714505 = ((Class) term714506).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term714505).setAccessible(true);
        Object enum1082 = ((Field) term714505).get((Object) null);
        term712699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term712793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term712863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term712933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term713043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term712933, term712933.getClass(), "jsType", null);
        setField(term712933, term712933.getClass(), "next", null);
        setField(term712863, term712863.getClass(), "first", term712933);
        setField(term712793, term712793.getClass(), "parameters", term712863);
        setField(term713043, term713043.getClass(), "kind", enum1082);
        setField(term712793, term712793.getClass(), "returnType", term713043);
        setField(term712699, term712699.getClass(), "call", term712793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term712699;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term711993, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


