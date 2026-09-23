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

public class NameAnalyzer_recordAlias_1268098468107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33317;
     Object term33488;

    public NameAnalyzer_recordAlias_1268098468107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term33365 = new HashMap();
        term33317 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term33317, term33317.getClass(), "aliases", term33365);
        HashMap term33489 = new HashMap();
        term33488 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term33488, term33488.getClass(), "compiler", null);
        setField(term33488, term33488.getClass(), "allNames", null);
        setField(term33488, term33488.getClass(), "referenceGraph", null);
        setField(term33488, term33488.getClass(), "scopes", null);
        setBooleanField(term33488, term33488.getClass(), "removeUnreferenced", false);
        setField(term33488, term33488.getClass(), "globalNames", null);
        setField(term33488, term33488.getClass(), "changeProxy", null);
        setField(term33488, term33488.getClass(), "externalNames", null);
        setField(term33488, term33488.getClass(), "refNodes", null);
        setField(term33488, term33488.getClass(), "aliases", term33489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = "";
        callMethod(klass, "recordAlias", argTypes, term33317, args);
        assertTrue(recursiveEquals(term33317, term33488));
    }

};


