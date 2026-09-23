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

public class CheckAccessControls_visit_577906820339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108099;
     Object term108169;
     Object term109392;
     Object term109393;

    public CheckAccessControls_visit_577906820339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108099 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term108169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term108379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term108169, term108169.getClass(), "type", 30);
        setField(term108279, term108279.getClass(), "docInfo", null);
        setField(term108279, term108279.getClass(), "implicitPrototypeFallback", term108379);
        setField(term108169, term108169.getClass(), "jsType", term108279);
        term109392 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term109392, term109392.getClass(), "compiler", null);
        setField(term109392, term109392.getClass(), "validator", null);
        setIntField(term109392, term109392.getClass(), "deprecatedDepth", 0);
        setIntField(term109392, term109392.getClass(), "methodDepth", 0);
        setField(term109392, term109392.getClass(), "currentClass", null);
        setField(term109392, term109392.getClass(), "initializedConstantProperties", null);
        term109393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term109395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term109393, term109393.getClass(), "type", 30);
        setField(term109393, term109393.getClass(), "next", null);
        setField(term109393, term109393.getClass(), "first", null);
        setField(term109393, term109393.getClass(), "last", null);
        setField(term109393, term109393.getClass(), "propListHead", null);
        setIntField(term109393, term109393.getClass(), "sourcePosition", 0);
        setField(term109394, term109394.getClass(), "call", null);
        setField(term109394, term109394.getClass(), "prototype", null);
        setField(term109394, term109394.getClass(), "kind", null);
        setField(term109394, term109394.getClass(), "typeOfThis", null);
        setField(term109394, term109394.getClass(), "source", null);
        setField(term109394, term109394.getClass(), "implementedInterfaces", null);
        setField(term109394, term109394.getClass(), "subTypes", null);
        setField(term109394, term109394.getClass(), "templateTypeName", null);
        setField(term109394, term109394.getClass(), "className", null);
        setField(term109394, term109394.getClass(), "properties", null);
        setBooleanField(term109394, term109394.getClass(), "nativeType", false);
        setField(term109395, term109395.getClass(), "call", null);
        setField(term109395, term109395.getClass(), "prototype", null);
        setField(term109395, term109395.getClass(), "kind", null);
        setField(term109395, term109395.getClass(), "typeOfThis", null);
        setField(term109395, term109395.getClass(), "source", null);
        setField(term109395, term109395.getClass(), "implementedInterfaces", null);
        setField(term109395, term109395.getClass(), "subTypes", null);
        setField(term109395, term109395.getClass(), "templateTypeName", null);
        setField(term109395, term109395.getClass(), "className", null);
        setField(term109395, term109395.getClass(), "properties", null);
        setBooleanField(term109395, term109395.getClass(), "nativeType", false);
        setField(term109395, term109395.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term109395, term109395.getClass(), "prettyPrint", false);
        setBooleanField(term109395, term109395.getClass(), "visited", false);
        setField(term109395, term109395.getClass(), "docInfo", null);
        setBooleanField(term109395, term109395.getClass(), "unknown", false);
        setBooleanField(term109395, term109395.getClass(), "resolved", false);
        setField(term109395, term109395.getClass(), "resolveResult", null);
        setField(term109395, term109395.getClass(), "registry", null);
        setField(term109394, term109394.getClass(), "implicitPrototypeFallback", term109395);
        setBooleanField(term109394, term109394.getClass(), "prettyPrint", false);
        setBooleanField(term109394, term109394.getClass(), "visited", false);
        setField(term109394, term109394.getClass(), "docInfo", null);
        setBooleanField(term109394, term109394.getClass(), "unknown", false);
        setBooleanField(term109394, term109394.getClass(), "resolved", false);
        setField(term109394, term109394.getClass(), "resolveResult", null);
        setField(term109394, term109394.getClass(), "registry", null);
        setField(term109393, term109393.getClass(), "jsType", term109394);
        setField(term109393, term109393.getClass(), "parent", null);
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
        args[1] = term108169;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term108099, args);
        assertTrue(recursiveEquals(term108099, term109392));
        assertTrue(recursiveEquals(term108169, null));
    }

};


