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
import java.lang.Object;

public class TypeCheck_shouldTraverse_435604074530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140306;
     Object term140488;
     Object term140514;
     Object term140516;

    public TypeCheck_shouldTraverse_435604074530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140306 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term140396 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term140306, term140306.getClass(), "validator", term140396);
        setIntField(term140306, term140306.getClass(), "noTypeCheckSection", -1);
        term140488 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term140488, term140488.getClass(), "type", 86);
        setField(term140488, term140488.getClass(), "propListHead", null);
        term140514 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term140515 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term140514, term140514.getClass(), "compiler", null);
        setField(term140515, term140515.getClass(), "compiler", null);
        setField(term140515, term140515.getClass(), "typeRegistry", null);
        setField(term140515, term140515.getClass(), "allValueTypes", null);
        setBooleanField(term140515, term140515.getClass(), "shouldReport", false);
        setField(term140515, term140515.getClass(), "nullOrUndefined", null);
        setField(term140515, term140515.getClass(), "mismatches", null);
        setField(term140514, term140514.getClass(), "validator", term140515);
        setField(term140514, term140514.getClass(), "reverseInterpreter", null);
        setField(term140514, term140514.getClass(), "typeRegistry", null);
        setField(term140514, term140514.getClass(), "topScope", null);
        setField(term140514, term140514.getClass(), "scopeCreator", null);
        setField(term140514, term140514.getClass(), "reportMissingOverride", null);
        setBooleanField(term140514, term140514.getClass(), "reportUnknownTypes", false);
        setBooleanField(term140514, term140514.getClass(), "reportMissingProperties", false);
        setField(term140514, term140514.getClass(), "inferJSDocInfo", null);
        setIntField(term140514, term140514.getClass(), "typedCount", 0);
        setIntField(term140514, term140514.getClass(), "nullCount", 0);
        setIntField(term140514, term140514.getClass(), "unknownCount", 0);
        setBooleanField(term140514, term140514.getClass(), "inExterns", false);
        setIntField(term140514, term140514.getClass(), "noTypeCheckSection", -1);
        setField(term140514, term140514.getClass(), "editDistance", null);
        term140516 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term140516, term140516.getClass(), "number", 0.0);
        setIntField(term140516, term140516.getClass(), "type", 86);
        setField(term140516, term140516.getClass(), "next", null);
        setField(term140516, term140516.getClass(), "first", null);
        setField(term140516, term140516.getClass(), "last", null);
        setField(term140516, term140516.getClass(), "propListHead", null);
        setIntField(term140516, term140516.getClass(), "sourcePosition", 0);
        setField(term140516, term140516.getClass(), "jsType", null);
        setField(term140516, term140516.getClass(), "parent", null);
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
        args[1] = term140488;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term140306, args);
        assertTrue(recursiveEquals(term140306, term140514));
        assertTrue(recursiveEquals(term140488, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


