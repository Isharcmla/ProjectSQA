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

public class PeepholeSubstituteAlternateSyntax_optimizeSubtree_1829453220119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129496;
     Object term129566;
     Object term192738;
     Object term192739;
     Object term192729;

    public PeepholeSubstituteAlternateSyntax_optimizeSubtree_1829453220119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129496 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term129496, term129496.getClass(), "late", true);
        term129566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129566, term129566.getClass(), "type", 85);
        term192738 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term192738, term192738.getClass(), "late", true);
        setField(term192738, term192738.getClass(), "compiler", null);
        term192739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192739, term192739.getClass(), "type", 85);
        setField(term192739, term192739.getClass(), "next", null);
        setField(term192739, term192739.getClass(), "first", null);
        setField(term192739, term192739.getClass(), "last", null);
        setField(term192739, term192739.getClass(), "propListHead", null);
        setIntField(term192739, term192739.getClass(), "sourcePosition", 0);
        setField(term192739, term192739.getClass(), "jsType", null);
        setField(term192739, term192739.getClass(), "parent", null);
        term192729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192729, term192729.getClass(), "type", 85);
        setField(term192729, term192729.getClass(), "next", null);
        setField(term192729, term192729.getClass(), "first", null);
        setField(term192729, term192729.getClass(), "last", null);
        setField(term192729, term192729.getClass(), "propListHead", null);
        setIntField(term192729, term192729.getClass(), "sourcePosition", 0);
        setField(term192729, term192729.getClass(), "jsType", null);
        setField(term192729, term192729.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term129566;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term129496, args);
        assertTrue(recursiveEquals(term129496, term192738));
        assertTrue(recursiveEquals(term129566, term192739));
        assertTrue(recursiveEquals(retValue, term192729));
    }

};


