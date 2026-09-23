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

public class TypeCheck_report_563874199168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37635;
     Object term37644;

    public TypeCheck_report_563874199168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37635 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term37635, term37635.getClass(), "noTypeCheckSection", -1);
        term37644 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term37644, term37644.getClass(), "compiler", null);
        setField(term37644, term37644.getClass(), "validator", null);
        setField(term37644, term37644.getClass(), "reverseInterpreter", null);
        setField(term37644, term37644.getClass(), "typeRegistry", null);
        setField(term37644, term37644.getClass(), "topScope", null);
        setField(term37644, term37644.getClass(), "scopeCreator", null);
        setField(term37644, term37644.getClass(), "reportMissingOverride", null);
        setField(term37644, term37644.getClass(), "reportUnknownTypes", null);
        setBooleanField(term37644, term37644.getClass(), "reportMissingProperties", false);
        setField(term37644, term37644.getClass(), "inferJSDocInfo", null);
        setIntField(term37644, term37644.getClass(), "typedCount", 0);
        setIntField(term37644, term37644.getClass(), "nullCount", 0);
        setIntField(term37644, term37644.getClass(), "unknownCount", 0);
        setBooleanField(term37644, term37644.getClass(), "inExterns", false);
        setIntField(term37644, term37644.getClass(), "noTypeCheckSection", -1);
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
        callMethod(klass, "report", argTypes, term37635, args);
        assertTrue(recursiveEquals(term37635, term37644));
    }

};


