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

public class PeepholeFoldConstants_optimizeSubtree_1606506993490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126399;
     Object term126469;
     Object term133718;
     Object term133719;
     Object term133703;

    public PeepholeFoldConstants_optimizeSubtree_1606506993490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126399 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term126469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term126469, term126469.getClass(), "type", 30);
        setField(term126469, term126469.getClass(), "first", term126469);
        term133718 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term133718, term133718.getClass(), "currentTraversal", null);
        term133719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term133719, term133719.getClass(), "type", 30);
        setField(term133719, term133719.getClass(), "next", null);
        setField(term133719, term133719.getClass(), "first", term133719);
        setField(term133719, term133719.getClass(), "last", null);
        setField(term133719, term133719.getClass(), "propListHead", null);
        setIntField(term133719, term133719.getClass(), "sourcePosition", 0);
        setField(term133719, term133719.getClass(), "jsType", null);
        setField(term133719, term133719.getClass(), "parent", null);
        term133703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term133703, term133703.getClass(), "type", 30);
        setField(term133703, term133703.getClass(), "next", null);
        setField(term133703, term133703.getClass(), "first", term133703);
        setField(term133703, term133703.getClass(), "last", null);
        setField(term133703, term133703.getClass(), "propListHead", null);
        setIntField(term133703, term133703.getClass(), "sourcePosition", 0);
        setField(term133703, term133703.getClass(), "jsType", null);
        setField(term133703, term133703.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term126469;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term126399, args);
        assertTrue(recursiveEquals(term126399, term133718));
        assertTrue(recursiveEquals(term126469, term133719));
        assertTrue(recursiveEquals(retValue, term133703));
    }

};


