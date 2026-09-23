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

public class NameAnalyzer_getRhsSubexpressions_1855552708118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30021;
     Object term30091;
     Object term31060;
     Object term31061;
     Object term31054;

    public NameAnalyzer_getRhsSubexpressions_1855552708118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30021 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term30091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30091, term30091.getClass(), "type", 86);
        setField(term30091, term30091.getClass(), "first", term30091);
        term31060 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term31060, term31060.getClass(), "compiler", null);
        setField(term31060, term31060.getClass(), "allNames", null);
        setField(term31060, term31060.getClass(), "referenceGraph", null);
        setField(term31060, term31060.getClass(), "scopes", null);
        setBooleanField(term31060, term31060.getClass(), "removeUnreferenced", false);
        setField(term31060, term31060.getClass(), "globalNames", null);
        setField(term31060, term31060.getClass(), "changeProxy", null);
        setField(term31060, term31060.getClass(), "externalNames", null);
        setField(term31060, term31060.getClass(), "refNodes", null);
        setField(term31060, term31060.getClass(), "aliases", null);
        term31061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31061, term31061.getClass(), "type", 86);
        setField(term31061, term31061.getClass(), "next", null);
        setField(term31061, term31061.getClass(), "first", term31061);
        setField(term31061, term31061.getClass(), "last", null);
        setField(term31061, term31061.getClass(), "propListHead", null);
        setIntField(term31061, term31061.getClass(), "sourcePosition", 0);
        setField(term31061, term31061.getClass(), "jsType", null);
        setField(term31061, term31061.getClass(), "parent", null);
        Object term31025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31025, term31025.getClass(), "type", 86);
        setField(term31025, term31025.getClass(), "next", null);
        setField(term31025, term31025.getClass(), "first", term31025);
        setField(term31025, term31025.getClass(), "last", null);
        setField(term31025, term31025.getClass(), "propListHead", null);
        setIntField(term31025, term31025.getClass(), "sourcePosition", 0);
        setField(term31025, term31025.getClass(), "jsType", null);
        setField(term31025, term31025.getClass(), "parent", null);
        term31054 = new ArrayList();
        ((ArrayList) term31054).add(term31025);
        ((ArrayList) term31054).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30091;
        Object retValue = callMethod(klass, "getRhsSubexpressions", argTypes, term30021, args);
        assertTrue(recursiveEquals(term30021, term31060));
        assertTrue(recursiveEquals(term30091, term31061));
        assertTrue(recursiveEquals(retValue, term31054));
    }

};


