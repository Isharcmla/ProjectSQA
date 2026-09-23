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

public class TypeCheck_shouldTraverse_435604074544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144614;
     Object term144774;
     Object term144798;
     Object term144800;

    public TypeCheck_shouldTraverse_435604074544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144614 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term144704 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term144614, term144614.getClass(), "validator", term144704);
        setIntField(term144614, term144614.getClass(), "noTypeCheckSection", 0);
        term144774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144774, term144774.getClass(), "type", 125);
        setField(term144774, term144774.getClass(), "propListHead", null);
        term144798 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term144799 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term144798, term144798.getClass(), "compiler", null);
        setField(term144799, term144799.getClass(), "compiler", null);
        setField(term144799, term144799.getClass(), "typeRegistry", null);
        setField(term144799, term144799.getClass(), "allValueTypes", null);
        setBooleanField(term144799, term144799.getClass(), "shouldReport", true);
        setField(term144799, term144799.getClass(), "nullOrUndefined", null);
        setField(term144799, term144799.getClass(), "mismatches", null);
        setField(term144798, term144798.getClass(), "validator", term144799);
        setField(term144798, term144798.getClass(), "reverseInterpreter", null);
        setField(term144798, term144798.getClass(), "typeRegistry", null);
        setField(term144798, term144798.getClass(), "topScope", null);
        setField(term144798, term144798.getClass(), "scopeCreator", null);
        setField(term144798, term144798.getClass(), "reportMissingOverride", null);
        setField(term144798, term144798.getClass(), "reportUnknownTypes", null);
        setBooleanField(term144798, term144798.getClass(), "reportMissingProperties", false);
        setField(term144798, term144798.getClass(), "inferJSDocInfo", null);
        setIntField(term144798, term144798.getClass(), "typedCount", 0);
        setIntField(term144798, term144798.getClass(), "nullCount", 0);
        setIntField(term144798, term144798.getClass(), "unknownCount", 0);
        setBooleanField(term144798, term144798.getClass(), "inExterns", false);
        setIntField(term144798, term144798.getClass(), "noTypeCheckSection", 0);
        term144800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144800, term144800.getClass(), "type", 125);
        setField(term144800, term144800.getClass(), "next", null);
        setField(term144800, term144800.getClass(), "first", null);
        setField(term144800, term144800.getClass(), "last", null);
        setField(term144800, term144800.getClass(), "propListHead", null);
        setIntField(term144800, term144800.getClass(), "sourcePosition", 0);
        setField(term144800, term144800.getClass(), "jsType", null);
        setField(term144800, term144800.getClass(), "parent", null);
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
        args[1] = term144774;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term144614, args);
        assertTrue(recursiveEquals(term144614, term144798));
        assertTrue(recursiveEquals(term144774, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


