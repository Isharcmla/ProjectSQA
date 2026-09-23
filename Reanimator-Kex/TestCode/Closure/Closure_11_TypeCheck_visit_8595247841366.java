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

public class TypeCheck_visit_8595247841366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414782;
     Object term414852;
     Object term414875;
     Object term414876;

    public TypeCheck_visit_8595247841366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term414782 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term414852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term414852, term414852.getClass(), "type", 115);
        term414875 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term414875, term414875.getClass(), "compiler", null);
        setField(term414875, term414875.getClass(), "validator", null);
        setField(term414875, term414875.getClass(), "reverseInterpreter", null);
        setField(term414875, term414875.getClass(), "typeRegistry", null);
        setField(term414875, term414875.getClass(), "topScope", null);
        setField(term414875, term414875.getClass(), "scopeCreator", null);
        setField(term414875, term414875.getClass(), "reportMissingOverride", null);
        setField(term414875, term414875.getClass(), "reportUnknownTypes", null);
        setBooleanField(term414875, term414875.getClass(), "reportMissingProperties", false);
        setField(term414875, term414875.getClass(), "inferJSDocInfo", null);
        setIntField(term414875, term414875.getClass(), "typedCount", 0);
        setIntField(term414875, term414875.getClass(), "nullCount", 0);
        setIntField(term414875, term414875.getClass(), "unknownCount", 0);
        setBooleanField(term414875, term414875.getClass(), "inExterns", false);
        setIntField(term414875, term414875.getClass(), "noTypeCheckSection", 0);
        term414876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term414876, term414876.getClass(), "type", 115);
        setField(term414876, term414876.getClass(), "next", null);
        setField(term414876, term414876.getClass(), "first", null);
        setField(term414876, term414876.getClass(), "last", null);
        setField(term414876, term414876.getClass(), "propListHead", null);
        setIntField(term414876, term414876.getClass(), "sourcePosition", 0);
        setField(term414876, term414876.getClass(), "jsType", null);
        setField(term414876, term414876.getClass(), "parent", null);
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
        args[1] = term414852;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term414782, args);
        assertTrue(recursiveEquals(term414782, term414875));
        assertTrue(recursiveEquals(term414852, null));
    }

};


