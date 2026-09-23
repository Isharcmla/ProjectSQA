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

public class PeepholeFoldConstants_optimizeSubtree_1606506993195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29677;
     Object term29747;
     Object term29791;
     Object term29792;
     Object term29782;

    public PeepholeFoldConstants_optimizeSubtree_1606506993195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29677 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term29747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29747, term29747.getClass(), "type", 82);
        term29791 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term29791, term29791.getClass(), "currentTraversal", null);
        term29792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29792, term29792.getClass(), "type", 82);
        setField(term29792, term29792.getClass(), "next", null);
        setField(term29792, term29792.getClass(), "first", null);
        setField(term29792, term29792.getClass(), "last", null);
        setField(term29792, term29792.getClass(), "propListHead", null);
        setIntField(term29792, term29792.getClass(), "sourcePosition", 0);
        setField(term29792, term29792.getClass(), "jsType", null);
        setField(term29792, term29792.getClass(), "parent", null);
        term29782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29782, term29782.getClass(), "type", 82);
        setField(term29782, term29782.getClass(), "next", null);
        setField(term29782, term29782.getClass(), "first", null);
        setField(term29782, term29782.getClass(), "last", null);
        setField(term29782, term29782.getClass(), "propListHead", null);
        setIntField(term29782, term29782.getClass(), "sourcePosition", 0);
        setField(term29782, term29782.getClass(), "jsType", null);
        setField(term29782, term29782.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29747;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term29677, args);
        assertTrue(recursiveEquals(term29677, term29791));
        assertTrue(recursiveEquals(term29747, term29792));
        assertTrue(recursiveEquals(retValue, term29782));
    }

};


