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

public class FunctionType_tryMergeFunctionPiecewise_2003411845491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429719;
     Object term430423;

    public FunctionType_tryMergeFunctionPiecewise_2003411845491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term431896 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term431895 = ((Class) term431896).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term431895).setAccessible(true);
        Object enum705 = ((Field) term431895).get((Object) null);
        term429719 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term429813 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term429883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430061 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term430313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term429953, term429953.getClass(), "jsType", null);
        setField(term429953, term429953.getClass(), "next", null);
        setField(term429883, term429883.getClass(), "first", term429953);
        setField(term429813, term429813.getClass(), "parameters", term429883);
        setField(term430061, term430061.getClass(), "kind", enum705);
        setField(term430061, term430061.getClass(), "registry", term430313);
        setField(term429813, term429813.getClass(), "returnType", term430061);
        setField(term429719, term429719.getClass(), "call", term429813);
        Class<? extends Object> term432196 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term432195 = ((Class) term432196).getDeclaredField((String) "INTERFACE");
        ((Field) term432195).setAccessible(true);
        Object enum706 = ((Field) term432195).get((Object) null);
        term430423 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term430517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term430587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term430657, term430657.getClass(), "jsType", null);
        setField(term430657, term430657.getClass(), "next", null);
        setField(term430587, term430587.getClass(), "first", term430657);
        setField(term430517, term430517.getClass(), "parameters", term430587);
        setField(term430757, term430757.getClass(), "kind", enum706);
        setField(term430517, term430517.getClass(), "returnType", term430757);
        setField(term430423, term430423.getClass(), "call", term430517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term430423;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term429719, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


