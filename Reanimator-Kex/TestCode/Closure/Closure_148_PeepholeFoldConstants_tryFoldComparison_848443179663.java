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

public class PeepholeFoldConstants_tryFoldComparison_848443179663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146274;
     Object term146366;
     Object term146458;
     Object term146550;
     Object term146974;
     Object term146975;
     Object term146976;
     Object term146977;
     Object term146954;

    public PeepholeFoldConstants_tryFoldComparison_848443179663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146274 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term146366 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term146366, term146366.getClass(), "type", 14);
        term146458 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term146458, term146458.getClass(), "type", 14);
        term146550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term146974 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term146974, term146974.getClass(), "currentTraversal", null);
        term146975 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term146975, term146975.getClass(), "str", null);
        setIntField(term146975, term146975.getClass(), "type", 14);
        setField(term146975, term146975.getClass(), "next", null);
        setField(term146975, term146975.getClass(), "first", null);
        setField(term146975, term146975.getClass(), "last", null);
        setField(term146975, term146975.getClass(), "propListHead", null);
        setIntField(term146975, term146975.getClass(), "sourcePosition", 0);
        setField(term146975, term146975.getClass(), "jsType", null);
        setField(term146975, term146975.getClass(), "parent", null);
        term146976 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term146976, term146976.getClass(), "str", null);
        setIntField(term146976, term146976.getClass(), "type", 14);
        setField(term146976, term146976.getClass(), "next", null);
        setField(term146976, term146976.getClass(), "first", null);
        setField(term146976, term146976.getClass(), "last", null);
        setField(term146976, term146976.getClass(), "propListHead", null);
        setIntField(term146976, term146976.getClass(), "sourcePosition", 0);
        setField(term146976, term146976.getClass(), "jsType", null);
        setField(term146976, term146976.getClass(), "parent", null);
        term146977 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term146977, term146977.getClass(), "str", null);
        setIntField(term146977, term146977.getClass(), "type", 0);
        setField(term146977, term146977.getClass(), "next", null);
        setField(term146977, term146977.getClass(), "first", null);
        setField(term146977, term146977.getClass(), "last", null);
        setField(term146977, term146977.getClass(), "propListHead", null);
        setIntField(term146977, term146977.getClass(), "sourcePosition", 0);
        setField(term146977, term146977.getClass(), "jsType", null);
        setField(term146977, term146977.getClass(), "parent", null);
        term146954 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term146954, term146954.getClass(), "str", null);
        setIntField(term146954, term146954.getClass(), "type", 14);
        setField(term146954, term146954.getClass(), "next", null);
        setField(term146954, term146954.getClass(), "first", null);
        setField(term146954, term146954.getClass(), "last", null);
        setField(term146954, term146954.getClass(), "propListHead", null);
        setIntField(term146954, term146954.getClass(), "sourcePosition", 0);
        setField(term146954, term146954.getClass(), "jsType", null);
        setField(term146954, term146954.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term146366;
        args[1] = term146458;
        args[2] = term146550;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term146274, args);
        assertTrue(recursiveEquals(term146274, term146974));
        assertTrue(recursiveEquals(term146366, term146975));
        assertTrue(recursiveEquals(term146458, term146976));
        assertTrue(recursiveEquals(term146550, term146977));
        assertTrue(recursiveEquals(retValue, term146954));
    }

};


