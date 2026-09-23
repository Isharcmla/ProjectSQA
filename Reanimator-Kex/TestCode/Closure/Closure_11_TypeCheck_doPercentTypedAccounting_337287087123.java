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

public class TypeCheck_doPercentTypedAccounting_337287087123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28318;
     Object term28388;
     Object term29208;
     Object term29209;

    public TypeCheck_doPercentTypedAccounting_337287087123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28318 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term28388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term29208 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term29208, term29208.getClass(), "compiler", null);
        setField(term29208, term29208.getClass(), "validator", null);
        setField(term29208, term29208.getClass(), "reverseInterpreter", null);
        setField(term29208, term29208.getClass(), "typeRegistry", null);
        setField(term29208, term29208.getClass(), "topScope", null);
        setField(term29208, term29208.getClass(), "scopeCreator", null);
        setField(term29208, term29208.getClass(), "reportMissingOverride", null);
        setField(term29208, term29208.getClass(), "reportUnknownTypes", null);
        setBooleanField(term29208, term29208.getClass(), "reportMissingProperties", false);
        setField(term29208, term29208.getClass(), "inferJSDocInfo", null);
        setIntField(term29208, term29208.getClass(), "typedCount", 0);
        setIntField(term29208, term29208.getClass(), "nullCount", 1);
        setIntField(term29208, term29208.getClass(), "unknownCount", 0);
        setBooleanField(term29208, term29208.getClass(), "inExterns", false);
        setIntField(term29208, term29208.getClass(), "noTypeCheckSection", 0);
        term29209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29209, term29209.getClass(), "type", 0);
        setField(term29209, term29209.getClass(), "next", null);
        setField(term29209, term29209.getClass(), "first", null);
        setField(term29209, term29209.getClass(), "last", null);
        setField(term29209, term29209.getClass(), "propListHead", null);
        setIntField(term29209, term29209.getClass(), "sourcePosition", 0);
        setField(term29209, term29209.getClass(), "jsType", null);
        setField(term29209, term29209.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28388;
        callMethod(klass, "doPercentTypedAccounting", argTypes, term28318, args);
        assertTrue(recursiveEquals(term28318, term29208));
        assertTrue(recursiveEquals(term28388, null));
    }

};


