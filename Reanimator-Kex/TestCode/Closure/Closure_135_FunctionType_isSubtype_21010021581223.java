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

public class FunctionType_isSubtype_21010021581223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1504530;
     Object term1504786;
     Object term1505629;
     Object term1505633;

    public FunctionType_isSubtype_21010021581223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1505639 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1505638 = ((Class) term1505639).getDeclaredField((String) "INTERFACE");
        ((Field) term1505638).setAccessible(true);
        Object enum2810 = ((Field) term1505638).get((Object) null);
        term1504530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1504530, term1504530.getClass(), "kind", enum2810);
        Class<? extends Object> term1505933 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1505932 = ((Class) term1505933).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1505932).setAccessible(true);
        Object enum2811 = ((Field) term1505932).get((Object) null);
        term1504786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1504786, term1504786.getClass(), "kind", enum2811);
        Class<? extends Object> term1506233 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1506232 = ((Class) term1506233).getDeclaredField((String) "INTERFACE");
        ((Field) term1506232).setAccessible(true);
        Object enum2812 = ((Field) term1506232).get((Object) null);
        term1505629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1505629, term1505629.getClass(), "this$0", null);
        setField(term1505629, term1505629.getClass(), "call", null);
        setField(term1505629, term1505629.getClass(), "prototype", null);
        setField(term1505629, term1505629.getClass(), "kind", enum2812);
        setField(term1505629, term1505629.getClass(), "typeOfThis", null);
        setField(term1505629, term1505629.getClass(), "source", null);
        setField(term1505629, term1505629.getClass(), "implementedInterfaces", null);
        setField(term1505629, term1505629.getClass(), "subTypes", null);
        setField(term1505629, term1505629.getClass(), "templateTypeName", null);
        setField(term1505629, term1505629.getClass(), "className", null);
        setField(term1505629, term1505629.getClass(), "properties", null);
        setField(term1505629, term1505629.getClass(), "implicitPrototype", null);
        setBooleanField(term1505629, term1505629.getClass(), "nativeType", false);
        setBooleanField(term1505629, term1505629.getClass(), "visited", false);
        setField(term1505629, term1505629.getClass(), "docInfo", null);
        setBooleanField(term1505629, term1505629.getClass(), "unknown", false);
        setBooleanField(term1505629, term1505629.getClass(), "resolved", false);
        setField(term1505629, term1505629.getClass(), "resolveResult", null);
        setField(term1505629, term1505629.getClass(), "registry", null);
        Class<? extends Object> term1506527 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1506526 = ((Class) term1506527).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1506526).setAccessible(true);
        Object enum2813 = ((Field) term1506526).get((Object) null);
        term1505633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1505633, term1505633.getClass(), "this$0", null);
        setField(term1505633, term1505633.getClass(), "call", null);
        setField(term1505633, term1505633.getClass(), "prototype", null);
        setField(term1505633, term1505633.getClass(), "kind", enum2813);
        setField(term1505633, term1505633.getClass(), "typeOfThis", null);
        setField(term1505633, term1505633.getClass(), "source", null);
        setField(term1505633, term1505633.getClass(), "implementedInterfaces", null);
        setField(term1505633, term1505633.getClass(), "subTypes", null);
        setField(term1505633, term1505633.getClass(), "templateTypeName", null);
        setField(term1505633, term1505633.getClass(), "className", null);
        setField(term1505633, term1505633.getClass(), "properties", null);
        setField(term1505633, term1505633.getClass(), "implicitPrototype", null);
        setBooleanField(term1505633, term1505633.getClass(), "nativeType", false);
        setBooleanField(term1505633, term1505633.getClass(), "visited", false);
        setField(term1505633, term1505633.getClass(), "docInfo", null);
        setBooleanField(term1505633, term1505633.getClass(), "unknown", false);
        setBooleanField(term1505633, term1505633.getClass(), "resolved", false);
        setField(term1505633, term1505633.getClass(), "resolveResult", null);
        setField(term1505633, term1505633.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1504786;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1504530, args);
        assertTrue(recursiveEquals(term1504530, term1505629));
        assertTrue(recursiveEquals(term1504786, term1505633));
        assertTrue(recursiveEquals(retValue, false));
    }

};


