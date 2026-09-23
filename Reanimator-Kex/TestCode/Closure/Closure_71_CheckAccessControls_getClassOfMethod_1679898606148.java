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

public class CheckAccessControls_getClassOfMethod_1679898606148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39811;
     Object term39881;
     Object term40059;
     Object term40711;
     Object term40712;
     Object term40713;
     Object term40676;

    public CheckAccessControls_getClassOfMethod_1679898606148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39811 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term39881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setIntField(term39881, term39881.getClass(), "type", 38);
        setField(term39881, term39881.getClass(), "jsType", term39989);
        term40059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40059, term40059.getClass(), "type", 38);
        term40711 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term40711, term40711.getClass(), "compiler", null);
        setField(term40711, term40711.getClass(), "validator", null);
        setIntField(term40711, term40711.getClass(), "deprecatedDepth", 0);
        setIntField(term40711, term40711.getClass(), "methodDepth", 0);
        setField(term40711, term40711.getClass(), "currentClass", null);
        setField(term40711, term40711.getClass(), "initializedConstantProperties", null);
        term40712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40712, term40712.getClass(), "type", 38);
        setField(term40712, term40712.getClass(), "next", null);
        setField(term40712, term40712.getClass(), "first", null);
        setField(term40712, term40712.getClass(), "last", null);
        setField(term40712, term40712.getClass(), "propListHead", null);
        setIntField(term40712, term40712.getClass(), "sourcePosition", 0);
        setField(term40712, term40712.getClass(), "jsType", null);
        setField(term40712, term40712.getClass(), "parent", null);
        term40713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setIntField(term40713, term40713.getClass(), "type", 38);
        setField(term40713, term40713.getClass(), "next", null);
        setField(term40713, term40713.getClass(), "first", null);
        setField(term40713, term40713.getClass(), "last", null);
        setField(term40713, term40713.getClass(), "propListHead", null);
        setIntField(term40713, term40713.getClass(), "sourcePosition", 0);
        setField(term40714, term40714.getClass(), "this$0", null);
        setField(term40714, term40714.getClass(), "call", null);
        setField(term40714, term40714.getClass(), "prototype", null);
        setField(term40714, term40714.getClass(), "kind", null);
        setField(term40714, term40714.getClass(), "typeOfThis", null);
        setField(term40714, term40714.getClass(), "source", null);
        setField(term40714, term40714.getClass(), "implementedInterfaces", null);
        setField(term40714, term40714.getClass(), "subTypes", null);
        setField(term40714, term40714.getClass(), "templateTypeName", null);
        setField(term40714, term40714.getClass(), "className", null);
        setField(term40714, term40714.getClass(), "properties", null);
        setBooleanField(term40714, term40714.getClass(), "nativeType", false);
        setField(term40714, term40714.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term40714, term40714.getClass(), "prettyPrint", false);
        setBooleanField(term40714, term40714.getClass(), "visited", false);
        setField(term40714, term40714.getClass(), "docInfo", null);
        setBooleanField(term40714, term40714.getClass(), "unknown", false);
        setBooleanField(term40714, term40714.getClass(), "resolved", false);
        setField(term40714, term40714.getClass(), "resolveResult", null);
        setField(term40714, term40714.getClass(), "registry", null);
        setField(term40713, term40713.getClass(), "jsType", term40714);
        setField(term40713, term40713.getClass(), "parent", null);
        term40676 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term40676, term40676.getClass(), "this$0", null);
        setField(term40676, term40676.getClass(), "call", null);
        setField(term40676, term40676.getClass(), "prototype", null);
        setField(term40676, term40676.getClass(), "kind", null);
        setField(term40676, term40676.getClass(), "typeOfThis", null);
        setField(term40676, term40676.getClass(), "source", null);
        setField(term40676, term40676.getClass(), "implementedInterfaces", null);
        setField(term40676, term40676.getClass(), "subTypes", null);
        setField(term40676, term40676.getClass(), "templateTypeName", null);
        setField(term40676, term40676.getClass(), "className", null);
        setField(term40676, term40676.getClass(), "properties", null);
        setBooleanField(term40676, term40676.getClass(), "nativeType", false);
        setField(term40676, term40676.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term40676, term40676.getClass(), "prettyPrint", false);
        setBooleanField(term40676, term40676.getClass(), "visited", false);
        setField(term40676, term40676.getClass(), "docInfo", null);
        setBooleanField(term40676, term40676.getClass(), "unknown", false);
        setBooleanField(term40676, term40676.getClass(), "resolved", false);
        setField(term40676, term40676.getClass(), "resolveResult", null);
        setField(term40676, term40676.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term39881;
        args[1] = term40059;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term39811, args);
        assertTrue(recursiveEquals(term39811, term40711));
        assertTrue(recursiveEquals(term39881, term40712));
        assertTrue(recursiveEquals(term40059, term40713));
        assertTrue(recursiveEquals(retValue, term40676));
    }

};


