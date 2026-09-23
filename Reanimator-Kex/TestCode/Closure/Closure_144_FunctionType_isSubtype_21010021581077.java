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

public class FunctionType_isSubtype_21010021581077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1403282;
     Object term1403734;
     Object term1406568;
     Object term1406574;

    public FunctionType_isSubtype_21010021581077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1406581 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1406580 = ((Class) term1406581).getDeclaredField((String) "ORDINARY");
        ((Field) term1406580).setAccessible(true);
        Object enum2521 = ((Field) term1406580).get((Object) null);
        term1403282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1403530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1403624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1403282, term1403282.getClass(), "kind", enum2521);
        setBooleanField(term1403530, term1403530.getClass(), "unknown", false);
        setField(term1403282, term1403282.getClass(), "typeOfThis", term1403530);
        setField(term1403282, term1403282.getClass(), "call", term1403624);
        term1403734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1403908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1403734, term1403734.getClass(), "kind", enum2521);
        setField(term1403734, term1403734.getClass(), "typeOfThis", term1403908);
        setField(term1403734, term1403734.getClass(), "call", null);
        Class<? extends Object> term1406872 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1406871 = ((Class) term1406872).getDeclaredField((String) "ORDINARY");
        ((Field) term1406871).setAccessible(true);
        Object enum2522 = ((Field) term1406871).get((Object) null);
        term1406568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1406569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1406573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1406568, term1406568.getClass(), "this$0", null);
        setField(term1406569, term1406569.getClass(), "parameters", null);
        setField(term1406569, term1406569.getClass(), "returnType", null);
        setBooleanField(term1406569, term1406569.getClass(), "returnTypeInferred", false);
        setBooleanField(term1406569, term1406569.getClass(), "resolved", false);
        setField(term1406569, term1406569.getClass(), "resolveResult", null);
        setField(term1406569, term1406569.getClass(), "registry", null);
        setField(term1406568, term1406568.getClass(), "call", term1406569);
        setField(term1406568, term1406568.getClass(), "prototype", null);
        setField(term1406568, term1406568.getClass(), "kind", enum2522);
        setField(term1406573, term1406573.getClass(), "call", null);
        setField(term1406573, term1406573.getClass(), "prototype", null);
        setField(term1406573, term1406573.getClass(), "kind", null);
        setField(term1406573, term1406573.getClass(), "typeOfThis", null);
        setField(term1406573, term1406573.getClass(), "source", null);
        setField(term1406573, term1406573.getClass(), "implementedInterfaces", null);
        setField(term1406573, term1406573.getClass(), "subTypes", null);
        setField(term1406573, term1406573.getClass(), "templateTypeName", null);
        setField(term1406573, term1406573.getClass(), "className", null);
        setField(term1406573, term1406573.getClass(), "properties", null);
        setField(term1406573, term1406573.getClass(), "implicitPrototype", null);
        setBooleanField(term1406573, term1406573.getClass(), "nativeType", false);
        setBooleanField(term1406573, term1406573.getClass(), "prettyPrint", false);
        setBooleanField(term1406573, term1406573.getClass(), "visited", false);
        setField(term1406573, term1406573.getClass(), "docInfo", null);
        setBooleanField(term1406573, term1406573.getClass(), "unknown", false);
        setBooleanField(term1406573, term1406573.getClass(), "resolved", false);
        setField(term1406573, term1406573.getClass(), "resolveResult", null);
        setField(term1406573, term1406573.getClass(), "registry", null);
        setField(term1406568, term1406568.getClass(), "typeOfThis", term1406573);
        setField(term1406568, term1406568.getClass(), "source", null);
        setField(term1406568, term1406568.getClass(), "implementedInterfaces", null);
        setField(term1406568, term1406568.getClass(), "subTypes", null);
        setField(term1406568, term1406568.getClass(), "templateTypeName", null);
        setField(term1406568, term1406568.getClass(), "className", null);
        setField(term1406568, term1406568.getClass(), "properties", null);
        setField(term1406568, term1406568.getClass(), "implicitPrototype", null);
        setBooleanField(term1406568, term1406568.getClass(), "nativeType", false);
        setBooleanField(term1406568, term1406568.getClass(), "prettyPrint", false);
        setBooleanField(term1406568, term1406568.getClass(), "visited", false);
        setField(term1406568, term1406568.getClass(), "docInfo", null);
        setBooleanField(term1406568, term1406568.getClass(), "unknown", false);
        setBooleanField(term1406568, term1406568.getClass(), "resolved", false);
        setField(term1406568, term1406568.getClass(), "resolveResult", null);
        setField(term1406568, term1406568.getClass(), "registry", null);
        Class<? extends Object> term1407163 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1407162 = ((Class) term1407163).getDeclaredField((String) "ORDINARY");
        ((Field) term1407162).setAccessible(true);
        Object enum2523 = ((Field) term1407162).get((Object) null);
        term1406574 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1406578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1406574, term1406574.getClass(), "call", null);
        setField(term1406574, term1406574.getClass(), "prototype", null);
        setField(term1406574, term1406574.getClass(), "kind", enum2523);
        setField(term1406578, term1406578.getClass(), "leastSupertypeVisitor", null);
        setField(term1406578, term1406578.getClass(), "greatestSubtypeVisitor", null);
        setField(term1406578, term1406578.getClass(), "call", null);
        setField(term1406578, term1406578.getClass(), "prototype", null);
        setField(term1406578, term1406578.getClass(), "kind", null);
        setField(term1406578, term1406578.getClass(), "typeOfThis", null);
        setField(term1406578, term1406578.getClass(), "source", null);
        setField(term1406578, term1406578.getClass(), "implementedInterfaces", null);
        setField(term1406578, term1406578.getClass(), "subTypes", null);
        setField(term1406578, term1406578.getClass(), "templateTypeName", null);
        setField(term1406578, term1406578.getClass(), "className", null);
        setField(term1406578, term1406578.getClass(), "properties", null);
        setField(term1406578, term1406578.getClass(), "implicitPrototype", null);
        setBooleanField(term1406578, term1406578.getClass(), "nativeType", false);
        setBooleanField(term1406578, term1406578.getClass(), "prettyPrint", false);
        setBooleanField(term1406578, term1406578.getClass(), "visited", false);
        setField(term1406578, term1406578.getClass(), "docInfo", null);
        setBooleanField(term1406578, term1406578.getClass(), "unknown", false);
        setBooleanField(term1406578, term1406578.getClass(), "resolved", false);
        setField(term1406578, term1406578.getClass(), "resolveResult", null);
        setField(term1406578, term1406578.getClass(), "registry", null);
        setField(term1406574, term1406574.getClass(), "typeOfThis", term1406578);
        setField(term1406574, term1406574.getClass(), "source", null);
        setField(term1406574, term1406574.getClass(), "implementedInterfaces", null);
        setField(term1406574, term1406574.getClass(), "subTypes", null);
        setField(term1406574, term1406574.getClass(), "templateTypeName", null);
        setField(term1406574, term1406574.getClass(), "className", null);
        setField(term1406574, term1406574.getClass(), "properties", null);
        setField(term1406574, term1406574.getClass(), "implicitPrototype", null);
        setBooleanField(term1406574, term1406574.getClass(), "nativeType", false);
        setBooleanField(term1406574, term1406574.getClass(), "prettyPrint", false);
        setBooleanField(term1406574, term1406574.getClass(), "visited", false);
        setField(term1406574, term1406574.getClass(), "docInfo", null);
        setBooleanField(term1406574, term1406574.getClass(), "unknown", false);
        setBooleanField(term1406574, term1406574.getClass(), "resolved", false);
        setField(term1406574, term1406574.getClass(), "resolveResult", null);
        setField(term1406574, term1406574.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1403734;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1403282, args);
        assertTrue(recursiveEquals(term1403282, term1406568));
        assertTrue(recursiveEquals(term1403734, term1406574));
        assertTrue(recursiveEquals(retValue, false));
    }

};


