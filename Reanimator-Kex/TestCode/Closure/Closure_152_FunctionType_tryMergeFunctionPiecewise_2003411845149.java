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
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75466;
     Object term75800;
     Object term76022;
     Object term76026;

    public FunctionType_tryMergeFunctionPiecewise_2003411845149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term75560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term75630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75630, term75630.getClass(), "first", term75700);
        setField(term75560, term75560.getClass(), "parameters", term75630);
        setField(term75466, term75466.getClass(), "call", term75560);
        term75800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term75894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term75964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75964, term75964.getClass(), "first", null);
        setField(term75894, term75894.getClass(), "parameters", term75964);
        setField(term75800, term75800.getClass(), "call", term75894);
        term76022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term76023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term76024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76024, term76024.getClass(), "type", 0);
        setField(term76024, term76024.getClass(), "next", null);
        setIntField(term76025, term76025.getClass(), "type", 0);
        setField(term76025, term76025.getClass(), "next", null);
        setField(term76025, term76025.getClass(), "first", null);
        setField(term76025, term76025.getClass(), "last", null);
        setField(term76025, term76025.getClass(), "propListHead", null);
        setIntField(term76025, term76025.getClass(), "sourcePosition", 0);
        setField(term76025, term76025.getClass(), "jsType", null);
        setField(term76025, term76025.getClass(), "parent", null);
        setField(term76024, term76024.getClass(), "first", term76025);
        setField(term76024, term76024.getClass(), "last", null);
        setField(term76024, term76024.getClass(), "propListHead", null);
        setIntField(term76024, term76024.getClass(), "sourcePosition", 0);
        setField(term76024, term76024.getClass(), "jsType", null);
        setField(term76024, term76024.getClass(), "parent", null);
        setField(term76023, term76023.getClass(), "parameters", term76024);
        setField(term76023, term76023.getClass(), "returnType", null);
        setBooleanField(term76023, term76023.getClass(), "returnTypeInferred", false);
        setBooleanField(term76023, term76023.getClass(), "resolved", false);
        setField(term76023, term76023.getClass(), "resolveResult", null);
        setField(term76023, term76023.getClass(), "registry", null);
        setField(term76022, term76022.getClass(), "call", term76023);
        setField(term76022, term76022.getClass(), "prototype", null);
        setField(term76022, term76022.getClass(), "kind", null);
        setField(term76022, term76022.getClass(), "typeOfThis", null);
        setField(term76022, term76022.getClass(), "source", null);
        setField(term76022, term76022.getClass(), "implementedInterfaces", null);
        setField(term76022, term76022.getClass(), "subTypes", null);
        setField(term76022, term76022.getClass(), "templateTypeName", null);
        setField(term76022, term76022.getClass(), "className", null);
        setField(term76022, term76022.getClass(), "properties", null);
        setBooleanField(term76022, term76022.getClass(), "nativeType", false);
        setField(term76022, term76022.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term76022, term76022.getClass(), "prettyPrint", false);
        setBooleanField(term76022, term76022.getClass(), "visited", false);
        setField(term76022, term76022.getClass(), "docInfo", null);
        setBooleanField(term76022, term76022.getClass(), "unknown", false);
        setBooleanField(term76022, term76022.getClass(), "resolved", false);
        setField(term76022, term76022.getClass(), "resolveResult", null);
        setField(term76022, term76022.getClass(), "registry", null);
        term76026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term76027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term76028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76028, term76028.getClass(), "type", 0);
        setField(term76028, term76028.getClass(), "next", null);
        setField(term76028, term76028.getClass(), "first", null);
        setField(term76028, term76028.getClass(), "last", null);
        setField(term76028, term76028.getClass(), "propListHead", null);
        setIntField(term76028, term76028.getClass(), "sourcePosition", 0);
        setField(term76028, term76028.getClass(), "jsType", null);
        setField(term76028, term76028.getClass(), "parent", null);
        setField(term76027, term76027.getClass(), "parameters", term76028);
        setField(term76027, term76027.getClass(), "returnType", null);
        setBooleanField(term76027, term76027.getClass(), "returnTypeInferred", false);
        setBooleanField(term76027, term76027.getClass(), "resolved", false);
        setField(term76027, term76027.getClass(), "resolveResult", null);
        setField(term76027, term76027.getClass(), "registry", null);
        setField(term76026, term76026.getClass(), "call", term76027);
        setField(term76026, term76026.getClass(), "prototype", null);
        setField(term76026, term76026.getClass(), "kind", null);
        setField(term76026, term76026.getClass(), "typeOfThis", null);
        setField(term76026, term76026.getClass(), "source", null);
        setField(term76026, term76026.getClass(), "implementedInterfaces", null);
        setField(term76026, term76026.getClass(), "subTypes", null);
        setField(term76026, term76026.getClass(), "templateTypeName", null);
        setField(term76026, term76026.getClass(), "className", null);
        setField(term76026, term76026.getClass(), "properties", null);
        setBooleanField(term76026, term76026.getClass(), "nativeType", false);
        setField(term76026, term76026.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term76026, term76026.getClass(), "prettyPrint", false);
        setBooleanField(term76026, term76026.getClass(), "visited", false);
        setField(term76026, term76026.getClass(), "docInfo", null);
        setBooleanField(term76026, term76026.getClass(), "unknown", false);
        setBooleanField(term76026, term76026.getClass(), "resolved", false);
        setField(term76026, term76026.getClass(), "resolveResult", null);
        setField(term76026, term76026.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term75800;
        args[1] = false;
        Object retValue = callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term75466, args);
        assertTrue(recursiveEquals(term75466, term76022));
        assertTrue(recursiveEquals(term75800, term76026));
        assertTrue(recursiveEquals(retValue, null));
    }

};


