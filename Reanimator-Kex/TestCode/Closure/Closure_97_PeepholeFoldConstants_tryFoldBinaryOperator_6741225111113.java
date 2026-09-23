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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343410;
     Object term343502;
     Object term344221;
     Object term344222;
     Object term344187;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343410 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term343502 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term343594 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term343686 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term343594, term343594.getClass(), "next", term343686);
        setField(term343502, term343502.getClass(), "first", term343594);
        setIntField(term343502, term343502.getClass(), "type", 45);
        term344221 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term344221, term344221.getClass(), "currentTraversal", null);
        term344222 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term344223 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term344224 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term344222, term344222.getClass(), "str", null);
        setIntField(term344222, term344222.getClass(), "type", 45);
        setField(term344222, term344222.getClass(), "next", null);
        setField(term344223, term344223.getClass(), "str", null);
        setIntField(term344223, term344223.getClass(), "type", 0);
        setField(term344224, term344224.getClass(), "str", null);
        setIntField(term344224, term344224.getClass(), "type", 0);
        setField(term344224, term344224.getClass(), "next", null);
        setField(term344224, term344224.getClass(), "first", null);
        setField(term344224, term344224.getClass(), "last", null);
        setField(term344224, term344224.getClass(), "propListHead", null);
        setIntField(term344224, term344224.getClass(), "sourcePosition", 0);
        setField(term344224, term344224.getClass(), "jsType", null);
        setField(term344224, term344224.getClass(), "parent", null);
        setField(term344223, term344223.getClass(), "next", term344224);
        setField(term344223, term344223.getClass(), "first", null);
        setField(term344223, term344223.getClass(), "last", null);
        setField(term344223, term344223.getClass(), "propListHead", null);
        setIntField(term344223, term344223.getClass(), "sourcePosition", 0);
        setField(term344223, term344223.getClass(), "jsType", null);
        setField(term344223, term344223.getClass(), "parent", null);
        setField(term344222, term344222.getClass(), "first", term344223);
        setField(term344222, term344222.getClass(), "last", null);
        setField(term344222, term344222.getClass(), "propListHead", null);
        setIntField(term344222, term344222.getClass(), "sourcePosition", 0);
        setField(term344222, term344222.getClass(), "jsType", null);
        setField(term344222, term344222.getClass(), "parent", null);
        term344187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term344189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term344191 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term344187, term344187.getClass(), "str", null);
        setIntField(term344187, term344187.getClass(), "type", 45);
        setField(term344187, term344187.getClass(), "next", null);
        setField(term344189, term344189.getClass(), "str", null);
        setIntField(term344189, term344189.getClass(), "type", 0);
        setField(term344191, term344191.getClass(), "str", null);
        setIntField(term344191, term344191.getClass(), "type", 0);
        setField(term344191, term344191.getClass(), "next", null);
        setField(term344191, term344191.getClass(), "first", null);
        setField(term344191, term344191.getClass(), "last", null);
        setField(term344191, term344191.getClass(), "propListHead", null);
        setIntField(term344191, term344191.getClass(), "sourcePosition", 0);
        setField(term344191, term344191.getClass(), "jsType", null);
        setField(term344191, term344191.getClass(), "parent", null);
        setField(term344189, term344189.getClass(), "next", term344191);
        setField(term344189, term344189.getClass(), "first", null);
        setField(term344189, term344189.getClass(), "last", null);
        setField(term344189, term344189.getClass(), "propListHead", null);
        setIntField(term344189, term344189.getClass(), "sourcePosition", 0);
        setField(term344189, term344189.getClass(), "jsType", null);
        setField(term344189, term344189.getClass(), "parent", null);
        setField(term344187, term344187.getClass(), "first", term344189);
        setField(term344187, term344187.getClass(), "last", null);
        setField(term344187, term344187.getClass(), "propListHead", null);
        setIntField(term344187, term344187.getClass(), "sourcePosition", 0);
        setField(term344187, term344187.getClass(), "jsType", null);
        setField(term344187, term344187.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term343502;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term343410, args);
        assertTrue(recursiveEquals(term343410, term344221));
        assertTrue(recursiveEquals(term343502, term344222));
        assertTrue(recursiveEquals(retValue, term344187));
    }

};


