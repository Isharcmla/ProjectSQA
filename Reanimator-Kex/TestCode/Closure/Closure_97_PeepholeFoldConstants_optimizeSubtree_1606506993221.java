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

public class PeepholeFoldConstants_optimizeSubtree_1606506993221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43600;
     Object term43670;
     Object term44129;
     Object term44130;
     Object term44114;

    public PeepholeFoldConstants_optimizeSubtree_1606506993221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43600 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term43670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43670, term43670.getClass(), "type", 34);
        setField(term43670, term43670.getClass(), "first", term43670);
        term44129 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term44129, term44129.getClass(), "currentTraversal", null);
        term44130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44130, term44130.getClass(), "type", 34);
        setField(term44130, term44130.getClass(), "next", null);
        setField(term44130, term44130.getClass(), "first", term44130);
        setField(term44130, term44130.getClass(), "last", null);
        setField(term44130, term44130.getClass(), "propListHead", null);
        setIntField(term44130, term44130.getClass(), "sourcePosition", 0);
        setField(term44130, term44130.getClass(), "jsType", null);
        setField(term44130, term44130.getClass(), "parent", null);
        term44114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44114, term44114.getClass(), "type", 34);
        setField(term44114, term44114.getClass(), "next", null);
        setField(term44114, term44114.getClass(), "first", term44114);
        setField(term44114, term44114.getClass(), "last", null);
        setField(term44114, term44114.getClass(), "propListHead", null);
        setIntField(term44114, term44114.getClass(), "sourcePosition", 0);
        setField(term44114, term44114.getClass(), "jsType", null);
        setField(term44114, term44114.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43670;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term43600, args);
        assertTrue(recursiveEquals(term43600, term44129));
        assertTrue(recursiveEquals(term43670, term44130));
        assertTrue(recursiveEquals(retValue, term44114));
    }

};


