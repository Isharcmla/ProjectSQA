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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318628;
     Object term318720;
     Object term319820;
     Object term319821;
     Object term319787;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318628 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term318720 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term318812 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term318904 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term318812, term318812.getClass(), "next", term318904);
        setIntField(term318812, term318812.getClass(), "type", 63);
        setField(term318720, term318720.getClass(), "first", term318812);
        setIntField(term318720, term318720.getClass(), "type", 35);
        term319820 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term319820, term319820.getClass(), "currentTraversal", null);
        term319821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term319822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term319823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term319821, term319821.getClass(), "str", null);
        setIntField(term319821, term319821.getClass(), "type", 35);
        setField(term319821, term319821.getClass(), "next", null);
        setField(term319822, term319822.getClass(), "str", null);
        setIntField(term319822, term319822.getClass(), "type", 63);
        setField(term319823, term319823.getClass(), "str", null);
        setIntField(term319823, term319823.getClass(), "type", 0);
        setField(term319823, term319823.getClass(), "next", null);
        setField(term319823, term319823.getClass(), "first", null);
        setField(term319823, term319823.getClass(), "last", null);
        setField(term319823, term319823.getClass(), "propListHead", null);
        setIntField(term319823, term319823.getClass(), "sourcePosition", 0);
        setField(term319823, term319823.getClass(), "jsType", null);
        setField(term319823, term319823.getClass(), "parent", null);
        setField(term319822, term319822.getClass(), "next", term319823);
        setField(term319822, term319822.getClass(), "first", null);
        setField(term319822, term319822.getClass(), "last", null);
        setField(term319822, term319822.getClass(), "propListHead", null);
        setIntField(term319822, term319822.getClass(), "sourcePosition", 0);
        setField(term319822, term319822.getClass(), "jsType", null);
        setField(term319822, term319822.getClass(), "parent", null);
        setField(term319821, term319821.getClass(), "first", term319822);
        setField(term319821, term319821.getClass(), "last", null);
        setField(term319821, term319821.getClass(), "propListHead", null);
        setIntField(term319821, term319821.getClass(), "sourcePosition", 0);
        setField(term319821, term319821.getClass(), "jsType", null);
        setField(term319821, term319821.getClass(), "parent", null);
        term319787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term319789 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term319791 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term319787, term319787.getClass(), "str", null);
        setIntField(term319787, term319787.getClass(), "type", 35);
        setField(term319787, term319787.getClass(), "next", null);
        setField(term319789, term319789.getClass(), "str", null);
        setIntField(term319789, term319789.getClass(), "type", 63);
        setField(term319791, term319791.getClass(), "str", null);
        setIntField(term319791, term319791.getClass(), "type", 0);
        setField(term319791, term319791.getClass(), "next", null);
        setField(term319791, term319791.getClass(), "first", null);
        setField(term319791, term319791.getClass(), "last", null);
        setField(term319791, term319791.getClass(), "propListHead", null);
        setIntField(term319791, term319791.getClass(), "sourcePosition", 0);
        setField(term319791, term319791.getClass(), "jsType", null);
        setField(term319791, term319791.getClass(), "parent", null);
        setField(term319789, term319789.getClass(), "next", term319791);
        setField(term319789, term319789.getClass(), "first", null);
        setField(term319789, term319789.getClass(), "last", null);
        setField(term319789, term319789.getClass(), "propListHead", null);
        setIntField(term319789, term319789.getClass(), "sourcePosition", 0);
        setField(term319789, term319789.getClass(), "jsType", null);
        setField(term319789, term319789.getClass(), "parent", null);
        setField(term319787, term319787.getClass(), "first", term319789);
        setField(term319787, term319787.getClass(), "last", null);
        setField(term319787, term319787.getClass(), "propListHead", null);
        setIntField(term319787, term319787.getClass(), "sourcePosition", 0);
        setField(term319787, term319787.getClass(), "jsType", null);
        setField(term319787, term319787.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term318720;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term318628, args);
        assertTrue(recursiveEquals(term318628, term319820));
        assertTrue(recursiveEquals(term318720, term319821));
        assertTrue(recursiveEquals(retValue, term319787));
    }

};


