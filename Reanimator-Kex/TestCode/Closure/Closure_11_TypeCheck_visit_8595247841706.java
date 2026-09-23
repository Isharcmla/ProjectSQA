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

public class TypeCheck_visit_8595247841706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552894;
     Object term552986;
     Object term553003;
     Object term553004;

    public TypeCheck_visit_8595247841706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552894 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term552986 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term552986, term552986.getClass(), "type", 114);
        term553003 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term553003, term553003.getClass(), "compiler", null);
        setField(term553003, term553003.getClass(), "validator", null);
        setField(term553003, term553003.getClass(), "reverseInterpreter", null);
        setField(term553003, term553003.getClass(), "typeRegistry", null);
        setField(term553003, term553003.getClass(), "topScope", null);
        setField(term553003, term553003.getClass(), "scopeCreator", null);
        setField(term553003, term553003.getClass(), "reportMissingOverride", null);
        setField(term553003, term553003.getClass(), "reportUnknownTypes", null);
        setBooleanField(term553003, term553003.getClass(), "reportMissingProperties", false);
        setField(term553003, term553003.getClass(), "inferJSDocInfo", null);
        setIntField(term553003, term553003.getClass(), "typedCount", 0);
        setIntField(term553003, term553003.getClass(), "nullCount", 0);
        setIntField(term553003, term553003.getClass(), "unknownCount", 0);
        setBooleanField(term553003, term553003.getClass(), "inExterns", false);
        setIntField(term553003, term553003.getClass(), "noTypeCheckSection", 0);
        term553004 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term553004, term553004.getClass(), "number", 0.0);
        setIntField(term553004, term553004.getClass(), "type", 114);
        setField(term553004, term553004.getClass(), "next", null);
        setField(term553004, term553004.getClass(), "first", null);
        setField(term553004, term553004.getClass(), "last", null);
        setField(term553004, term553004.getClass(), "propListHead", null);
        setIntField(term553004, term553004.getClass(), "sourcePosition", 0);
        setField(term553004, term553004.getClass(), "jsType", null);
        setField(term553004, term553004.getClass(), "parent", null);
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
        args[1] = term552986;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term552894, args);
        assertTrue(recursiveEquals(term552894, term553003));
        assertTrue(recursiveEquals(term552986, null));
    }

};


