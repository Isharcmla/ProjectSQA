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

public class CheckAccessControls_getTypeDeprecationInfo_972924409313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99688;
     Object term100228;

    public CheckAccessControls_getTypeDeprecationInfo_972924409313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term99796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term99688, term99688.getClass(), "docInfo", null);
        setField(term99688, term99688.getClass(), "implicitPrototypeFallback", term99796);
        term100228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term100229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term100228, term100228.getClass(), "call", null);
        setField(term100228, term100228.getClass(), "prototype", null);
        setField(term100228, term100228.getClass(), "kind", null);
        setField(term100228, term100228.getClass(), "typeOfThis", null);
        setField(term100228, term100228.getClass(), "source", null);
        setField(term100228, term100228.getClass(), "implementedInterfaces", null);
        setField(term100228, term100228.getClass(), "subTypes", null);
        setField(term100228, term100228.getClass(), "templateTypeName", null);
        setField(term100228, term100228.getClass(), "className", null);
        setField(term100228, term100228.getClass(), "properties", null);
        setBooleanField(term100228, term100228.getClass(), "nativeType", false);
        setField(term100229, term100229.getClass(), "this$0", null);
        setField(term100229, term100229.getClass(), "call", null);
        setField(term100229, term100229.getClass(), "prototype", null);
        setField(term100229, term100229.getClass(), "kind", null);
        setField(term100229, term100229.getClass(), "typeOfThis", null);
        setField(term100229, term100229.getClass(), "source", null);
        setField(term100229, term100229.getClass(), "implementedInterfaces", null);
        setField(term100229, term100229.getClass(), "subTypes", null);
        setField(term100229, term100229.getClass(), "templateTypeName", null);
        setField(term100229, term100229.getClass(), "className", null);
        setField(term100229, term100229.getClass(), "properties", null);
        setBooleanField(term100229, term100229.getClass(), "nativeType", false);
        setField(term100229, term100229.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term100229, term100229.getClass(), "prettyPrint", false);
        setBooleanField(term100229, term100229.getClass(), "visited", false);
        setField(term100229, term100229.getClass(), "docInfo", null);
        setBooleanField(term100229, term100229.getClass(), "unknown", false);
        setBooleanField(term100229, term100229.getClass(), "resolved", false);
        setField(term100229, term100229.getClass(), "resolveResult", null);
        setField(term100229, term100229.getClass(), "registry", null);
        setField(term100228, term100228.getClass(), "implicitPrototypeFallback", term100229);
        setBooleanField(term100228, term100228.getClass(), "prettyPrint", false);
        setBooleanField(term100228, term100228.getClass(), "visited", false);
        setField(term100228, term100228.getClass(), "docInfo", null);
        setBooleanField(term100228, term100228.getClass(), "unknown", false);
        setBooleanField(term100228, term100228.getClass(), "resolved", false);
        setField(term100228, term100228.getClass(), "resolveResult", null);
        setField(term100228, term100228.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term99688;
        Object retValue = callMethod(klass, "getTypeDeprecationInfo", argTypes, null, args);
        assertTrue(recursiveEquals(term99688, term100228));
        assertTrue(recursiveEquals(retValue, null));
    }

};


