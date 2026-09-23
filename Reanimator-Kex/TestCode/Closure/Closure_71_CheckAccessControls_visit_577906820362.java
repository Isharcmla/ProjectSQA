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

public class CheckAccessControls_visit_577906820362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109546;
     Object term109616;
     Object term189713;
     Object term189714;

    public CheckAccessControls_visit_577906820362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109546 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term109616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109726 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term109836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term109616, term109616.getClass(), "type", 30);
        setField(term109726, term109726.getClass(), "docInfo", null);
        setField(term109726, term109726.getClass(), "implicitPrototypeFallback", term109836);
        setField(term109616, term109616.getClass(), "jsType", term109726);
        term189713 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term189713, term189713.getClass(), "compiler", null);
        setField(term189713, term189713.getClass(), "validator", null);
        setIntField(term189713, term189713.getClass(), "deprecatedDepth", 0);
        setIntField(term189713, term189713.getClass(), "methodDepth", 0);
        setField(term189713, term189713.getClass(), "currentClass", null);
        setField(term189713, term189713.getClass(), "initializedConstantProperties", null);
        term189714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term189716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term189714, term189714.getClass(), "type", 30);
        setField(term189714, term189714.getClass(), "next", null);
        setField(term189714, term189714.getClass(), "first", null);
        setField(term189714, term189714.getClass(), "last", null);
        setField(term189714, term189714.getClass(), "propListHead", null);
        setIntField(term189714, term189714.getClass(), "sourcePosition", 0);
        setField(term189715, term189715.getClass(), "call", null);
        setField(term189715, term189715.getClass(), "prototype", null);
        setField(term189715, term189715.getClass(), "kind", null);
        setField(term189715, term189715.getClass(), "typeOfThis", null);
        setField(term189715, term189715.getClass(), "source", null);
        setField(term189715, term189715.getClass(), "implementedInterfaces", null);
        setField(term189715, term189715.getClass(), "subTypes", null);
        setField(term189715, term189715.getClass(), "templateTypeName", null);
        setField(term189715, term189715.getClass(), "className", null);
        setField(term189715, term189715.getClass(), "properties", null);
        setBooleanField(term189715, term189715.getClass(), "nativeType", false);
        setField(term189716, term189716.getClass(), "call", null);
        setField(term189716, term189716.getClass(), "prototype", null);
        setField(term189716, term189716.getClass(), "kind", null);
        setField(term189716, term189716.getClass(), "typeOfThis", null);
        setField(term189716, term189716.getClass(), "source", null);
        setField(term189716, term189716.getClass(), "implementedInterfaces", null);
        setField(term189716, term189716.getClass(), "subTypes", null);
        setField(term189716, term189716.getClass(), "templateTypeName", null);
        setField(term189716, term189716.getClass(), "className", null);
        setField(term189716, term189716.getClass(), "properties", null);
        setBooleanField(term189716, term189716.getClass(), "nativeType", false);
        setField(term189716, term189716.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term189716, term189716.getClass(), "prettyPrint", false);
        setBooleanField(term189716, term189716.getClass(), "visited", false);
        setField(term189716, term189716.getClass(), "docInfo", null);
        setBooleanField(term189716, term189716.getClass(), "unknown", false);
        setBooleanField(term189716, term189716.getClass(), "resolved", false);
        setField(term189716, term189716.getClass(), "resolveResult", null);
        setField(term189716, term189716.getClass(), "registry", null);
        setField(term189715, term189715.getClass(), "implicitPrototypeFallback", term189716);
        setBooleanField(term189715, term189715.getClass(), "prettyPrint", false);
        setBooleanField(term189715, term189715.getClass(), "visited", false);
        setField(term189715, term189715.getClass(), "docInfo", null);
        setBooleanField(term189715, term189715.getClass(), "unknown", false);
        setBooleanField(term189715, term189715.getClass(), "resolved", false);
        setField(term189715, term189715.getClass(), "resolveResult", null);
        setField(term189715, term189715.getClass(), "registry", null);
        setField(term189714, term189714.getClass(), "jsType", term189715);
        setField(term189714, term189714.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term109616;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term109546, args);
        assertTrue(recursiveEquals(term109546, term189713));
        assertTrue(recursiveEquals(term109616, null));
    }

};


