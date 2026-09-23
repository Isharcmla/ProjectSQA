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

public class CheckAccessControls_getTypeDeprecationInfo_972924409410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206199;
     Object term206482;

    public CheckAccessControls_getTypeDeprecationInfo_972924409410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term206303 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term206199, term206199.getClass(), "docInfo", null);
        setField(term206199, term206199.getClass(), "implicitPrototypeFallback", term206303);
        term206482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term206483 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term206482, term206482.getClass(), "call", null);
        setField(term206482, term206482.getClass(), "prototype", null);
        setField(term206482, term206482.getClass(), "kind", null);
        setField(term206482, term206482.getClass(), "typeOfThis", null);
        setField(term206482, term206482.getClass(), "source", null);
        setField(term206482, term206482.getClass(), "implementedInterfaces", null);
        setField(term206482, term206482.getClass(), "subTypes", null);
        setField(term206482, term206482.getClass(), "templateTypeName", null);
        setField(term206482, term206482.getClass(), "className", null);
        setField(term206482, term206482.getClass(), "properties", null);
        setBooleanField(term206482, term206482.getClass(), "nativeType", false);
        setField(term206483, term206483.getClass(), "call", null);
        setField(term206483, term206483.getClass(), "prototype", null);
        setField(term206483, term206483.getClass(), "kind", null);
        setField(term206483, term206483.getClass(), "typeOfThis", null);
        setField(term206483, term206483.getClass(), "source", null);
        setField(term206483, term206483.getClass(), "implementedInterfaces", null);
        setField(term206483, term206483.getClass(), "subTypes", null);
        setField(term206483, term206483.getClass(), "templateTypeName", null);
        setField(term206483, term206483.getClass(), "className", null);
        setField(term206483, term206483.getClass(), "properties", null);
        setBooleanField(term206483, term206483.getClass(), "nativeType", false);
        setField(term206483, term206483.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term206483, term206483.getClass(), "prettyPrint", false);
        setBooleanField(term206483, term206483.getClass(), "visited", false);
        setField(term206483, term206483.getClass(), "docInfo", null);
        setBooleanField(term206483, term206483.getClass(), "unknown", false);
        setBooleanField(term206483, term206483.getClass(), "resolved", false);
        setField(term206483, term206483.getClass(), "resolveResult", null);
        setField(term206483, term206483.getClass(), "registry", null);
        setField(term206482, term206482.getClass(), "implicitPrototypeFallback", term206483);
        setBooleanField(term206482, term206482.getClass(), "prettyPrint", false);
        setBooleanField(term206482, term206482.getClass(), "visited", false);
        setField(term206482, term206482.getClass(), "docInfo", null);
        setBooleanField(term206482, term206482.getClass(), "unknown", false);
        setBooleanField(term206482, term206482.getClass(), "resolved", false);
        setField(term206482, term206482.getClass(), "resolveResult", null);
        setField(term206482, term206482.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term206199;
        Object retValue = callMethod(klass, "getTypeDeprecationInfo", argTypes, null, args);
        assertTrue(recursiveEquals(term206199, term206482));
        assertTrue(recursiveEquals(retValue, null));
    }

};


