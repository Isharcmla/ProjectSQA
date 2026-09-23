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

public class TypeCheck_visit_859524784426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105696;
     Object term105766;
     Object term106040;
     Object term106041;

    public TypeCheck_visit_859524784426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105696 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term105766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term105766, term105766.getClass(), "type", 113);
        term106040 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term106040, term106040.getClass(), "compiler", null);
        setField(term106040, term106040.getClass(), "validator", null);
        setField(term106040, term106040.getClass(), "reverseInterpreter", null);
        setField(term106040, term106040.getClass(), "typeRegistry", null);
        setField(term106040, term106040.getClass(), "topScope", null);
        setField(term106040, term106040.getClass(), "scopeCreator", null);
        setField(term106040, term106040.getClass(), "reportMissingOverride", null);
        setField(term106040, term106040.getClass(), "reportUnknownTypes", null);
        setBooleanField(term106040, term106040.getClass(), "reportMissingProperties", false);
        setField(term106040, term106040.getClass(), "inferJSDocInfo", null);
        setIntField(term106040, term106040.getClass(), "typedCount", 0);
        setIntField(term106040, term106040.getClass(), "nullCount", 0);
        setIntField(term106040, term106040.getClass(), "unknownCount", 0);
        setBooleanField(term106040, term106040.getClass(), "inExterns", false);
        setIntField(term106040, term106040.getClass(), "noTypeCheckSection", 0);
        term106041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106041, term106041.getClass(), "type", 113);
        setField(term106041, term106041.getClass(), "next", null);
        setField(term106041, term106041.getClass(), "first", null);
        setField(term106041, term106041.getClass(), "last", null);
        setField(term106041, term106041.getClass(), "propListHead", null);
        setIntField(term106041, term106041.getClass(), "sourcePosition", 0);
        setField(term106041, term106041.getClass(), "jsType", null);
        setField(term106041, term106041.getClass(), "parent", null);
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
        args[1] = term105766;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term105696, args);
        assertTrue(recursiveEquals(term105696, term106040));
        assertTrue(recursiveEquals(term105766, null));
    }

};


