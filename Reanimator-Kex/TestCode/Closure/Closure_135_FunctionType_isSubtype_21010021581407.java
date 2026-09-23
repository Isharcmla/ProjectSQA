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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_21010021581407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1814430;
     Object term1814780;
     Object term1815354;
     Object term1815359;

    public FunctionType_isSubtype_21010021581407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1815366 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1815365 = ((Class) term1815366).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1815365).setAccessible(true);
        Object enum3384 = ((Field) term1815365).get((Object) null);
        term1814430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1814672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1814430, term1814430.getClass(), "kind", enum3384);
        setField(term1814430, term1814430.getClass(), "call", term1814672);
        term1814780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1814948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1814780, term1814780.getClass(), "kind", enum3384);
        setField(term1814780, term1814780.getClass(), "call", term1814948);
        Class<? extends Object> term1815666 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1815665 = ((Class) term1815666).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1815665).setAccessible(true);
        Object enum3385 = ((Field) term1815665).get((Object) null);
        term1815354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1815355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1815355, term1815355.getClass(), "parameters", null);
        setField(term1815355, term1815355.getClass(), "returnType", null);
        setBooleanField(term1815355, term1815355.getClass(), "resolved", false);
        setField(term1815355, term1815355.getClass(), "resolveResult", null);
        setField(term1815355, term1815355.getClass(), "registry", null);
        setField(term1815354, term1815354.getClass(), "call", term1815355);
        setField(term1815354, term1815354.getClass(), "prototype", null);
        setField(term1815354, term1815354.getClass(), "kind", enum3385);
        setField(term1815354, term1815354.getClass(), "typeOfThis", null);
        setField(term1815354, term1815354.getClass(), "source", null);
        setField(term1815354, term1815354.getClass(), "implementedInterfaces", null);
        setField(term1815354, term1815354.getClass(), "subTypes", null);
        setField(term1815354, term1815354.getClass(), "templateTypeName", null);
        setField(term1815354, term1815354.getClass(), "className", null);
        setField(term1815354, term1815354.getClass(), "properties", null);
        setField(term1815354, term1815354.getClass(), "implicitPrototype", null);
        setBooleanField(term1815354, term1815354.getClass(), "nativeType", false);
        setBooleanField(term1815354, term1815354.getClass(), "visited", false);
        setField(term1815354, term1815354.getClass(), "docInfo", null);
        setBooleanField(term1815354, term1815354.getClass(), "unknown", false);
        setBooleanField(term1815354, term1815354.getClass(), "resolved", false);
        setField(term1815354, term1815354.getClass(), "resolveResult", null);
        setField(term1815354, term1815354.getClass(), "registry", null);
        Class<? extends Object> term1815966 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1815965 = ((Class) term1815966).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1815965).setAccessible(true);
        Object enum3386 = ((Field) term1815965).get((Object) null);
        term1815359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1815360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1815359, term1815359.getClass(), "this$0", null);
        setField(term1815360, term1815360.getClass(), "parameters", null);
        setField(term1815360, term1815360.getClass(), "returnType", null);
        setBooleanField(term1815360, term1815360.getClass(), "resolved", false);
        setField(term1815360, term1815360.getClass(), "resolveResult", null);
        setField(term1815360, term1815360.getClass(), "registry", null);
        setField(term1815359, term1815359.getClass(), "call", term1815360);
        setField(term1815359, term1815359.getClass(), "prototype", null);
        setField(term1815359, term1815359.getClass(), "kind", enum3386);
        setField(term1815359, term1815359.getClass(), "typeOfThis", null);
        setField(term1815359, term1815359.getClass(), "source", null);
        setField(term1815359, term1815359.getClass(), "implementedInterfaces", null);
        setField(term1815359, term1815359.getClass(), "subTypes", null);
        setField(term1815359, term1815359.getClass(), "templateTypeName", null);
        setField(term1815359, term1815359.getClass(), "className", null);
        setField(term1815359, term1815359.getClass(), "properties", null);
        setField(term1815359, term1815359.getClass(), "implicitPrototype", null);
        setBooleanField(term1815359, term1815359.getClass(), "nativeType", false);
        setBooleanField(term1815359, term1815359.getClass(), "visited", false);
        setField(term1815359, term1815359.getClass(), "docInfo", null);
        setBooleanField(term1815359, term1815359.getClass(), "unknown", false);
        setBooleanField(term1815359, term1815359.getClass(), "resolved", false);
        setField(term1815359, term1815359.getClass(), "resolveResult", null);
        setField(term1815359, term1815359.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1814780;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1814430, args);
        assertTrue(recursiveEquals(term1814430, term1815354));
        assertTrue(recursiveEquals(term1814780, term1815359));
        assertTrue(recursiveEquals(retValue, true));
    }

};


