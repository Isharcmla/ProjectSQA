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

public class PeepholeFoldConstants_optimizeSubtree_1606506993178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27830;
     Object term27900;
     Object term28141;
     Object term28142;
     Object term28132;

    public PeepholeFoldConstants_optimizeSubtree_1606506993178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27830 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27900, term27900.getClass(), "type", 58);
        term28141 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term28141, term28141.getClass(), "currentTraversal", null);
        term28142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28142, term28142.getClass(), "type", 58);
        setField(term28142, term28142.getClass(), "next", null);
        setField(term28142, term28142.getClass(), "first", null);
        setField(term28142, term28142.getClass(), "last", null);
        setField(term28142, term28142.getClass(), "propListHead", null);
        setIntField(term28142, term28142.getClass(), "sourcePosition", 0);
        setField(term28142, term28142.getClass(), "jsType", null);
        setField(term28142, term28142.getClass(), "parent", null);
        term28132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28132, term28132.getClass(), "type", 58);
        setField(term28132, term28132.getClass(), "next", null);
        setField(term28132, term28132.getClass(), "first", null);
        setField(term28132, term28132.getClass(), "last", null);
        setField(term28132, term28132.getClass(), "propListHead", null);
        setIntField(term28132, term28132.getClass(), "sourcePosition", 0);
        setField(term28132, term28132.getClass(), "jsType", null);
        setField(term28132, term28132.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27900;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term27830, args);
        assertTrue(recursiveEquals(term27830, term28141));
        assertTrue(recursiveEquals(term27900, term28142));
        assertTrue(recursiveEquals(retValue, term28132));
    }

};


