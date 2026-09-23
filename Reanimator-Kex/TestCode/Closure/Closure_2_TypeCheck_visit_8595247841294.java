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

public class TypeCheck_visit_8595247841294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389743;
     Object term389835;
     Object term389851;
     Object term389852;

    public TypeCheck_visit_8595247841294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term389743 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term389835 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term389835, term389835.getClass(), "type", 152);
        term389851 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term389851, term389851.getClass(), "compiler", null);
        setField(term389851, term389851.getClass(), "validator", null);
        setField(term389851, term389851.getClass(), "reverseInterpreter", null);
        setField(term389851, term389851.getClass(), "typeRegistry", null);
        setField(term389851, term389851.getClass(), "topScope", null);
        setField(term389851, term389851.getClass(), "scopeCreator", null);
        setField(term389851, term389851.getClass(), "reportMissingOverride", null);
        setField(term389851, term389851.getClass(), "reportUnknownTypes", null);
        setBooleanField(term389851, term389851.getClass(), "reportMissingProperties", false);
        setField(term389851, term389851.getClass(), "inferJSDocInfo", null);
        setIntField(term389851, term389851.getClass(), "typedCount", 0);
        setIntField(term389851, term389851.getClass(), "nullCount", 0);
        setIntField(term389851, term389851.getClass(), "unknownCount", 0);
        setBooleanField(term389851, term389851.getClass(), "inExterns", false);
        setIntField(term389851, term389851.getClass(), "noTypeCheckSection", 0);
        term389852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term389852, term389852.getClass(), "str", null);
        setIntField(term389852, term389852.getClass(), "type", 152);
        setField(term389852, term389852.getClass(), "next", null);
        setField(term389852, term389852.getClass(), "first", null);
        setField(term389852, term389852.getClass(), "last", null);
        setField(term389852, term389852.getClass(), "propListHead", null);
        setIntField(term389852, term389852.getClass(), "sourcePosition", 0);
        setField(term389852, term389852.getClass(), "jsType", null);
        setField(term389852, term389852.getClass(), "parent", null);
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
        args[1] = term389835;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term389743, args);
        assertTrue(recursiveEquals(term389743, term389851));
        assertTrue(recursiveEquals(term389835, null));
    }

};


