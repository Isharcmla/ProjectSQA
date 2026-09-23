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

public class CheckAccessControls_getTypeDeprecationInfo_972924409244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71190;
     Object term71421;

    public CheckAccessControls_getTypeDeprecationInfo_972924409244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term71294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term71190, term71190.getClass(), "docInfo", null);
        setField(term71190, term71190.getClass(), "implicitPrototypeFallback", term71294);
        term71421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term71422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term71421, term71421.getClass(), "call", null);
        setField(term71421, term71421.getClass(), "prototype", null);
        setField(term71421, term71421.getClass(), "kind", null);
        setField(term71421, term71421.getClass(), "typeOfThis", null);
        setField(term71421, term71421.getClass(), "source", null);
        setField(term71421, term71421.getClass(), "implementedInterfaces", null);
        setField(term71421, term71421.getClass(), "subTypes", null);
        setField(term71421, term71421.getClass(), "templateTypeName", null);
        setField(term71421, term71421.getClass(), "className", null);
        setField(term71421, term71421.getClass(), "properties", null);
        setBooleanField(term71421, term71421.getClass(), "nativeType", false);
        setField(term71422, term71422.getClass(), "call", null);
        setField(term71422, term71422.getClass(), "prototype", null);
        setField(term71422, term71422.getClass(), "kind", null);
        setField(term71422, term71422.getClass(), "typeOfThis", null);
        setField(term71422, term71422.getClass(), "source", null);
        setField(term71422, term71422.getClass(), "implementedInterfaces", null);
        setField(term71422, term71422.getClass(), "subTypes", null);
        setField(term71422, term71422.getClass(), "templateTypeName", null);
        setField(term71422, term71422.getClass(), "className", null);
        setField(term71422, term71422.getClass(), "properties", null);
        setBooleanField(term71422, term71422.getClass(), "nativeType", false);
        setField(term71422, term71422.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term71422, term71422.getClass(), "prettyPrint", false);
        setBooleanField(term71422, term71422.getClass(), "visited", false);
        setField(term71422, term71422.getClass(), "docInfo", null);
        setBooleanField(term71422, term71422.getClass(), "unknown", false);
        setBooleanField(term71422, term71422.getClass(), "resolved", false);
        setField(term71422, term71422.getClass(), "resolveResult", null);
        setField(term71422, term71422.getClass(), "registry", null);
        setField(term71421, term71421.getClass(), "implicitPrototypeFallback", term71422);
        setBooleanField(term71421, term71421.getClass(), "prettyPrint", false);
        setBooleanField(term71421, term71421.getClass(), "visited", false);
        setField(term71421, term71421.getClass(), "docInfo", null);
        setBooleanField(term71421, term71421.getClass(), "unknown", false);
        setBooleanField(term71421, term71421.getClass(), "resolved", false);
        setField(term71421, term71421.getClass(), "resolveResult", null);
        setField(term71421, term71421.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term71190;
        Object retValue = callMethod(klass, "getTypeDeprecationInfo", argTypes, null, args);
        assertTrue(recursiveEquals(term71190, term71421));
        assertTrue(recursiveEquals(retValue, null));
    }

};


