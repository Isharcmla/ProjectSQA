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

public class TypeCheck_visit_859524784178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47565;
     Object term47635;
     Object term47921;
     Object term47922;

    public TypeCheck_visit_859524784178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47565 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term47635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47635, term47635.getClass(), "type", 110);
        term47921 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term47921, term47921.getClass(), "compiler", null);
        setField(term47921, term47921.getClass(), "validator", null);
        setField(term47921, term47921.getClass(), "reverseInterpreter", null);
        setField(term47921, term47921.getClass(), "typeRegistry", null);
        setField(term47921, term47921.getClass(), "topScope", null);
        setField(term47921, term47921.getClass(), "scopeCreator", null);
        setField(term47921, term47921.getClass(), "reportMissingOverride", null);
        setField(term47921, term47921.getClass(), "reportUnknownTypes", null);
        setBooleanField(term47921, term47921.getClass(), "reportMissingProperties", false);
        setField(term47921, term47921.getClass(), "inferJSDocInfo", null);
        setIntField(term47921, term47921.getClass(), "typedCount", 0);
        setIntField(term47921, term47921.getClass(), "nullCount", 0);
        setIntField(term47921, term47921.getClass(), "unknownCount", 0);
        setBooleanField(term47921, term47921.getClass(), "inExterns", false);
        setIntField(term47921, term47921.getClass(), "noTypeCheckSection", 0);
        term47922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47922, term47922.getClass(), "type", 110);
        setField(term47922, term47922.getClass(), "next", null);
        setField(term47922, term47922.getClass(), "first", null);
        setField(term47922, term47922.getClass(), "last", null);
        setField(term47922, term47922.getClass(), "propListHead", null);
        setIntField(term47922, term47922.getClass(), "sourcePosition", 0);
        setField(term47922, term47922.getClass(), "jsType", null);
        setField(term47922, term47922.getClass(), "parent", null);
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
        args[1] = term47635;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term47565, args);
        assertTrue(recursiveEquals(term47565, term47921));
        assertTrue(recursiveEquals(term47635, null));
    }

};


