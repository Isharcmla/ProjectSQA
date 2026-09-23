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

public class FunctionType_tryMergeFunctionPiecewise_2003411845661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675336;
     Object term676040;

    public FunctionType_tryMergeFunctionPiecewise_2003411845661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term677548 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term677547 = ((Class) term677548).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term677547).setAccessible(true);
        Object enum1032 = ((Field) term677547).get((Object) null);
        term675336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term675430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term675500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term675570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term675680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term675932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term675570, term675570.getClass(), "jsType", null);
        setField(term675570, term675570.getClass(), "next", null);
        setField(term675500, term675500.getClass(), "first", term675570);
        setField(term675430, term675430.getClass(), "parameters", term675500);
        setField(term675680, term675680.getClass(), "kind", enum1032);
        setField(term675680, term675680.getClass(), "registry", term675932);
        setField(term675430, term675430.getClass(), "returnType", term675680);
        setField(term675336, term675336.getClass(), "call", term675430);
        Class<? extends Object> term677848 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term677847 = ((Class) term677848).getDeclaredField((String) "INTERFACE");
        ((Field) term677847).setAccessible(true);
        Object enum1033 = ((Field) term677847).get((Object) null);
        term676040 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term676134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term676204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term676274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term676384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term676274, term676274.getClass(), "jsType", null);
        setField(term676274, term676274.getClass(), "next", null);
        setField(term676204, term676204.getClass(), "first", term676274);
        setField(term676134, term676134.getClass(), "parameters", term676204);
        setField(term676384, term676384.getClass(), "kind", enum1033);
        setField(term676134, term676134.getClass(), "returnType", term676384);
        setField(term676040, term676040.getClass(), "call", term676134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term676040;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term675336, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


