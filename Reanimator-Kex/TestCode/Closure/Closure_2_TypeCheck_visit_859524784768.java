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

public class TypeCheck_visit_859524784768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207952;
     Object term208044;
     Object term208060;
     Object term208061;

    public TypeCheck_visit_859524784768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207952 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term208044 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term208044, term208044.getClass(), "type", 117);
        term208060 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term208060, term208060.getClass(), "compiler", null);
        setField(term208060, term208060.getClass(), "validator", null);
        setField(term208060, term208060.getClass(), "reverseInterpreter", null);
        setField(term208060, term208060.getClass(), "typeRegistry", null);
        setField(term208060, term208060.getClass(), "topScope", null);
        setField(term208060, term208060.getClass(), "scopeCreator", null);
        setField(term208060, term208060.getClass(), "reportMissingOverride", null);
        setField(term208060, term208060.getClass(), "reportUnknownTypes", null);
        setBooleanField(term208060, term208060.getClass(), "reportMissingProperties", false);
        setField(term208060, term208060.getClass(), "inferJSDocInfo", null);
        setIntField(term208060, term208060.getClass(), "typedCount", 0);
        setIntField(term208060, term208060.getClass(), "nullCount", 0);
        setIntField(term208060, term208060.getClass(), "unknownCount", 0);
        setBooleanField(term208060, term208060.getClass(), "inExterns", false);
        setIntField(term208060, term208060.getClass(), "noTypeCheckSection", 0);
        term208061 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term208061, term208061.getClass(), "str", null);
        setIntField(term208061, term208061.getClass(), "type", 117);
        setField(term208061, term208061.getClass(), "next", null);
        setField(term208061, term208061.getClass(), "first", null);
        setField(term208061, term208061.getClass(), "last", null);
        setField(term208061, term208061.getClass(), "propListHead", null);
        setIntField(term208061, term208061.getClass(), "sourcePosition", 0);
        setField(term208061, term208061.getClass(), "jsType", null);
        setField(term208061, term208061.getClass(), "parent", null);
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
        args[1] = term208044;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term207952, args);
        assertTrue(recursiveEquals(term207952, term208060));
        assertTrue(recursiveEquals(term208044, null));
    }

};


