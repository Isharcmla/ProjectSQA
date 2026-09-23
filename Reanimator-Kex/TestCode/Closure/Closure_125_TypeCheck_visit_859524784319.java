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

public class TypeCheck_visit_859524784319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78546;
     Object term78616;
     Object term78798;
     Object term78799;

    public TypeCheck_visit_859524784319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78546 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term78616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78616, term78616.getClass(), "type", 117);
        term78798 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term78798, term78798.getClass(), "compiler", null);
        setField(term78798, term78798.getClass(), "validator", null);
        setField(term78798, term78798.getClass(), "reverseInterpreter", null);
        setField(term78798, term78798.getClass(), "typeRegistry", null);
        setField(term78798, term78798.getClass(), "topScope", null);
        setField(term78798, term78798.getClass(), "scopeCreator", null);
        setField(term78798, term78798.getClass(), "reportMissingOverride", null);
        setBooleanField(term78798, term78798.getClass(), "reportUnknownTypes", false);
        setBooleanField(term78798, term78798.getClass(), "reportMissingProperties", false);
        setField(term78798, term78798.getClass(), "inferJSDocInfo", null);
        setIntField(term78798, term78798.getClass(), "typedCount", 0);
        setIntField(term78798, term78798.getClass(), "nullCount", 0);
        setIntField(term78798, term78798.getClass(), "unknownCount", 0);
        setBooleanField(term78798, term78798.getClass(), "inExterns", false);
        setIntField(term78798, term78798.getClass(), "noTypeCheckSection", 0);
        setField(term78798, term78798.getClass(), "editDistance", null);
        term78799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78799, term78799.getClass(), "type", 117);
        setField(term78799, term78799.getClass(), "next", null);
        setField(term78799, term78799.getClass(), "first", null);
        setField(term78799, term78799.getClass(), "last", null);
        setField(term78799, term78799.getClass(), "propListHead", null);
        setIntField(term78799, term78799.getClass(), "sourcePosition", 0);
        setField(term78799, term78799.getClass(), "jsType", null);
        setField(term78799, term78799.getClass(), "parent", null);
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
        args[1] = term78616;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term78546, args);
        assertTrue(recursiveEquals(term78546, term78798));
        assertTrue(recursiveEquals(term78616, null));
    }

};


