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

public class TypeCheck_visit_859524784604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188705;
     Object term188797;
     Object term188814;
     Object term188815;

    public TypeCheck_visit_859524784604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188705 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term188797 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term188797, term188797.getClass(), "type", 117);
        term188814 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term188814, term188814.getClass(), "compiler", null);
        setField(term188814, term188814.getClass(), "validator", null);
        setField(term188814, term188814.getClass(), "reverseInterpreter", null);
        setField(term188814, term188814.getClass(), "typeRegistry", null);
        setField(term188814, term188814.getClass(), "topScope", null);
        setField(term188814, term188814.getClass(), "scopeCreator", null);
        setField(term188814, term188814.getClass(), "reportMissingOverride", null);
        setField(term188814, term188814.getClass(), "reportUnknownTypes", null);
        setBooleanField(term188814, term188814.getClass(), "reportMissingProperties", false);
        setField(term188814, term188814.getClass(), "inferJSDocInfo", null);
        setIntField(term188814, term188814.getClass(), "typedCount", 0);
        setIntField(term188814, term188814.getClass(), "nullCount", 0);
        setIntField(term188814, term188814.getClass(), "unknownCount", 0);
        setBooleanField(term188814, term188814.getClass(), "inExterns", false);
        setIntField(term188814, term188814.getClass(), "noTypeCheckSection", 0);
        term188815 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term188815, term188815.getClass(), "number", 0.0);
        setIntField(term188815, term188815.getClass(), "type", 117);
        setField(term188815, term188815.getClass(), "next", null);
        setField(term188815, term188815.getClass(), "first", null);
        setField(term188815, term188815.getClass(), "last", null);
        setField(term188815, term188815.getClass(), "propListHead", null);
        setIntField(term188815, term188815.getClass(), "sourcePosition", 0);
        setField(term188815, term188815.getClass(), "jsType", null);
        setField(term188815, term188815.getClass(), "parent", null);
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
        args[1] = term188797;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term188705, args);
        assertTrue(recursiveEquals(term188705, term188814));
        assertTrue(recursiveEquals(term188797, null));
    }

};


