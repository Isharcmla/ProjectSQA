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

public class NameAnalyzer_getRhsSubexpressions_185555270897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21890;
     Object term21960;
     Object term21978;
     Object term21979;
     Object term21972;

    public NameAnalyzer_getRhsSubexpressions_185555270897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21890 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term21960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21960, term21960.getClass(), "type", 118);
        term21978 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term21978, term21978.getClass(), "compiler", null);
        setField(term21978, term21978.getClass(), "allNames", null);
        setField(term21978, term21978.getClass(), "referenceGraph", null);
        setField(term21978, term21978.getClass(), "scopes", null);
        setBooleanField(term21978, term21978.getClass(), "removeUnreferenced", false);
        setField(term21978, term21978.getClass(), "globalNames", null);
        setField(term21978, term21978.getClass(), "changeProxy", null);
        setField(term21978, term21978.getClass(), "externalNames", null);
        setField(term21978, term21978.getClass(), "refNodes", null);
        setField(term21978, term21978.getClass(), "aliases", null);
        term21979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21979, term21979.getClass(), "type", 118);
        setField(term21979, term21979.getClass(), "next", null);
        setField(term21979, term21979.getClass(), "first", null);
        setField(term21979, term21979.getClass(), "last", null);
        setField(term21979, term21979.getClass(), "propListHead", null);
        setIntField(term21979, term21979.getClass(), "sourcePosition", 0);
        setField(term21979, term21979.getClass(), "jsType", null);
        setField(term21979, term21979.getClass(), "parent", null);
        term21972 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21960;
        Object retValue = callMethod(klass, "getRhsSubexpressions", argTypes, term21890, args);
        assertTrue(recursiveEquals(term21890, term21978));
        assertTrue(recursiveEquals(term21960, term21979));
        assertTrue(recursiveEquals(retValue, term21972));
    }

};


