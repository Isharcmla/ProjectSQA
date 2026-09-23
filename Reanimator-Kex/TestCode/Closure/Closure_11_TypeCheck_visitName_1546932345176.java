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

public class TypeCheck_visitName_1546932345176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40753;
     Object term40823;
     Object term40840;
     Object term40841;

    public TypeCheck_visitName_1546932345176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40753 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term40823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40823, term40823.getClass(), "type", 118);
        term40840 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term40840, term40840.getClass(), "compiler", null);
        setField(term40840, term40840.getClass(), "validator", null);
        setField(term40840, term40840.getClass(), "reverseInterpreter", null);
        setField(term40840, term40840.getClass(), "typeRegistry", null);
        setField(term40840, term40840.getClass(), "topScope", null);
        setField(term40840, term40840.getClass(), "scopeCreator", null);
        setField(term40840, term40840.getClass(), "reportMissingOverride", null);
        setField(term40840, term40840.getClass(), "reportUnknownTypes", null);
        setBooleanField(term40840, term40840.getClass(), "reportMissingProperties", false);
        setField(term40840, term40840.getClass(), "inferJSDocInfo", null);
        setIntField(term40840, term40840.getClass(), "typedCount", 0);
        setIntField(term40840, term40840.getClass(), "nullCount", 0);
        setIntField(term40840, term40840.getClass(), "unknownCount", 0);
        setBooleanField(term40840, term40840.getClass(), "inExterns", false);
        setIntField(term40840, term40840.getClass(), "noTypeCheckSection", 0);
        term40841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40841, term40841.getClass(), "type", 118);
        setField(term40841, term40841.getClass(), "next", null);
        setField(term40841, term40841.getClass(), "first", null);
        setField(term40841, term40841.getClass(), "last", null);
        setField(term40841, term40841.getClass(), "propListHead", null);
        setIntField(term40841, term40841.getClass(), "sourcePosition", 0);
        setField(term40841, term40841.getClass(), "jsType", null);
        setField(term40841, term40841.getClass(), "parent", null);
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
        args[2] = term40823;
        Object retValue = callMethod(klass, "visitName", argTypes, term40753, args);
        assertTrue(recursiveEquals(term40753, term40840));
        assertTrue(recursiveEquals(term40823, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


