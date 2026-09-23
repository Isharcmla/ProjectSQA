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

public class TypeValidator_mismatch_1931343499298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102866;
     Object term102970;
     Object term103074;
     Object term103120;
     Object term103121;
     Object term103122;

    public TypeValidator_mismatch_1931343499298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102866 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term102970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term103074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term103074, term103074.getClass(), "unknown", true);
        term103120 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term103120, term103120.getClass(), "compiler", null);
        setField(term103120, term103120.getClass(), "typeRegistry", null);
        setField(term103120, term103120.getClass(), "allValueTypes", null);
        setBooleanField(term103120, term103120.getClass(), "shouldReport", false);
        setField(term103120, term103120.getClass(), "nullOrUndefined", null);
        setField(term103120, term103120.getClass(), "mismatches", null);
        term103121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term103121, term103121.getClass(), "call", null);
        setField(term103121, term103121.getClass(), "prototype", null);
        setField(term103121, term103121.getClass(), "kind", null);
        setField(term103121, term103121.getClass(), "typeOfThis", null);
        setField(term103121, term103121.getClass(), "source", null);
        setField(term103121, term103121.getClass(), "implementedInterfaces", null);
        setField(term103121, term103121.getClass(), "subTypes", null);
        setField(term103121, term103121.getClass(), "templateTypeName", null);
        setField(term103121, term103121.getClass(), "className", null);
        setField(term103121, term103121.getClass(), "properties", null);
        setBooleanField(term103121, term103121.getClass(), "nativeType", false);
        setField(term103121, term103121.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term103121, term103121.getClass(), "prettyPrint", false);
        setBooleanField(term103121, term103121.getClass(), "visited", false);
        setField(term103121, term103121.getClass(), "docInfo", null);
        setBooleanField(term103121, term103121.getClass(), "unknown", false);
        setBooleanField(term103121, term103121.getClass(), "resolved", false);
        setField(term103121, term103121.getClass(), "resolveResult", null);
        setField(term103121, term103121.getClass(), "registry", null);
        term103122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term103122, term103122.getClass(), "call", null);
        setField(term103122, term103122.getClass(), "prototype", null);
        setField(term103122, term103122.getClass(), "kind", null);
        setField(term103122, term103122.getClass(), "typeOfThis", null);
        setField(term103122, term103122.getClass(), "source", null);
        setField(term103122, term103122.getClass(), "implementedInterfaces", null);
        setField(term103122, term103122.getClass(), "subTypes", null);
        setField(term103122, term103122.getClass(), "templateTypeName", null);
        setField(term103122, term103122.getClass(), "className", null);
        setField(term103122, term103122.getClass(), "properties", null);
        setBooleanField(term103122, term103122.getClass(), "nativeType", false);
        setField(term103122, term103122.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term103122, term103122.getClass(), "prettyPrint", false);
        setBooleanField(term103122, term103122.getClass(), "visited", false);
        setField(term103122, term103122.getClass(), "docInfo", null);
        setBooleanField(term103122, term103122.getClass(), "unknown", false);
        setBooleanField(term103122, term103122.getClass(), "resolved", false);
        setField(term103122, term103122.getClass(), "resolveResult", null);
        setField(term103122, term103122.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term102970;
        args[4] = term103074;
        callMethod(klass, "mismatch", argTypes, term102866, args);
        assertTrue(recursiveEquals(term102866, term103120));
        assertTrue(recursiveEquals(term102970, null));
        assertTrue(recursiveEquals(term103074, null));
    }

};


