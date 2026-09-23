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

public class TypeValidator_bothIntrinsics_1270751181274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91558;
     Object term91648;
     Object term91752;
     Object term92233;
     Object term92234;
     Object term92238;

    public TypeValidator_bothIntrinsics_1270751181274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91558 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term91648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Class<? extends Object> term92241 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term92240 = ((Class) term92241).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term92240).setAccessible(true);
        Object enum26 = ((Field) term92240).get((Object) null);
        term91752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term91752, term91752.getClass(), "kind", enum26);
        term92233 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term92233, term92233.getClass(), "compiler", null);
        setField(term92233, term92233.getClass(), "typeRegistry", null);
        setField(term92233, term92233.getClass(), "allValueTypes", null);
        setBooleanField(term92233, term92233.getClass(), "shouldReport", false);
        setField(term92233, term92233.getClass(), "nullOrUndefined", null);
        setField(term92233, term92233.getClass(), "mismatches", null);
        Class<? extends Object> term92541 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term92540 = ((Class) term92541).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term92540).setAccessible(true);
        Object enum27 = ((Field) term92540).get((Object) null);
        term92234 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term92234, term92234.getClass(), "call", null);
        setField(term92234, term92234.getClass(), "prototype", null);
        setField(term92234, term92234.getClass(), "kind", enum27);
        setField(term92234, term92234.getClass(), "typeOfThis", null);
        setField(term92234, term92234.getClass(), "source", null);
        setField(term92234, term92234.getClass(), "implementedInterfaces", null);
        setField(term92234, term92234.getClass(), "subTypes", null);
        setField(term92234, term92234.getClass(), "templateTypeName", null);
        setField(term92234, term92234.getClass(), "className", null);
        setField(term92234, term92234.getClass(), "properties", null);
        setBooleanField(term92234, term92234.getClass(), "nativeType", false);
        setField(term92234, term92234.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term92234, term92234.getClass(), "prettyPrint", false);
        setBooleanField(term92234, term92234.getClass(), "visited", false);
        setField(term92234, term92234.getClass(), "docInfo", null);
        setBooleanField(term92234, term92234.getClass(), "unknown", false);
        setBooleanField(term92234, term92234.getClass(), "resolved", false);
        setField(term92234, term92234.getClass(), "resolveResult", null);
        setField(term92234, term92234.getClass(), "registry", null);
        term92238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term92238, term92238.getClass(), "resolved", false);
        setField(term92238, term92238.getClass(), "resolveResult", null);
        setField(term92238, term92238.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term91648;
        args[1] = term91752;
        Object retValue = callMethod(klass, "bothIntrinsics", argTypes, term91558, args);
        assertTrue(recursiveEquals(term91558, term92233));
        assertTrue(recursiveEquals(term91648, term92234));
        assertTrue(recursiveEquals(term91752, term92238));
        assertTrue(recursiveEquals(retValue, false));
    }

};


