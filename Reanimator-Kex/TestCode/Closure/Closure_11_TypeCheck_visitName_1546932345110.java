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

public class TypeCheck_visitName_1546932345110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26709;
     Object term26779;
     Object term26793;
     Object term26794;

    public TypeCheck_visitName_1546932345110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26709 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term26779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26779, term26779.getClass(), "type", 105);
        term26793 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term26793, term26793.getClass(), "compiler", null);
        setField(term26793, term26793.getClass(), "validator", null);
        setField(term26793, term26793.getClass(), "reverseInterpreter", null);
        setField(term26793, term26793.getClass(), "typeRegistry", null);
        setField(term26793, term26793.getClass(), "topScope", null);
        setField(term26793, term26793.getClass(), "scopeCreator", null);
        setField(term26793, term26793.getClass(), "reportMissingOverride", null);
        setField(term26793, term26793.getClass(), "reportUnknownTypes", null);
        setBooleanField(term26793, term26793.getClass(), "reportMissingProperties", false);
        setField(term26793, term26793.getClass(), "inferJSDocInfo", null);
        setIntField(term26793, term26793.getClass(), "typedCount", 0);
        setIntField(term26793, term26793.getClass(), "nullCount", 0);
        setIntField(term26793, term26793.getClass(), "unknownCount", 0);
        setBooleanField(term26793, term26793.getClass(), "inExterns", false);
        setIntField(term26793, term26793.getClass(), "noTypeCheckSection", 0);
        term26794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26794, term26794.getClass(), "type", 105);
        setField(term26794, term26794.getClass(), "next", null);
        setField(term26794, term26794.getClass(), "first", null);
        setField(term26794, term26794.getClass(), "last", null);
        setField(term26794, term26794.getClass(), "propListHead", null);
        setIntField(term26794, term26794.getClass(), "sourcePosition", 0);
        setField(term26794, term26794.getClass(), "jsType", null);
        setField(term26794, term26794.getClass(), "parent", null);
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
        args[2] = term26779;
        Object retValue = callMethod(klass, "visitName", argTypes, term26709, args);
        assertTrue(recursiveEquals(term26709, term26793));
        assertTrue(recursiveEquals(term26779, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


