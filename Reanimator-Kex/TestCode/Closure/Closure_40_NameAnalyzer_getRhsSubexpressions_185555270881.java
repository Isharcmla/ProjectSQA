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

public class NameAnalyzer_getRhsSubexpressions_185555270881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23627;
     Object term23697;
     Object term23707;
     Object term23708;
     Object term23703;

    public NameAnalyzer_getRhsSubexpressions_185555270881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23627 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term23697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23697, term23697.getClass(), "type", 38);
        term23707 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term23707, term23707.getClass(), "compiler", null);
        setField(term23707, term23707.getClass(), "allNames", null);
        setField(term23707, term23707.getClass(), "referenceGraph", null);
        setField(term23707, term23707.getClass(), "scopes", null);
        setBooleanField(term23707, term23707.getClass(), "removeUnreferenced", false);
        setField(term23707, term23707.getClass(), "globalNames", null);
        setField(term23707, term23707.getClass(), "changeProxy", null);
        setField(term23707, term23707.getClass(), "externalNames", null);
        setField(term23707, term23707.getClass(), "refNodes", null);
        setField(term23707, term23707.getClass(), "aliases", null);
        term23708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23708, term23708.getClass(), "type", 38);
        setField(term23708, term23708.getClass(), "next", null);
        setField(term23708, term23708.getClass(), "first", null);
        setField(term23708, term23708.getClass(), "last", null);
        setField(term23708, term23708.getClass(), "propListHead", null);
        setIntField(term23708, term23708.getClass(), "sourcePosition", 0);
        setField(term23708, term23708.getClass(), "jsType", null);
        setField(term23708, term23708.getClass(), "parent", null);
        term23703 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setIntField(term23703, term23703.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23697;
        Object retValue = callMethod(klass, "getRhsSubexpressions", argTypes, term23627, args);
        assertTrue(recursiveEquals(term23627, term23707));
        assertTrue(recursiveEquals(term23697, term23708));
        assertTrue(recursiveEquals(retValue, term23703));
    }

};


