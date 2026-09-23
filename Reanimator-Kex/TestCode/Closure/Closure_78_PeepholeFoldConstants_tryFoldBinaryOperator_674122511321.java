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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49984;
     Object term50054;
     Object term63286;
     Object term63287;
     Object term63271;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49984 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term50054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50054, term50054.getClass(), "first", term50054);
        setField(term50054, term50054.getClass(), "next", term50054);
        setIntField(term50054, term50054.getClass(), "type", 18);
        term63286 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term63286, term63286.getClass(), "currentTraversal", null);
        term63287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63287, term63287.getClass(), "type", 18);
        setField(term63287, term63287.getClass(), "next", term63287);
        setField(term63287, term63287.getClass(), "first", term63287);
        setField(term63287, term63287.getClass(), "last", null);
        setField(term63287, term63287.getClass(), "propListHead", null);
        setIntField(term63287, term63287.getClass(), "sourcePosition", 0);
        setField(term63287, term63287.getClass(), "jsType", null);
        setField(term63287, term63287.getClass(), "parent", null);
        term63271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63271, term63271.getClass(), "type", 18);
        setField(term63271, term63271.getClass(), "next", term63271);
        setField(term63271, term63271.getClass(), "first", term63271);
        setField(term63271, term63271.getClass(), "last", null);
        setField(term63271, term63271.getClass(), "propListHead", null);
        setIntField(term63271, term63271.getClass(), "sourcePosition", 0);
        setField(term63271, term63271.getClass(), "jsType", null);
        setField(term63271, term63271.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50054;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term49984, args);
        assertTrue(recursiveEquals(term49984, term63286));
        assertTrue(recursiveEquals(term50054, term63287));
        assertTrue(recursiveEquals(retValue, term63271));
    }

};


