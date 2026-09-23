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

public class TypeCheck_visitName_1546932345456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138524;
     Object term138594;
     Object term138768;
     Object term138823;
     Object term138824;
     Object term138825;

    public TypeCheck_visitName_1546932345456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138524 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term138594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term138594, term138594.getClass(), "jsType", term138698);
        setIntField(term138594, term138594.getClass(), "type", 105);
        term138768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term138768, term138768.getClass(), "type", 16);
        term138823 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term138823, term138823.getClass(), "compiler", null);
        setField(term138823, term138823.getClass(), "validator", null);
        setField(term138823, term138823.getClass(), "reverseInterpreter", null);
        setField(term138823, term138823.getClass(), "typeRegistry", null);
        setField(term138823, term138823.getClass(), "topScope", null);
        setField(term138823, term138823.getClass(), "scopeCreator", null);
        setField(term138823, term138823.getClass(), "reportMissingOverride", null);
        setField(term138823, term138823.getClass(), "reportUnknownTypes", null);
        setBooleanField(term138823, term138823.getClass(), "reportMissingProperties", false);
        setField(term138823, term138823.getClass(), "inferJSDocInfo", null);
        setIntField(term138823, term138823.getClass(), "typedCount", 0);
        setIntField(term138823, term138823.getClass(), "nullCount", 0);
        setIntField(term138823, term138823.getClass(), "unknownCount", 0);
        setBooleanField(term138823, term138823.getClass(), "inExterns", false);
        setIntField(term138823, term138823.getClass(), "noTypeCheckSection", 0);
        term138824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term138824, term138824.getClass(), "type", 16);
        setField(term138824, term138824.getClass(), "next", null);
        setField(term138824, term138824.getClass(), "first", null);
        setField(term138824, term138824.getClass(), "last", null);
        setField(term138824, term138824.getClass(), "propListHead", null);
        setIntField(term138824, term138824.getClass(), "sourcePosition", 0);
        setField(term138824, term138824.getClass(), "jsType", null);
        setField(term138824, term138824.getClass(), "parent", null);
        term138825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term138825, term138825.getClass(), "type", 105);
        setField(term138825, term138825.getClass(), "next", null);
        setField(term138825, term138825.getClass(), "first", null);
        setField(term138825, term138825.getClass(), "last", null);
        setField(term138825, term138825.getClass(), "propListHead", null);
        setIntField(term138825, term138825.getClass(), "sourcePosition", 0);
        setField(term138826, term138826.getClass(), "call", null);
        setField(term138826, term138826.getClass(), "prototype", null);
        setField(term138826, term138826.getClass(), "kind", null);
        setField(term138826, term138826.getClass(), "typeOfThis", null);
        setField(term138826, term138826.getClass(), "source", null);
        setField(term138826, term138826.getClass(), "implementedInterfaces", null);
        setField(term138826, term138826.getClass(), "extendedInterfaces", null);
        setField(term138826, term138826.getClass(), "subTypes", null);
        setField(term138826, term138826.getClass(), "templateTypeName", null);
        setField(term138826, term138826.getClass(), "className", null);
        setField(term138826, term138826.getClass(), "properties", null);
        setBooleanField(term138826, term138826.getClass(), "nativeType", false);
        setField(term138826, term138826.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term138826, term138826.getClass(), "prettyPrint", false);
        setBooleanField(term138826, term138826.getClass(), "visited", false);
        setField(term138826, term138826.getClass(), "docInfo", null);
        setBooleanField(term138826, term138826.getClass(), "unknown", false);
        setBooleanField(term138826, term138826.getClass(), "resolved", false);
        setField(term138826, term138826.getClass(), "resolveResult", null);
        setField(term138826, term138826.getClass(), "registry", null);
        setField(term138825, term138825.getClass(), "jsType", term138826);
        setField(term138825, term138825.getClass(), "parent", null);
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
        args[1] = term138594;
        args[2] = term138768;
        Object retValue = callMethod(klass, "visitName", argTypes, term138524, args);
        assertTrue(recursiveEquals(term138524, term138823));
        assertTrue(recursiveEquals(term138594, term138825));
        assertTrue(recursiveEquals(term138768, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


