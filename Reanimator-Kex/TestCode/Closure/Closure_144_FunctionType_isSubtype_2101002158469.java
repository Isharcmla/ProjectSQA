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

public class FunctionType_isSubtype_2101002158469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393809;
     Object term394065;
     Object term394425;
     Object term394429;

    public FunctionType_isSubtype_2101002158469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term394432 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term394431 = ((Class) term394432).getDeclaredField((String) "INTERFACE");
        ((Field) term394431).setAccessible(true);
        Object enum713 = ((Field) term394431).get((Object) null);
        term393809 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term393809, term393809.getClass(), "kind", enum713);
        term394065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class<? extends Object> term394726 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term394725 = ((Class) term394726).getDeclaredField((String) "INTERFACE");
        ((Field) term394725).setAccessible(true);
        Object enum714 = ((Field) term394725).get((Object) null);
        term394425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term394425, term394425.getClass(), "call", null);
        setField(term394425, term394425.getClass(), "prototype", null);
        setField(term394425, term394425.getClass(), "kind", enum714);
        setField(term394425, term394425.getClass(), "typeOfThis", null);
        setField(term394425, term394425.getClass(), "source", null);
        setField(term394425, term394425.getClass(), "implementedInterfaces", null);
        setField(term394425, term394425.getClass(), "subTypes", null);
        setField(term394425, term394425.getClass(), "templateTypeName", null);
        setField(term394425, term394425.getClass(), "className", null);
        setField(term394425, term394425.getClass(), "properties", null);
        setField(term394425, term394425.getClass(), "implicitPrototype", null);
        setBooleanField(term394425, term394425.getClass(), "nativeType", false);
        setBooleanField(term394425, term394425.getClass(), "prettyPrint", false);
        setBooleanField(term394425, term394425.getClass(), "visited", false);
        setField(term394425, term394425.getClass(), "docInfo", null);
        setBooleanField(term394425, term394425.getClass(), "unknown", false);
        setBooleanField(term394425, term394425.getClass(), "resolved", false);
        setField(term394425, term394425.getClass(), "resolveResult", null);
        setField(term394425, term394425.getClass(), "registry", null);
        term394429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term394429, term394429.getClass(), "this$0", null);
        setField(term394429, term394429.getClass(), "call", null);
        setField(term394429, term394429.getClass(), "prototype", null);
        setField(term394429, term394429.getClass(), "kind", null);
        setField(term394429, term394429.getClass(), "typeOfThis", null);
        setField(term394429, term394429.getClass(), "source", null);
        setField(term394429, term394429.getClass(), "implementedInterfaces", null);
        setField(term394429, term394429.getClass(), "subTypes", null);
        setField(term394429, term394429.getClass(), "templateTypeName", null);
        setField(term394429, term394429.getClass(), "className", null);
        setField(term394429, term394429.getClass(), "properties", null);
        setField(term394429, term394429.getClass(), "implicitPrototype", null);
        setBooleanField(term394429, term394429.getClass(), "nativeType", false);
        setBooleanField(term394429, term394429.getClass(), "prettyPrint", false);
        setBooleanField(term394429, term394429.getClass(), "visited", false);
        setField(term394429, term394429.getClass(), "docInfo", null);
        setBooleanField(term394429, term394429.getClass(), "unknown", false);
        setBooleanField(term394429, term394429.getClass(), "resolved", false);
        setField(term394429, term394429.getClass(), "resolveResult", null);
        setField(term394429, term394429.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term394065;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term393809, args);
        assertTrue(recursiveEquals(term393809, term394425));
        assertTrue(recursiveEquals(term394065, term394429));
        assertTrue(recursiveEquals(retValue, false));
    }

};


