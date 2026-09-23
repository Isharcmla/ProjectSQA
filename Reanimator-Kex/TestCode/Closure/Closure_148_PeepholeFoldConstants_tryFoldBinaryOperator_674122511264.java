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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50653;
     Object term50723;
     Object term50791;
     Object term50792;
     Object term50770;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50653 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term50723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50723, term50723.getClass(), "first", term50723);
        setField(term50723, term50723.getClass(), "next", term50723);
        setIntField(term50723, term50723.getClass(), "type", 9);
        term50791 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term50791, term50791.getClass(), "currentTraversal", null);
        term50792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50792, term50792.getClass(), "type", 9);
        setField(term50792, term50792.getClass(), "next", term50792);
        setField(term50792, term50792.getClass(), "first", term50792);
        setField(term50792, term50792.getClass(), "last", null);
        setField(term50792, term50792.getClass(), "propListHead", null);
        setIntField(term50792, term50792.getClass(), "sourcePosition", 0);
        setField(term50792, term50792.getClass(), "jsType", null);
        setField(term50792, term50792.getClass(), "parent", null);
        term50770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50770, term50770.getClass(), "type", 9);
        setField(term50770, term50770.getClass(), "next", term50770);
        setField(term50770, term50770.getClass(), "first", term50770);
        setField(term50770, term50770.getClass(), "last", null);
        setField(term50770, term50770.getClass(), "propListHead", null);
        setIntField(term50770, term50770.getClass(), "sourcePosition", 0);
        setField(term50770, term50770.getClass(), "jsType", null);
        setField(term50770, term50770.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50723;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term50653, args);
        assertTrue(recursiveEquals(term50653, term50791));
        assertTrue(recursiveEquals(term50723, term50792));
        assertTrue(recursiveEquals(retValue, term50770));
    }

};


