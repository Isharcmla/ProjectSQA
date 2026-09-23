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

public class PeepholeFoldConstants_tryFoldComparison_848443179220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41526;
     Object term41618;
     Object term41710;
     Object term42202;
     Object term42203;
     Object term42204;
     Object term42195;

    public PeepholeFoldConstants_tryFoldComparison_848443179220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41526 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term41618 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term41710 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term41710, term41710.getClass(), "type", 0);
        term42202 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term42202, term42202.getClass(), "currentTraversal", null);
        term42203 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term42203, term42203.getClass(), "str", null);
        setIntField(term42203, term42203.getClass(), "type", 0);
        setField(term42203, term42203.getClass(), "next", null);
        setField(term42203, term42203.getClass(), "first", null);
        setField(term42203, term42203.getClass(), "last", null);
        setField(term42203, term42203.getClass(), "propListHead", null);
        setIntField(term42203, term42203.getClass(), "sourcePosition", 0);
        setField(term42203, term42203.getClass(), "jsType", null);
        setField(term42203, term42203.getClass(), "parent", null);
        term42204 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term42204, term42204.getClass(), "str", null);
        setIntField(term42204, term42204.getClass(), "type", 0);
        setField(term42204, term42204.getClass(), "next", null);
        setField(term42204, term42204.getClass(), "first", null);
        setField(term42204, term42204.getClass(), "last", null);
        setField(term42204, term42204.getClass(), "propListHead", null);
        setIntField(term42204, term42204.getClass(), "sourcePosition", 0);
        setField(term42204, term42204.getClass(), "jsType", null);
        setField(term42204, term42204.getClass(), "parent", null);
        term42195 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term42195, term42195.getClass(), "str", null);
        setIntField(term42195, term42195.getClass(), "type", 0);
        setField(term42195, term42195.getClass(), "next", null);
        setField(term42195, term42195.getClass(), "first", null);
        setField(term42195, term42195.getClass(), "last", null);
        setField(term42195, term42195.getClass(), "propListHead", null);
        setIntField(term42195, term42195.getClass(), "sourcePosition", 0);
        setField(term42195, term42195.getClass(), "jsType", null);
        setField(term42195, term42195.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term41618;
        args[1] = term41710;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term41526, args);
        assertTrue(recursiveEquals(term41526, term42202));
        assertTrue(recursiveEquals(term41618, term42203));
        assertTrue(recursiveEquals(term41710, term42204));
        assertTrue(recursiveEquals(retValue, term42195));
    }

};


