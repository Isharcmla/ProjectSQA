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

public class TypeCheck_visit_859524784490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122877;
     Object term122969;
     Object term122987;
     Object term122988;

    public TypeCheck_visit_859524784490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122877 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term122969 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term122969, term122969.getClass(), "type", 148);
        term122987 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term122987, term122987.getClass(), "compiler", null);
        setField(term122987, term122987.getClass(), "validator", null);
        setField(term122987, term122987.getClass(), "reverseInterpreter", null);
        setField(term122987, term122987.getClass(), "typeRegistry", null);
        setField(term122987, term122987.getClass(), "topScope", null);
        setField(term122987, term122987.getClass(), "scopeCreator", null);
        setField(term122987, term122987.getClass(), "reportMissingOverride", null);
        setField(term122987, term122987.getClass(), "reportUnknownTypes", null);
        setBooleanField(term122987, term122987.getClass(), "reportMissingProperties", false);
        setField(term122987, term122987.getClass(), "inferJSDocInfo", null);
        setIntField(term122987, term122987.getClass(), "typedCount", 0);
        setIntField(term122987, term122987.getClass(), "nullCount", 1);
        setIntField(term122987, term122987.getClass(), "unknownCount", 0);
        setBooleanField(term122987, term122987.getClass(), "inExterns", false);
        setIntField(term122987, term122987.getClass(), "noTypeCheckSection", 0);
        term122988 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term122988, term122988.getClass(), "str", null);
        setIntField(term122988, term122988.getClass(), "type", 148);
        setField(term122988, term122988.getClass(), "next", null);
        setField(term122988, term122988.getClass(), "first", null);
        setField(term122988, term122988.getClass(), "last", null);
        setField(term122988, term122988.getClass(), "propListHead", null);
        setIntField(term122988, term122988.getClass(), "sourcePosition", 0);
        setField(term122988, term122988.getClass(), "jsType", null);
        setField(term122988, term122988.getClass(), "parent", null);
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
        args[1] = term122969;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term122877, args);
        assertTrue(recursiveEquals(term122877, term122987));
        assertTrue(recursiveEquals(term122969, null));
    }

};


