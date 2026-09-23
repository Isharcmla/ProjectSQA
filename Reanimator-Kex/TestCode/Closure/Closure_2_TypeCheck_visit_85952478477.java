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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeCheck_visit_85952478477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2892;

    public TypeCheck_visit_85952478477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2892 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term2892, term2892.getClass(), "compiler", null);
        setField(term2892, term2892.getClass(), "validator", null);
        setField(term2892, term2892.getClass(), "reverseInterpreter", null);
        setField(term2892, term2892.getClass(), "typeRegistry", null);
        setField(term2892, term2892.getClass(), "topScope", null);
        setField(term2892, term2892.getClass(), "scopeCreator", null);
        setField(term2892, term2892.getClass(), "reportMissingOverride", null);
        setField(term2892, term2892.getClass(), "reportUnknownTypes", null);
        setBooleanField(term2892, term2892.getClass(), "reportMissingProperties", false);
        setField(term2892, term2892.getClass(), "inferJSDocInfo", null);
        setIntField(term2892, term2892.getClass(), "typedCount", 0);
        setIntField(term2892, term2892.getClass(), "nullCount", 0);
        setIntField(term2892, term2892.getClass(), "unknownCount", 0);
        setBooleanField(term2892, term2892.getClass(), "inExterns", false);
        setIntField(term2892, term2892.getClass(), "noTypeCheckSection", 0);
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
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term2892, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


