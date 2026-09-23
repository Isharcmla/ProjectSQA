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

public class TypeCheck_visitVar_32894406192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44115;
     Object term44185;
     Object term44202;
     Object term44203;

    public TypeCheck_visitVar_32894406192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44115 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term44185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term44202 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term44202, term44202.getClass(), "compiler", null);
        setField(term44202, term44202.getClass(), "validator", null);
        setField(term44202, term44202.getClass(), "reverseInterpreter", null);
        setField(term44202, term44202.getClass(), "typeRegistry", null);
        setField(term44202, term44202.getClass(), "topScope", null);
        setField(term44202, term44202.getClass(), "scopeCreator", null);
        setField(term44202, term44202.getClass(), "reportMissingOverride", null);
        setField(term44202, term44202.getClass(), "reportUnknownTypes", null);
        setBooleanField(term44202, term44202.getClass(), "reportMissingProperties", false);
        setField(term44202, term44202.getClass(), "inferJSDocInfo", null);
        setIntField(term44202, term44202.getClass(), "typedCount", 0);
        setIntField(term44202, term44202.getClass(), "nullCount", 0);
        setIntField(term44202, term44202.getClass(), "unknownCount", 0);
        setBooleanField(term44202, term44202.getClass(), "inExterns", false);
        setIntField(term44202, term44202.getClass(), "noTypeCheckSection", 0);
        term44203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44203, term44203.getClass(), "type", 0);
        setField(term44203, term44203.getClass(), "next", null);
        setField(term44203, term44203.getClass(), "first", null);
        setField(term44203, term44203.getClass(), "last", null);
        setField(term44203, term44203.getClass(), "propListHead", null);
        setIntField(term44203, term44203.getClass(), "sourcePosition", 0);
        setField(term44203, term44203.getClass(), "jsType", null);
        setField(term44203, term44203.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term44185;
        callMethod(klass, "visitVar", argTypes, term44115, args);
        assertTrue(recursiveEquals(term44115, term44202));
        assertTrue(recursiveEquals(term44185, null));
    }

};


