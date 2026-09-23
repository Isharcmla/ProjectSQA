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

public class TypeCheck_visitName_154693234598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29282;
     Object term29352;
     Object term29374;
     Object term29375;

    public TypeCheck_visitName_154693234598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29282 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term29352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29352, term29352.getClass(), "type", 120);
        term29374 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term29374, term29374.getClass(), "compiler", null);
        setField(term29374, term29374.getClass(), "validator", null);
        setField(term29374, term29374.getClass(), "reverseInterpreter", null);
        setField(term29374, term29374.getClass(), "typeRegistry", null);
        setField(term29374, term29374.getClass(), "topScope", null);
        setField(term29374, term29374.getClass(), "scopeCreator", null);
        setField(term29374, term29374.getClass(), "reportMissingOverride", null);
        setField(term29374, term29374.getClass(), "reportUnknownTypes", null);
        setBooleanField(term29374, term29374.getClass(), "reportMissingProperties", false);
        setField(term29374, term29374.getClass(), "inferJSDocInfo", null);
        setIntField(term29374, term29374.getClass(), "typedCount", 0);
        setIntField(term29374, term29374.getClass(), "nullCount", 0);
        setIntField(term29374, term29374.getClass(), "unknownCount", 0);
        setBooleanField(term29374, term29374.getClass(), "inExterns", false);
        setIntField(term29374, term29374.getClass(), "noTypeCheckSection", 0);
        term29375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29375, term29375.getClass(), "type", 120);
        setField(term29375, term29375.getClass(), "next", null);
        setField(term29375, term29375.getClass(), "first", null);
        setField(term29375, term29375.getClass(), "last", null);
        setField(term29375, term29375.getClass(), "propListHead", null);
        setIntField(term29375, term29375.getClass(), "sourcePosition", 0);
        setField(term29375, term29375.getClass(), "jsType", null);
        setField(term29375, term29375.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term29352;
        Object retValue = callMethod(klass, "visitName", argTypes, term29282, args);
        assertTrue(recursiveEquals(term29282, term29374));
        assertTrue(recursiveEquals(term29352, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


