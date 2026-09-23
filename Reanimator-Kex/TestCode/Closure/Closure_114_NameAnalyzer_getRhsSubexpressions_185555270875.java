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

public class NameAnalyzer_getRhsSubexpressions_185555270875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18112;
     Object term18182;
     Object term18192;
     Object term18193;
     Object term18188;

    public NameAnalyzer_getRhsSubexpressions_185555270875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18112 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term18182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18182, term18182.getClass(), "type", 38);
        term18192 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term18192, term18192.getClass(), "compiler", null);
        setField(term18192, term18192.getClass(), "allNames", null);
        setField(term18192, term18192.getClass(), "referenceGraph", null);
        setField(term18192, term18192.getClass(), "scopes", null);
        setBooleanField(term18192, term18192.getClass(), "removeUnreferenced", false);
        setField(term18192, term18192.getClass(), "globalNames", null);
        setField(term18192, term18192.getClass(), "changeProxy", null);
        setField(term18192, term18192.getClass(), "externalNames", null);
        setField(term18192, term18192.getClass(), "refNodes", null);
        setField(term18192, term18192.getClass(), "aliases", null);
        term18193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18193, term18193.getClass(), "type", 38);
        setField(term18193, term18193.getClass(), "next", null);
        setField(term18193, term18193.getClass(), "first", null);
        setField(term18193, term18193.getClass(), "last", null);
        setField(term18193, term18193.getClass(), "propListHead", null);
        setIntField(term18193, term18193.getClass(), "sourcePosition", 0);
        setField(term18193, term18193.getClass(), "jsType", null);
        setField(term18193, term18193.getClass(), "parent", null);
        term18188 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setIntField(term18188, term18188.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18182;
        Object retValue = callMethod(klass, "getRhsSubexpressions", argTypes, term18112, args);
        assertTrue(recursiveEquals(term18112, term18192));
        assertTrue(recursiveEquals(term18182, term18193));
        assertTrue(recursiveEquals(retValue, term18188));
    }

};


