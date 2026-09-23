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

public class TypeCheck_visit_859524784836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214979;
     Object term215049;
     Object term215119;
     Object term215142;
     Object term215143;
     Object term215144;

    public TypeCheck_visit_859524784836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214979 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term215049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term215049, term215049.getClass(), "type", 38);
        term215119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term215119, term215119.getClass(), "type", 120);
        term215142 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term215142, term215142.getClass(), "compiler", null);
        setField(term215142, term215142.getClass(), "validator", null);
        setField(term215142, term215142.getClass(), "reverseInterpreter", null);
        setField(term215142, term215142.getClass(), "typeRegistry", null);
        setField(term215142, term215142.getClass(), "topScope", null);
        setField(term215142, term215142.getClass(), "scopeCreator", null);
        setField(term215142, term215142.getClass(), "reportMissingOverride", null);
        setField(term215142, term215142.getClass(), "reportUnknownTypes", null);
        setBooleanField(term215142, term215142.getClass(), "reportMissingProperties", false);
        setField(term215142, term215142.getClass(), "inferJSDocInfo", null);
        setIntField(term215142, term215142.getClass(), "typedCount", 0);
        setIntField(term215142, term215142.getClass(), "nullCount", 0);
        setIntField(term215142, term215142.getClass(), "unknownCount", 0);
        setBooleanField(term215142, term215142.getClass(), "inExterns", false);
        setIntField(term215142, term215142.getClass(), "noTypeCheckSection", 0);
        term215143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term215143, term215143.getClass(), "type", 38);
        setField(term215143, term215143.getClass(), "next", null);
        setField(term215143, term215143.getClass(), "first", null);
        setField(term215143, term215143.getClass(), "last", null);
        setField(term215143, term215143.getClass(), "propListHead", null);
        setIntField(term215143, term215143.getClass(), "sourcePosition", 0);
        setField(term215143, term215143.getClass(), "jsType", null);
        setField(term215143, term215143.getClass(), "parent", null);
        term215144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term215144, term215144.getClass(), "type", 120);
        setField(term215144, term215144.getClass(), "next", null);
        setField(term215144, term215144.getClass(), "first", null);
        setField(term215144, term215144.getClass(), "last", null);
        setField(term215144, term215144.getClass(), "propListHead", null);
        setIntField(term215144, term215144.getClass(), "sourcePosition", 0);
        setField(term215144, term215144.getClass(), "jsType", null);
        setField(term215144, term215144.getClass(), "parent", null);
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
        args[1] = term215049;
        args[2] = term215119;
        callMethod(klass, "visit", argTypes, term214979, args);
        assertTrue(recursiveEquals(term214979, term215142));
        assertTrue(recursiveEquals(term215049, term215144));
        assertTrue(recursiveEquals(term215119, null));
    }

};


