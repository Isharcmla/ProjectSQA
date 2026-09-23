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

public class TypeCheck_getFunctionType_861075670190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48677;
     Object term48747;
     Object term48897;
     Object term48898;
     Object term48861;

    public TypeCheck_getFunctionType_861075670190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48677 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term48747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term48747, term48747.getClass(), "jsType", term48851);
        term48897 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term48897, term48897.getClass(), "compiler", null);
        setField(term48897, term48897.getClass(), "validator", null);
        setField(term48897, term48897.getClass(), "reverseInterpreter", null);
        setField(term48897, term48897.getClass(), "typeRegistry", null);
        setField(term48897, term48897.getClass(), "topScope", null);
        setField(term48897, term48897.getClass(), "scopeCreator", null);
        setField(term48897, term48897.getClass(), "reportMissingOverride", null);
        setField(term48897, term48897.getClass(), "reportUnknownTypes", null);
        setBooleanField(term48897, term48897.getClass(), "reportMissingProperties", false);
        setField(term48897, term48897.getClass(), "inferJSDocInfo", null);
        setIntField(term48897, term48897.getClass(), "typedCount", 0);
        setIntField(term48897, term48897.getClass(), "nullCount", 0);
        setIntField(term48897, term48897.getClass(), "unknownCount", 0);
        setBooleanField(term48897, term48897.getClass(), "inExterns", false);
        setIntField(term48897, term48897.getClass(), "noTypeCheckSection", 0);
        term48898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term48898, term48898.getClass(), "type", 0);
        setField(term48898, term48898.getClass(), "next", null);
        setField(term48898, term48898.getClass(), "first", null);
        setField(term48898, term48898.getClass(), "last", null);
        setField(term48898, term48898.getClass(), "propListHead", null);
        setIntField(term48898, term48898.getClass(), "sourcePosition", 0);
        setField(term48899, term48899.getClass(), "call", null);
        setField(term48899, term48899.getClass(), "prototype", null);
        setField(term48899, term48899.getClass(), "kind", null);
        setField(term48899, term48899.getClass(), "typeOfThis", null);
        setField(term48899, term48899.getClass(), "source", null);
        setField(term48899, term48899.getClass(), "implementedInterfaces", null);
        setField(term48899, term48899.getClass(), "extendedInterfaces", null);
        setField(term48899, term48899.getClass(), "subTypes", null);
        setField(term48899, term48899.getClass(), "templateTypeName", null);
        setField(term48899, term48899.getClass(), "className", null);
        setField(term48899, term48899.getClass(), "properties", null);
        setBooleanField(term48899, term48899.getClass(), "nativeType", false);
        setField(term48899, term48899.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term48899, term48899.getClass(), "prettyPrint", false);
        setBooleanField(term48899, term48899.getClass(), "visited", false);
        setField(term48899, term48899.getClass(), "docInfo", null);
        setBooleanField(term48899, term48899.getClass(), "unknown", false);
        setBooleanField(term48899, term48899.getClass(), "resolved", false);
        setField(term48899, term48899.getClass(), "resolveResult", null);
        setField(term48899, term48899.getClass(), "registry", null);
        setField(term48898, term48898.getClass(), "jsType", term48899);
        setField(term48898, term48898.getClass(), "parent", null);
        term48861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term48861, term48861.getClass(), "call", null);
        setField(term48861, term48861.getClass(), "prototype", null);
        setField(term48861, term48861.getClass(), "kind", null);
        setField(term48861, term48861.getClass(), "typeOfThis", null);
        setField(term48861, term48861.getClass(), "source", null);
        setField(term48861, term48861.getClass(), "implementedInterfaces", null);
        setField(term48861, term48861.getClass(), "extendedInterfaces", null);
        setField(term48861, term48861.getClass(), "subTypes", null);
        setField(term48861, term48861.getClass(), "templateTypeName", null);
        setField(term48861, term48861.getClass(), "className", null);
        setField(term48861, term48861.getClass(), "properties", null);
        setBooleanField(term48861, term48861.getClass(), "nativeType", false);
        setField(term48861, term48861.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term48861, term48861.getClass(), "prettyPrint", false);
        setBooleanField(term48861, term48861.getClass(), "visited", false);
        setField(term48861, term48861.getClass(), "docInfo", null);
        setBooleanField(term48861, term48861.getClass(), "unknown", false);
        setBooleanField(term48861, term48861.getClass(), "resolved", false);
        setField(term48861, term48861.getClass(), "resolveResult", null);
        setField(term48861, term48861.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48747;
        Object retValue = callMethod(klass, "getFunctionType", argTypes, term48677, args);
        assertTrue(recursiveEquals(term48677, term48897));
        assertTrue(recursiveEquals(term48747, term48898));
        assertTrue(recursiveEquals(retValue, term48861));
    }

};


