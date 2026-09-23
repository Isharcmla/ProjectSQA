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

public class FunctionType_isSubtype_21010021581090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1267265;
     Object term1267617;
     Object term1272452;
     Object term1272457;

    public FunctionType_isSubtype_21010021581090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1272463 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1272462 = ((Class) term1272463).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1272462).setAccessible(true);
        Object enum2369 = ((Field) term1272462).get((Object) null);
        term1267265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1267507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1267265, term1267265.getClass(), "kind", enum2369);
        setField(term1267265, term1267265.getClass(), "call", term1267507);
        Class<? extends Object> term1272763 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1272762 = ((Class) term1272763).getDeclaredField((String) "ORDINARY");
        ((Field) term1272762).setAccessible(true);
        Object enum2370 = ((Field) term1272762).get((Object) null);
        term1267617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1267617, term1267617.getClass(), "kind", enum2370);
        setField(term1267617, term1267617.getClass(), "call", null);
        Class<? extends Object> term1273054 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1273053 = ((Class) term1273054).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1273053).setAccessible(true);
        Object enum2371 = ((Field) term1273053).get((Object) null);
        term1272452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1272453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1272452, term1272452.getClass(), "this$0", null);
        setField(term1272453, term1272453.getClass(), "parameters", null);
        setField(term1272453, term1272453.getClass(), "returnType", null);
        setBooleanField(term1272453, term1272453.getClass(), "resolved", false);
        setField(term1272453, term1272453.getClass(), "resolveResult", null);
        setField(term1272453, term1272453.getClass(), "registry", null);
        setField(term1272452, term1272452.getClass(), "call", term1272453);
        setField(term1272452, term1272452.getClass(), "prototype", null);
        setField(term1272452, term1272452.getClass(), "kind", enum2371);
        setField(term1272452, term1272452.getClass(), "typeOfThis", null);
        setField(term1272452, term1272452.getClass(), "source", null);
        setField(term1272452, term1272452.getClass(), "implementedInterfaces", null);
        setField(term1272452, term1272452.getClass(), "subTypes", null);
        setField(term1272452, term1272452.getClass(), "templateTypeName", null);
        setField(term1272452, term1272452.getClass(), "className", null);
        setField(term1272452, term1272452.getClass(), "properties", null);
        setField(term1272452, term1272452.getClass(), "implicitPrototype", null);
        setBooleanField(term1272452, term1272452.getClass(), "nativeType", false);
        setBooleanField(term1272452, term1272452.getClass(), "visited", false);
        setField(term1272452, term1272452.getClass(), "docInfo", null);
        setBooleanField(term1272452, term1272452.getClass(), "unknown", false);
        setBooleanField(term1272452, term1272452.getClass(), "resolved", false);
        setField(term1272452, term1272452.getClass(), "resolveResult", null);
        setField(term1272452, term1272452.getClass(), "registry", null);
        Class<? extends Object> term1273354 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1273353 = ((Class) term1273354).getDeclaredField((String) "ORDINARY");
        ((Field) term1273353).setAccessible(true);
        Object enum2372 = ((Field) term1273353).get((Object) null);
        term1272457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1272457, term1272457.getClass(), "call", null);
        setField(term1272457, term1272457.getClass(), "prototype", null);
        setField(term1272457, term1272457.getClass(), "kind", enum2372);
        setField(term1272457, term1272457.getClass(), "typeOfThis", null);
        setField(term1272457, term1272457.getClass(), "source", null);
        setField(term1272457, term1272457.getClass(), "implementedInterfaces", null);
        setField(term1272457, term1272457.getClass(), "subTypes", null);
        setField(term1272457, term1272457.getClass(), "templateTypeName", null);
        setField(term1272457, term1272457.getClass(), "className", null);
        setField(term1272457, term1272457.getClass(), "properties", null);
        setField(term1272457, term1272457.getClass(), "implicitPrototype", null);
        setBooleanField(term1272457, term1272457.getClass(), "nativeType", false);
        setBooleanField(term1272457, term1272457.getClass(), "visited", false);
        setField(term1272457, term1272457.getClass(), "docInfo", null);
        setBooleanField(term1272457, term1272457.getClass(), "unknown", false);
        setBooleanField(term1272457, term1272457.getClass(), "resolved", false);
        setField(term1272457, term1272457.getClass(), "resolveResult", null);
        setField(term1272457, term1272457.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1267617;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1267265, args);
        assertTrue(recursiveEquals(term1267265, term1272452));
        assertTrue(recursiveEquals(term1267617, term1272457));
        assertTrue(recursiveEquals(retValue, false));
    }

};


