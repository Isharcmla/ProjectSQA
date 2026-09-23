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

public class TypeCheck_ensureTyped_103120306320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88922;
     Object term88992;
     Object term89096;
     Object term89129;
     Object term89130;
     Object term89132;

    public TypeCheck_ensureTyped_103120306320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88922 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term88992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88992, term88992.getClass(), "type", 105);
        term89096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term89129 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term89129, term89129.getClass(), "compiler", null);
        setField(term89129, term89129.getClass(), "validator", null);
        setField(term89129, term89129.getClass(), "reverseInterpreter", null);
        setField(term89129, term89129.getClass(), "typeRegistry", null);
        setField(term89129, term89129.getClass(), "topScope", null);
        setField(term89129, term89129.getClass(), "scopeCreator", null);
        setField(term89129, term89129.getClass(), "reportMissingOverride", null);
        setField(term89129, term89129.getClass(), "reportUnknownTypes", null);
        setBooleanField(term89129, term89129.getClass(), "reportMissingProperties", false);
        setField(term89129, term89129.getClass(), "inferJSDocInfo", null);
        setIntField(term89129, term89129.getClass(), "typedCount", 0);
        setIntField(term89129, term89129.getClass(), "nullCount", 0);
        setIntField(term89129, term89129.getClass(), "unknownCount", 0);
        setBooleanField(term89129, term89129.getClass(), "inExterns", false);
        setIntField(term89129, term89129.getClass(), "noTypeCheckSection", 0);
        term89130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term89130, term89130.getClass(), "type", 105);
        setField(term89130, term89130.getClass(), "next", null);
        setField(term89130, term89130.getClass(), "first", null);
        setField(term89130, term89130.getClass(), "last", null);
        setField(term89130, term89130.getClass(), "propListHead", null);
        setIntField(term89130, term89130.getClass(), "sourcePosition", 0);
        setField(term89131, term89131.getClass(), "call", null);
        setField(term89131, term89131.getClass(), "prototype", null);
        setField(term89131, term89131.getClass(), "kind", null);
        setField(term89131, term89131.getClass(), "typeOfThis", null);
        setField(term89131, term89131.getClass(), "source", null);
        setField(term89131, term89131.getClass(), "implementedInterfaces", null);
        setField(term89131, term89131.getClass(), "extendedInterfaces", null);
        setField(term89131, term89131.getClass(), "subTypes", null);
        setField(term89131, term89131.getClass(), "templateTypeName", null);
        setField(term89131, term89131.getClass(), "className", null);
        setField(term89131, term89131.getClass(), "properties", null);
        setBooleanField(term89131, term89131.getClass(), "nativeType", false);
        setField(term89131, term89131.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term89131, term89131.getClass(), "prettyPrint", false);
        setBooleanField(term89131, term89131.getClass(), "visited", false);
        setField(term89131, term89131.getClass(), "docInfo", null);
        setBooleanField(term89131, term89131.getClass(), "unknown", false);
        setBooleanField(term89131, term89131.getClass(), "resolved", false);
        setField(term89131, term89131.getClass(), "resolveResult", null);
        setField(term89131, term89131.getClass(), "registry", null);
        setField(term89130, term89130.getClass(), "jsType", term89131);
        setField(term89130, term89130.getClass(), "parent", null);
        term89132 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term89132, term89132.getClass(), "call", null);
        setField(term89132, term89132.getClass(), "prototype", null);
        setField(term89132, term89132.getClass(), "kind", null);
        setField(term89132, term89132.getClass(), "typeOfThis", null);
        setField(term89132, term89132.getClass(), "source", null);
        setField(term89132, term89132.getClass(), "implementedInterfaces", null);
        setField(term89132, term89132.getClass(), "extendedInterfaces", null);
        setField(term89132, term89132.getClass(), "subTypes", null);
        setField(term89132, term89132.getClass(), "templateTypeName", null);
        setField(term89132, term89132.getClass(), "className", null);
        setField(term89132, term89132.getClass(), "properties", null);
        setBooleanField(term89132, term89132.getClass(), "nativeType", false);
        setField(term89132, term89132.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term89132, term89132.getClass(), "prettyPrint", false);
        setBooleanField(term89132, term89132.getClass(), "visited", false);
        setField(term89132, term89132.getClass(), "docInfo", null);
        setBooleanField(term89132, term89132.getClass(), "unknown", false);
        setBooleanField(term89132, term89132.getClass(), "resolved", false);
        setField(term89132, term89132.getClass(), "resolveResult", null);
        setField(term89132, term89132.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term88992;
        args[2] = term89096;
        callMethod(klass, "ensureTyped", argTypes, term88922, args);
        assertTrue(recursiveEquals(term88922, term89129));
        assertTrue(recursiveEquals(term88992, null));
        assertTrue(recursiveEquals(term89096, term89132));
    }

};


