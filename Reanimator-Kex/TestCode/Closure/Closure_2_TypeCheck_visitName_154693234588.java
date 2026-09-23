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

public class TypeCheck_visitName_154693234588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7268;

    public TypeCheck_visitName_154693234588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7268 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term7268, term7268.getClass(), "compiler", null);
        setField(term7268, term7268.getClass(), "validator", null);
        setField(term7268, term7268.getClass(), "reverseInterpreter", null);
        setField(term7268, term7268.getClass(), "typeRegistry", null);
        setField(term7268, term7268.getClass(), "topScope", null);
        setField(term7268, term7268.getClass(), "scopeCreator", null);
        setField(term7268, term7268.getClass(), "reportMissingOverride", null);
        setField(term7268, term7268.getClass(), "reportUnknownTypes", null);
        setBooleanField(term7268, term7268.getClass(), "reportMissingProperties", false);
        setField(term7268, term7268.getClass(), "inferJSDocInfo", null);
        setIntField(term7268, term7268.getClass(), "typedCount", 0);
        setIntField(term7268, term7268.getClass(), "nullCount", 0);
        setIntField(term7268, term7268.getClass(), "unknownCount", 0);
        setBooleanField(term7268, term7268.getClass(), "inExterns", false);
        setIntField(term7268, term7268.getClass(), "noTypeCheckSection", 0);
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
            callMethod(klass, "visitName", argTypes, term7268, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


