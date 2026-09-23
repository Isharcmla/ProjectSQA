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

public class TypeCheck_visit_8595247841240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361754;
     Object term361824;
     Object term362004;
     Object term362071;
     Object term362072;
     Object term362074;

    public TypeCheck_visit_8595247841240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361754 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setBooleanField(term361754, term361754.getClass(), "inExterns", true);
        term361824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term361824, term361824.getClass(), "type", 38);
        setField(term361824, term361824.getClass(), "jsType", term361934);
        setField(term361824, term361824.getClass(), "propListHead", null);
        term362004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term362004, term362004.getClass(), "type", 38);
        term362071 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term362071, term362071.getClass(), "compiler", null);
        setField(term362071, term362071.getClass(), "validator", null);
        setField(term362071, term362071.getClass(), "reverseInterpreter", null);
        setField(term362071, term362071.getClass(), "typeRegistry", null);
        setField(term362071, term362071.getClass(), "topScope", null);
        setField(term362071, term362071.getClass(), "scopeCreator", null);
        setField(term362071, term362071.getClass(), "reportMissingOverride", null);
        setField(term362071, term362071.getClass(), "reportUnknownTypes", null);
        setBooleanField(term362071, term362071.getClass(), "reportMissingProperties", false);
        setField(term362071, term362071.getClass(), "inferJSDocInfo", null);
        setIntField(term362071, term362071.getClass(), "typedCount", 0);
        setIntField(term362071, term362071.getClass(), "nullCount", 0);
        setIntField(term362071, term362071.getClass(), "unknownCount", 0);
        setBooleanField(term362071, term362071.getClass(), "inExterns", true);
        setIntField(term362071, term362071.getClass(), "noTypeCheckSection", 0);
        term362072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term362073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term362072, term362072.getClass(), "type", 38);
        setField(term362072, term362072.getClass(), "next", null);
        setField(term362072, term362072.getClass(), "first", null);
        setField(term362072, term362072.getClass(), "last", null);
        setField(term362072, term362072.getClass(), "propListHead", null);
        setIntField(term362072, term362072.getClass(), "sourcePosition", 0);
        setField(term362073, term362073.getClass(), "call", null);
        setField(term362073, term362073.getClass(), "prototypeSlot", null);
        setField(term362073, term362073.getClass(), "kind", null);
        setField(term362073, term362073.getClass(), "propAccess", null);
        setField(term362073, term362073.getClass(), "typeOfThis", null);
        setField(term362073, term362073.getClass(), "source", null);
        setField(term362073, term362073.getClass(), "implementedInterfaces", null);
        setField(term362073, term362073.getClass(), "extendedInterfaces", null);
        setField(term362073, term362073.getClass(), "subTypes", null);
        setField(term362073, term362073.getClass(), "templateTypeNames", null);
        setField(term362073, term362073.getClass(), "className", null);
        setField(term362073, term362073.getClass(), "properties", null);
        setBooleanField(term362073, term362073.getClass(), "nativeType", false);
        setField(term362073, term362073.getClass(), "implicitPrototypeFallback", null);
        setField(term362073, term362073.getClass(), "ownerFunction", null);
        setBooleanField(term362073, term362073.getClass(), "prettyPrint", false);
        setBooleanField(term362073, term362073.getClass(), "visited", false);
        setField(term362073, term362073.getClass(), "docInfo", null);
        setBooleanField(term362073, term362073.getClass(), "unknown", false);
        setBooleanField(term362073, term362073.getClass(), "resolved", false);
        setField(term362073, term362073.getClass(), "resolveResult", null);
        setBooleanField(term362073, term362073.getClass(), "inTemplatedCheckVisit", false);
        setField(term362073, term362073.getClass(), "registry", null);
        setField(term362072, term362072.getClass(), "jsType", term362073);
        setField(term362072, term362072.getClass(), "parent", null);
        term362074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term362074, term362074.getClass(), "type", 38);
        setField(term362074, term362074.getClass(), "next", null);
        setField(term362074, term362074.getClass(), "first", null);
        setField(term362074, term362074.getClass(), "last", null);
        setField(term362074, term362074.getClass(), "propListHead", null);
        setIntField(term362074, term362074.getClass(), "sourcePosition", 0);
        setField(term362074, term362074.getClass(), "jsType", null);
        setField(term362074, term362074.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term361824;
        args[2] = term362004;
        callMethod(klass, "visit", argTypes, term361754, args);
        assertTrue(recursiveEquals(term361754, term362071));
        assertTrue(recursiveEquals(term361824, term362074));
        assertTrue(recursiveEquals(term362004, null));
    }

};


