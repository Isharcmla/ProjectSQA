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

public class PeepholeFoldConstants_optimizeSubtree_1606506993193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29297;
     Object term29367;
     Object term29767;
     Object term29768;
     Object term29749;

    public PeepholeFoldConstants_optimizeSubtree_1606506993193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29297 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term29367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29367, term29367.getClass(), "type", 92);
        setField(term29367, term29367.getClass(), "last", term29367);
        term29767 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term29767, term29767.getClass(), "currentTraversal", null);
        term29768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29768, term29768.getClass(), "type", 92);
        setField(term29768, term29768.getClass(), "next", null);
        setField(term29768, term29768.getClass(), "first", null);
        setField(term29768, term29768.getClass(), "last", term29768);
        setField(term29768, term29768.getClass(), "propListHead", null);
        setIntField(term29768, term29768.getClass(), "sourcePosition", 0);
        setField(term29768, term29768.getClass(), "jsType", null);
        setField(term29768, term29768.getClass(), "parent", null);
        term29749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29749, term29749.getClass(), "type", 92);
        setField(term29749, term29749.getClass(), "next", null);
        setField(term29749, term29749.getClass(), "first", null);
        setField(term29749, term29749.getClass(), "last", term29749);
        setField(term29749, term29749.getClass(), "propListHead", null);
        setIntField(term29749, term29749.getClass(), "sourcePosition", 0);
        setField(term29749, term29749.getClass(), "jsType", null);
        setField(term29749, term29749.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29367;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term29297, args);
        assertTrue(recursiveEquals(term29297, term29767));
        assertTrue(recursiveEquals(term29367, term29768));
        assertTrue(recursiveEquals(retValue, term29749));
    }

};


