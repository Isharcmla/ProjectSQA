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

public class TypeCheck_visit_859524784697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178149;
     Object term178241;
     Object term178445;
     Object term178446;

    public TypeCheck_visit_859524784697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178149 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term178241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term178241, term178241.getClass(), "type", 116);
        term178445 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term178445, term178445.getClass(), "compiler", null);
        setField(term178445, term178445.getClass(), "validator", null);
        setField(term178445, term178445.getClass(), "reverseInterpreter", null);
        setField(term178445, term178445.getClass(), "typeRegistry", null);
        setField(term178445, term178445.getClass(), "topScope", null);
        setField(term178445, term178445.getClass(), "scopeCreator", null);
        setField(term178445, term178445.getClass(), "reportMissingOverride", null);
        setField(term178445, term178445.getClass(), "reportUnknownTypes", null);
        setBooleanField(term178445, term178445.getClass(), "reportMissingProperties", false);
        setField(term178445, term178445.getClass(), "inferJSDocInfo", null);
        setIntField(term178445, term178445.getClass(), "typedCount", 0);
        setIntField(term178445, term178445.getClass(), "nullCount", 0);
        setIntField(term178445, term178445.getClass(), "unknownCount", 0);
        setBooleanField(term178445, term178445.getClass(), "inExterns", false);
        setIntField(term178445, term178445.getClass(), "noTypeCheckSection", 0);
        term178446 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term178446, term178446.getClass(), "str", null);
        setIntField(term178446, term178446.getClass(), "type", 116);
        setField(term178446, term178446.getClass(), "next", null);
        setField(term178446, term178446.getClass(), "first", null);
        setField(term178446, term178446.getClass(), "last", null);
        setField(term178446, term178446.getClass(), "propListHead", null);
        setIntField(term178446, term178446.getClass(), "sourcePosition", 0);
        setField(term178446, term178446.getClass(), "jsType", null);
        setField(term178446, term178446.getClass(), "parent", null);
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
        args[1] = term178241;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term178149, args);
        assertTrue(recursiveEquals(term178149, term178445));
        assertTrue(recursiveEquals(term178241, null));
    }

};


