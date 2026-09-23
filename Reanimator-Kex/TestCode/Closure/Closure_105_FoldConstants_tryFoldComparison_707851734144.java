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

public class FoldConstants_tryFoldComparison_707851734144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32381;
     Object term32451;
     Object term32521;
     Object term32591;
     Object term32999;
     Object term33000;
     Object term33001;
     Object term33002;

    public FoldConstants_tryFoldComparison_707851734144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32381 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term32451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32451, term32451.getClass(), "type", -2147483608);
        term32521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32521, term32521.getClass(), "type", 44);
        term32591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32591, term32591.getClass(), "type", -2147483608);
        term32999 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term32999, term32999.getClass(), "compiler", null);
        term33000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33000, term33000.getClass(), "type", -2147483608);
        setField(term33000, term33000.getClass(), "next", null);
        setField(term33000, term33000.getClass(), "first", null);
        setField(term33000, term33000.getClass(), "last", null);
        setField(term33000, term33000.getClass(), "propListHead", null);
        setIntField(term33000, term33000.getClass(), "sourcePosition", 0);
        setField(term33000, term33000.getClass(), "jsType", null);
        setField(term33000, term33000.getClass(), "parent", null);
        term33001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33001, term33001.getClass(), "type", -2147483608);
        setField(term33001, term33001.getClass(), "next", null);
        setField(term33001, term33001.getClass(), "first", null);
        setField(term33001, term33001.getClass(), "last", null);
        setField(term33001, term33001.getClass(), "propListHead", null);
        setIntField(term33001, term33001.getClass(), "sourcePosition", 0);
        setField(term33001, term33001.getClass(), "jsType", null);
        setField(term33001, term33001.getClass(), "parent", null);
        term33002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33002, term33002.getClass(), "type", 44);
        setField(term33002, term33002.getClass(), "next", null);
        setField(term33002, term33002.getClass(), "first", null);
        setField(term33002, term33002.getClass(), "last", null);
        setField(term33002, term33002.getClass(), "propListHead", null);
        setIntField(term33002, term33002.getClass(), "sourcePosition", 0);
        setField(term33002, term33002.getClass(), "jsType", null);
        setField(term33002, term33002.getClass(), "parent", null);
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
        args[1] = term32451;
        args[2] = term32521;
        args[3] = term32591;
        args[4] = null;
        callMethod(klass, "tryFoldComparison", argTypes, term32381, args);
        assertTrue(recursiveEquals(term32381, term32999));
        assertTrue(recursiveEquals(term32451, term33001));
        assertTrue(recursiveEquals(term32521, term33002));
        assertTrue(recursiveEquals(term32591, null));
    }

};


