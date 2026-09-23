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

public class NameAnalyzer_getRhsSubexpressions_185555270865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19608;
     Object term19678;
     Object term19687;
     Object term19688;
     Object term19683;

    public NameAnalyzer_getRhsSubexpressions_185555270865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19608 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term19678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19678, term19678.getClass(), "type", 105);
        term19687 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term19687, term19687.getClass(), "compiler", null);
        setField(term19687, term19687.getClass(), "allNames", null);
        setField(term19687, term19687.getClass(), "referenceGraph", null);
        setField(term19687, term19687.getClass(), "scopes", null);
        setBooleanField(term19687, term19687.getClass(), "removeUnreferenced", false);
        setField(term19687, term19687.getClass(), "globalNames", null);
        setField(term19687, term19687.getClass(), "changeProxy", null);
        setField(term19687, term19687.getClass(), "externalNames", null);
        setField(term19687, term19687.getClass(), "refNodes", null);
        setField(term19687, term19687.getClass(), "aliases", null);
        term19688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19688, term19688.getClass(), "type", 105);
        setField(term19688, term19688.getClass(), "next", null);
        setField(term19688, term19688.getClass(), "first", null);
        setField(term19688, term19688.getClass(), "last", null);
        setField(term19688, term19688.getClass(), "propListHead", null);
        setIntField(term19688, term19688.getClass(), "sourcePosition", 0);
        setField(term19688, term19688.getClass(), "jsType", null);
        setField(term19688, term19688.getClass(), "parent", null);
        term19683 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setIntField(term19683, term19683.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19678;
        Object retValue = callMethod(klass, "getRhsSubexpressions", argTypes, term19608, args);
        assertTrue(recursiveEquals(term19608, term19687));
        assertTrue(recursiveEquals(term19678, term19688));
        assertTrue(recursiveEquals(retValue, term19683));
    }

};


