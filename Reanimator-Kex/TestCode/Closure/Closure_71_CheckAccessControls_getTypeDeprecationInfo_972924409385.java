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
import java.lang.Object;

public class CheckAccessControls_getTypeDeprecationInfo_972924409385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196922;
     Object term198251;

    public CheckAccessControls_getTypeDeprecationInfo_972924409385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term197030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term197140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term196922, term196922.getClass(), "docInfo", null);
        setField(term197030, term197030.getClass(), "docInfo", null);
        setField(term197030, term197030.getClass(), "implicitPrototypeFallback", term197140);
        setField(term196922, term196922.getClass(), "implicitPrototypeFallback", term197030);
        term198251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term198252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term198253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term198251, term198251.getClass(), "call", null);
        setField(term198251, term198251.getClass(), "prototype", null);
        setField(term198251, term198251.getClass(), "kind", null);
        setField(term198251, term198251.getClass(), "typeOfThis", null);
        setField(term198251, term198251.getClass(), "source", null);
        setField(term198251, term198251.getClass(), "implementedInterfaces", null);
        setField(term198251, term198251.getClass(), "subTypes", null);
        setField(term198251, term198251.getClass(), "templateTypeName", null);
        setField(term198251, term198251.getClass(), "className", null);
        setField(term198251, term198251.getClass(), "properties", null);
        setBooleanField(term198251, term198251.getClass(), "nativeType", false);
        setField(term198252, term198252.getClass(), "this$0", null);
        setField(term198252, term198252.getClass(), "call", null);
        setField(term198252, term198252.getClass(), "prototype", null);
        setField(term198252, term198252.getClass(), "kind", null);
        setField(term198252, term198252.getClass(), "typeOfThis", null);
        setField(term198252, term198252.getClass(), "source", null);
        setField(term198252, term198252.getClass(), "implementedInterfaces", null);
        setField(term198252, term198252.getClass(), "subTypes", null);
        setField(term198252, term198252.getClass(), "templateTypeName", null);
        setField(term198252, term198252.getClass(), "className", null);
        setField(term198252, term198252.getClass(), "properties", null);
        setBooleanField(term198252, term198252.getClass(), "nativeType", false);
        setField(term198253, term198253.getClass(), "call", null);
        setField(term198253, term198253.getClass(), "prototype", null);
        setField(term198253, term198253.getClass(), "kind", null);
        setField(term198253, term198253.getClass(), "typeOfThis", null);
        setField(term198253, term198253.getClass(), "source", null);
        setField(term198253, term198253.getClass(), "implementedInterfaces", null);
        setField(term198253, term198253.getClass(), "subTypes", null);
        setField(term198253, term198253.getClass(), "templateTypeName", null);
        setField(term198253, term198253.getClass(), "className", null);
        setField(term198253, term198253.getClass(), "properties", null);
        setBooleanField(term198253, term198253.getClass(), "nativeType", false);
        setField(term198253, term198253.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term198253, term198253.getClass(), "prettyPrint", false);
        setBooleanField(term198253, term198253.getClass(), "visited", false);
        setField(term198253, term198253.getClass(), "docInfo", null);
        setBooleanField(term198253, term198253.getClass(), "unknown", false);
        setBooleanField(term198253, term198253.getClass(), "resolved", false);
        setField(term198253, term198253.getClass(), "resolveResult", null);
        setField(term198253, term198253.getClass(), "registry", null);
        setField(term198252, term198252.getClass(), "implicitPrototypeFallback", term198253);
        setBooleanField(term198252, term198252.getClass(), "prettyPrint", false);
        setBooleanField(term198252, term198252.getClass(), "visited", false);
        setField(term198252, term198252.getClass(), "docInfo", null);
        setBooleanField(term198252, term198252.getClass(), "unknown", false);
        setBooleanField(term198252, term198252.getClass(), "resolved", false);
        setField(term198252, term198252.getClass(), "resolveResult", null);
        setField(term198252, term198252.getClass(), "registry", null);
        setField(term198251, term198251.getClass(), "implicitPrototypeFallback", term198252);
        setBooleanField(term198251, term198251.getClass(), "prettyPrint", false);
        setBooleanField(term198251, term198251.getClass(), "visited", false);
        setField(term198251, term198251.getClass(), "docInfo", null);
        setBooleanField(term198251, term198251.getClass(), "unknown", false);
        setBooleanField(term198251, term198251.getClass(), "resolved", false);
        setField(term198251, term198251.getClass(), "resolveResult", null);
        setField(term198251, term198251.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term196922;
        Object retValue = callMethod(klass, "getTypeDeprecationInfo", argTypes, null, args);
        assertTrue(recursiveEquals(term196922, term198251));
        assertTrue(recursiveEquals(retValue, null));
    }

};


