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

public class PeepholeFoldConstants_optimizeSubtree_1606506993138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22688;
     Object term22758;
     Object term22959;
     Object term22960;
     Object term22949;

    public PeepholeFoldConstants_optimizeSubtree_1606506993138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22688 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term22758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22758, term22758.getClass(), "type", 18);
        term22959 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term22959, term22959.getClass(), "currentTraversal", null);
        term22960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22960, term22960.getClass(), "type", 18);
        setField(term22960, term22960.getClass(), "next", null);
        setField(term22960, term22960.getClass(), "first", null);
        setField(term22960, term22960.getClass(), "last", null);
        setField(term22960, term22960.getClass(), "propListHead", null);
        setIntField(term22960, term22960.getClass(), "sourcePosition", 0);
        setField(term22960, term22960.getClass(), "jsType", null);
        setField(term22960, term22960.getClass(), "parent", null);
        term22949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22949, term22949.getClass(), "type", 18);
        setField(term22949, term22949.getClass(), "next", null);
        setField(term22949, term22949.getClass(), "first", null);
        setField(term22949, term22949.getClass(), "last", null);
        setField(term22949, term22949.getClass(), "propListHead", null);
        setIntField(term22949, term22949.getClass(), "sourcePosition", 0);
        setField(term22949, term22949.getClass(), "jsType", null);
        setField(term22949, term22949.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22758;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term22688, args);
        assertTrue(recursiveEquals(term22688, term22959));
        assertTrue(recursiveEquals(term22758, term22960));
        assertTrue(recursiveEquals(retValue, term22949));
    }

};


