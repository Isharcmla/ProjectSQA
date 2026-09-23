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

public class TypeCheck_shouldTraverse_435604074364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107008;
     Object term107168;
     Object term107293;
     Object term107295;

    public TypeCheck_shouldTraverse_435604074364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107008 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term107098 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term107008, term107008.getClass(), "validator", term107098);
        setIntField(term107008, term107008.getClass(), "noTypeCheckSection", 0);
        term107168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107264 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term107168, term107168.getClass(), "type", 118);
        setIntField(term107264, term107264.getClass(), "type", -30);
        setField(term107264, term107264.getClass(), "next", null);
        setField(term107168, term107168.getClass(), "propListHead", term107264);
        term107293 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term107294 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term107293, term107293.getClass(), "compiler", null);
        setField(term107294, term107294.getClass(), "compiler", null);
        setField(term107294, term107294.getClass(), "typeRegistry", null);
        setField(term107294, term107294.getClass(), "allValueTypes", null);
        setBooleanField(term107294, term107294.getClass(), "shouldReport", true);
        setField(term107294, term107294.getClass(), "nullOrUndefined", null);
        setField(term107294, term107294.getClass(), "mismatches", null);
        setField(term107293, term107293.getClass(), "validator", term107294);
        setField(term107293, term107293.getClass(), "reverseInterpreter", null);
        setField(term107293, term107293.getClass(), "typeRegistry", null);
        setField(term107293, term107293.getClass(), "topScope", null);
        setField(term107293, term107293.getClass(), "scopeCreator", null);
        setField(term107293, term107293.getClass(), "reportMissingOverride", null);
        setField(term107293, term107293.getClass(), "reportUnknownTypes", null);
        setBooleanField(term107293, term107293.getClass(), "reportMissingProperties", false);
        setField(term107293, term107293.getClass(), "inferJSDocInfo", null);
        setIntField(term107293, term107293.getClass(), "typedCount", 0);
        setIntField(term107293, term107293.getClass(), "nullCount", 0);
        setIntField(term107293, term107293.getClass(), "unknownCount", 0);
        setBooleanField(term107293, term107293.getClass(), "inExterns", false);
        setIntField(term107293, term107293.getClass(), "noTypeCheckSection", 0);
        term107295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107296 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term107295, term107295.getClass(), "type", 118);
        setField(term107295, term107295.getClass(), "next", null);
        setField(term107295, term107295.getClass(), "first", null);
        setField(term107295, term107295.getClass(), "last", null);
        setField(term107296, term107296.getClass(), "next", null);
        setIntField(term107296, term107296.getClass(), "type", -30);
        setIntField(term107296, term107296.getClass(), "intValue", 0);
        setField(term107296, term107296.getClass(), "objectValue", null);
        setField(term107295, term107295.getClass(), "propListHead", term107296);
        setIntField(term107295, term107295.getClass(), "sourcePosition", 0);
        setField(term107295, term107295.getClass(), "jsType", null);
        setField(term107295, term107295.getClass(), "parent", null);
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
        args[1] = term107168;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term107008, args);
        assertTrue(recursiveEquals(term107008, term107293));
        assertTrue(recursiveEquals(term107168, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


