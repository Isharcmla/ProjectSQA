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

public class TypeCheck_visit_859524784239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57908;
     Object term57978;
     Object term58159;
     Object term58160;

    public TypeCheck_visit_859524784239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57908 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term57978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57978, term57978.getClass(), "type", 124);
        term58159 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term58159, term58159.getClass(), "compiler", null);
        setField(term58159, term58159.getClass(), "validator", null);
        setField(term58159, term58159.getClass(), "reverseInterpreter", null);
        setField(term58159, term58159.getClass(), "typeRegistry", null);
        setField(term58159, term58159.getClass(), "topScope", null);
        setField(term58159, term58159.getClass(), "scopeCreator", null);
        setField(term58159, term58159.getClass(), "reportMissingOverride", null);
        setField(term58159, term58159.getClass(), "reportUnknownTypes", null);
        setBooleanField(term58159, term58159.getClass(), "reportMissingProperties", false);
        setField(term58159, term58159.getClass(), "inferJSDocInfo", null);
        setIntField(term58159, term58159.getClass(), "typedCount", 0);
        setIntField(term58159, term58159.getClass(), "nullCount", 0);
        setIntField(term58159, term58159.getClass(), "unknownCount", 0);
        setBooleanField(term58159, term58159.getClass(), "inExterns", false);
        setIntField(term58159, term58159.getClass(), "noTypeCheckSection", 0);
        term58160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58160, term58160.getClass(), "type", 124);
        setField(term58160, term58160.getClass(), "next", null);
        setField(term58160, term58160.getClass(), "first", null);
        setField(term58160, term58160.getClass(), "last", null);
        setField(term58160, term58160.getClass(), "propListHead", null);
        setIntField(term58160, term58160.getClass(), "sourcePosition", 0);
        setField(term58160, term58160.getClass(), "jsType", null);
        setField(term58160, term58160.getClass(), "parent", null);
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
        args[1] = term57978;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term57908, args);
        assertTrue(recursiveEquals(term57908, term58159));
        assertTrue(recursiveEquals(term57978, null));
    }

};


