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

public class TypeCheck_shouldTraverse_435604074114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27431;
     Object term27501;
     Object term27807;
     Object term27808;

    public TypeCheck_shouldTraverse_435604074114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27431 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term27501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term27807 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term27807, term27807.getClass(), "compiler", null);
        setField(term27807, term27807.getClass(), "validator", null);
        setField(term27807, term27807.getClass(), "reverseInterpreter", null);
        setField(term27807, term27807.getClass(), "typeRegistry", null);
        setField(term27807, term27807.getClass(), "topScope", null);
        setField(term27807, term27807.getClass(), "scopeCreator", null);
        setField(term27807, term27807.getClass(), "reportMissingOverride", null);
        setField(term27807, term27807.getClass(), "reportUnknownTypes", null);
        setBooleanField(term27807, term27807.getClass(), "reportMissingProperties", false);
        setField(term27807, term27807.getClass(), "inferJSDocInfo", null);
        setIntField(term27807, term27807.getClass(), "typedCount", 0);
        setIntField(term27807, term27807.getClass(), "nullCount", 0);
        setIntField(term27807, term27807.getClass(), "unknownCount", 0);
        setBooleanField(term27807, term27807.getClass(), "inExterns", false);
        setIntField(term27807, term27807.getClass(), "noTypeCheckSection", 0);
        term27808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27808, term27808.getClass(), "type", 0);
        setField(term27808, term27808.getClass(), "next", null);
        setField(term27808, term27808.getClass(), "first", null);
        setField(term27808, term27808.getClass(), "last", null);
        setField(term27808, term27808.getClass(), "propListHead", null);
        setIntField(term27808, term27808.getClass(), "sourcePosition", 0);
        setField(term27808, term27808.getClass(), "jsType", null);
        setField(term27808, term27808.getClass(), "parent", null);
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
        args[1] = term27501;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term27431, args);
        assertTrue(recursiveEquals(term27431, term27807));
        assertTrue(recursiveEquals(term27501, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


