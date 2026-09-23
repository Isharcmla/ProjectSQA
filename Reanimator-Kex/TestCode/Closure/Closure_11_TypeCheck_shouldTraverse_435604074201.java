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

public class TypeCheck_shouldTraverse_435604074201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47455;
     Object term47525;
     Object term49369;
     Object term49370;

    public TypeCheck_shouldTraverse_435604074201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47455 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term47525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term49369 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term49369, term49369.getClass(), "compiler", null);
        setField(term49369, term49369.getClass(), "validator", null);
        setField(term49369, term49369.getClass(), "reverseInterpreter", null);
        setField(term49369, term49369.getClass(), "typeRegistry", null);
        setField(term49369, term49369.getClass(), "topScope", null);
        setField(term49369, term49369.getClass(), "scopeCreator", null);
        setField(term49369, term49369.getClass(), "reportMissingOverride", null);
        setField(term49369, term49369.getClass(), "reportUnknownTypes", null);
        setBooleanField(term49369, term49369.getClass(), "reportMissingProperties", false);
        setField(term49369, term49369.getClass(), "inferJSDocInfo", null);
        setIntField(term49369, term49369.getClass(), "typedCount", 0);
        setIntField(term49369, term49369.getClass(), "nullCount", 0);
        setIntField(term49369, term49369.getClass(), "unknownCount", 0);
        setBooleanField(term49369, term49369.getClass(), "inExterns", false);
        setIntField(term49369, term49369.getClass(), "noTypeCheckSection", 0);
        term49370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49370, term49370.getClass(), "type", 0);
        setField(term49370, term49370.getClass(), "next", null);
        setField(term49370, term49370.getClass(), "first", null);
        setField(term49370, term49370.getClass(), "last", null);
        setField(term49370, term49370.getClass(), "propListHead", null);
        setIntField(term49370, term49370.getClass(), "sourcePosition", 0);
        setField(term49370, term49370.getClass(), "jsType", null);
        setField(term49370, term49370.getClass(), "parent", null);
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
        args[1] = term47525;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term47455, args);
        assertTrue(recursiveEquals(term47455, term49369));
        assertTrue(recursiveEquals(term47525, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


