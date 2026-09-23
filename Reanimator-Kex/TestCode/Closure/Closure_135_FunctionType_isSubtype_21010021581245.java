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

public class FunctionType_isSubtype_21010021581245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1542118;
     Object term1542374;
     Object term1542829;
     Object term1542833;

    public FunctionType_isSubtype_21010021581245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1542839 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1542838 = ((Class) term1542839).getDeclaredField((String) "INTERFACE");
        ((Field) term1542838).setAccessible(true);
        Object enum2879 = ((Field) term1542838).get((Object) null);
        term1542118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1542118, term1542118.getClass(), "kind", enum2879);
        term1542374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1542374, term1542374.getClass(), "kind", enum2879);
        Class<? extends Object> term1543133 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1543132 = ((Class) term1543133).getDeclaredField((String) "INTERFACE");
        ((Field) term1543132).setAccessible(true);
        Object enum2880 = ((Field) term1543132).get((Object) null);
        term1542829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1542829, term1542829.getClass(), "this$0", null);
        setField(term1542829, term1542829.getClass(), "call", null);
        setField(term1542829, term1542829.getClass(), "prototype", null);
        setField(term1542829, term1542829.getClass(), "kind", enum2880);
        setField(term1542829, term1542829.getClass(), "typeOfThis", null);
        setField(term1542829, term1542829.getClass(), "source", null);
        setField(term1542829, term1542829.getClass(), "implementedInterfaces", null);
        setField(term1542829, term1542829.getClass(), "subTypes", null);
        setField(term1542829, term1542829.getClass(), "templateTypeName", null);
        setField(term1542829, term1542829.getClass(), "className", null);
        setField(term1542829, term1542829.getClass(), "properties", null);
        setField(term1542829, term1542829.getClass(), "implicitPrototype", null);
        setBooleanField(term1542829, term1542829.getClass(), "nativeType", false);
        setBooleanField(term1542829, term1542829.getClass(), "visited", false);
        setField(term1542829, term1542829.getClass(), "docInfo", null);
        setBooleanField(term1542829, term1542829.getClass(), "unknown", false);
        setBooleanField(term1542829, term1542829.getClass(), "resolved", false);
        setField(term1542829, term1542829.getClass(), "resolveResult", null);
        setField(term1542829, term1542829.getClass(), "registry", null);
        Class<? extends Object> term1543427 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1543426 = ((Class) term1543427).getDeclaredField((String) "INTERFACE");
        ((Field) term1543426).setAccessible(true);
        Object enum2881 = ((Field) term1543426).get((Object) null);
        term1542833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1542833, term1542833.getClass(), "this$0", null);
        setField(term1542833, term1542833.getClass(), "call", null);
        setField(term1542833, term1542833.getClass(), "prototype", null);
        setField(term1542833, term1542833.getClass(), "kind", enum2881);
        setField(term1542833, term1542833.getClass(), "typeOfThis", null);
        setField(term1542833, term1542833.getClass(), "source", null);
        setField(term1542833, term1542833.getClass(), "implementedInterfaces", null);
        setField(term1542833, term1542833.getClass(), "subTypes", null);
        setField(term1542833, term1542833.getClass(), "templateTypeName", null);
        setField(term1542833, term1542833.getClass(), "className", null);
        setField(term1542833, term1542833.getClass(), "properties", null);
        setField(term1542833, term1542833.getClass(), "implicitPrototype", null);
        setBooleanField(term1542833, term1542833.getClass(), "nativeType", false);
        setBooleanField(term1542833, term1542833.getClass(), "visited", false);
        setField(term1542833, term1542833.getClass(), "docInfo", null);
        setBooleanField(term1542833, term1542833.getClass(), "unknown", false);
        setBooleanField(term1542833, term1542833.getClass(), "resolved", false);
        setField(term1542833, term1542833.getClass(), "resolveResult", null);
        setField(term1542833, term1542833.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1542374;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1542118, args);
        assertTrue(recursiveEquals(term1542118, term1542829));
        assertTrue(recursiveEquals(term1542374, term1542833));
        assertTrue(recursiveEquals(retValue, true));
    }

};


