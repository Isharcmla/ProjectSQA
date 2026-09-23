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

public class TypeCheck_visit_859524784612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154884;
     Object term154976;
     Object term154992;
     Object term154993;

    public TypeCheck_visit_859524784612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154884 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term154976 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term154976, term154976.getClass(), "type", 154);
        term154992 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term154992, term154992.getClass(), "compiler", null);
        setField(term154992, term154992.getClass(), "validator", null);
        setField(term154992, term154992.getClass(), "reverseInterpreter", null);
        setField(term154992, term154992.getClass(), "typeRegistry", null);
        setField(term154992, term154992.getClass(), "topScope", null);
        setField(term154992, term154992.getClass(), "scopeCreator", null);
        setField(term154992, term154992.getClass(), "reportMissingOverride", null);
        setField(term154992, term154992.getClass(), "reportUnknownTypes", null);
        setBooleanField(term154992, term154992.getClass(), "reportMissingProperties", false);
        setField(term154992, term154992.getClass(), "inferJSDocInfo", null);
        setIntField(term154992, term154992.getClass(), "typedCount", 0);
        setIntField(term154992, term154992.getClass(), "nullCount", 0);
        setIntField(term154992, term154992.getClass(), "unknownCount", 0);
        setBooleanField(term154992, term154992.getClass(), "inExterns", false);
        setIntField(term154992, term154992.getClass(), "noTypeCheckSection", 0);
        term154993 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term154993, term154993.getClass(), "str", null);
        setIntField(term154993, term154993.getClass(), "type", 154);
        setField(term154993, term154993.getClass(), "next", null);
        setField(term154993, term154993.getClass(), "first", null);
        setField(term154993, term154993.getClass(), "last", null);
        setField(term154993, term154993.getClass(), "propListHead", null);
        setIntField(term154993, term154993.getClass(), "sourcePosition", 0);
        setField(term154993, term154993.getClass(), "jsType", null);
        setField(term154993, term154993.getClass(), "parent", null);
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
        args[1] = term154976;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term154884, args);
        assertTrue(recursiveEquals(term154884, term154992));
        assertTrue(recursiveEquals(term154976, null));
    }

};


