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

public class NameAnalyzer_getRhsSubexpressions_185555270892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25046;
     Object term25116;
     Object term28786;
     Object term28787;
     Object term28780;

    public NameAnalyzer_getRhsSubexpressions_185555270892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25046 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term25116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25116, term25116.getClass(), "type", 118);
        term28786 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term28786, term28786.getClass(), "compiler", null);
        setField(term28786, term28786.getClass(), "allNames", null);
        setField(term28786, term28786.getClass(), "referenceGraph", null);
        setField(term28786, term28786.getClass(), "scopes", null);
        setBooleanField(term28786, term28786.getClass(), "removeUnreferenced", false);
        setField(term28786, term28786.getClass(), "globalNames", null);
        setField(term28786, term28786.getClass(), "changeProxy", null);
        setField(term28786, term28786.getClass(), "externalNames", null);
        setField(term28786, term28786.getClass(), "refNodes", null);
        setField(term28786, term28786.getClass(), "aliases", null);
        term28787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28787, term28787.getClass(), "type", 118);
        setField(term28787, term28787.getClass(), "next", null);
        setField(term28787, term28787.getClass(), "first", null);
        setField(term28787, term28787.getClass(), "last", null);
        setField(term28787, term28787.getClass(), "propListHead", null);
        setIntField(term28787, term28787.getClass(), "sourcePosition", 0);
        setField(term28787, term28787.getClass(), "jsType", null);
        setField(term28787, term28787.getClass(), "parent", null);
        term28780 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25116;
        Object retValue = callMethod(klass, "getRhsSubexpressions", argTypes, term25046, args);
        assertTrue(recursiveEquals(term25046, term28786));
        assertTrue(recursiveEquals(term25116, term28787));
        assertTrue(recursiveEquals(retValue, term28780));
    }

};


