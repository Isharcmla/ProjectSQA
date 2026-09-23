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

public class TypeCheck_visit_8595247841644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555121;
     Object term555281;
     Object term555843;
     Object term555845;

    public TypeCheck_visit_8595247841644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555121 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term555211 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term555121, term555121.getClass(), "validator", term555211);
        term555281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term555351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term555463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term555281, term555281.getClass(), "type", 119);
        setField(term555351, term555351.getClass(), "jsType", term555463);
        setField(term555281, term555281.getClass(), "first", term555351);
        term555843 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term555844 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term555843, term555843.getClass(), "compiler", null);
        setField(term555844, term555844.getClass(), "compiler", null);
        setField(term555844, term555844.getClass(), "typeRegistry", null);
        setField(term555844, term555844.getClass(), "allValueTypes", null);
        setBooleanField(term555844, term555844.getClass(), "shouldReport", false);
        setField(term555844, term555844.getClass(), "nullOrUndefined", null);
        setField(term555844, term555844.getClass(), "mismatches", null);
        setField(term555843, term555843.getClass(), "validator", term555844);
        setField(term555843, term555843.getClass(), "reverseInterpreter", null);
        setField(term555843, term555843.getClass(), "typeRegistry", null);
        setField(term555843, term555843.getClass(), "topScope", null);
        setField(term555843, term555843.getClass(), "scopeCreator", null);
        setField(term555843, term555843.getClass(), "reportMissingOverride", null);
        setField(term555843, term555843.getClass(), "reportUnknownTypes", null);
        setBooleanField(term555843, term555843.getClass(), "reportMissingProperties", false);
        setField(term555843, term555843.getClass(), "inferJSDocInfo", null);
        setIntField(term555843, term555843.getClass(), "typedCount", 0);
        setIntField(term555843, term555843.getClass(), "nullCount", 0);
        setIntField(term555843, term555843.getClass(), "unknownCount", 0);
        setBooleanField(term555843, term555843.getClass(), "inExterns", false);
        setIntField(term555843, term555843.getClass(), "noTypeCheckSection", 0);
        term555845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term555846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term555847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term555845, term555845.getClass(), "type", 119);
        setField(term555845, term555845.getClass(), "next", null);
        setIntField(term555846, term555846.getClass(), "type", 0);
        setField(term555846, term555846.getClass(), "next", null);
        setField(term555846, term555846.getClass(), "first", null);
        setField(term555846, term555846.getClass(), "last", null);
        setField(term555846, term555846.getClass(), "propListHead", null);
        setIntField(term555846, term555846.getClass(), "sourcePosition", 0);
        setField(term555847, term555847.getClass(), "constructor", null);
        setField(term555847, term555847.getClass(), "className", null);
        setField(term555847, term555847.getClass(), "properties", null);
        setBooleanField(term555847, term555847.getClass(), "nativeType", false);
        setField(term555847, term555847.getClass(), "implicitPrototypeFallback", null);
        setField(term555847, term555847.getClass(), "ownerFunction", null);
        setBooleanField(term555847, term555847.getClass(), "prettyPrint", false);
        setBooleanField(term555847, term555847.getClass(), "visited", false);
        setField(term555847, term555847.getClass(), "docInfo", null);
        setBooleanField(term555847, term555847.getClass(), "unknown", false);
        setBooleanField(term555847, term555847.getClass(), "resolved", false);
        setField(term555847, term555847.getClass(), "resolveResult", null);
        setField(term555847, term555847.getClass(), "templateKeys", null);
        setField(term555847, term555847.getClass(), "templatizedTypes", null);
        setBooleanField(term555847, term555847.getClass(), "inTemplatedCheckVisit", false);
        setField(term555847, term555847.getClass(), "registry", null);
        setField(term555846, term555846.getClass(), "jsType", term555847);
        setField(term555846, term555846.getClass(), "parent", null);
        setField(term555845, term555845.getClass(), "first", term555846);
        setField(term555845, term555845.getClass(), "last", null);
        setField(term555845, term555845.getClass(), "propListHead", null);
        setIntField(term555845, term555845.getClass(), "sourcePosition", 0);
        setField(term555845, term555845.getClass(), "jsType", null);
        setField(term555845, term555845.getClass(), "parent", null);
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
        args[1] = term555281;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term555121, args);
        assertTrue(recursiveEquals(term555121, term555843));
        assertTrue(recursiveEquals(term555281, null));
    }

};


