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

public class PeepholeFoldConstants_tryFoldComparison_848443179175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33368;
     Object term33460;
     Object term33552;
     Object term33644;
     Object term34082;
     Object term34083;
     Object term34084;
     Object term34085;
     Object term34064;

    public PeepholeFoldConstants_tryFoldComparison_848443179175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33368 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term33460 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term33460, term33460.getClass(), "type", 16);
        term33552 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term33552, term33552.getClass(), "type", 16);
        term33644 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term34082 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term34082, term34082.getClass(), "currentTraversal", null);
        term34083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term34083, term34083.getClass(), "str", null);
        setIntField(term34083, term34083.getClass(), "type", 16);
        setField(term34083, term34083.getClass(), "next", null);
        setField(term34083, term34083.getClass(), "first", null);
        setField(term34083, term34083.getClass(), "last", null);
        setField(term34083, term34083.getClass(), "propListHead", null);
        setIntField(term34083, term34083.getClass(), "sourcePosition", 0);
        setField(term34083, term34083.getClass(), "jsType", null);
        setField(term34083, term34083.getClass(), "parent", null);
        term34084 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term34084, term34084.getClass(), "str", null);
        setIntField(term34084, term34084.getClass(), "type", 16);
        setField(term34084, term34084.getClass(), "next", null);
        setField(term34084, term34084.getClass(), "first", null);
        setField(term34084, term34084.getClass(), "last", null);
        setField(term34084, term34084.getClass(), "propListHead", null);
        setIntField(term34084, term34084.getClass(), "sourcePosition", 0);
        setField(term34084, term34084.getClass(), "jsType", null);
        setField(term34084, term34084.getClass(), "parent", null);
        term34085 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term34085, term34085.getClass(), "str", null);
        setIntField(term34085, term34085.getClass(), "type", 0);
        setField(term34085, term34085.getClass(), "next", null);
        setField(term34085, term34085.getClass(), "first", null);
        setField(term34085, term34085.getClass(), "last", null);
        setField(term34085, term34085.getClass(), "propListHead", null);
        setIntField(term34085, term34085.getClass(), "sourcePosition", 0);
        setField(term34085, term34085.getClass(), "jsType", null);
        setField(term34085, term34085.getClass(), "parent", null);
        term34064 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term34064, term34064.getClass(), "str", null);
        setIntField(term34064, term34064.getClass(), "type", 16);
        setField(term34064, term34064.getClass(), "next", null);
        setField(term34064, term34064.getClass(), "first", null);
        setField(term34064, term34064.getClass(), "last", null);
        setField(term34064, term34064.getClass(), "propListHead", null);
        setIntField(term34064, term34064.getClass(), "sourcePosition", 0);
        setField(term34064, term34064.getClass(), "jsType", null);
        setField(term34064, term34064.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term33460;
        args[1] = term33552;
        args[2] = term33644;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term33368, args);
        assertTrue(recursiveEquals(term33368, term34082));
        assertTrue(recursiveEquals(term33460, term34083));
        assertTrue(recursiveEquals(term33552, term34084));
        assertTrue(recursiveEquals(term33644, term34085));
        assertTrue(recursiveEquals(retValue, term34064));
    }

};


