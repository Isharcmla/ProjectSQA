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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44785;
     Object term44855;
     Object term45139;
     Object term45140;
     Object term45116;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44785 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term44855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44855, term44855.getClass(), "first", term44855);
        setField(term44855, term44855.getClass(), "next", term44855);
        setIntField(term44855, term44855.getClass(), "type", 46);
        term45139 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term45139, term45139.getClass(), "currentTraversal", null);
        term45140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45140, term45140.getClass(), "type", 46);
        setField(term45140, term45140.getClass(), "next", term45140);
        setField(term45140, term45140.getClass(), "first", term45140);
        setField(term45140, term45140.getClass(), "last", null);
        setField(term45140, term45140.getClass(), "propListHead", null);
        setIntField(term45140, term45140.getClass(), "sourcePosition", 0);
        setField(term45140, term45140.getClass(), "jsType", null);
        setField(term45140, term45140.getClass(), "parent", null);
        term45116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45116, term45116.getClass(), "type", 46);
        setField(term45116, term45116.getClass(), "next", term45116);
        setField(term45116, term45116.getClass(), "first", term45116);
        setField(term45116, term45116.getClass(), "last", null);
        setField(term45116, term45116.getClass(), "propListHead", null);
        setIntField(term45116, term45116.getClass(), "sourcePosition", 0);
        setField(term45116, term45116.getClass(), "jsType", null);
        setField(term45116, term45116.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44855;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term44785, args);
        assertTrue(recursiveEquals(term44785, term45139));
        assertTrue(recursiveEquals(term44855, term45140));
        assertTrue(recursiveEquals(retValue, term45116));
    }

};


