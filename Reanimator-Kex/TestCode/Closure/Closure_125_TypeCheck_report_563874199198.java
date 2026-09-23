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

public class TypeCheck_report_563874199198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46864;
     Object term46874;

    public TypeCheck_report_563874199198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46864 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term46864, term46864.getClass(), "noTypeCheckSection", -1);
        term46874 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term46874, term46874.getClass(), "compiler", null);
        setField(term46874, term46874.getClass(), "validator", null);
        setField(term46874, term46874.getClass(), "reverseInterpreter", null);
        setField(term46874, term46874.getClass(), "typeRegistry", null);
        setField(term46874, term46874.getClass(), "topScope", null);
        setField(term46874, term46874.getClass(), "scopeCreator", null);
        setField(term46874, term46874.getClass(), "reportMissingOverride", null);
        setBooleanField(term46874, term46874.getClass(), "reportUnknownTypes", false);
        setBooleanField(term46874, term46874.getClass(), "reportMissingProperties", false);
        setField(term46874, term46874.getClass(), "inferJSDocInfo", null);
        setIntField(term46874, term46874.getClass(), "typedCount", 0);
        setIntField(term46874, term46874.getClass(), "nullCount", 0);
        setIntField(term46874, term46874.getClass(), "unknownCount", 0);
        setBooleanField(term46874, term46874.getClass(), "inExterns", false);
        setIntField(term46874, term46874.getClass(), "noTypeCheckSection", -1);
        setField(term46874, term46874.getClass(), "editDistance", null);
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
        callMethod(klass, "report", argTypes, term46864, args);
        assertTrue(recursiveEquals(term46864, term46874));
    }

};


