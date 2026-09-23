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

public class FunctionType_isSubtype_2101002158364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257355;
     Object term257909;
     Object term259492;
     Object term259496;

    public FunctionType_isSubtype_2101002158364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term259502 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term259501 = ((Class) term259502).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term259501).setAccessible(true);
        Object enum478 = ((Field) term259501).get((Object) null);
        term257355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term257355, term257355.getClass(), "kind", enum478);
        Class<? extends Object> term259802 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term259801 = ((Class) term259802).getDeclaredField((String) "INTERFACE");
        ((Field) term259801).setAccessible(true);
        Object enum479 = ((Field) term259801).get((Object) null);
        term257909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term257909, term257909.getClass(), "kind", enum479);
        Class<? extends Object> term260096 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term260095 = ((Class) term260096).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term260095).setAccessible(true);
        Object enum480 = ((Field) term260095).get((Object) null);
        term259492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term259492, term259492.getClass(), "call", null);
        setField(term259492, term259492.getClass(), "prototype", null);
        setField(term259492, term259492.getClass(), "kind", enum480);
        setField(term259492, term259492.getClass(), "typeOfThis", null);
        setField(term259492, term259492.getClass(), "source", null);
        setField(term259492, term259492.getClass(), "implementedInterfaces", null);
        setField(term259492, term259492.getClass(), "subTypes", null);
        setField(term259492, term259492.getClass(), "templateTypeName", null);
        setField(term259492, term259492.getClass(), "className", null);
        setField(term259492, term259492.getClass(), "properties", null);
        setField(term259492, term259492.getClass(), "implicitPrototype", null);
        setBooleanField(term259492, term259492.getClass(), "nativeType", false);
        setBooleanField(term259492, term259492.getClass(), "prettyPrint", false);
        setBooleanField(term259492, term259492.getClass(), "visited", false);
        setField(term259492, term259492.getClass(), "docInfo", null);
        setBooleanField(term259492, term259492.getClass(), "unknown", false);
        setBooleanField(term259492, term259492.getClass(), "resolved", false);
        setField(term259492, term259492.getClass(), "resolveResult", null);
        setField(term259492, term259492.getClass(), "registry", null);
        Class<? extends Object> term260396 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term260395 = ((Class) term260396).getDeclaredField((String) "INTERFACE");
        ((Field) term260395).setAccessible(true);
        Object enum481 = ((Field) term260395).get((Object) null);
        term259496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term259496, term259496.getClass(), "call", null);
        setField(term259496, term259496.getClass(), "prototype", null);
        setField(term259496, term259496.getClass(), "kind", enum481);
        setField(term259496, term259496.getClass(), "typeOfThis", null);
        setField(term259496, term259496.getClass(), "source", null);
        setField(term259496, term259496.getClass(), "implementedInterfaces", null);
        setField(term259496, term259496.getClass(), "subTypes", null);
        setField(term259496, term259496.getClass(), "templateTypeName", null);
        setField(term259496, term259496.getClass(), "className", null);
        setField(term259496, term259496.getClass(), "properties", null);
        setField(term259496, term259496.getClass(), "implicitPrototype", null);
        setBooleanField(term259496, term259496.getClass(), "nativeType", false);
        setBooleanField(term259496, term259496.getClass(), "prettyPrint", false);
        setBooleanField(term259496, term259496.getClass(), "visited", false);
        setField(term259496, term259496.getClass(), "docInfo", null);
        setBooleanField(term259496, term259496.getClass(), "unknown", false);
        setBooleanField(term259496, term259496.getClass(), "resolved", false);
        setField(term259496, term259496.getClass(), "resolveResult", null);
        setField(term259496, term259496.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term257909;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term257355, args);
        assertTrue(recursiveEquals(term257355, term259492));
        assertTrue(recursiveEquals(term257909, term259496));
        assertTrue(recursiveEquals(retValue, true));
    }

};


