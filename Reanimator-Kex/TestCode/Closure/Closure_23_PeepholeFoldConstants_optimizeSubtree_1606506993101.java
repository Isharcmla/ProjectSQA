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

public class PeepholeFoldConstants_optimizeSubtree_1606506993101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13295;
     Object term13365;
     Object term13391;
     Object term13392;
     Object term13381;

    public PeepholeFoldConstants_optimizeSubtree_1606506993101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13295 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term13365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13365, term13365.getClass(), "type", 79);
        term13391 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term13391, term13391.getClass(), "late", false);
        setField(term13391, term13391.getClass(), "compiler", null);
        term13392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13392, term13392.getClass(), "type", 79);
        setField(term13392, term13392.getClass(), "next", null);
        setField(term13392, term13392.getClass(), "first", null);
        setField(term13392, term13392.getClass(), "last", null);
        setField(term13392, term13392.getClass(), "propListHead", null);
        setIntField(term13392, term13392.getClass(), "sourcePosition", 0);
        setField(term13392, term13392.getClass(), "jsType", null);
        setField(term13392, term13392.getClass(), "parent", null);
        term13381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13381, term13381.getClass(), "type", 79);
        setField(term13381, term13381.getClass(), "next", null);
        setField(term13381, term13381.getClass(), "first", null);
        setField(term13381, term13381.getClass(), "last", null);
        setField(term13381, term13381.getClass(), "propListHead", null);
        setIntField(term13381, term13381.getClass(), "sourcePosition", 0);
        setField(term13381, term13381.getClass(), "jsType", null);
        setField(term13381, term13381.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13365;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term13295, args);
        assertTrue(recursiveEquals(term13295, term13391));
        assertTrue(recursiveEquals(term13365, term13392));
        assertTrue(recursiveEquals(retValue, term13381));
    }

};


