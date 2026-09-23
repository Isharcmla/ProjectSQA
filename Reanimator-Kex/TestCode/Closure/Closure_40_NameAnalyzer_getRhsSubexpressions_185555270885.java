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

public class NameAnalyzer_getRhsSubexpressions_185555270885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24460;
     Object term24530;
     Object term24567;
     Object term24568;
     Object term24561;

    public NameAnalyzer_getRhsSubexpressions_185555270885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24460 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term24530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24530, term24530.getClass(), "type", 86);
        setField(term24530, term24530.getClass(), "first", term24530);
        term24567 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term24567, term24567.getClass(), "compiler", null);
        setField(term24567, term24567.getClass(), "allNames", null);
        setField(term24567, term24567.getClass(), "referenceGraph", null);
        setField(term24567, term24567.getClass(), "scopes", null);
        setBooleanField(term24567, term24567.getClass(), "removeUnreferenced", false);
        setField(term24567, term24567.getClass(), "globalNames", null);
        setField(term24567, term24567.getClass(), "changeProxy", null);
        setField(term24567, term24567.getClass(), "externalNames", null);
        setField(term24567, term24567.getClass(), "refNodes", null);
        setField(term24567, term24567.getClass(), "aliases", null);
        term24568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24568, term24568.getClass(), "type", 86);
        setField(term24568, term24568.getClass(), "next", null);
        setField(term24568, term24568.getClass(), "first", term24568);
        setField(term24568, term24568.getClass(), "last", null);
        setField(term24568, term24568.getClass(), "propListHead", null);
        setIntField(term24568, term24568.getClass(), "sourcePosition", 0);
        setField(term24568, term24568.getClass(), "jsType", null);
        setField(term24568, term24568.getClass(), "parent", null);
        Object term24532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24532, term24532.getClass(), "type", 86);
        setField(term24532, term24532.getClass(), "next", null);
        setField(term24532, term24532.getClass(), "first", term24532);
        setField(term24532, term24532.getClass(), "last", null);
        setField(term24532, term24532.getClass(), "propListHead", null);
        setIntField(term24532, term24532.getClass(), "sourcePosition", 0);
        setField(term24532, term24532.getClass(), "jsType", null);
        setField(term24532, term24532.getClass(), "parent", null);
        term24561 = new ArrayList();
        ((ArrayList) term24561).add(term24532);
        ((ArrayList) term24561).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24530;
        Object retValue = callMethod(klass, "getRhsSubexpressions", argTypes, term24460, args);
        assertTrue(recursiveEquals(term24460, term24567));
        assertTrue(recursiveEquals(term24530, term24568));
        assertTrue(recursiveEquals(retValue, term24561));
    }

};


