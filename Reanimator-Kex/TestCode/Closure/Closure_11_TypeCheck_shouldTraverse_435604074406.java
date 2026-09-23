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

public class TypeCheck_shouldTraverse_435604074406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97926;
     Object term98018;
     Object term98394;
     Object term98395;

    public TypeCheck_shouldTraverse_435604074406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97926 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term98018 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term98394 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term98394, term98394.getClass(), "compiler", null);
        setField(term98394, term98394.getClass(), "validator", null);
        setField(term98394, term98394.getClass(), "reverseInterpreter", null);
        setField(term98394, term98394.getClass(), "typeRegistry", null);
        setField(term98394, term98394.getClass(), "topScope", null);
        setField(term98394, term98394.getClass(), "scopeCreator", null);
        setField(term98394, term98394.getClass(), "reportMissingOverride", null);
        setField(term98394, term98394.getClass(), "reportUnknownTypes", null);
        setBooleanField(term98394, term98394.getClass(), "reportMissingProperties", false);
        setField(term98394, term98394.getClass(), "inferJSDocInfo", null);
        setIntField(term98394, term98394.getClass(), "typedCount", 0);
        setIntField(term98394, term98394.getClass(), "nullCount", 0);
        setIntField(term98394, term98394.getClass(), "unknownCount", 0);
        setBooleanField(term98394, term98394.getClass(), "inExterns", false);
        setIntField(term98394, term98394.getClass(), "noTypeCheckSection", 0);
        term98395 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term98395, term98395.getClass(), "str", null);
        setIntField(term98395, term98395.getClass(), "type", 0);
        setField(term98395, term98395.getClass(), "next", null);
        setField(term98395, term98395.getClass(), "first", null);
        setField(term98395, term98395.getClass(), "last", null);
        setField(term98395, term98395.getClass(), "propListHead", null);
        setIntField(term98395, term98395.getClass(), "sourcePosition", 0);
        setField(term98395, term98395.getClass(), "jsType", null);
        setField(term98395, term98395.getClass(), "parent", null);
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
        args[1] = term98018;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term97926, args);
        assertTrue(recursiveEquals(term97926, term98394));
        assertTrue(recursiveEquals(term98018, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


