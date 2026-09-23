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

public class CheckAccessControls_getTypeDeprecationInfo_972924409132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36024;
     Object term36515;

    public CheckAccessControls_getTypeDeprecationInfo_972924409132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term36515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term36515, term36515.getClass(), "call", null);
        setField(term36515, term36515.getClass(), "prototype", null);
        setField(term36515, term36515.getClass(), "kind", null);
        setField(term36515, term36515.getClass(), "typeOfThis", null);
        setField(term36515, term36515.getClass(), "source", null);
        setField(term36515, term36515.getClass(), "implementedInterfaces", null);
        setField(term36515, term36515.getClass(), "subTypes", null);
        setField(term36515, term36515.getClass(), "templateTypeName", null);
        setField(term36515, term36515.getClass(), "className", null);
        setField(term36515, term36515.getClass(), "properties", null);
        setBooleanField(term36515, term36515.getClass(), "nativeType", false);
        setField(term36515, term36515.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term36515, term36515.getClass(), "prettyPrint", false);
        setBooleanField(term36515, term36515.getClass(), "visited", false);
        setField(term36515, term36515.getClass(), "docInfo", null);
        setBooleanField(term36515, term36515.getClass(), "unknown", false);
        setBooleanField(term36515, term36515.getClass(), "resolved", false);
        setField(term36515, term36515.getClass(), "resolveResult", null);
        setField(term36515, term36515.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term36024;
        Object retValue = callMethod(klass, "getTypeDeprecationInfo", argTypes, null, args);
        assertTrue(recursiveEquals(term36024, term36515));
        assertTrue(recursiveEquals(retValue, null));
    }

};


