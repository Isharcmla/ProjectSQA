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

public class TypeCheck_visit_859524784976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272919;
     Object term273011;
     Object term273027;
     Object term273028;

    public TypeCheck_visit_859524784976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272919 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term273011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term273011, term273011.getClass(), "type", 114);
        term273027 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term273027, term273027.getClass(), "compiler", null);
        setField(term273027, term273027.getClass(), "validator", null);
        setField(term273027, term273027.getClass(), "reverseInterpreter", null);
        setField(term273027, term273027.getClass(), "typeRegistry", null);
        setField(term273027, term273027.getClass(), "topScope", null);
        setField(term273027, term273027.getClass(), "scopeCreator", null);
        setField(term273027, term273027.getClass(), "reportMissingOverride", null);
        setField(term273027, term273027.getClass(), "reportUnknownTypes", null);
        setBooleanField(term273027, term273027.getClass(), "reportMissingProperties", false);
        setField(term273027, term273027.getClass(), "inferJSDocInfo", null);
        setIntField(term273027, term273027.getClass(), "typedCount", 0);
        setIntField(term273027, term273027.getClass(), "nullCount", 0);
        setIntField(term273027, term273027.getClass(), "unknownCount", 0);
        setBooleanField(term273027, term273027.getClass(), "inExterns", false);
        setIntField(term273027, term273027.getClass(), "noTypeCheckSection", 0);
        term273028 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term273028, term273028.getClass(), "str", null);
        setIntField(term273028, term273028.getClass(), "type", 114);
        setField(term273028, term273028.getClass(), "next", null);
        setField(term273028, term273028.getClass(), "first", null);
        setField(term273028, term273028.getClass(), "last", null);
        setField(term273028, term273028.getClass(), "propListHead", null);
        setIntField(term273028, term273028.getClass(), "sourcePosition", 0);
        setField(term273028, term273028.getClass(), "jsType", null);
        setField(term273028, term273028.getClass(), "parent", null);
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
        args[1] = term273011;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term272919, args);
        assertTrue(recursiveEquals(term272919, term273027));
        assertTrue(recursiveEquals(term273011, null));
    }

};


