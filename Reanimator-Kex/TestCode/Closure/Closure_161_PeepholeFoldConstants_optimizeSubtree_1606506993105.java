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

public class PeepholeFoldConstants_optimizeSubtree_1606506993105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16569;
     Object term16639;
     Object term16650;
     Object term16651;
     Object term16641;

    public PeepholeFoldConstants_optimizeSubtree_1606506993105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16569 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term16639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16639, term16639.getClass(), "type", 67);
        term16650 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term16650, term16650.getClass(), "currentTraversal", null);
        term16651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16651, term16651.getClass(), "type", 67);
        setField(term16651, term16651.getClass(), "next", null);
        setField(term16651, term16651.getClass(), "first", null);
        setField(term16651, term16651.getClass(), "last", null);
        setField(term16651, term16651.getClass(), "propListHead", null);
        setIntField(term16651, term16651.getClass(), "sourcePosition", 0);
        setField(term16651, term16651.getClass(), "jsType", null);
        setField(term16651, term16651.getClass(), "parent", null);
        term16641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16641, term16641.getClass(), "type", 67);
        setField(term16641, term16641.getClass(), "next", null);
        setField(term16641, term16641.getClass(), "first", null);
        setField(term16641, term16641.getClass(), "last", null);
        setField(term16641, term16641.getClass(), "propListHead", null);
        setIntField(term16641, term16641.getClass(), "sourcePosition", 0);
        setField(term16641, term16641.getClass(), "jsType", null);
        setField(term16641, term16641.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16639;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term16569, args);
        assertTrue(recursiveEquals(term16569, term16650));
        assertTrue(recursiveEquals(term16639, term16651));
        assertTrue(recursiveEquals(retValue, term16641));
    }

};


