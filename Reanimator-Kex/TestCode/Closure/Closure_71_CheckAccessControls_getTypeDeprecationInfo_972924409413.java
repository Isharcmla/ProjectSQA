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

public class CheckAccessControls_getTypeDeprecationInfo_972924409413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206658;
     Object term207457;

    public CheckAccessControls_getTypeDeprecationInfo_972924409413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term206768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term206878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term206658, term206658.getClass(), "docInfo", null);
        setField(term206768, term206768.getClass(), "docInfo", null);
        setField(term206768, term206768.getClass(), "implicitPrototypeFallback", term206878);
        setField(term206658, term206658.getClass(), "implicitPrototypeFallback", term206768);
        term207457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term207458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term207459 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term207457, term207457.getClass(), "call", null);
        setField(term207457, term207457.getClass(), "prototype", null);
        setField(term207457, term207457.getClass(), "kind", null);
        setField(term207457, term207457.getClass(), "typeOfThis", null);
        setField(term207457, term207457.getClass(), "source", null);
        setField(term207457, term207457.getClass(), "implementedInterfaces", null);
        setField(term207457, term207457.getClass(), "subTypes", null);
        setField(term207457, term207457.getClass(), "templateTypeName", null);
        setField(term207457, term207457.getClass(), "className", null);
        setField(term207457, term207457.getClass(), "properties", null);
        setBooleanField(term207457, term207457.getClass(), "nativeType", false);
        setField(term207458, term207458.getClass(), "call", null);
        setField(term207458, term207458.getClass(), "prototype", null);
        setField(term207458, term207458.getClass(), "kind", null);
        setField(term207458, term207458.getClass(), "typeOfThis", null);
        setField(term207458, term207458.getClass(), "source", null);
        setField(term207458, term207458.getClass(), "implementedInterfaces", null);
        setField(term207458, term207458.getClass(), "subTypes", null);
        setField(term207458, term207458.getClass(), "templateTypeName", null);
        setField(term207458, term207458.getClass(), "className", null);
        setField(term207458, term207458.getClass(), "properties", null);
        setBooleanField(term207458, term207458.getClass(), "nativeType", false);
        setField(term207459, term207459.getClass(), "call", null);
        setField(term207459, term207459.getClass(), "prototype", null);
        setField(term207459, term207459.getClass(), "kind", null);
        setField(term207459, term207459.getClass(), "typeOfThis", null);
        setField(term207459, term207459.getClass(), "source", null);
        setField(term207459, term207459.getClass(), "implementedInterfaces", null);
        setField(term207459, term207459.getClass(), "subTypes", null);
        setField(term207459, term207459.getClass(), "templateTypeName", null);
        setField(term207459, term207459.getClass(), "className", null);
        setField(term207459, term207459.getClass(), "properties", null);
        setBooleanField(term207459, term207459.getClass(), "nativeType", false);
        setField(term207459, term207459.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term207459, term207459.getClass(), "prettyPrint", false);
        setBooleanField(term207459, term207459.getClass(), "visited", false);
        setField(term207459, term207459.getClass(), "docInfo", null);
        setBooleanField(term207459, term207459.getClass(), "unknown", false);
        setBooleanField(term207459, term207459.getClass(), "resolved", false);
        setField(term207459, term207459.getClass(), "resolveResult", null);
        setField(term207459, term207459.getClass(), "registry", null);
        setField(term207458, term207458.getClass(), "implicitPrototypeFallback", term207459);
        setBooleanField(term207458, term207458.getClass(), "prettyPrint", false);
        setBooleanField(term207458, term207458.getClass(), "visited", false);
        setField(term207458, term207458.getClass(), "docInfo", null);
        setBooleanField(term207458, term207458.getClass(), "unknown", false);
        setBooleanField(term207458, term207458.getClass(), "resolved", false);
        setField(term207458, term207458.getClass(), "resolveResult", null);
        setField(term207458, term207458.getClass(), "registry", null);
        setField(term207457, term207457.getClass(), "implicitPrototypeFallback", term207458);
        setBooleanField(term207457, term207457.getClass(), "prettyPrint", false);
        setBooleanField(term207457, term207457.getClass(), "visited", false);
        setField(term207457, term207457.getClass(), "docInfo", null);
        setBooleanField(term207457, term207457.getClass(), "unknown", false);
        setBooleanField(term207457, term207457.getClass(), "resolved", false);
        setField(term207457, term207457.getClass(), "resolveResult", null);
        setField(term207457, term207457.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term206658;
        Object retValue = callMethod(klass, "getTypeDeprecationInfo", argTypes, null, args);
        assertTrue(recursiveEquals(term206658, term207457));
        assertTrue(recursiveEquals(retValue, null));
    }

};


