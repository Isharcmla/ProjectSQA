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

public class TypeCheck_report_56387419978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2827;

    public TypeCheck_report_56387419978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2827 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term2827, term2827.getClass(), "compiler", null);
        setField(term2827, term2827.getClass(), "validator", null);
        setField(term2827, term2827.getClass(), "reverseInterpreter", null);
        setField(term2827, term2827.getClass(), "typeRegistry", null);
        setField(term2827, term2827.getClass(), "topScope", null);
        setField(term2827, term2827.getClass(), "scopeCreator", null);
        setField(term2827, term2827.getClass(), "reportMissingOverride", null);
        setBooleanField(term2827, term2827.getClass(), "reportUnknownTypes", false);
        setBooleanField(term2827, term2827.getClass(), "reportMissingProperties", false);
        setField(term2827, term2827.getClass(), "inferJSDocInfo", null);
        setIntField(term2827, term2827.getClass(), "typedCount", 0);
        setIntField(term2827, term2827.getClass(), "nullCount", 0);
        setIntField(term2827, term2827.getClass(), "unknownCount", 0);
        setBooleanField(term2827, term2827.getClass(), "inExterns", false);
        setIntField(term2827, term2827.getClass(), "noTypeCheckSection", 0);
        setField(term2827, term2827.getClass(), "editDistance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[3] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "report", argTypes, term2827, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


