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

public class FunctionType_isSubtype_21010021581177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1580085;
     Object term1580537;
     Object term1581557;
     Object term1581563;

    public FunctionType_isSubtype_21010021581177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1581570 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1581569 = ((Class) term1581570).getDeclaredField((String) "ORDINARY");
        ((Field) term1581569).setAccessible(true);
        Object enum2822 = ((Field) term1581569).get((Object) null);
        term1580085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1580333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1580427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1580085, term1580085.getClass(), "kind", enum2822);
        setField(term1580085, term1580085.getClass(), "typeOfThis", term1580333);
        setField(term1580085, term1580085.getClass(), "call", term1580427);
        Class<? extends Object> term1581861 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1581860 = ((Class) term1581861).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1581860).setAccessible(true);
        Object enum2823 = ((Field) term1581860).get((Object) null);
        term1580537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1580773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1580537, term1580537.getClass(), "kind", enum2823);
        setField(term1580537, term1580537.getClass(), "typeOfThis", term1580773);
        setField(term1580537, term1580537.getClass(), "call", null);
        Class<? extends Object> term1582161 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1582160 = ((Class) term1582161).getDeclaredField((String) "ORDINARY");
        ((Field) term1582160).setAccessible(true);
        Object enum2824 = ((Field) term1582160).get((Object) null);
        term1581557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1581558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1581562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1581557, term1581557.getClass(), "this$0", null);
        setField(term1581558, term1581558.getClass(), "parameters", null);
        setField(term1581558, term1581558.getClass(), "returnType", null);
        setBooleanField(term1581558, term1581558.getClass(), "returnTypeInferred", false);
        setBooleanField(term1581558, term1581558.getClass(), "resolved", false);
        setField(term1581558, term1581558.getClass(), "resolveResult", null);
        setField(term1581558, term1581558.getClass(), "registry", null);
        setField(term1581557, term1581557.getClass(), "call", term1581558);
        setField(term1581557, term1581557.getClass(), "prototype", null);
        setField(term1581557, term1581557.getClass(), "kind", enum2824);
        setField(term1581562, term1581562.getClass(), "call", null);
        setField(term1581562, term1581562.getClass(), "prototype", null);
        setField(term1581562, term1581562.getClass(), "kind", null);
        setField(term1581562, term1581562.getClass(), "typeOfThis", null);
        setField(term1581562, term1581562.getClass(), "source", null);
        setField(term1581562, term1581562.getClass(), "implementedInterfaces", null);
        setField(term1581562, term1581562.getClass(), "subTypes", null);
        setField(term1581562, term1581562.getClass(), "templateTypeName", null);
        setField(term1581562, term1581562.getClass(), "className", null);
        setField(term1581562, term1581562.getClass(), "properties", null);
        setField(term1581562, term1581562.getClass(), "implicitPrototype", null);
        setBooleanField(term1581562, term1581562.getClass(), "nativeType", false);
        setBooleanField(term1581562, term1581562.getClass(), "prettyPrint", false);
        setBooleanField(term1581562, term1581562.getClass(), "visited", false);
        setField(term1581562, term1581562.getClass(), "docInfo", null);
        setBooleanField(term1581562, term1581562.getClass(), "unknown", false);
        setBooleanField(term1581562, term1581562.getClass(), "resolved", false);
        setField(term1581562, term1581562.getClass(), "resolveResult", null);
        setField(term1581562, term1581562.getClass(), "registry", null);
        setField(term1581557, term1581557.getClass(), "typeOfThis", term1581562);
        setField(term1581557, term1581557.getClass(), "source", null);
        setField(term1581557, term1581557.getClass(), "implementedInterfaces", null);
        setField(term1581557, term1581557.getClass(), "subTypes", null);
        setField(term1581557, term1581557.getClass(), "templateTypeName", null);
        setField(term1581557, term1581557.getClass(), "className", null);
        setField(term1581557, term1581557.getClass(), "properties", null);
        setField(term1581557, term1581557.getClass(), "implicitPrototype", null);
        setBooleanField(term1581557, term1581557.getClass(), "nativeType", false);
        setBooleanField(term1581557, term1581557.getClass(), "prettyPrint", false);
        setBooleanField(term1581557, term1581557.getClass(), "visited", false);
        setField(term1581557, term1581557.getClass(), "docInfo", null);
        setBooleanField(term1581557, term1581557.getClass(), "unknown", false);
        setBooleanField(term1581557, term1581557.getClass(), "resolved", false);
        setField(term1581557, term1581557.getClass(), "resolveResult", null);
        setField(term1581557, term1581557.getClass(), "registry", null);
        Class<? extends Object> term1582452 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1582451 = ((Class) term1582452).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1582451).setAccessible(true);
        Object enum2825 = ((Field) term1582451).get((Object) null);
        term1581563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1581567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1581563, term1581563.getClass(), "call", null);
        setField(term1581563, term1581563.getClass(), "prototype", null);
        setField(term1581563, term1581563.getClass(), "kind", enum2825);
        setField(term1581567, term1581567.getClass(), "leastSupertypeVisitor", null);
        setField(term1581567, term1581567.getClass(), "greatestSubtypeVisitor", null);
        setField(term1581567, term1581567.getClass(), "call", null);
        setField(term1581567, term1581567.getClass(), "prototype", null);
        setField(term1581567, term1581567.getClass(), "kind", null);
        setField(term1581567, term1581567.getClass(), "typeOfThis", null);
        setField(term1581567, term1581567.getClass(), "source", null);
        setField(term1581567, term1581567.getClass(), "implementedInterfaces", null);
        setField(term1581567, term1581567.getClass(), "subTypes", null);
        setField(term1581567, term1581567.getClass(), "templateTypeName", null);
        setField(term1581567, term1581567.getClass(), "className", null);
        setField(term1581567, term1581567.getClass(), "properties", null);
        setField(term1581567, term1581567.getClass(), "implicitPrototype", null);
        setBooleanField(term1581567, term1581567.getClass(), "nativeType", false);
        setBooleanField(term1581567, term1581567.getClass(), "prettyPrint", false);
        setBooleanField(term1581567, term1581567.getClass(), "visited", false);
        setField(term1581567, term1581567.getClass(), "docInfo", null);
        setBooleanField(term1581567, term1581567.getClass(), "unknown", false);
        setBooleanField(term1581567, term1581567.getClass(), "resolved", false);
        setField(term1581567, term1581567.getClass(), "resolveResult", null);
        setField(term1581567, term1581567.getClass(), "registry", null);
        setField(term1581563, term1581563.getClass(), "typeOfThis", term1581567);
        setField(term1581563, term1581563.getClass(), "source", null);
        setField(term1581563, term1581563.getClass(), "implementedInterfaces", null);
        setField(term1581563, term1581563.getClass(), "subTypes", null);
        setField(term1581563, term1581563.getClass(), "templateTypeName", null);
        setField(term1581563, term1581563.getClass(), "className", null);
        setField(term1581563, term1581563.getClass(), "properties", null);
        setField(term1581563, term1581563.getClass(), "implicitPrototype", null);
        setBooleanField(term1581563, term1581563.getClass(), "nativeType", false);
        setBooleanField(term1581563, term1581563.getClass(), "prettyPrint", false);
        setBooleanField(term1581563, term1581563.getClass(), "visited", false);
        setField(term1581563, term1581563.getClass(), "docInfo", null);
        setBooleanField(term1581563, term1581563.getClass(), "unknown", false);
        setBooleanField(term1581563, term1581563.getClass(), "resolved", false);
        setField(term1581563, term1581563.getClass(), "resolveResult", null);
        setField(term1581563, term1581563.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1580537;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1580085, args);
        assertTrue(recursiveEquals(term1580085, term1581557));
        assertTrue(recursiveEquals(term1580537, term1581563));
        assertTrue(recursiveEquals(retValue, false));
    }

};


