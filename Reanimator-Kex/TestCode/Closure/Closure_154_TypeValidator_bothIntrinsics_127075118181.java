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

public class TypeValidator_bothIntrinsics_127075118181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19811;
     Object term19915;
     Object term20471;
     Object term20472;

    public TypeValidator_bothIntrinsics_127075118181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19811 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term19915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term20471 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term20471, term20471.getClass(), "compiler", null);
        setField(term20471, term20471.getClass(), "typeRegistry", null);
        setField(term20471, term20471.getClass(), "allValueTypes", null);
        setBooleanField(term20471, term20471.getClass(), "shouldReport", false);
        setField(term20471, term20471.getClass(), "nullOrUndefined", null);
        setField(term20471, term20471.getClass(), "mismatches", null);
        term20472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term20472, term20472.getClass(), "call", null);
        setField(term20472, term20472.getClass(), "prototype", null);
        setField(term20472, term20472.getClass(), "kind", null);
        setField(term20472, term20472.getClass(), "typeOfThis", null);
        setField(term20472, term20472.getClass(), "source", null);
        setField(term20472, term20472.getClass(), "implementedInterfaces", null);
        setField(term20472, term20472.getClass(), "subTypes", null);
        setField(term20472, term20472.getClass(), "templateTypeName", null);
        setField(term20472, term20472.getClass(), "className", null);
        setField(term20472, term20472.getClass(), "properties", null);
        setBooleanField(term20472, term20472.getClass(), "nativeType", false);
        setField(term20472, term20472.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term20472, term20472.getClass(), "prettyPrint", false);
        setBooleanField(term20472, term20472.getClass(), "visited", false);
        setField(term20472, term20472.getClass(), "docInfo", null);
        setBooleanField(term20472, term20472.getClass(), "unknown", false);
        setBooleanField(term20472, term20472.getClass(), "resolved", false);
        setField(term20472, term20472.getClass(), "resolveResult", null);
        setField(term20472, term20472.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term19915;
        Object retValue = callMethod(klass, "bothIntrinsics", argTypes, term19811, args);
        assertTrue(recursiveEquals(term19811, term20471));
        assertTrue(recursiveEquals(term19915, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


