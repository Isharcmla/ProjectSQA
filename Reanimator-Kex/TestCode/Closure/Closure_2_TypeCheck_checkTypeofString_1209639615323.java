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

public class TypeCheck_checkTypeofString_1209639615323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79557;
     Object term79788;

    public TypeCheck_checkTypeofString_1209639615323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79557 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term79788 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term79788, term79788.getClass(), "compiler", null);
        setField(term79788, term79788.getClass(), "validator", null);
        setField(term79788, term79788.getClass(), "reverseInterpreter", null);
        setField(term79788, term79788.getClass(), "typeRegistry", null);
        setField(term79788, term79788.getClass(), "topScope", null);
        setField(term79788, term79788.getClass(), "scopeCreator", null);
        setField(term79788, term79788.getClass(), "reportMissingOverride", null);
        setField(term79788, term79788.getClass(), "reportUnknownTypes", null);
        setBooleanField(term79788, term79788.getClass(), "reportMissingProperties", false);
        setField(term79788, term79788.getClass(), "inferJSDocInfo", null);
        setIntField(term79788, term79788.getClass(), "typedCount", 0);
        setIntField(term79788, term79788.getClass(), "nullCount", 0);
        setIntField(term79788, term79788.getClass(), "unknownCount", 0);
        setBooleanField(term79788, term79788.getClass(), "inExterns", false);
        setIntField(term79788, term79788.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = "object";
        callMethod(klass, "checkTypeofString", argTypes, term79557, args);
        assertTrue(recursiveEquals(term79557, term79788));
    }

};


