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

public class PeepholeFoldConstants_tryFoldComparison_8484431791202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285409;
     Object term285501;
     Object term285593;
     Object term285685;
     Object term285720;
     Object term285721;
     Object term285722;
     Object term285723;
     Object term285695;

    public PeepholeFoldConstants_tryFoldComparison_8484431791202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285409 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term285501 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term285501, term285501.getClass(), "type", 14);
        term285593 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term285593, term285593.getClass(), "type", 42);
        term285685 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term285685, term285685.getClass(), "type", 14);
        term285720 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term285720, term285720.getClass(), "currentTraversal", null);
        term285721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term285721, term285721.getClass(), "str", null);
        setIntField(term285721, term285721.getClass(), "type", 42);
        setField(term285721, term285721.getClass(), "next", null);
        setField(term285721, term285721.getClass(), "first", null);
        setField(term285721, term285721.getClass(), "last", null);
        setField(term285721, term285721.getClass(), "propListHead", null);
        setIntField(term285721, term285721.getClass(), "sourcePosition", 0);
        setField(term285721, term285721.getClass(), "jsType", null);
        setField(term285721, term285721.getClass(), "parent", null);
        term285722 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term285722, term285722.getClass(), "str", null);
        setIntField(term285722, term285722.getClass(), "type", 14);
        setField(term285722, term285722.getClass(), "next", null);
        setField(term285722, term285722.getClass(), "first", null);
        setField(term285722, term285722.getClass(), "last", null);
        setField(term285722, term285722.getClass(), "propListHead", null);
        setIntField(term285722, term285722.getClass(), "sourcePosition", 0);
        setField(term285722, term285722.getClass(), "jsType", null);
        setField(term285722, term285722.getClass(), "parent", null);
        term285723 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term285723, term285723.getClass(), "str", null);
        setIntField(term285723, term285723.getClass(), "type", 14);
        setField(term285723, term285723.getClass(), "next", null);
        setField(term285723, term285723.getClass(), "first", null);
        setField(term285723, term285723.getClass(), "last", null);
        setField(term285723, term285723.getClass(), "propListHead", null);
        setIntField(term285723, term285723.getClass(), "sourcePosition", 0);
        setField(term285723, term285723.getClass(), "jsType", null);
        setField(term285723, term285723.getClass(), "parent", null);
        term285695 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term285695, term285695.getClass(), "str", null);
        setIntField(term285695, term285695.getClass(), "type", 14);
        setField(term285695, term285695.getClass(), "next", null);
        setField(term285695, term285695.getClass(), "first", null);
        setField(term285695, term285695.getClass(), "last", null);
        setField(term285695, term285695.getClass(), "propListHead", null);
        setIntField(term285695, term285695.getClass(), "sourcePosition", 0);
        setField(term285695, term285695.getClass(), "jsType", null);
        setField(term285695, term285695.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term285501;
        args[1] = term285593;
        args[2] = term285685;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term285409, args);
        assertTrue(recursiveEquals(term285409, term285720));
        assertTrue(recursiveEquals(term285501, term285721));
        assertTrue(recursiveEquals(term285593, term285722));
        assertTrue(recursiveEquals(term285685, term285723));
        assertTrue(recursiveEquals(retValue, term285695));
    }

};


