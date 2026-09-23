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

public class JSType_getLeastSupertype_2082831967227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37356;
     Object term37552;
     Object term37915;
     Object term37916;
     Object term37818;

    public JSType_getLeastSupertype_2082831967227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term37460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term37356, term37356.getClass(), "registry", term37460);
        term37552 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term37915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term37915, term37915.getClass(), "resolved", false);
        setField(term37915, term37915.getClass(), "resolveResult", null);
        setField(term37915, term37915.getClass(), "registry", null);
        term37916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term37917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term37916, term37916.getClass(), "leastSupertypeVisitor", null);
        setField(term37916, term37916.getClass(), "greatestSubtypeVisitor", null);
        setField(term37916, term37916.getClass(), "call", null);
        setField(term37916, term37916.getClass(), "prototype", null);
        setField(term37916, term37916.getClass(), "kind", null);
        setField(term37916, term37916.getClass(), "typeOfThis", null);
        setField(term37916, term37916.getClass(), "source", null);
        setField(term37916, term37916.getClass(), "implementedInterfaces", null);
        setField(term37916, term37916.getClass(), "subTypes", null);
        setField(term37916, term37916.getClass(), "templateTypeName", null);
        setField(term37916, term37916.getClass(), "className", null);
        setField(term37916, term37916.getClass(), "properties", null);
        setField(term37916, term37916.getClass(), "implicitPrototype", null);
        setBooleanField(term37916, term37916.getClass(), "nativeType", false);
        setBooleanField(term37916, term37916.getClass(), "prettyPrint", false);
        setBooleanField(term37916, term37916.getClass(), "visited", false);
        setField(term37916, term37916.getClass(), "docInfo", null);
        setBooleanField(term37916, term37916.getClass(), "unknown", false);
        setBooleanField(term37916, term37916.getClass(), "resolved", false);
        setField(term37916, term37916.getClass(), "resolveResult", null);
        setField(term37917, term37917.getClass(), "reporter", null);
        setField(term37917, term37917.getClass(), "nativeTypes", null);
        setField(term37917, term37917.getClass(), "namesToTypes", null);
        setField(term37917, term37917.getClass(), "namespaces", null);
        setField(term37917, term37917.getClass(), "enumTypeNames", null);
        setField(term37917, term37917.getClass(), "forwardDeclaredTypes", null);
        setField(term37917, term37917.getClass(), "typesIndexedByProperty", null);
        setField(term37917, term37917.getClass(), "greatestSubtypeByProperty", null);
        setField(term37917, term37917.getClass(), "interfaceToImplementors", null);
        setField(term37917, term37917.getClass(), "unresolvedNamedTypes", null);
        setField(term37917, term37917.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term37917, term37917.getClass(), "lastGeneration", false);
        setField(term37917, term37917.getClass(), "templateTypeName", null);
        setField(term37917, term37917.getClass(), "templateType", null);
        setBooleanField(term37917, term37917.getClass(), "tolerateUndefinedValues", false);
        setField(term37917, term37917.getClass(), "resolveMode", null);
        setField(term37916, term37916.getClass(), "registry", term37917);
        term37818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term37818, term37818.getClass(), "resolved", false);
        setField(term37818, term37818.getClass(), "resolveResult", null);
        setField(term37818, term37818.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term37356;
        args[1] = term37552;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term37356, term37915));
        assertTrue(recursiveEquals(term37552, term37916));
        assertTrue(recursiveEquals(retValue, term37818));
    }

};


