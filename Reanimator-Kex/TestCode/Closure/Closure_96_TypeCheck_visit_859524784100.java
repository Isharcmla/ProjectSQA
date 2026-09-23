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

public class TypeCheck_visit_859524784100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60193;
     Object term60263;
     Object term61782;
     Object term61783;

    public TypeCheck_visit_859524784100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60193 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term60263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60263, term60263.getClass(), "type", 117);
        term61782 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term61782, term61782.getClass(), "compiler", null);
        setField(term61782, term61782.getClass(), "validator", null);
        setField(term61782, term61782.getClass(), "reverseInterpreter", null);
        setField(term61782, term61782.getClass(), "typeRegistry", null);
        setField(term61782, term61782.getClass(), "topScope", null);
        setField(term61782, term61782.getClass(), "scopeCreator", null);
        setField(term61782, term61782.getClass(), "reportMissingOverride", null);
        setField(term61782, term61782.getClass(), "reportUnknownTypes", null);
        setBooleanField(term61782, term61782.getClass(), "reportMissingProperties", false);
        setField(term61782, term61782.getClass(), "inferJSDocInfo", null);
        setIntField(term61782, term61782.getClass(), "typedCount", 0);
        setIntField(term61782, term61782.getClass(), "nullCount", 0);
        setIntField(term61782, term61782.getClass(), "unknownCount", 0);
        setBooleanField(term61782, term61782.getClass(), "inExterns", false);
        setIntField(term61782, term61782.getClass(), "noTypeCheckSection", 0);
        term61783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61783, term61783.getClass(), "type", 117);
        setField(term61783, term61783.getClass(), "next", null);
        setField(term61783, term61783.getClass(), "first", null);
        setField(term61783, term61783.getClass(), "last", null);
        setField(term61783, term61783.getClass(), "propListHead", null);
        setIntField(term61783, term61783.getClass(), "sourcePosition", 0);
        setField(term61783, term61783.getClass(), "jsType", null);
        setField(term61783, term61783.getClass(), "parent", null);
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
        args[1] = term60263;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term60193, args);
        assertTrue(recursiveEquals(term60193, term61782));
        assertTrue(recursiveEquals(term60263, null));
    }

};


