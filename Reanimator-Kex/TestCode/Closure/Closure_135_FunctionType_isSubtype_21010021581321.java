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

public class FunctionType_isSubtype_21010021581321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1670327;
     Object term1670925;
     Object term1672420;
     Object term1672429;

    public FunctionType_isSubtype_21010021581321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1672437 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1672436 = ((Class) term1672437).getDeclaredField((String) "ORDINARY");
        ((Field) term1672436).setAccessible(true);
        Object enum3119 = ((Field) term1672436).get((Object) null);
        Class<? extends Object> term1672728 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1672727 = ((Class) term1672728).getDeclaredField((String) "INTERFACE");
        ((Field) term1672727).setAccessible(true);
        Object enum3120 = ((Field) term1672727).get((Object) null);
        term1670327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1670575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1670817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1670327, term1670327.getClass(), "kind", enum3119);
        setField(term1670575, term1670575.getClass(), "kind", enum3120);
        setField(term1670327, term1670327.getClass(), "typeOfThis", term1670575);
        setField(term1670327, term1670327.getClass(), "call", term1670817);
        Class<? extends Object> term1673022 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1673021 = ((Class) term1673022).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1673021).setAccessible(true);
        Object enum3121 = ((Field) term1673021).get((Object) null);
        term1670925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1671181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1671275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1670925, term1670925.getClass(), "kind", enum3121);
        setField(term1671181, term1671181.getClass(), "kind", enum3121);
        setField(term1670925, term1670925.getClass(), "typeOfThis", term1671181);
        setField(term1670925, term1670925.getClass(), "call", term1671275);
        Class<? extends Object> term1673322 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1673321 = ((Class) term1673322).getDeclaredField((String) "ORDINARY");
        ((Field) term1673321).setAccessible(true);
        Object enum3122 = ((Field) term1673321).get((Object) null);
        Class<? extends Object> term1673613 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1673612 = ((Class) term1673613).getDeclaredField((String) "INTERFACE");
        ((Field) term1673612).setAccessible(true);
        Object enum3123 = ((Field) term1673612).get((Object) null);
        term1672420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1672421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1672425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1672420, term1672420.getClass(), "this$0", null);
        setField(term1672421, term1672421.getClass(), "parameters", null);
        setField(term1672421, term1672421.getClass(), "returnType", null);
        setBooleanField(term1672421, term1672421.getClass(), "resolved", false);
        setField(term1672421, term1672421.getClass(), "resolveResult", null);
        setField(term1672421, term1672421.getClass(), "registry", null);
        setField(term1672420, term1672420.getClass(), "call", term1672421);
        setField(term1672420, term1672420.getClass(), "prototype", null);
        setField(term1672420, term1672420.getClass(), "kind", enum3122);
        setField(term1672425, term1672425.getClass(), "call", null);
        setField(term1672425, term1672425.getClass(), "prototype", null);
        setField(term1672425, term1672425.getClass(), "kind", enum3123);
        setField(term1672425, term1672425.getClass(), "typeOfThis", null);
        setField(term1672425, term1672425.getClass(), "source", null);
        setField(term1672425, term1672425.getClass(), "implementedInterfaces", null);
        setField(term1672425, term1672425.getClass(), "subTypes", null);
        setField(term1672425, term1672425.getClass(), "templateTypeName", null);
        setField(term1672425, term1672425.getClass(), "className", null);
        setField(term1672425, term1672425.getClass(), "properties", null);
        setField(term1672425, term1672425.getClass(), "implicitPrototype", null);
        setBooleanField(term1672425, term1672425.getClass(), "nativeType", false);
        setBooleanField(term1672425, term1672425.getClass(), "visited", false);
        setField(term1672425, term1672425.getClass(), "docInfo", null);
        setBooleanField(term1672425, term1672425.getClass(), "unknown", false);
        setBooleanField(term1672425, term1672425.getClass(), "resolved", false);
        setField(term1672425, term1672425.getClass(), "resolveResult", null);
        setField(term1672425, term1672425.getClass(), "registry", null);
        setField(term1672420, term1672420.getClass(), "typeOfThis", term1672425);
        setField(term1672420, term1672420.getClass(), "source", null);
        setField(term1672420, term1672420.getClass(), "implementedInterfaces", null);
        setField(term1672420, term1672420.getClass(), "subTypes", null);
        setField(term1672420, term1672420.getClass(), "templateTypeName", null);
        setField(term1672420, term1672420.getClass(), "className", null);
        setField(term1672420, term1672420.getClass(), "properties", null);
        setField(term1672420, term1672420.getClass(), "implicitPrototype", null);
        setBooleanField(term1672420, term1672420.getClass(), "nativeType", false);
        setBooleanField(term1672420, term1672420.getClass(), "visited", false);
        setField(term1672420, term1672420.getClass(), "docInfo", null);
        setBooleanField(term1672420, term1672420.getClass(), "unknown", false);
        setBooleanField(term1672420, term1672420.getClass(), "resolved", false);
        setField(term1672420, term1672420.getClass(), "resolveResult", null);
        setField(term1672420, term1672420.getClass(), "registry", null);
        Class<? extends Object> term1673907 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1673906 = ((Class) term1673907).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1673906).setAccessible(true);
        Object enum3124 = ((Field) term1673906).get((Object) null);
        term1672429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1672430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1672434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1672429, term1672429.getClass(), "this$0", null);
        setField(term1672430, term1672430.getClass(), "parameters", null);
        setField(term1672430, term1672430.getClass(), "returnType", null);
        setBooleanField(term1672430, term1672430.getClass(), "resolved", false);
        setField(term1672430, term1672430.getClass(), "resolveResult", null);
        setField(term1672430, term1672430.getClass(), "registry", null);
        setField(term1672429, term1672429.getClass(), "call", term1672430);
        setField(term1672429, term1672429.getClass(), "prototype", null);
        setField(term1672429, term1672429.getClass(), "kind", enum3124);
        setField(term1672434, term1672434.getClass(), "this$0", null);
        setField(term1672434, term1672434.getClass(), "call", null);
        setField(term1672434, term1672434.getClass(), "prototype", null);
        setField(term1672434, term1672434.getClass(), "kind", enum3124);
        setField(term1672434, term1672434.getClass(), "typeOfThis", null);
        setField(term1672434, term1672434.getClass(), "source", null);
        setField(term1672434, term1672434.getClass(), "implementedInterfaces", null);
        setField(term1672434, term1672434.getClass(), "subTypes", null);
        setField(term1672434, term1672434.getClass(), "templateTypeName", null);
        setField(term1672434, term1672434.getClass(), "className", null);
        setField(term1672434, term1672434.getClass(), "properties", null);
        setField(term1672434, term1672434.getClass(), "implicitPrototype", null);
        setBooleanField(term1672434, term1672434.getClass(), "nativeType", false);
        setBooleanField(term1672434, term1672434.getClass(), "visited", false);
        setField(term1672434, term1672434.getClass(), "docInfo", null);
        setBooleanField(term1672434, term1672434.getClass(), "unknown", false);
        setBooleanField(term1672434, term1672434.getClass(), "resolved", false);
        setField(term1672434, term1672434.getClass(), "resolveResult", null);
        setField(term1672434, term1672434.getClass(), "registry", null);
        setField(term1672429, term1672429.getClass(), "typeOfThis", term1672434);
        setField(term1672429, term1672429.getClass(), "source", null);
        setField(term1672429, term1672429.getClass(), "implementedInterfaces", null);
        setField(term1672429, term1672429.getClass(), "subTypes", null);
        setField(term1672429, term1672429.getClass(), "templateTypeName", null);
        setField(term1672429, term1672429.getClass(), "className", null);
        setField(term1672429, term1672429.getClass(), "properties", null);
        setField(term1672429, term1672429.getClass(), "implicitPrototype", null);
        setBooleanField(term1672429, term1672429.getClass(), "nativeType", false);
        setBooleanField(term1672429, term1672429.getClass(), "visited", false);
        setField(term1672429, term1672429.getClass(), "docInfo", null);
        setBooleanField(term1672429, term1672429.getClass(), "unknown", false);
        setBooleanField(term1672429, term1672429.getClass(), "resolved", false);
        setField(term1672429, term1672429.getClass(), "resolveResult", null);
        setField(term1672429, term1672429.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1670925;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1670327, args);
        assertTrue(recursiveEquals(term1670327, term1672420));
        assertTrue(recursiveEquals(term1670925, term1672429));
        assertTrue(recursiveEquals(retValue, true));
    }

};


