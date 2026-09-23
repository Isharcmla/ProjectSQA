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

public class PeepholeFoldConstants_optimizeSubtree_1606506993260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42324;
     Object term42394;
     Object term42604;
     Object term42605;
     Object term42588;

    public PeepholeFoldConstants_optimizeSubtree_1606506993260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42324 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term42394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42394, term42394.getClass(), "type", 58);
        setField(term42394, term42394.getClass(), "first", term42394);
        term42604 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term42604, term42604.getClass(), "currentTraversal", null);
        term42605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42605, term42605.getClass(), "type", 58);
        setField(term42605, term42605.getClass(), "next", null);
        setField(term42605, term42605.getClass(), "first", term42605);
        setField(term42605, term42605.getClass(), "last", null);
        setField(term42605, term42605.getClass(), "propListHead", null);
        setIntField(term42605, term42605.getClass(), "sourcePosition", 0);
        setField(term42605, term42605.getClass(), "jsType", null);
        setField(term42605, term42605.getClass(), "parent", null);
        term42588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42588, term42588.getClass(), "type", 58);
        setField(term42588, term42588.getClass(), "next", null);
        setField(term42588, term42588.getClass(), "first", term42588);
        setField(term42588, term42588.getClass(), "last", null);
        setField(term42588, term42588.getClass(), "propListHead", null);
        setIntField(term42588, term42588.getClass(), "sourcePosition", 0);
        setField(term42588, term42588.getClass(), "jsType", null);
        setField(term42588, term42588.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42394;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term42324, args);
        assertTrue(recursiveEquals(term42324, term42604));
        assertTrue(recursiveEquals(term42394, term42605));
        assertTrue(recursiveEquals(retValue, term42588));
    }

};


