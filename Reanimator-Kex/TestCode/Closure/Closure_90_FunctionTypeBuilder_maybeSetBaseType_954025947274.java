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

public class FunctionTypeBuilder_maybeSetBaseType_954025947274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103674;
     Object term103850;
     Object term104503;
     Object term104505;

    public FunctionTypeBuilder_maybeSetBaseType_954025947274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103674 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term103762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term103674, term103674.getClass(), "baseType", term103762);
        term103850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        term104503 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term104504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term104503, term104503.getClass(), "fnName", null);
        setField(term104503, term104503.getClass(), "compiler", null);
        setField(term104503, term104503.getClass(), "codingConvention", null);
        setField(term104503, term104503.getClass(), "typeRegistry", null);
        setField(term104503, term104503.getClass(), "errorRoot", null);
        setField(term104503, term104503.getClass(), "sourceName", null);
        setField(term104503, term104503.getClass(), "scope", null);
        setField(term104503, term104503.getClass(), "returnType", null);
        setBooleanField(term104503, term104503.getClass(), "returnTypeInferred", false);
        setField(term104503, term104503.getClass(), "implementedInterfaces", null);
        setField(term104504, term104504.getClass(), "leastSupertypeVisitor", null);
        setField(term104504, term104504.getClass(), "greatestSubtypeVisitor", null);
        setField(term104504, term104504.getClass(), "call", null);
        setField(term104504, term104504.getClass(), "prototype", null);
        setField(term104504, term104504.getClass(), "kind", null);
        setField(term104504, term104504.getClass(), "typeOfThis", null);
        setField(term104504, term104504.getClass(), "source", null);
        setField(term104504, term104504.getClass(), "implementedInterfaces", null);
        setField(term104504, term104504.getClass(), "subTypes", null);
        setField(term104504, term104504.getClass(), "templateTypeName", null);
        setField(term104504, term104504.getClass(), "className", null);
        setField(term104504, term104504.getClass(), "properties", null);
        setBooleanField(term104504, term104504.getClass(), "nativeType", false);
        setField(term104504, term104504.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term104504, term104504.getClass(), "prettyPrint", false);
        setBooleanField(term104504, term104504.getClass(), "visited", false);
        setField(term104504, term104504.getClass(), "docInfo", null);
        setBooleanField(term104504, term104504.getClass(), "unknown", false);
        setBooleanField(term104504, term104504.getClass(), "resolved", false);
        setField(term104504, term104504.getClass(), "resolveResult", null);
        setField(term104504, term104504.getClass(), "registry", null);
        setField(term104503, term104503.getClass(), "baseType", term104504);
        setField(term104503, term104503.getClass(), "thisType", null);
        setBooleanField(term104503, term104503.getClass(), "isConstructor", false);
        setBooleanField(term104503, term104503.getClass(), "isInterface", false);
        setField(term104503, term104503.getClass(), "parametersNode", null);
        setField(term104503, term104503.getClass(), "sourceNode", null);
        setField(term104503, term104503.getClass(), "templateTypeName", null);
        term104505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term104506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term104507 = newInstance(Class.forName("java.util.TreeMap"));
        Object term104508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term104505, term104505.getClass(), "leastSupertypeVisitor", null);
        setField(term104505, term104505.getClass(), "greatestSubtypeVisitor", null);
        setField(term104505, term104505.getClass(), "call", null);
        setField(term104506, term104506.getClass(), "ownerFunction", term104505);
        setField(term104506, term104506.getClass(), "className", null);
        setField(term104507, term104507.getClass(), "comparator", null);
        setField(term104507, term104507.getClass(), "root", null);
        setIntField(term104507, term104507.getClass(), "size", 0);
        setIntField(term104507, term104507.getClass(), "modCount", 0);
        setField(term104507, term104507.getClass(), "entrySet", null);
        setField(term104507, term104507.getClass(), "navigableKeySet", null);
        setField(term104507, term104507.getClass(), "descendingMap", null);
        setField(term104507, term104507.getClass(), "keySet", null);
        setField(term104507, term104507.getClass(), "values", null);
        setField(term104506, term104506.getClass(), "properties", term104507);
        setBooleanField(term104506, term104506.getClass(), "nativeType", false);
        setField(term104508, term104508.getClass(), "leastSupertypeVisitor", null);
        setField(term104508, term104508.getClass(), "greatestSubtypeVisitor", null);
        setField(term104508, term104508.getClass(), "call", null);
        setField(term104508, term104508.getClass(), "prototype", null);
        setField(term104508, term104508.getClass(), "kind", null);
        setField(term104508, term104508.getClass(), "typeOfThis", null);
        setField(term104508, term104508.getClass(), "source", null);
        setField(term104508, term104508.getClass(), "implementedInterfaces", null);
        setField(term104508, term104508.getClass(), "subTypes", null);
        setField(term104508, term104508.getClass(), "templateTypeName", null);
        setField(term104508, term104508.getClass(), "className", null);
        setField(term104508, term104508.getClass(), "properties", null);
        setBooleanField(term104508, term104508.getClass(), "nativeType", false);
        setField(term104508, term104508.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term104508, term104508.getClass(), "prettyPrint", false);
        setBooleanField(term104508, term104508.getClass(), "visited", false);
        setField(term104508, term104508.getClass(), "docInfo", null);
        setBooleanField(term104508, term104508.getClass(), "unknown", false);
        setBooleanField(term104508, term104508.getClass(), "resolved", false);
        setField(term104508, term104508.getClass(), "resolveResult", null);
        setField(term104508, term104508.getClass(), "registry", null);
        setField(term104506, term104506.getClass(), "implicitPrototypeFallback", term104508);
        setBooleanField(term104506, term104506.getClass(), "prettyPrint", false);
        setBooleanField(term104506, term104506.getClass(), "visited", false);
        setField(term104506, term104506.getClass(), "docInfo", null);
        setBooleanField(term104506, term104506.getClass(), "unknown", true);
        setBooleanField(term104506, term104506.getClass(), "resolved", false);
        setField(term104506, term104506.getClass(), "resolveResult", null);
        setField(term104506, term104506.getClass(), "registry", null);
        setField(term104505, term104505.getClass(), "prototype", term104506);
        setField(term104505, term104505.getClass(), "kind", null);
        setField(term104505, term104505.getClass(), "typeOfThis", null);
        setField(term104505, term104505.getClass(), "source", null);
        setField(term104505, term104505.getClass(), "implementedInterfaces", null);
        setField(term104505, term104505.getClass(), "subTypes", null);
        setField(term104505, term104505.getClass(), "templateTypeName", null);
        setField(term104505, term104505.getClass(), "className", null);
        setField(term104505, term104505.getClass(), "properties", null);
        setBooleanField(term104505, term104505.getClass(), "nativeType", false);
        setField(term104505, term104505.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term104505, term104505.getClass(), "prettyPrint", false);
        setBooleanField(term104505, term104505.getClass(), "visited", false);
        setField(term104505, term104505.getClass(), "docInfo", null);
        setBooleanField(term104505, term104505.getClass(), "unknown", false);
        setBooleanField(term104505, term104505.getClass(), "resolved", false);
        setField(term104505, term104505.getClass(), "resolveResult", null);
        setField(term104505, term104505.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term103850;
        callMethod(klass, "maybeSetBaseType", argTypes, term103674, args);
        assertTrue(recursiveEquals(term103674, term104503));
        assertTrue(recursiveEquals(term103850, term104505));
    }

};


