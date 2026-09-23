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

public class TypeCheck_shouldTraverse_435604074187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52368;
     Object term52460;
     Object term52827;
     Object term52828;

    public TypeCheck_shouldTraverse_435604074187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52368 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term52460 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term52827 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term52827, term52827.getClass(), "compiler", null);
        setField(term52827, term52827.getClass(), "validator", null);
        setField(term52827, term52827.getClass(), "reverseInterpreter", null);
        setField(term52827, term52827.getClass(), "typeRegistry", null);
        setField(term52827, term52827.getClass(), "topScope", null);
        setField(term52827, term52827.getClass(), "scopeCreator", null);
        setField(term52827, term52827.getClass(), "reportMissingOverride", null);
        setField(term52827, term52827.getClass(), "reportUnknownTypes", null);
        setBooleanField(term52827, term52827.getClass(), "reportMissingProperties", false);
        setField(term52827, term52827.getClass(), "inferJSDocInfo", null);
        setIntField(term52827, term52827.getClass(), "typedCount", 0);
        setIntField(term52827, term52827.getClass(), "nullCount", 0);
        setIntField(term52827, term52827.getClass(), "unknownCount", 0);
        setBooleanField(term52827, term52827.getClass(), "inExterns", false);
        setIntField(term52827, term52827.getClass(), "noTypeCheckSection", 0);
        term52828 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term52828, term52828.getClass(), "str", null);
        setIntField(term52828, term52828.getClass(), "type", 0);
        setField(term52828, term52828.getClass(), "next", null);
        setField(term52828, term52828.getClass(), "first", null);
        setField(term52828, term52828.getClass(), "last", null);
        setField(term52828, term52828.getClass(), "propListHead", null);
        setIntField(term52828, term52828.getClass(), "sourcePosition", 0);
        setField(term52828, term52828.getClass(), "jsType", null);
        setField(term52828, term52828.getClass(), "parent", null);
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
        args[1] = term52460;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term52368, args);
        assertTrue(recursiveEquals(term52368, term52827));
        assertTrue(recursiveEquals(term52460, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


