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

public class FunctionType_tryMergeFunctionPiecewise_2003411845223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114295;
     Object term114629;
     Object term115021;
     Object term115025;

    public FunctionType_tryMergeFunctionPiecewise_2003411845223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114295 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term114389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term114459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term114529, term114529.getClass(), "jsType", null);
        setField(term114529, term114529.getClass(), "next", null);
        setField(term114459, term114459.getClass(), "first", term114529);
        setField(term114389, term114389.getClass(), "parameters", term114459);
        setField(term114295, term114295.getClass(), "call", term114389);
        term114629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term114723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term114793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term114863, term114863.getClass(), "jsType", null);
        setField(term114863, term114863.getClass(), "next", term114933);
        setField(term114793, term114793.getClass(), "first", term114863);
        setField(term114723, term114723.getClass(), "parameters", term114793);
        setField(term114629, term114629.getClass(), "call", term114723);
        term115021 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term115022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term115023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term115023, term115023.getClass(), "type", 0);
        setField(term115023, term115023.getClass(), "next", null);
        setIntField(term115024, term115024.getClass(), "type", 0);
        setField(term115024, term115024.getClass(), "next", null);
        setField(term115024, term115024.getClass(), "first", null);
        setField(term115024, term115024.getClass(), "last", null);
        setField(term115024, term115024.getClass(), "propListHead", null);
        setIntField(term115024, term115024.getClass(), "sourcePosition", 0);
        setField(term115024, term115024.getClass(), "jsType", null);
        setField(term115024, term115024.getClass(), "parent", null);
        setField(term115023, term115023.getClass(), "first", term115024);
        setField(term115023, term115023.getClass(), "last", null);
        setField(term115023, term115023.getClass(), "propListHead", null);
        setIntField(term115023, term115023.getClass(), "sourcePosition", 0);
        setField(term115023, term115023.getClass(), "jsType", null);
        setField(term115023, term115023.getClass(), "parent", null);
        setField(term115022, term115022.getClass(), "parameters", term115023);
        setField(term115022, term115022.getClass(), "returnType", null);
        setBooleanField(term115022, term115022.getClass(), "returnTypeInferred", false);
        setBooleanField(term115022, term115022.getClass(), "resolved", false);
        setField(term115022, term115022.getClass(), "resolveResult", null);
        setField(term115022, term115022.getClass(), "registry", null);
        setField(term115021, term115021.getClass(), "call", term115022);
        setField(term115021, term115021.getClass(), "prototype", null);
        setField(term115021, term115021.getClass(), "kind", null);
        setField(term115021, term115021.getClass(), "typeOfThis", null);
        setField(term115021, term115021.getClass(), "source", null);
        setField(term115021, term115021.getClass(), "implementedInterfaces", null);
        setField(term115021, term115021.getClass(), "subTypes", null);
        setField(term115021, term115021.getClass(), "templateTypeName", null);
        setField(term115021, term115021.getClass(), "className", null);
        setField(term115021, term115021.getClass(), "properties", null);
        setBooleanField(term115021, term115021.getClass(), "nativeType", false);
        setField(term115021, term115021.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term115021, term115021.getClass(), "prettyPrint", false);
        setBooleanField(term115021, term115021.getClass(), "visited", false);
        setField(term115021, term115021.getClass(), "docInfo", null);
        setBooleanField(term115021, term115021.getClass(), "unknown", false);
        setBooleanField(term115021, term115021.getClass(), "resolved", false);
        setField(term115021, term115021.getClass(), "resolveResult", null);
        setField(term115021, term115021.getClass(), "registry", null);
        term115025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term115026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term115027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term115027, term115027.getClass(), "type", 0);
        setField(term115027, term115027.getClass(), "next", null);
        setIntField(term115028, term115028.getClass(), "type", 0);
        setIntField(term115029, term115029.getClass(), "type", 0);
        setField(term115029, term115029.getClass(), "next", null);
        setField(term115029, term115029.getClass(), "first", null);
        setField(term115029, term115029.getClass(), "last", null);
        setField(term115029, term115029.getClass(), "propListHead", null);
        setIntField(term115029, term115029.getClass(), "sourcePosition", 0);
        setField(term115029, term115029.getClass(), "jsType", null);
        setField(term115029, term115029.getClass(), "parent", null);
        setField(term115028, term115028.getClass(), "next", term115029);
        setField(term115028, term115028.getClass(), "first", null);
        setField(term115028, term115028.getClass(), "last", null);
        setField(term115028, term115028.getClass(), "propListHead", null);
        setIntField(term115028, term115028.getClass(), "sourcePosition", 0);
        setField(term115028, term115028.getClass(), "jsType", null);
        setField(term115028, term115028.getClass(), "parent", null);
        setField(term115027, term115027.getClass(), "first", term115028);
        setField(term115027, term115027.getClass(), "last", null);
        setField(term115027, term115027.getClass(), "propListHead", null);
        setIntField(term115027, term115027.getClass(), "sourcePosition", 0);
        setField(term115027, term115027.getClass(), "jsType", null);
        setField(term115027, term115027.getClass(), "parent", null);
        setField(term115026, term115026.getClass(), "parameters", term115027);
        setField(term115026, term115026.getClass(), "returnType", null);
        setBooleanField(term115026, term115026.getClass(), "returnTypeInferred", false);
        setBooleanField(term115026, term115026.getClass(), "resolved", false);
        setField(term115026, term115026.getClass(), "resolveResult", null);
        setField(term115026, term115026.getClass(), "registry", null);
        setField(term115025, term115025.getClass(), "call", term115026);
        setField(term115025, term115025.getClass(), "prototype", null);
        setField(term115025, term115025.getClass(), "kind", null);
        setField(term115025, term115025.getClass(), "typeOfThis", null);
        setField(term115025, term115025.getClass(), "source", null);
        setField(term115025, term115025.getClass(), "implementedInterfaces", null);
        setField(term115025, term115025.getClass(), "subTypes", null);
        setField(term115025, term115025.getClass(), "templateTypeName", null);
        setField(term115025, term115025.getClass(), "className", null);
        setField(term115025, term115025.getClass(), "properties", null);
        setBooleanField(term115025, term115025.getClass(), "nativeType", false);
        setField(term115025, term115025.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term115025, term115025.getClass(), "prettyPrint", false);
        setBooleanField(term115025, term115025.getClass(), "visited", false);
        setField(term115025, term115025.getClass(), "docInfo", null);
        setBooleanField(term115025, term115025.getClass(), "unknown", false);
        setBooleanField(term115025, term115025.getClass(), "resolved", false);
        setField(term115025, term115025.getClass(), "resolveResult", null);
        setField(term115025, term115025.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term114629;
        args[1] = false;
        Object retValue = callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term114295, args);
        assertTrue(recursiveEquals(term114295, term115021));
        assertTrue(recursiveEquals(term114629, term115025));
        assertTrue(recursiveEquals(retValue, null));
    }

};


