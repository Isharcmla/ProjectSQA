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

public class PeepholeFoldConstants_optimizeSubtree_1606506993277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54855;
     Object term54925;
     Object term55224;
     Object term55225;
     Object term55209;

    public PeepholeFoldConstants_optimizeSubtree_1606506993277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54855 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term54925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54925, term54925.getClass(), "type", 35);
        setField(term54925, term54925.getClass(), "first", term54925);
        term55224 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term55224, term55224.getClass(), "currentTraversal", null);
        term55225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55225, term55225.getClass(), "type", 35);
        setField(term55225, term55225.getClass(), "next", null);
        setField(term55225, term55225.getClass(), "first", term55225);
        setField(term55225, term55225.getClass(), "last", null);
        setField(term55225, term55225.getClass(), "propListHead", null);
        setIntField(term55225, term55225.getClass(), "sourcePosition", 0);
        setField(term55225, term55225.getClass(), "jsType", null);
        setField(term55225, term55225.getClass(), "parent", null);
        term55209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55209, term55209.getClass(), "type", 35);
        setField(term55209, term55209.getClass(), "next", null);
        setField(term55209, term55209.getClass(), "first", term55209);
        setField(term55209, term55209.getClass(), "last", null);
        setField(term55209, term55209.getClass(), "propListHead", null);
        setIntField(term55209, term55209.getClass(), "sourcePosition", 0);
        setField(term55209, term55209.getClass(), "jsType", null);
        setField(term55209, term55209.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54925;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term54855, args);
        assertTrue(recursiveEquals(term54855, term55224));
        assertTrue(recursiveEquals(term54925, term55225));
        assertTrue(recursiveEquals(retValue, term55209));
    }

};


