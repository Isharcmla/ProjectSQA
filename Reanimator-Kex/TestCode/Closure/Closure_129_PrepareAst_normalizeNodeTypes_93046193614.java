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

public class PrepareAst_normalizeNodeTypes_93046193614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1126;
     Object term1196;
     Object term1379;
     Object term1380;

    public PrepareAst_normalizeNodeTypes_93046193614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1126 = newInstance(Class.forName("com.google.javascript.jscomp.PrepareAst"));
        term1196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1196, term1196.getClass(), "type", 14);
        setField(term1196, term1196.getClass(), "first", null);
        term1379 = newInstance(Class.forName("com.google.javascript.jscomp.PrepareAst"));
        setField(term1379, term1379.getClass(), "compiler", null);
        setBooleanField(term1379, term1379.getClass(), "checkOnly", false);
        term1380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1380, term1380.getClass(), "type", 14);
        setField(term1380, term1380.getClass(), "next", null);
        setField(term1380, term1380.getClass(), "first", null);
        setField(term1380, term1380.getClass(), "last", null);
        setField(term1380, term1380.getClass(), "propListHead", null);
        setIntField(term1380, term1380.getClass(), "sourcePosition", 0);
        setField(term1380, term1380.getClass(), "jsType", null);
        setField(term1380, term1380.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1196;
        callMethod(klass, "normalizeNodeTypes", argTypes, term1126, args);
        assertTrue(recursiveEquals(term1126, term1379));
        assertTrue(recursiveEquals(term1196, term1380));
    }

};


