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

public class TypeCheck_visit_859524784468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120813;
     Object term120883;
     Object term120909;
     Object term120910;

    public TypeCheck_visit_859524784468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120813 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term120883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term120883, term120883.getClass(), "type", 115);
        term120909 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term120909, term120909.getClass(), "compiler", null);
        setField(term120909, term120909.getClass(), "validator", null);
        setField(term120909, term120909.getClass(), "reverseInterpreter", null);
        setField(term120909, term120909.getClass(), "typeRegistry", null);
        setField(term120909, term120909.getClass(), "topScope", null);
        setField(term120909, term120909.getClass(), "scopeCreator", null);
        setField(term120909, term120909.getClass(), "reportMissingOverride", null);
        setBooleanField(term120909, term120909.getClass(), "reportUnknownTypes", false);
        setBooleanField(term120909, term120909.getClass(), "reportMissingProperties", false);
        setField(term120909, term120909.getClass(), "inferJSDocInfo", null);
        setIntField(term120909, term120909.getClass(), "typedCount", 0);
        setIntField(term120909, term120909.getClass(), "nullCount", 0);
        setIntField(term120909, term120909.getClass(), "unknownCount", 0);
        setBooleanField(term120909, term120909.getClass(), "inExterns", false);
        setIntField(term120909, term120909.getClass(), "noTypeCheckSection", 0);
        setField(term120909, term120909.getClass(), "editDistance", null);
        term120910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term120910, term120910.getClass(), "type", 115);
        setField(term120910, term120910.getClass(), "next", null);
        setField(term120910, term120910.getClass(), "first", null);
        setField(term120910, term120910.getClass(), "last", null);
        setField(term120910, term120910.getClass(), "propListHead", null);
        setIntField(term120910, term120910.getClass(), "sourcePosition", 0);
        setField(term120910, term120910.getClass(), "jsType", null);
        setField(term120910, term120910.getClass(), "parent", null);
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
        args[1] = term120883;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term120813, args);
        assertTrue(recursiveEquals(term120813, term120909));
        assertTrue(recursiveEquals(term120883, null));
    }

};


