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

public class PeepholeFoldConstants_optimizeSubtree_1606506993141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23510;
     Object term23580;
     Object term23608;
     Object term23609;
     Object term23599;

    public PeepholeFoldConstants_optimizeSubtree_1606506993141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23510 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term23580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23580, term23580.getClass(), "type", 56);
        term23608 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term23608, term23608.getClass(), "currentTraversal", null);
        term23609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23609, term23609.getClass(), "type", 56);
        setField(term23609, term23609.getClass(), "next", null);
        setField(term23609, term23609.getClass(), "first", null);
        setField(term23609, term23609.getClass(), "last", null);
        setField(term23609, term23609.getClass(), "propListHead", null);
        setIntField(term23609, term23609.getClass(), "sourcePosition", 0);
        setField(term23609, term23609.getClass(), "jsType", null);
        setField(term23609, term23609.getClass(), "parent", null);
        term23599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23599, term23599.getClass(), "type", 56);
        setField(term23599, term23599.getClass(), "next", null);
        setField(term23599, term23599.getClass(), "first", null);
        setField(term23599, term23599.getClass(), "last", null);
        setField(term23599, term23599.getClass(), "propListHead", null);
        setIntField(term23599, term23599.getClass(), "sourcePosition", 0);
        setField(term23599, term23599.getClass(), "jsType", null);
        setField(term23599, term23599.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23580;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term23510, args);
        assertTrue(recursiveEquals(term23510, term23608));
        assertTrue(recursiveEquals(term23580, term23609));
        assertTrue(recursiveEquals(retValue, term23599));
    }

};


