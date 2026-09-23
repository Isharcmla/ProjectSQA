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

public class TypeCheck_visit_859524784157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45398;
     Object term45468;
     Object term45484;
     Object term45485;

    public TypeCheck_visit_859524784157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45398 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term45468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45468, term45468.getClass(), "type", 114);
        term45484 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term45484, term45484.getClass(), "compiler", null);
        setField(term45484, term45484.getClass(), "validator", null);
        setField(term45484, term45484.getClass(), "reverseInterpreter", null);
        setField(term45484, term45484.getClass(), "typeRegistry", null);
        setField(term45484, term45484.getClass(), "topScope", null);
        setField(term45484, term45484.getClass(), "scopeCreator", null);
        setField(term45484, term45484.getClass(), "reportMissingOverride", null);
        setField(term45484, term45484.getClass(), "reportUnknownTypes", null);
        setBooleanField(term45484, term45484.getClass(), "reportMissingProperties", false);
        setField(term45484, term45484.getClass(), "inferJSDocInfo", null);
        setIntField(term45484, term45484.getClass(), "typedCount", 0);
        setIntField(term45484, term45484.getClass(), "nullCount", 0);
        setIntField(term45484, term45484.getClass(), "unknownCount", 0);
        setBooleanField(term45484, term45484.getClass(), "inExterns", false);
        setIntField(term45484, term45484.getClass(), "noTypeCheckSection", 0);
        term45485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45485, term45485.getClass(), "type", 114);
        setField(term45485, term45485.getClass(), "next", null);
        setField(term45485, term45485.getClass(), "first", null);
        setField(term45485, term45485.getClass(), "last", null);
        setField(term45485, term45485.getClass(), "propListHead", null);
        setIntField(term45485, term45485.getClass(), "sourcePosition", 0);
        setField(term45485, term45485.getClass(), "jsType", null);
        setField(term45485, term45485.getClass(), "parent", null);
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
        args[1] = term45468;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term45398, args);
        assertTrue(recursiveEquals(term45398, term45484));
        assertTrue(recursiveEquals(term45468, null));
    }

};


