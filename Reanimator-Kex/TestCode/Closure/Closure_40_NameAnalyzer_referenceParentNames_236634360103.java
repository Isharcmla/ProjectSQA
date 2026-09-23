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
import java.util.HashMap;

public class NameAnalyzer_referenceParentNames_236634360103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32653;
     Object term32730;

    public NameAnalyzer_referenceParentNames_236634360103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term32701 = new HashMap();
        term32653 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term32653, term32653.getClass(), "allNames", term32701);
        HashMap term32731 = new HashMap();
        term32730 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term32730, term32730.getClass(), "compiler", null);
        setField(term32730, term32730.getClass(), "allNames", term32731);
        setField(term32730, term32730.getClass(), "referenceGraph", null);
        setField(term32730, term32730.getClass(), "scopes", null);
        setBooleanField(term32730, term32730.getClass(), "removeUnreferenced", false);
        setField(term32730, term32730.getClass(), "globalNames", null);
        setField(term32730, term32730.getClass(), "changeProxy", null);
        setField(term32730, term32730.getClass(), "externalNames", null);
        setField(term32730, term32730.getClass(), "refNodes", null);
        setField(term32730, term32730.getClass(), "aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "referenceParentNames", argTypes, term32653, args);
        assertTrue(recursiveEquals(term32653, term32730));
    }

};


