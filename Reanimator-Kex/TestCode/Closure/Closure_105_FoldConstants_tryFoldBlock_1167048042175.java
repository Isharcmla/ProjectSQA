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
import java.lang.Object;

public class FoldConstants_tryFoldBlock_1167048042175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35783;
     Object term35853;
     Object term46586;
     Object term46587;

    public FoldConstants_tryFoldBlock_1167048042175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35783 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term35853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35923, term35923.getClass(), "next", term35853);
        setIntField(term35923, term35923.getClass(), "type", 112);
        setField(term35853, term35853.getClass(), "first", term35923);
        setField(term35853, term35853.getClass(), "next", term35993);
        setIntField(term35853, term35853.getClass(), "type", 54);
        term46586 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term46586, term46586.getClass(), "compiler", null);
        term46587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46587, term46587.getClass(), "type", 54);
        setIntField(term46588, term46588.getClass(), "type", 0);
        setField(term46588, term46588.getClass(), "next", null);
        setField(term46588, term46588.getClass(), "first", null);
        setField(term46588, term46588.getClass(), "last", null);
        setField(term46588, term46588.getClass(), "propListHead", null);
        setIntField(term46588, term46588.getClass(), "sourcePosition", 0);
        setField(term46588, term46588.getClass(), "jsType", null);
        setField(term46588, term46588.getClass(), "parent", null);
        setField(term46587, term46587.getClass(), "next", term46588);
        setIntField(term46589, term46589.getClass(), "type", 112);
        setField(term46589, term46589.getClass(), "next", term46587);
        setField(term46589, term46589.getClass(), "first", null);
        setField(term46589, term46589.getClass(), "last", null);
        setField(term46589, term46589.getClass(), "propListHead", null);
        setIntField(term46589, term46589.getClass(), "sourcePosition", 0);
        setField(term46589, term46589.getClass(), "jsType", null);
        setField(term46589, term46589.getClass(), "parent", null);
        setField(term46587, term46587.getClass(), "first", term46589);
        setField(term46587, term46587.getClass(), "last", null);
        setField(term46587, term46587.getClass(), "propListHead", null);
        setIntField(term46587, term46587.getClass(), "sourcePosition", 0);
        setField(term46587, term46587.getClass(), "jsType", null);
        setField(term46587, term46587.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term35853;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term35783, args);
        assertTrue(recursiveEquals(term35783, term46586));
        assertTrue(recursiveEquals(term35853, null));
    }

};


