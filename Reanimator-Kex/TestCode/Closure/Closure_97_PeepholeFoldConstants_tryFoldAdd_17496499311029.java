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

public class PeepholeFoldConstants_tryFoldAdd_17496499311029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321237;
     Object term321329;
     Object term321421;
     Object term321513;
     Object term321956;
     Object term321957;
     Object term321958;
     Object term321959;
     Object term321930;

    public PeepholeFoldConstants_tryFoldAdd_17496499311029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321237 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term321329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term321329, term321329.getClass(), "type", 21);
        term321421 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term321421, term321421.getClass(), "type", 21);
        term321513 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term321956 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term321956, term321956.getClass(), "currentTraversal", null);
        term321957 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term321957, term321957.getClass(), "str", null);
        setIntField(term321957, term321957.getClass(), "type", 21);
        setField(term321957, term321957.getClass(), "next", null);
        setField(term321957, term321957.getClass(), "first", null);
        setField(term321957, term321957.getClass(), "last", null);
        setField(term321957, term321957.getClass(), "propListHead", null);
        setIntField(term321957, term321957.getClass(), "sourcePosition", 0);
        setField(term321957, term321957.getClass(), "jsType", null);
        setField(term321957, term321957.getClass(), "parent", null);
        term321958 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term321958, term321958.getClass(), "str", null);
        setIntField(term321958, term321958.getClass(), "type", 21);
        setField(term321958, term321958.getClass(), "next", null);
        setField(term321958, term321958.getClass(), "first", null);
        setField(term321958, term321958.getClass(), "last", null);
        setField(term321958, term321958.getClass(), "propListHead", null);
        setIntField(term321958, term321958.getClass(), "sourcePosition", 0);
        setField(term321958, term321958.getClass(), "jsType", null);
        setField(term321958, term321958.getClass(), "parent", null);
        term321959 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term321959, term321959.getClass(), "str", null);
        setIntField(term321959, term321959.getClass(), "type", 0);
        setField(term321959, term321959.getClass(), "next", null);
        setField(term321959, term321959.getClass(), "first", null);
        setField(term321959, term321959.getClass(), "last", null);
        setField(term321959, term321959.getClass(), "propListHead", null);
        setIntField(term321959, term321959.getClass(), "sourcePosition", 0);
        setField(term321959, term321959.getClass(), "jsType", null);
        setField(term321959, term321959.getClass(), "parent", null);
        term321930 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term321930, term321930.getClass(), "str", null);
        setIntField(term321930, term321930.getClass(), "type", 21);
        setField(term321930, term321930.getClass(), "next", null);
        setField(term321930, term321930.getClass(), "first", null);
        setField(term321930, term321930.getClass(), "last", null);
        setField(term321930, term321930.getClass(), "propListHead", null);
        setIntField(term321930, term321930.getClass(), "sourcePosition", 0);
        setField(term321930, term321930.getClass(), "jsType", null);
        setField(term321930, term321930.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term321329;
        args[1] = term321421;
        args[2] = term321513;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term321237, args);
        assertTrue(recursiveEquals(term321237, term321956));
        assertTrue(recursiveEquals(term321329, term321957));
        assertTrue(recursiveEquals(term321421, term321958));
        assertTrue(recursiveEquals(term321513, term321959));
        assertTrue(recursiveEquals(retValue, term321930));
    }

};


