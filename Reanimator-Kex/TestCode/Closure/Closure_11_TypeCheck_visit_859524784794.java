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

public class TypeCheck_visit_859524784794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203416;
     Object term203486;
     Object term203556;
     Object term203843;
     Object term203844;
     Object term203845;

    public TypeCheck_visit_859524784794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203416 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term203486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term203486, term203486.getClass(), "type", 38);
        term203556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term203556, term203556.getClass(), "type", 83);
        term203843 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term203843, term203843.getClass(), "compiler", null);
        setField(term203843, term203843.getClass(), "validator", null);
        setField(term203843, term203843.getClass(), "reverseInterpreter", null);
        setField(term203843, term203843.getClass(), "typeRegistry", null);
        setField(term203843, term203843.getClass(), "topScope", null);
        setField(term203843, term203843.getClass(), "scopeCreator", null);
        setField(term203843, term203843.getClass(), "reportMissingOverride", null);
        setField(term203843, term203843.getClass(), "reportUnknownTypes", null);
        setBooleanField(term203843, term203843.getClass(), "reportMissingProperties", false);
        setField(term203843, term203843.getClass(), "inferJSDocInfo", null);
        setIntField(term203843, term203843.getClass(), "typedCount", 0);
        setIntField(term203843, term203843.getClass(), "nullCount", 0);
        setIntField(term203843, term203843.getClass(), "unknownCount", 0);
        setBooleanField(term203843, term203843.getClass(), "inExterns", false);
        setIntField(term203843, term203843.getClass(), "noTypeCheckSection", 0);
        term203844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term203844, term203844.getClass(), "type", 38);
        setField(term203844, term203844.getClass(), "next", null);
        setField(term203844, term203844.getClass(), "first", null);
        setField(term203844, term203844.getClass(), "last", null);
        setField(term203844, term203844.getClass(), "propListHead", null);
        setIntField(term203844, term203844.getClass(), "sourcePosition", 0);
        setField(term203844, term203844.getClass(), "jsType", null);
        setField(term203844, term203844.getClass(), "parent", null);
        term203845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term203845, term203845.getClass(), "type", 83);
        setField(term203845, term203845.getClass(), "next", null);
        setField(term203845, term203845.getClass(), "first", null);
        setField(term203845, term203845.getClass(), "last", null);
        setField(term203845, term203845.getClass(), "propListHead", null);
        setIntField(term203845, term203845.getClass(), "sourcePosition", 0);
        setField(term203845, term203845.getClass(), "jsType", null);
        setField(term203845, term203845.getClass(), "parent", null);
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
        args[1] = term203486;
        args[2] = term203556;
        callMethod(klass, "visit", argTypes, term203416, args);
        assertTrue(recursiveEquals(term203416, term203843));
        assertTrue(recursiveEquals(term203486, term203845));
        assertTrue(recursiveEquals(term203556, null));
    }

};


