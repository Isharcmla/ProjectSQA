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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class FunctionType_setPrototypeBasedOn_10126661301403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1809755;
     Object term1810121;
     Object term1810601;
     Object term1810609;

    public FunctionType_setPrototypeBasedOn_10126661301403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1810611 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1810610 = ((Class) term1810611).getDeclaredField((String) "INTERFACE");
        ((Field) term1810610).setAccessible(true);
        Object enum3375 = ((Field) term1810610).get((Object) null);
        term1809755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1809859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1809755, term1809755.getClass(), "prototype", null);
        setField(term1809755, term1809755.getClass(), "registry", term1809859);
        setBooleanField(term1809755, term1809755.getClass(), "nativeType", false);
        setField(term1809755, term1809755.getClass(), "kind", enum3375);
        term1810121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        HashMap term1810603 = new HashMap();
        Class<? extends Object> term1810905 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1810904 = ((Class) term1810905).getDeclaredField((String) "INTERFACE");
        ((Field) term1810904).setAccessible(true);
        Object enum3376 = ((Field) term1810904).get((Object) null);
        term1810601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1810602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term1810604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term1810605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1810601, term1810601.getClass(), "call", null);
        setField(term1810602, term1810602.getClass(), "ownerFunction", term1810601);
        setField(term1810602, term1810602.getClass(), "className", null);
        setField(term1810602, term1810602.getClass(), "properties", term1810603);
        setField(term1810604, term1810604.getClass(), "className", null);
        setField(term1810604, term1810604.getClass(), "properties", null);
        setField(term1810604, term1810604.getClass(), "implicitPrototype", null);
        setBooleanField(term1810604, term1810604.getClass(), "nativeType", false);
        setBooleanField(term1810604, term1810604.getClass(), "visited", false);
        setField(term1810604, term1810604.getClass(), "docInfo", null);
        setBooleanField(term1810604, term1810604.getClass(), "unknown", false);
        setBooleanField(term1810604, term1810604.getClass(), "resolved", false);
        setField(term1810604, term1810604.getClass(), "resolveResult", null);
        setField(term1810604, term1810604.getClass(), "registry", null);
        setField(term1810602, term1810602.getClass(), "implicitPrototype", term1810604);
        setBooleanField(term1810602, term1810602.getClass(), "nativeType", false);
        setBooleanField(term1810602, term1810602.getClass(), "visited", false);
        setField(term1810602, term1810602.getClass(), "docInfo", null);
        setBooleanField(term1810602, term1810602.getClass(), "unknown", true);
        setBooleanField(term1810602, term1810602.getClass(), "resolved", false);
        setField(term1810602, term1810602.getClass(), "resolveResult", null);
        setField(term1810605, term1810605.getClass(), "reporter", null);
        setField(term1810605, term1810605.getClass(), "nativeTypes", null);
        setField(term1810605, term1810605.getClass(), "namesToTypes", null);
        setField(term1810605, term1810605.getClass(), "namespaces", null);
        setField(term1810605, term1810605.getClass(), "enumTypeNames", null);
        setField(term1810605, term1810605.getClass(), "forwardDeclaredTypes", null);
        setField(term1810605, term1810605.getClass(), "typesIndexedByProperty", null);
        setField(term1810605, term1810605.getClass(), "greatestSubtypeByProperty", null);
        setField(term1810605, term1810605.getClass(), "interfaceToImplementors", null);
        setField(term1810605, term1810605.getClass(), "unresolvedNamedTypes", null);
        setField(term1810605, term1810605.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1810605, term1810605.getClass(), "lastGeneration", false);
        setField(term1810605, term1810605.getClass(), "templateTypeName", null);
        setField(term1810605, term1810605.getClass(), "templateType", null);
        setField(term1810602, term1810602.getClass(), "registry", term1810605);
        setField(term1810601, term1810601.getClass(), "prototype", term1810602);
        setField(term1810601, term1810601.getClass(), "kind", enum3376);
        setField(term1810601, term1810601.getClass(), "typeOfThis", null);
        setField(term1810601, term1810601.getClass(), "source", null);
        setField(term1810601, term1810601.getClass(), "implementedInterfaces", null);
        setField(term1810601, term1810601.getClass(), "subTypes", null);
        setField(term1810601, term1810601.getClass(), "templateTypeName", null);
        setField(term1810601, term1810601.getClass(), "className", null);
        setField(term1810601, term1810601.getClass(), "properties", null);
        setField(term1810601, term1810601.getClass(), "implicitPrototype", null);
        setBooleanField(term1810601, term1810601.getClass(), "nativeType", false);
        setBooleanField(term1810601, term1810601.getClass(), "visited", false);
        setField(term1810601, term1810601.getClass(), "docInfo", null);
        setBooleanField(term1810601, term1810601.getClass(), "unknown", false);
        setBooleanField(term1810601, term1810601.getClass(), "resolved", false);
        setField(term1810601, term1810601.getClass(), "resolveResult", null);
        setField(term1810601, term1810601.getClass(), "registry", term1810605);
        term1810609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term1810609, term1810609.getClass(), "className", null);
        setField(term1810609, term1810609.getClass(), "properties", null);
        setField(term1810609, term1810609.getClass(), "implicitPrototype", null);
        setBooleanField(term1810609, term1810609.getClass(), "nativeType", false);
        setBooleanField(term1810609, term1810609.getClass(), "visited", false);
        setField(term1810609, term1810609.getClass(), "docInfo", null);
        setBooleanField(term1810609, term1810609.getClass(), "unknown", false);
        setBooleanField(term1810609, term1810609.getClass(), "resolved", false);
        setField(term1810609, term1810609.getClass(), "resolveResult", null);
        setField(term1810609, term1810609.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term1810121;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term1809755, args);
        assertTrue(recursiveEquals(term1809755, term1810601));
        assertTrue(recursiveEquals(term1810121, term1810609));
    }

};


