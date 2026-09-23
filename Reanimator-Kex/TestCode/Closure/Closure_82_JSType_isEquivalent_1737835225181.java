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

public class JSType_isEquivalent_1737835225181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23239;
     Object term23462;
     Object term23463;

    public JSType_isEquivalent_1737835225181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term23462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term23462, term23462.getClass(), "call", null);
        setField(term23462, term23462.getClass(), "prototype", null);
        setField(term23462, term23462.getClass(), "kind", null);
        setField(term23462, term23462.getClass(), "typeOfThis", null);
        setField(term23462, term23462.getClass(), "source", null);
        setField(term23462, term23462.getClass(), "implementedInterfaces", null);
        setField(term23462, term23462.getClass(), "subTypes", null);
        setField(term23462, term23462.getClass(), "templateTypeName", null);
        setField(term23462, term23462.getClass(), "className", null);
        setField(term23462, term23462.getClass(), "properties", null);
        setBooleanField(term23462, term23462.getClass(), "nativeType", false);
        setField(term23462, term23462.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term23462, term23462.getClass(), "prettyPrint", false);
        setBooleanField(term23462, term23462.getClass(), "visited", false);
        setField(term23462, term23462.getClass(), "docInfo", null);
        setBooleanField(term23462, term23462.getClass(), "unknown", false);
        setBooleanField(term23462, term23462.getClass(), "resolved", false);
        setField(term23462, term23462.getClass(), "resolveResult", null);
        setField(term23462, term23462.getClass(), "registry", null);
        term23463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term23463, term23463.getClass(), "call", null);
        setField(term23463, term23463.getClass(), "prototype", null);
        setField(term23463, term23463.getClass(), "kind", null);
        setField(term23463, term23463.getClass(), "typeOfThis", null);
        setField(term23463, term23463.getClass(), "source", null);
        setField(term23463, term23463.getClass(), "implementedInterfaces", null);
        setField(term23463, term23463.getClass(), "subTypes", null);
        setField(term23463, term23463.getClass(), "templateTypeName", null);
        setField(term23463, term23463.getClass(), "className", null);
        setField(term23463, term23463.getClass(), "properties", null);
        setBooleanField(term23463, term23463.getClass(), "nativeType", false);
        setField(term23463, term23463.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term23463, term23463.getClass(), "prettyPrint", false);
        setBooleanField(term23463, term23463.getClass(), "visited", false);
        setField(term23463, term23463.getClass(), "docInfo", null);
        setBooleanField(term23463, term23463.getClass(), "unknown", false);
        setBooleanField(term23463, term23463.getClass(), "resolved", false);
        setField(term23463, term23463.getClass(), "resolveResult", null);
        setField(term23463, term23463.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term23239;
        args[1] = term23239;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term23239, term23462));
        assertTrue(recursiveEquals(term23239, term23463));
        assertTrue(recursiveEquals(retValue, true));
    }

};


