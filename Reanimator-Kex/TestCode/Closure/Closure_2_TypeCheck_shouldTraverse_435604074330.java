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

public class TypeCheck_shouldTraverse_435604074330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80760;
     Object term80920;
     Object term81199;
     Object term81201;

    public TypeCheck_shouldTraverse_435604074330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80760 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term80850 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term80760, term80760.getClass(), "validator", term80850);
        setIntField(term80760, term80760.getClass(), "noTypeCheckSection", 0);
        term80920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80920, term80920.getClass(), "type", 86);
        setField(term80920, term80920.getClass(), "propListHead", null);
        term81199 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term81200 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term81199, term81199.getClass(), "compiler", null);
        setField(term81200, term81200.getClass(), "compiler", null);
        setField(term81200, term81200.getClass(), "typeRegistry", null);
        setField(term81200, term81200.getClass(), "allValueTypes", null);
        setBooleanField(term81200, term81200.getClass(), "shouldReport", true);
        setField(term81200, term81200.getClass(), "nullOrUndefined", null);
        setField(term81200, term81200.getClass(), "mismatches", null);
        setField(term81199, term81199.getClass(), "validator", term81200);
        setField(term81199, term81199.getClass(), "reverseInterpreter", null);
        setField(term81199, term81199.getClass(), "typeRegistry", null);
        setField(term81199, term81199.getClass(), "topScope", null);
        setField(term81199, term81199.getClass(), "scopeCreator", null);
        setField(term81199, term81199.getClass(), "reportMissingOverride", null);
        setField(term81199, term81199.getClass(), "reportUnknownTypes", null);
        setBooleanField(term81199, term81199.getClass(), "reportMissingProperties", false);
        setField(term81199, term81199.getClass(), "inferJSDocInfo", null);
        setIntField(term81199, term81199.getClass(), "typedCount", 0);
        setIntField(term81199, term81199.getClass(), "nullCount", 0);
        setIntField(term81199, term81199.getClass(), "unknownCount", 0);
        setBooleanField(term81199, term81199.getClass(), "inExterns", false);
        setIntField(term81199, term81199.getClass(), "noTypeCheckSection", 0);
        term81201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81201, term81201.getClass(), "type", 86);
        setField(term81201, term81201.getClass(), "next", null);
        setField(term81201, term81201.getClass(), "first", null);
        setField(term81201, term81201.getClass(), "last", null);
        setField(term81201, term81201.getClass(), "propListHead", null);
        setIntField(term81201, term81201.getClass(), "sourcePosition", 0);
        setField(term81201, term81201.getClass(), "jsType", null);
        setField(term81201, term81201.getClass(), "parent", null);
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
        args[1] = term80920;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term80760, args);
        assertTrue(recursiveEquals(term80760, term81199));
        assertTrue(recursiveEquals(term80920, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


