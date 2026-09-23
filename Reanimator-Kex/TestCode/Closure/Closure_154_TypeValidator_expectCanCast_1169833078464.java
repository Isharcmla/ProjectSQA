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

public class TypeValidator_expectCanCast_1169833078464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232162;
     Object term232272;
     Object term232530;
     Object term233495;
     Object term233496;
     Object term233500;

    public TypeValidator_expectCanCast_1169833078464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232162 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term233505 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term233504 = ((Class) term233505).getDeclaredField((String) "INTERFACE");
        ((Field) term233504).setAccessible(true);
        Object enum127 = ((Field) term233504).get((Object) null);
        term232272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term232272, term232272.getClass(), "kind", enum127);
        Class<? extends Object> term233799 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term233798 = ((Class) term233799).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term233798).setAccessible(true);
        Object enum128 = ((Field) term233798).get((Object) null);
        term232530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term232530, term232530.getClass(), "unknown", false);
        setField(term232530, term232530.getClass(), "kind", enum128);
        term233495 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term233495, term233495.getClass(), "compiler", null);
        setField(term233495, term233495.getClass(), "typeRegistry", null);
        setField(term233495, term233495.getClass(), "allValueTypes", null);
        setBooleanField(term233495, term233495.getClass(), "shouldReport", false);
        setField(term233495, term233495.getClass(), "nullOrUndefined", null);
        setField(term233495, term233495.getClass(), "mismatches", null);
        Class<? extends Object> term234099 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term234098 = ((Class) term234099).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term234098).setAccessible(true);
        Object enum129 = ((Field) term234098).get((Object) null);
        term233496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term233496, term233496.getClass(), "call", null);
        setField(term233496, term233496.getClass(), "prototype", null);
        setField(term233496, term233496.getClass(), "kind", enum129);
        setField(term233496, term233496.getClass(), "typeOfThis", null);
        setField(term233496, term233496.getClass(), "source", null);
        setField(term233496, term233496.getClass(), "implementedInterfaces", null);
        setField(term233496, term233496.getClass(), "subTypes", null);
        setField(term233496, term233496.getClass(), "templateTypeName", null);
        setField(term233496, term233496.getClass(), "className", null);
        setField(term233496, term233496.getClass(), "properties", null);
        setBooleanField(term233496, term233496.getClass(), "nativeType", false);
        setField(term233496, term233496.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term233496, term233496.getClass(), "prettyPrint", false);
        setBooleanField(term233496, term233496.getClass(), "visited", false);
        setField(term233496, term233496.getClass(), "docInfo", null);
        setBooleanField(term233496, term233496.getClass(), "unknown", false);
        setBooleanField(term233496, term233496.getClass(), "resolved", false);
        setField(term233496, term233496.getClass(), "resolveResult", null);
        setField(term233496, term233496.getClass(), "registry", null);
        Class<? extends Object> term234399 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term234398 = ((Class) term234399).getDeclaredField((String) "INTERFACE");
        ((Field) term234398).setAccessible(true);
        Object enum130 = ((Field) term234398).get((Object) null);
        term233500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term233500, term233500.getClass(), "call", null);
        setField(term233500, term233500.getClass(), "prototype", null);
        setField(term233500, term233500.getClass(), "kind", enum130);
        setField(term233500, term233500.getClass(), "typeOfThis", null);
        setField(term233500, term233500.getClass(), "source", null);
        setField(term233500, term233500.getClass(), "implementedInterfaces", null);
        setField(term233500, term233500.getClass(), "subTypes", null);
        setField(term233500, term233500.getClass(), "templateTypeName", null);
        setField(term233500, term233500.getClass(), "className", null);
        setField(term233500, term233500.getClass(), "properties", null);
        setBooleanField(term233500, term233500.getClass(), "nativeType", false);
        setField(term233500, term233500.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term233500, term233500.getClass(), "prettyPrint", false);
        setBooleanField(term233500, term233500.getClass(), "visited", false);
        setField(term233500, term233500.getClass(), "docInfo", null);
        setBooleanField(term233500, term233500.getClass(), "unknown", false);
        setBooleanField(term233500, term233500.getClass(), "resolved", false);
        setField(term233500, term233500.getClass(), "resolveResult", null);
        setField(term233500, term233500.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term232272;
        args[3] = term232530;
        callMethod(klass, "expectCanCast", argTypes, term232162, args);
        assertTrue(recursiveEquals(term232162, term233495));
        assertTrue(recursiveEquals(term232272, null));
        assertTrue(recursiveEquals(term232530, null));
    }

};


