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

public class PeepholeSubstituteAlternateSyntax_optimizeSubtree_1829453220139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14268;
     Object term14338;
     Object term44085;
     Object term44086;
     Object term44075;

    public PeepholeSubstituteAlternateSyntax_optimizeSubtree_1829453220139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14268 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term14338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14338, term14338.getClass(), "type", 44);
        term44085 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term44085, term44085.getClass(), "late", false);
        setIntField(term44085, term44085.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term44085, term44085.getClass(), "compiler", null);
        term44086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44086, term44086.getClass(), "type", 44);
        setField(term44086, term44086.getClass(), "next", null);
        setField(term44086, term44086.getClass(), "first", null);
        setField(term44086, term44086.getClass(), "last", null);
        setField(term44086, term44086.getClass(), "propListHead", null);
        setIntField(term44086, term44086.getClass(), "sourcePosition", 0);
        setField(term44086, term44086.getClass(), "jsType", null);
        setField(term44086, term44086.getClass(), "parent", null);
        term44075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44075, term44075.getClass(), "type", 44);
        setField(term44075, term44075.getClass(), "next", null);
        setField(term44075, term44075.getClass(), "first", null);
        setField(term44075, term44075.getClass(), "last", null);
        setField(term44075, term44075.getClass(), "propListHead", null);
        setIntField(term44075, term44075.getClass(), "sourcePosition", 0);
        setField(term44075, term44075.getClass(), "jsType", null);
        setField(term44075, term44075.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14338;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term14268, args);
        assertTrue(recursiveEquals(term14268, term44085));
        assertTrue(recursiveEquals(term14338, term44086));
        assertTrue(recursiveEquals(retValue, term44075));
    }

};


