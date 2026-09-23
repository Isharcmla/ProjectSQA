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

public class FoldConstants_tryFoldComparison_707851734142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32049;
     Object term32119;
     Object term32189;
     Object term32259;
     Object term32615;
     Object term32616;
     Object term32617;
     Object term32618;

    public FoldConstants_tryFoldComparison_707851734142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32049 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term32119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32119, term32119.getClass(), "type", -2147483608);
        term32189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32189, term32189.getClass(), "type", 40);
        term32259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32259, term32259.getClass(), "type", -2147483608);
        term32615 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term32615, term32615.getClass(), "compiler", null);
        term32616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32616, term32616.getClass(), "type", -2147483608);
        setField(term32616, term32616.getClass(), "next", null);
        setField(term32616, term32616.getClass(), "first", null);
        setField(term32616, term32616.getClass(), "last", null);
        setField(term32616, term32616.getClass(), "propListHead", null);
        setIntField(term32616, term32616.getClass(), "sourcePosition", 0);
        setField(term32616, term32616.getClass(), "jsType", null);
        setField(term32616, term32616.getClass(), "parent", null);
        term32617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32617, term32617.getClass(), "type", -2147483608);
        setField(term32617, term32617.getClass(), "next", null);
        setField(term32617, term32617.getClass(), "first", null);
        setField(term32617, term32617.getClass(), "last", null);
        setField(term32617, term32617.getClass(), "propListHead", null);
        setIntField(term32617, term32617.getClass(), "sourcePosition", 0);
        setField(term32617, term32617.getClass(), "jsType", null);
        setField(term32617, term32617.getClass(), "parent", null);
        term32618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32618, term32618.getClass(), "type", 40);
        setField(term32618, term32618.getClass(), "next", null);
        setField(term32618, term32618.getClass(), "first", null);
        setField(term32618, term32618.getClass(), "last", null);
        setField(term32618, term32618.getClass(), "propListHead", null);
        setIntField(term32618, term32618.getClass(), "sourcePosition", 0);
        setField(term32618, term32618.getClass(), "jsType", null);
        setField(term32618, term32618.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term32119;
        args[2] = term32189;
        args[3] = term32259;
        args[4] = null;
        callMethod(klass, "tryFoldComparison", argTypes, term32049, args);
        assertTrue(recursiveEquals(term32049, term32615));
        assertTrue(recursiveEquals(term32119, term32617));
        assertTrue(recursiveEquals(term32189, term32618));
        assertTrue(recursiveEquals(term32259, null));
    }

};


