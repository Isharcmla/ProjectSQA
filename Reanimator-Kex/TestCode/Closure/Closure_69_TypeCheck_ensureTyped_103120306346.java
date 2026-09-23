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

public class TypeCheck_ensureTyped_103120306346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100433;
     Object term100503;
     Object term100603;
     Object term100636;
     Object term100637;
     Object term100639;

    public TypeCheck_ensureTyped_103120306346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100433 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term100503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term100503, term100503.getClass(), "type", 105);
        term100603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term100636 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term100636, term100636.getClass(), "compiler", null);
        setField(term100636, term100636.getClass(), "validator", null);
        setField(term100636, term100636.getClass(), "reverseInterpreter", null);
        setField(term100636, term100636.getClass(), "typeRegistry", null);
        setField(term100636, term100636.getClass(), "topScope", null);
        setField(term100636, term100636.getClass(), "scopeCreator", null);
        setField(term100636, term100636.getClass(), "reportMissingOverride", null);
        setField(term100636, term100636.getClass(), "reportUnknownTypes", null);
        setBooleanField(term100636, term100636.getClass(), "reportMissingProperties", false);
        setField(term100636, term100636.getClass(), "inferJSDocInfo", null);
        setIntField(term100636, term100636.getClass(), "typedCount", 0);
        setIntField(term100636, term100636.getClass(), "nullCount", 0);
        setIntField(term100636, term100636.getClass(), "unknownCount", 0);
        setBooleanField(term100636, term100636.getClass(), "inExterns", false);
        setIntField(term100636, term100636.getClass(), "noTypeCheckSection", 0);
        term100637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term100637, term100637.getClass(), "type", 105);
        setField(term100637, term100637.getClass(), "next", null);
        setField(term100637, term100637.getClass(), "first", null);
        setField(term100637, term100637.getClass(), "last", null);
        setField(term100637, term100637.getClass(), "propListHead", null);
        setIntField(term100637, term100637.getClass(), "sourcePosition", 0);
        setField(term100638, term100638.getClass(), "call", null);
        setField(term100638, term100638.getClass(), "prototype", null);
        setField(term100638, term100638.getClass(), "kind", null);
        setField(term100638, term100638.getClass(), "typeOfThis", null);
        setField(term100638, term100638.getClass(), "source", null);
        setField(term100638, term100638.getClass(), "implementedInterfaces", null);
        setField(term100638, term100638.getClass(), "extendedInterfaces", null);
        setField(term100638, term100638.getClass(), "subTypes", null);
        setField(term100638, term100638.getClass(), "templateTypeName", null);
        setField(term100638, term100638.getClass(), "className", null);
        setField(term100638, term100638.getClass(), "properties", null);
        setBooleanField(term100638, term100638.getClass(), "nativeType", false);
        setField(term100638, term100638.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term100638, term100638.getClass(), "prettyPrint", false);
        setBooleanField(term100638, term100638.getClass(), "visited", false);
        setField(term100638, term100638.getClass(), "docInfo", null);
        setBooleanField(term100638, term100638.getClass(), "unknown", false);
        setBooleanField(term100638, term100638.getClass(), "resolved", false);
        setField(term100638, term100638.getClass(), "resolveResult", null);
        setField(term100638, term100638.getClass(), "registry", null);
        setField(term100637, term100637.getClass(), "jsType", term100638);
        setField(term100637, term100637.getClass(), "parent", null);
        term100639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100639, term100639.getClass(), "call", null);
        setField(term100639, term100639.getClass(), "prototype", null);
        setField(term100639, term100639.getClass(), "kind", null);
        setField(term100639, term100639.getClass(), "typeOfThis", null);
        setField(term100639, term100639.getClass(), "source", null);
        setField(term100639, term100639.getClass(), "implementedInterfaces", null);
        setField(term100639, term100639.getClass(), "extendedInterfaces", null);
        setField(term100639, term100639.getClass(), "subTypes", null);
        setField(term100639, term100639.getClass(), "templateTypeName", null);
        setField(term100639, term100639.getClass(), "className", null);
        setField(term100639, term100639.getClass(), "properties", null);
        setBooleanField(term100639, term100639.getClass(), "nativeType", false);
        setField(term100639, term100639.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term100639, term100639.getClass(), "prettyPrint", false);
        setBooleanField(term100639, term100639.getClass(), "visited", false);
        setField(term100639, term100639.getClass(), "docInfo", null);
        setBooleanField(term100639, term100639.getClass(), "unknown", false);
        setBooleanField(term100639, term100639.getClass(), "resolved", false);
        setField(term100639, term100639.getClass(), "resolveResult", null);
        setField(term100639, term100639.getClass(), "registry", null);
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
        args[1] = term100503;
        args[2] = term100603;
        callMethod(klass, "ensureTyped", argTypes, term100433, args);
        assertTrue(recursiveEquals(term100433, term100636));
        assertTrue(recursiveEquals(term100503, null));
        assertTrue(recursiveEquals(term100603, term100639));
    }

};


