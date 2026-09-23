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

public class PeepholeFoldConstants_tryFoldStringIndexOf_1018448660460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106668;
     Object term106738;
     Object term106762;
     Object term106763;
     Object term106740;

    public PeepholeFoldConstants_tryFoldStringIndexOf_1018448660460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106668 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term106738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106738, term106738.getClass(), "type", 37);
        setField(term106738, term106738.getClass(), "first", term106738);
        setField(term106738, term106738.getClass(), "next", term106738);
        term106762 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term106762, term106762.getClass(), "currentTraversal", null);
        term106763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106763, term106763.getClass(), "type", 37);
        setField(term106763, term106763.getClass(), "next", term106763);
        setField(term106763, term106763.getClass(), "first", term106763);
        setField(term106763, term106763.getClass(), "last", null);
        setField(term106763, term106763.getClass(), "propListHead", null);
        setIntField(term106763, term106763.getClass(), "sourcePosition", 0);
        setField(term106763, term106763.getClass(), "jsType", null);
        setField(term106763, term106763.getClass(), "parent", null);
        term106740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106740, term106740.getClass(), "type", 37);
        setField(term106740, term106740.getClass(), "next", term106740);
        setField(term106740, term106740.getClass(), "first", term106740);
        setField(term106740, term106740.getClass(), "last", null);
        setField(term106740, term106740.getClass(), "propListHead", null);
        setIntField(term106740, term106740.getClass(), "sourcePosition", 0);
        setField(term106740, term106740.getClass(), "jsType", null);
        setField(term106740, term106740.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term106738;
        Object retValue = callMethod(klass, "tryFoldStringIndexOf", argTypes, term106668, args);
        assertTrue(recursiveEquals(term106668, term106762));
        assertTrue(recursiveEquals(term106738, term106763));
        assertTrue(recursiveEquals(retValue, term106740));
    }

};


