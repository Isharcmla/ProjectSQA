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

public class TypeCheck_visit_8595247841008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277800;
     Object term277892;
     Object term277909;
     Object term277910;

    public TypeCheck_visit_8595247841008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277800 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setBooleanField(term277800, term277800.getClass(), "inExterns", true);
        term277892 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term277892, term277892.getClass(), "type", 148);
        term277909 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term277909, term277909.getClass(), "compiler", null);
        setField(term277909, term277909.getClass(), "validator", null);
        setField(term277909, term277909.getClass(), "reverseInterpreter", null);
        setField(term277909, term277909.getClass(), "typeRegistry", null);
        setField(term277909, term277909.getClass(), "topScope", null);
        setField(term277909, term277909.getClass(), "scopeCreator", null);
        setField(term277909, term277909.getClass(), "reportMissingOverride", null);
        setField(term277909, term277909.getClass(), "reportUnknownTypes", null);
        setBooleanField(term277909, term277909.getClass(), "reportMissingProperties", false);
        setField(term277909, term277909.getClass(), "inferJSDocInfo", null);
        setIntField(term277909, term277909.getClass(), "typedCount", 0);
        setIntField(term277909, term277909.getClass(), "nullCount", 0);
        setIntField(term277909, term277909.getClass(), "unknownCount", 0);
        setBooleanField(term277909, term277909.getClass(), "inExterns", true);
        setIntField(term277909, term277909.getClass(), "noTypeCheckSection", 0);
        term277910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term277910, term277910.getClass(), "str", null);
        setIntField(term277910, term277910.getClass(), "type", 148);
        setField(term277910, term277910.getClass(), "next", null);
        setField(term277910, term277910.getClass(), "first", null);
        setField(term277910, term277910.getClass(), "last", null);
        setField(term277910, term277910.getClass(), "propListHead", null);
        setIntField(term277910, term277910.getClass(), "sourcePosition", 0);
        setField(term277910, term277910.getClass(), "jsType", null);
        setField(term277910, term277910.getClass(), "parent", null);
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
        args[1] = term277892;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term277800, args);
        assertTrue(recursiveEquals(term277800, term277909));
        assertTrue(recursiveEquals(term277892, null));
    }

};


