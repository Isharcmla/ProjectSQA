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

public class TypeCheck_visitName_1546932345173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48356;
     Object term48426;
     Object term48441;
     Object term48442;

    public TypeCheck_visitName_1546932345173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48356 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term48426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48426, term48426.getClass(), "type", 120);
        term48441 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term48441, term48441.getClass(), "compiler", null);
        setField(term48441, term48441.getClass(), "validator", null);
        setField(term48441, term48441.getClass(), "reverseInterpreter", null);
        setField(term48441, term48441.getClass(), "typeRegistry", null);
        setField(term48441, term48441.getClass(), "topScope", null);
        setField(term48441, term48441.getClass(), "scopeCreator", null);
        setField(term48441, term48441.getClass(), "reportMissingOverride", null);
        setField(term48441, term48441.getClass(), "reportUnknownTypes", null);
        setBooleanField(term48441, term48441.getClass(), "reportMissingProperties", false);
        setField(term48441, term48441.getClass(), "inferJSDocInfo", null);
        setIntField(term48441, term48441.getClass(), "typedCount", 0);
        setIntField(term48441, term48441.getClass(), "nullCount", 0);
        setIntField(term48441, term48441.getClass(), "unknownCount", 0);
        setBooleanField(term48441, term48441.getClass(), "inExterns", false);
        setIntField(term48441, term48441.getClass(), "noTypeCheckSection", 0);
        term48442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48442, term48442.getClass(), "type", 120);
        setField(term48442, term48442.getClass(), "next", null);
        setField(term48442, term48442.getClass(), "first", null);
        setField(term48442, term48442.getClass(), "last", null);
        setField(term48442, term48442.getClass(), "propListHead", null);
        setIntField(term48442, term48442.getClass(), "sourcePosition", 0);
        setField(term48442, term48442.getClass(), "jsType", null);
        setField(term48442, term48442.getClass(), "parent", null);
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
        args[2] = term48426;
        Object retValue = callMethod(klass, "visitName", argTypes, term48356, args);
        assertTrue(recursiveEquals(term48356, term48441));
        assertTrue(recursiveEquals(term48426, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


