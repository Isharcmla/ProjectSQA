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

public class TypeCheck_shouldTraverse_435604074195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48105;
     Object term48197;
     Object term48482;
     Object term48483;

    public TypeCheck_shouldTraverse_435604074195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48105 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term48197 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term48482 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term48482, term48482.getClass(), "compiler", null);
        setField(term48482, term48482.getClass(), "validator", null);
        setField(term48482, term48482.getClass(), "reverseInterpreter", null);
        setField(term48482, term48482.getClass(), "typeRegistry", null);
        setField(term48482, term48482.getClass(), "topScope", null);
        setField(term48482, term48482.getClass(), "scopeCreator", null);
        setField(term48482, term48482.getClass(), "reportMissingOverride", null);
        setField(term48482, term48482.getClass(), "reportUnknownTypes", null);
        setBooleanField(term48482, term48482.getClass(), "reportMissingProperties", false);
        setField(term48482, term48482.getClass(), "inferJSDocInfo", null);
        setIntField(term48482, term48482.getClass(), "typedCount", 0);
        setIntField(term48482, term48482.getClass(), "nullCount", 0);
        setIntField(term48482, term48482.getClass(), "unknownCount", 0);
        setBooleanField(term48482, term48482.getClass(), "inExterns", false);
        setIntField(term48482, term48482.getClass(), "noTypeCheckSection", 0);
        term48483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term48483, term48483.getClass(), "str", null);
        setIntField(term48483, term48483.getClass(), "type", 0);
        setField(term48483, term48483.getClass(), "next", null);
        setField(term48483, term48483.getClass(), "first", null);
        setField(term48483, term48483.getClass(), "last", null);
        setField(term48483, term48483.getClass(), "propListHead", null);
        setIntField(term48483, term48483.getClass(), "sourcePosition", 0);
        setField(term48483, term48483.getClass(), "jsType", null);
        setField(term48483, term48483.getClass(), "parent", null);
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
        args[1] = term48197;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term48105, args);
        assertTrue(recursiveEquals(term48105, term48482));
        assertTrue(recursiveEquals(term48197, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


