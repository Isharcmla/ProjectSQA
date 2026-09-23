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

public class TypeCheck_visit_859524784444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107612;
     Object term107682;
     Object term107824;
     Object term107825;

    public TypeCheck_visit_859524784444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107612 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setBooleanField(term107612, term107612.getClass(), "inExterns", false);
        term107682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term107682, term107682.getClass(), "type", 148);
        setField(term107682, term107682.getClass(), "jsType", term107782);
        term107824 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term107824, term107824.getClass(), "compiler", null);
        setField(term107824, term107824.getClass(), "validator", null);
        setField(term107824, term107824.getClass(), "reverseInterpreter", null);
        setField(term107824, term107824.getClass(), "typeRegistry", null);
        setField(term107824, term107824.getClass(), "topScope", null);
        setField(term107824, term107824.getClass(), "scopeCreator", null);
        setField(term107824, term107824.getClass(), "reportMissingOverride", null);
        setField(term107824, term107824.getClass(), "reportUnknownTypes", null);
        setBooleanField(term107824, term107824.getClass(), "reportMissingProperties", false);
        setField(term107824, term107824.getClass(), "inferJSDocInfo", null);
        setIntField(term107824, term107824.getClass(), "typedCount", 1);
        setIntField(term107824, term107824.getClass(), "nullCount", 0);
        setIntField(term107824, term107824.getClass(), "unknownCount", 0);
        setBooleanField(term107824, term107824.getClass(), "inExterns", false);
        setIntField(term107824, term107824.getClass(), "noTypeCheckSection", 0);
        term107825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term107825, term107825.getClass(), "type", 148);
        setField(term107825, term107825.getClass(), "next", null);
        setField(term107825, term107825.getClass(), "first", null);
        setField(term107825, term107825.getClass(), "last", null);
        setField(term107825, term107825.getClass(), "propListHead", null);
        setIntField(term107825, term107825.getClass(), "sourcePosition", 0);
        setField(term107826, term107826.getClass(), "call", null);
        setField(term107826, term107826.getClass(), "prototypeSlot", null);
        setField(term107826, term107826.getClass(), "kind", null);
        setField(term107826, term107826.getClass(), "propAccess", null);
        setField(term107826, term107826.getClass(), "typeOfThis", null);
        setField(term107826, term107826.getClass(), "source", null);
        setField(term107826, term107826.getClass(), "implementedInterfaces", null);
        setField(term107826, term107826.getClass(), "extendedInterfaces", null);
        setField(term107826, term107826.getClass(), "subTypes", null);
        setField(term107826, term107826.getClass(), "templateTypeNames", null);
        setField(term107826, term107826.getClass(), "className", null);
        setField(term107826, term107826.getClass(), "properties", null);
        setBooleanField(term107826, term107826.getClass(), "nativeType", false);
        setField(term107826, term107826.getClass(), "implicitPrototypeFallback", null);
        setField(term107826, term107826.getClass(), "ownerFunction", null);
        setBooleanField(term107826, term107826.getClass(), "prettyPrint", false);
        setBooleanField(term107826, term107826.getClass(), "visited", false);
        setField(term107826, term107826.getClass(), "docInfo", null);
        setBooleanField(term107826, term107826.getClass(), "unknown", false);
        setBooleanField(term107826, term107826.getClass(), "resolved", false);
        setField(term107826, term107826.getClass(), "resolveResult", null);
        setBooleanField(term107826, term107826.getClass(), "inTemplatedCheckVisit", false);
        setField(term107826, term107826.getClass(), "registry", null);
        setField(term107825, term107825.getClass(), "jsType", term107826);
        setField(term107825, term107825.getClass(), "parent", null);
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
        args[1] = term107682;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term107612, args);
        assertTrue(recursiveEquals(term107612, term107824));
        assertTrue(recursiveEquals(term107682, null));
    }

};


