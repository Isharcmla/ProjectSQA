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

public class PeepholeFoldConstants_optimizeSubtree_1606506993318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49270;
     Object term49340;
     Object term63183;
     Object term63184;
     Object term63174;

    public PeepholeFoldConstants_optimizeSubtree_1606506993318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49270 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term49340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49340, term49340.getClass(), "type", 74);
        term63183 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term63183, term63183.getClass(), "currentTraversal", null);
        term63184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63184, term63184.getClass(), "type", 74);
        setField(term63184, term63184.getClass(), "next", null);
        setField(term63184, term63184.getClass(), "first", null);
        setField(term63184, term63184.getClass(), "last", null);
        setField(term63184, term63184.getClass(), "propListHead", null);
        setIntField(term63184, term63184.getClass(), "sourcePosition", 0);
        setField(term63184, term63184.getClass(), "jsType", null);
        setField(term63184, term63184.getClass(), "parent", null);
        term63174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63174, term63174.getClass(), "type", 74);
        setField(term63174, term63174.getClass(), "next", null);
        setField(term63174, term63174.getClass(), "first", null);
        setField(term63174, term63174.getClass(), "last", null);
        setField(term63174, term63174.getClass(), "propListHead", null);
        setIntField(term63174, term63174.getClass(), "sourcePosition", 0);
        setField(term63174, term63174.getClass(), "jsType", null);
        setField(term63174, term63174.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49340;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term49270, args);
        assertTrue(recursiveEquals(term49270, term63183));
        assertTrue(recursiveEquals(term49340, term63184));
        assertTrue(recursiveEquals(retValue, term63174));
    }

};


