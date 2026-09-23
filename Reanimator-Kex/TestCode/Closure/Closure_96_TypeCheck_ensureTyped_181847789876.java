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

public class TypeCheck_ensureTyped_181847789876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21279;

    public TypeCheck_ensureTyped_181847789876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21279 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term21279, term21279.getClass(), "compiler", null);
        setField(term21279, term21279.getClass(), "validator", null);
        setField(term21279, term21279.getClass(), "reverseInterpreter", null);
        setField(term21279, term21279.getClass(), "typeRegistry", null);
        setField(term21279, term21279.getClass(), "topScope", null);
        setField(term21279, term21279.getClass(), "scopeCreator", null);
        setField(term21279, term21279.getClass(), "reportMissingOverride", null);
        setField(term21279, term21279.getClass(), "reportUnknownTypes", null);
        setBooleanField(term21279, term21279.getClass(), "reportMissingProperties", false);
        setField(term21279, term21279.getClass(), "inferJSDocInfo", null);
        setIntField(term21279, term21279.getClass(), "typedCount", 0);
        setIntField(term21279, term21279.getClass(), "nullCount", 0);
        setIntField(term21279, term21279.getClass(), "unknownCount", 0);
        setBooleanField(term21279, term21279.getClass(), "inExterns", false);
        setIntField(term21279, term21279.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "ensureTyped", argTypes, term21279, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


