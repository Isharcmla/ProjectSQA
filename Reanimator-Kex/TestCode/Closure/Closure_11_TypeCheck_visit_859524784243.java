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

public class TypeCheck_visit_859524784243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58516;
     Object term58586;
     Object term58767;
     Object term58768;

    public TypeCheck_visit_859524784243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58516 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term58586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58586, term58586.getClass(), "type", 114);
        term58767 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term58767, term58767.getClass(), "compiler", null);
        setField(term58767, term58767.getClass(), "validator", null);
        setField(term58767, term58767.getClass(), "reverseInterpreter", null);
        setField(term58767, term58767.getClass(), "typeRegistry", null);
        setField(term58767, term58767.getClass(), "topScope", null);
        setField(term58767, term58767.getClass(), "scopeCreator", null);
        setField(term58767, term58767.getClass(), "reportMissingOverride", null);
        setField(term58767, term58767.getClass(), "reportUnknownTypes", null);
        setBooleanField(term58767, term58767.getClass(), "reportMissingProperties", false);
        setField(term58767, term58767.getClass(), "inferJSDocInfo", null);
        setIntField(term58767, term58767.getClass(), "typedCount", 0);
        setIntField(term58767, term58767.getClass(), "nullCount", 0);
        setIntField(term58767, term58767.getClass(), "unknownCount", 0);
        setBooleanField(term58767, term58767.getClass(), "inExterns", false);
        setIntField(term58767, term58767.getClass(), "noTypeCheckSection", 0);
        term58768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58768, term58768.getClass(), "type", 114);
        setField(term58768, term58768.getClass(), "next", null);
        setField(term58768, term58768.getClass(), "first", null);
        setField(term58768, term58768.getClass(), "last", null);
        setField(term58768, term58768.getClass(), "propListHead", null);
        setIntField(term58768, term58768.getClass(), "sourcePosition", 0);
        setField(term58768, term58768.getClass(), "jsType", null);
        setField(term58768, term58768.getClass(), "parent", null);
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
        args[1] = term58586;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term58516, args);
        assertTrue(recursiveEquals(term58516, term58767));
        assertTrue(recursiveEquals(term58586, null));
    }

};


