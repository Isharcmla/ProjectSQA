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

public class NameAnalyzer_getRhsSubexpressions_185555270893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21359;
     Object term21429;
     Object term21438;
     Object term21439;
     Object term21434;

    public NameAnalyzer_getRhsSubexpressions_185555270893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21359 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term21429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21429, term21429.getClass(), "type", 105);
        term21438 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term21438, term21438.getClass(), "compiler", null);
        setField(term21438, term21438.getClass(), "allNames", null);
        setField(term21438, term21438.getClass(), "referenceGraph", null);
        setField(term21438, term21438.getClass(), "scopes", null);
        setBooleanField(term21438, term21438.getClass(), "removeUnreferenced", false);
        setField(term21438, term21438.getClass(), "globalNames", null);
        setField(term21438, term21438.getClass(), "changeProxy", null);
        setField(term21438, term21438.getClass(), "externalNames", null);
        setField(term21438, term21438.getClass(), "refNodes", null);
        setField(term21438, term21438.getClass(), "aliases", null);
        term21439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21439, term21439.getClass(), "type", 105);
        setField(term21439, term21439.getClass(), "next", null);
        setField(term21439, term21439.getClass(), "first", null);
        setField(term21439, term21439.getClass(), "last", null);
        setField(term21439, term21439.getClass(), "propListHead", null);
        setIntField(term21439, term21439.getClass(), "sourcePosition", 0);
        setField(term21439, term21439.getClass(), "jsType", null);
        setField(term21439, term21439.getClass(), "parent", null);
        term21434 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setIntField(term21434, term21434.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21429;
        Object retValue = callMethod(klass, "getRhsSubexpressions", argTypes, term21359, args);
        assertTrue(recursiveEquals(term21359, term21438));
        assertTrue(recursiveEquals(term21429, term21439));
        assertTrue(recursiveEquals(retValue, term21434));
    }

};


