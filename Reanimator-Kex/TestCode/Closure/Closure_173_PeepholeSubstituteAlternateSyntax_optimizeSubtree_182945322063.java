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

public class PeepholeSubstituteAlternateSyntax_optimizeSubtree_182945322063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6825;
     Object term6895;
     Object term24758;
     Object term24759;
     Object term24752;

    public PeepholeSubstituteAlternateSyntax_optimizeSubtree_182945322063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6825 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term6895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6895, term6895.getClass(), "type", 4);
        term24758 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term24758, term24758.getClass(), "late", false);
        setField(term24758, term24758.getClass(), "compiler", null);
        term24759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24759, term24759.getClass(), "type", 4);
        setField(term24759, term24759.getClass(), "next", null);
        setField(term24759, term24759.getClass(), "first", null);
        setField(term24759, term24759.getClass(), "last", null);
        setField(term24759, term24759.getClass(), "propListHead", null);
        setIntField(term24759, term24759.getClass(), "sourcePosition", 0);
        setField(term24759, term24759.getClass(), "jsType", null);
        setField(term24759, term24759.getClass(), "parent", null);
        term24752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24752, term24752.getClass(), "type", 4);
        setField(term24752, term24752.getClass(), "next", null);
        setField(term24752, term24752.getClass(), "first", null);
        setField(term24752, term24752.getClass(), "last", null);
        setField(term24752, term24752.getClass(), "propListHead", null);
        setIntField(term24752, term24752.getClass(), "sourcePosition", 0);
        setField(term24752, term24752.getClass(), "jsType", null);
        setField(term24752, term24752.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6895;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term6825, args);
        assertTrue(recursiveEquals(term6825, term24758));
        assertTrue(recursiveEquals(term6895, term24759));
        assertTrue(recursiveEquals(retValue, term24752));
    }

};


