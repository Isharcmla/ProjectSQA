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

public class NameAnalyzer_referenceParentNames_23663436088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20317;
     Object term20710;

    public NameAnalyzer_referenceParentNames_23663436088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20365 = new HashMap();
        term20317 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term20317, term20317.getClass(), "allNames", term20365);
        HashMap term20711 = new HashMap();
        term20710 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term20710, term20710.getClass(), "compiler", null);
        setField(term20710, term20710.getClass(), "allNames", term20711);
        setField(term20710, term20710.getClass(), "referenceGraph", null);
        setField(term20710, term20710.getClass(), "scopes", null);
        setBooleanField(term20710, term20710.getClass(), "removeUnreferenced", false);
        setField(term20710, term20710.getClass(), "globalNames", null);
        setField(term20710, term20710.getClass(), "changeProxy", null);
        setField(term20710, term20710.getClass(), "externalNames", null);
        setField(term20710, term20710.getClass(), "refNodes", null);
        setField(term20710, term20710.getClass(), "aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "referenceParentNames", argTypes, term20317, args);
        assertTrue(recursiveEquals(term20317, term20710));
    }

};


