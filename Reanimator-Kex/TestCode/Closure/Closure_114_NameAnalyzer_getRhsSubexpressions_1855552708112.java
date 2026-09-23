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
import java.util.ArrayList;
import java.lang.Object;

public class NameAnalyzer_getRhsSubexpressions_1855552708112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24681;
     Object term24751;
     Object term29135;
     Object term29136;
     Object term29129;

    public NameAnalyzer_getRhsSubexpressions_1855552708112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24681 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term24751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24751, term24751.getClass(), "type", 38);
        setField(term24751, term24751.getClass(), "first", term24751);
        term29135 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term29135, term29135.getClass(), "compiler", null);
        setField(term29135, term29135.getClass(), "allNames", null);
        setField(term29135, term29135.getClass(), "referenceGraph", null);
        setField(term29135, term29135.getClass(), "scopes", null);
        setBooleanField(term29135, term29135.getClass(), "removeUnreferenced", false);
        setField(term29135, term29135.getClass(), "globalNames", null);
        setField(term29135, term29135.getClass(), "changeProxy", null);
        setField(term29135, term29135.getClass(), "externalNames", null);
        setField(term29135, term29135.getClass(), "refNodes", null);
        setField(term29135, term29135.getClass(), "aliases", null);
        term29136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29136, term29136.getClass(), "type", 38);
        setField(term29136, term29136.getClass(), "next", null);
        setField(term29136, term29136.getClass(), "first", term29136);
        setField(term29136, term29136.getClass(), "last", null);
        setField(term29136, term29136.getClass(), "propListHead", null);
        setIntField(term29136, term29136.getClass(), "sourcePosition", 0);
        setField(term29136, term29136.getClass(), "jsType", null);
        setField(term29136, term29136.getClass(), "parent", null);
        Object term29102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29102, term29102.getClass(), "type", 38);
        setField(term29102, term29102.getClass(), "next", null);
        setField(term29102, term29102.getClass(), "first", term29102);
        setField(term29102, term29102.getClass(), "last", null);
        setField(term29102, term29102.getClass(), "propListHead", null);
        setIntField(term29102, term29102.getClass(), "sourcePosition", 0);
        setField(term29102, term29102.getClass(), "jsType", null);
        setField(term29102, term29102.getClass(), "parent", null);
        term29129 = new ArrayList();
        ((ArrayList) term29129).add(term29102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24751;
        Object retValue = callMethod(klass, "getRhsSubexpressions", argTypes, term24681, args);
        assertTrue(recursiveEquals(term24681, term29135));
        assertTrue(recursiveEquals(term24751, term29136));
        assertTrue(recursiveEquals(retValue, term29129));
    }

};


