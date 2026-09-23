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

public class FunctionType_tryMergeFunctionPiecewise_2003411845411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314788;
     Object term314504;

    public FunctionType_tryMergeFunctionPiecewise_2003411845411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term316227 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term316226 = ((Class) term316227).getDeclaredField((String) "ORDINARY");
        ((Field) term316226).setAccessible(true);
        Object enum545 = ((Field) term316226).get((Object) null);
        Class<? extends Object> term316518 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term316517 = ((Class) term316518).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term316517).setAccessible(true);
        Object enum546 = ((Field) term316517).get((Object) null);
        term314788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term314835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term314870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term314905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term314955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term315073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term314905, term314905.getClass(), "jsType", null);
        setField(term314905, term314905.getClass(), "next", null);
        setField(term314870, term314870.getClass(), "first", term314905);
        setField(term314835, term314835.getClass(), "parameters", term314870);
        setField(term314955, term314955.getClass(), "kind", enum545);
        setField(term314955, term314955.getClass(), "typeOfThis", term315073);
        setField(term314835, term314835.getClass(), "returnType", term314955);
        setField(term314788, term314788.getClass(), "call", term314835);
        setField(term314788, term314788.getClass(), "kind", enum546);
        setField(term314788, term314788.getClass(), "typeOfThis", null);
        term314504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term314598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term314668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term314738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term314738, term314738.getClass(), "jsType", null);
        setField(term314738, term314738.getClass(), "next", null);
        setField(term314668, term314668.getClass(), "first", term314738);
        setField(term314598, term314598.getClass(), "parameters", term314668);
        setField(term314598, term314598.getClass(), "returnType", term314788);
        setField(term314504, term314504.getClass(), "call", term314598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term314504;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term314788, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


