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

public class PeepholeFoldConstants_tryFoldComparison_848443179342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66675;
     Object term66767;
     Object term66859;
     Object term66951;
     Object term81250;
     Object term81251;
     Object term81252;
     Object term81253;
     Object term81231;

    public PeepholeFoldConstants_tryFoldComparison_848443179342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66675 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term66767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term66767, term66767.getClass(), "type", 16);
        term66859 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term66859, term66859.getClass(), "type", 16);
        term66951 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term81250 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81250, term81250.getClass(), "currentTraversal", null);
        term81251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term81251, term81251.getClass(), "number", 0.0);
        setIntField(term81251, term81251.getClass(), "type", 16);
        setField(term81251, term81251.getClass(), "next", null);
        setField(term81251, term81251.getClass(), "first", null);
        setField(term81251, term81251.getClass(), "last", null);
        setField(term81251, term81251.getClass(), "propListHead", null);
        setIntField(term81251, term81251.getClass(), "sourcePosition", 0);
        setField(term81251, term81251.getClass(), "jsType", null);
        setField(term81251, term81251.getClass(), "parent", null);
        term81252 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term81252, term81252.getClass(), "number", 0.0);
        setIntField(term81252, term81252.getClass(), "type", 16);
        setField(term81252, term81252.getClass(), "next", null);
        setField(term81252, term81252.getClass(), "first", null);
        setField(term81252, term81252.getClass(), "last", null);
        setField(term81252, term81252.getClass(), "propListHead", null);
        setIntField(term81252, term81252.getClass(), "sourcePosition", 0);
        setField(term81252, term81252.getClass(), "jsType", null);
        setField(term81252, term81252.getClass(), "parent", null);
        term81253 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81253, term81253.getClass(), "str", null);
        setIntField(term81253, term81253.getClass(), "type", 0);
        setField(term81253, term81253.getClass(), "next", null);
        setField(term81253, term81253.getClass(), "first", null);
        setField(term81253, term81253.getClass(), "last", null);
        setField(term81253, term81253.getClass(), "propListHead", null);
        setIntField(term81253, term81253.getClass(), "sourcePosition", 0);
        setField(term81253, term81253.getClass(), "jsType", null);
        setField(term81253, term81253.getClass(), "parent", null);
        term81231 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term81231, term81231.getClass(), "number", 0.0);
        setIntField(term81231, term81231.getClass(), "type", 16);
        setField(term81231, term81231.getClass(), "next", null);
        setField(term81231, term81231.getClass(), "first", null);
        setField(term81231, term81231.getClass(), "last", null);
        setField(term81231, term81231.getClass(), "propListHead", null);
        setIntField(term81231, term81231.getClass(), "sourcePosition", 0);
        setField(term81231, term81231.getClass(), "jsType", null);
        setField(term81231, term81231.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term66767;
        args[1] = term66859;
        args[2] = term66951;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term66675, args);
        assertTrue(recursiveEquals(term66675, term81250));
        assertTrue(recursiveEquals(term66767, term81251));
        assertTrue(recursiveEquals(term66859, term81252));
        assertTrue(recursiveEquals(term66951, term81253));
        assertTrue(recursiveEquals(retValue, term81231));
    }

};


