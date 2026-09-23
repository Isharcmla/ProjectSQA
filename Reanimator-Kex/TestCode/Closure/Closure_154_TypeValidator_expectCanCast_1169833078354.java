package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class TypeValidator_expectCanCast_1169833078354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132684;
     Object term132794;
     Object term133348;
     Object term134165;
     Object term134166;
     Object term134170;

    public TypeValidator_expectCanCast_1169833078354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132684 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term134175 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term134174 = ((Class) term134175).getDeclaredField((String) "ORDINARY");
        ((Field) term134174).setAccessible(true);
        Object enum39 = ((Field) term134174).get((Object) null);
        term132794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term132794, term132794.getClass(), "kind", enum39);
        Class<? extends Object> term134466 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term134465 = ((Class) term134466).getDeclaredField((String) "INTERFACE");
        ((Field) term134465).setAccessible(true);
        Object enum40 = ((Field) term134465).get((Object) null);
        term133348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term133348, term133348.getClass(), "unknown", false);
        setField(term133348, term133348.getClass(), "kind", enum40);
        term134165 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term134165, term134165.getClass(), "compiler", null);
        setField(term134165, term134165.getClass(), "typeRegistry", null);
        setField(term134165, term134165.getClass(), "allValueTypes", null);
        setBooleanField(term134165, term134165.getClass(), "shouldReport", false);
        setField(term134165, term134165.getClass(), "nullOrUndefined", null);
        setField(term134165, term134165.getClass(), "mismatches", null);
        Class<? extends Object> term134760 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term134759 = ((Class) term134760).getDeclaredField((String) "INTERFACE");
        ((Field) term134759).setAccessible(true);
        Object enum41 = ((Field) term134759).get((Object) null);
        term134166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term134166, term134166.getClass(), "call", null);
        setField(term134166, term134166.getClass(), "prototype", null);
        setField(term134166, term134166.getClass(), "kind", enum41);
        setField(term134166, term134166.getClass(), "typeOfThis", null);
        setField(term134166, term134166.getClass(), "source", null);
        setField(term134166, term134166.getClass(), "implementedInterfaces", null);
        setField(term134166, term134166.getClass(), "subTypes", null);
        setField(term134166, term134166.getClass(), "templateTypeName", null);
        setField(term134166, term134166.getClass(), "className", null);
        setField(term134166, term134166.getClass(), "properties", null);
        setBooleanField(term134166, term134166.getClass(), "nativeType", false);
        setField(term134166, term134166.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term134166, term134166.getClass(), "prettyPrint", false);
        setBooleanField(term134166, term134166.getClass(), "visited", false);
        setField(term134166, term134166.getClass(), "docInfo", null);
        setBooleanField(term134166, term134166.getClass(), "unknown", false);
        setBooleanField(term134166, term134166.getClass(), "resolved", false);
        setField(term134166, term134166.getClass(), "resolveResult", null);
        setField(term134166, term134166.getClass(), "registry", null);
        Class<? extends Object> term135054 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term135053 = ((Class) term135054).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term135053).setAccessible(true);
        Object enum42 = ((Field) term135053).get((Object) null);
        term134170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term134170, term134170.getClass(), "call", null);
        setField(term134170, term134170.getClass(), "prototype", null);
        setField(term134170, term134170.getClass(), "kind", enum42);
        setField(term134170, term134170.getClass(), "typeOfThis", null);
        setField(term134170, term134170.getClass(), "source", null);
        setField(term134170, term134170.getClass(), "implementedInterfaces", null);
        setField(term134170, term134170.getClass(), "subTypes", null);
        setField(term134170, term134170.getClass(), "templateTypeName", null);
        setField(term134170, term134170.getClass(), "className", null);
        setField(term134170, term134170.getClass(), "properties", null);
        setBooleanField(term134170, term134170.getClass(), "nativeType", false);
        setField(term134170, term134170.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term134170, term134170.getClass(), "prettyPrint", false);
        setBooleanField(term134170, term134170.getClass(), "visited", false);
        setField(term134170, term134170.getClass(), "docInfo", null);
        setBooleanField(term134170, term134170.getClass(), "unknown", false);
        setBooleanField(term134170, term134170.getClass(), "resolved", false);
        setField(term134170, term134170.getClass(), "resolveResult", null);
        setField(term134170, term134170.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term132794;
        args[3] = term133348;
        callMethod(klass, "expectCanCast", argTypes, term132684, args);
        assertTrue(recursiveEquals(term132684, term134165));
        assertTrue(recursiveEquals(term132794, null));
        assertTrue(recursiveEquals(term133348, null));
    }

};


