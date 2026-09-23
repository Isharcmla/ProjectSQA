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

public class PeepholeSubstituteAlternateSyntax_optimizeSubtree_1829453220118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129279;
     Object term129349;
     Object term192726;
     Object term192727;
     Object term192713;

    public PeepholeSubstituteAlternateSyntax_optimizeSubtree_1829453220118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129279 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term129349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129349, term129349.getClass(), "type", 4);
        setField(term129349, term129349.getClass(), "first", term129349);
        term192726 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term192726, term192726.getClass(), "late", false);
        setField(term192726, term192726.getClass(), "compiler", null);
        term192727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192727, term192727.getClass(), "type", 4);
        setField(term192727, term192727.getClass(), "next", null);
        setField(term192727, term192727.getClass(), "first", term192727);
        setField(term192727, term192727.getClass(), "last", null);
        setField(term192727, term192727.getClass(), "propListHead", null);
        setIntField(term192727, term192727.getClass(), "sourcePosition", 0);
        setField(term192727, term192727.getClass(), "jsType", null);
        setField(term192727, term192727.getClass(), "parent", null);
        term192713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192713, term192713.getClass(), "type", 4);
        setField(term192713, term192713.getClass(), "next", null);
        setField(term192713, term192713.getClass(), "first", term192713);
        setField(term192713, term192713.getClass(), "last", null);
        setField(term192713, term192713.getClass(), "propListHead", null);
        setIntField(term192713, term192713.getClass(), "sourcePosition", 0);
        setField(term192713, term192713.getClass(), "jsType", null);
        setField(term192713, term192713.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term129349;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term129279, args);
        assertTrue(recursiveEquals(term129279, term192726));
        assertTrue(recursiveEquals(term129349, term192727));
        assertTrue(recursiveEquals(retValue, term192713));
    }

};


