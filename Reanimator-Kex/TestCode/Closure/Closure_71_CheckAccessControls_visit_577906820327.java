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

public class CheckAccessControls_visit_577906820327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104923;
     Object term104993;
     Object term105652;
     Object term105653;

    public CheckAccessControls_visit_577906820327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104923 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term104993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term105209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setIntField(term104993, term104993.getClass(), "type", 30);
        setField(term105103, term105103.getClass(), "docInfo", null);
        setField(term105103, term105103.getClass(), "implicitPrototypeFallback", term105209);
        setField(term104993, term104993.getClass(), "jsType", term105103);
        term105652 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term105652, term105652.getClass(), "compiler", null);
        setField(term105652, term105652.getClass(), "validator", null);
        setIntField(term105652, term105652.getClass(), "deprecatedDepth", 0);
        setIntField(term105652, term105652.getClass(), "methodDepth", 0);
        setField(term105652, term105652.getClass(), "currentClass", null);
        setField(term105652, term105652.getClass(), "initializedConstantProperties", null);
        term105653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term105655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setIntField(term105653, term105653.getClass(), "type", 30);
        setField(term105653, term105653.getClass(), "next", null);
        setField(term105653, term105653.getClass(), "first", null);
        setField(term105653, term105653.getClass(), "last", null);
        setField(term105653, term105653.getClass(), "propListHead", null);
        setIntField(term105653, term105653.getClass(), "sourcePosition", 0);
        setField(term105654, term105654.getClass(), "call", null);
        setField(term105654, term105654.getClass(), "prototype", null);
        setField(term105654, term105654.getClass(), "kind", null);
        setField(term105654, term105654.getClass(), "typeOfThis", null);
        setField(term105654, term105654.getClass(), "source", null);
        setField(term105654, term105654.getClass(), "implementedInterfaces", null);
        setField(term105654, term105654.getClass(), "subTypes", null);
        setField(term105654, term105654.getClass(), "templateTypeName", null);
        setField(term105654, term105654.getClass(), "className", null);
        setField(term105654, term105654.getClass(), "properties", null);
        setBooleanField(term105654, term105654.getClass(), "nativeType", false);
        setField(term105655, term105655.getClass(), "primitiveType", null);
        setField(term105655, term105655.getClass(), "primitiveObjectType", null);
        setField(term105655, term105655.getClass(), "name", null);
        setBooleanField(term105655, term105655.getClass(), "visited", false);
        setField(term105655, term105655.getClass(), "docInfo", null);
        setBooleanField(term105655, term105655.getClass(), "unknown", false);
        setBooleanField(term105655, term105655.getClass(), "resolved", false);
        setField(term105655, term105655.getClass(), "resolveResult", null);
        setField(term105655, term105655.getClass(), "registry", null);
        setField(term105654, term105654.getClass(), "implicitPrototypeFallback", term105655);
        setBooleanField(term105654, term105654.getClass(), "prettyPrint", false);
        setBooleanField(term105654, term105654.getClass(), "visited", false);
        setField(term105654, term105654.getClass(), "docInfo", null);
        setBooleanField(term105654, term105654.getClass(), "unknown", false);
        setBooleanField(term105654, term105654.getClass(), "resolved", false);
        setField(term105654, term105654.getClass(), "resolveResult", null);
        setField(term105654, term105654.getClass(), "registry", null);
        setField(term105653, term105653.getClass(), "jsType", term105654);
        setField(term105653, term105653.getClass(), "parent", null);
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
        args[1] = term104993;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term104923, args);
        assertTrue(recursiveEquals(term104923, term105652));
        assertTrue(recursiveEquals(term104993, null));
    }

};


