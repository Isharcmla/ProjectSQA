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

public class PeepholeSubstituteAlternateSyntax_optimizeSubtree_182945322072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9453;
     Object term9523;
     Object term37361;
     Object term37362;
     Object term37273;

    public PeepholeSubstituteAlternateSyntax_optimizeSubtree_182945322072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9453 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term9523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9523, term9523.getClass(), "type", 44);
        term37361 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term37361, term37361.getClass(), "late", false);
        setField(term37361, term37361.getClass(), "compiler", null);
        term37362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37362, term37362.getClass(), "type", 44);
        setField(term37362, term37362.getClass(), "next", null);
        setField(term37362, term37362.getClass(), "first", null);
        setField(term37362, term37362.getClass(), "last", null);
        setField(term37362, term37362.getClass(), "propListHead", null);
        setIntField(term37362, term37362.getClass(), "sourcePosition", 0);
        setField(term37362, term37362.getClass(), "jsType", null);
        setField(term37362, term37362.getClass(), "parent", null);
        term37273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37273, term37273.getClass(), "type", 44);
        setField(term37273, term37273.getClass(), "next", null);
        setField(term37273, term37273.getClass(), "first", null);
        setField(term37273, term37273.getClass(), "last", null);
        setField(term37273, term37273.getClass(), "propListHead", null);
        setIntField(term37273, term37273.getClass(), "sourcePosition", 0);
        setField(term37273, term37273.getClass(), "jsType", null);
        setField(term37273, term37273.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9523;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term9453, args);
        assertTrue(recursiveEquals(term9453, term37361));
        assertTrue(recursiveEquals(term9523, term37362));
        assertTrue(recursiveEquals(retValue, term37273));
    }

};


