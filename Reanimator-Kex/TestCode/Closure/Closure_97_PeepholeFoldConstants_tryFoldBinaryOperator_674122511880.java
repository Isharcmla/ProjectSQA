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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249552;
     Object term249644;
     Object term249742;
     Object term249743;
     Object term249721;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249552 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term249644 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term249714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term249644, term249644.getClass(), "first", term249644);
        setField(term249644, term249644.getClass(), "next", term249714);
        setIntField(term249644, term249644.getClass(), "type", 20);
        term249742 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term249742, term249742.getClass(), "currentTraversal", null);
        term249743 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term249744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term249743, term249743.getClass(), "str", null);
        setIntField(term249743, term249743.getClass(), "type", 20);
        setIntField(term249744, term249744.getClass(), "type", 0);
        setField(term249744, term249744.getClass(), "next", null);
        setField(term249744, term249744.getClass(), "first", null);
        setField(term249744, term249744.getClass(), "last", null);
        setField(term249744, term249744.getClass(), "propListHead", null);
        setIntField(term249744, term249744.getClass(), "sourcePosition", 0);
        setField(term249744, term249744.getClass(), "jsType", null);
        setField(term249744, term249744.getClass(), "parent", null);
        setField(term249743, term249743.getClass(), "next", term249744);
        setField(term249743, term249743.getClass(), "first", term249743);
        setField(term249743, term249743.getClass(), "last", null);
        setField(term249743, term249743.getClass(), "propListHead", null);
        setIntField(term249743, term249743.getClass(), "sourcePosition", 0);
        setField(term249743, term249743.getClass(), "jsType", null);
        setField(term249743, term249743.getClass(), "parent", null);
        term249721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term249723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term249721, term249721.getClass(), "str", null);
        setIntField(term249721, term249721.getClass(), "type", 20);
        setIntField(term249723, term249723.getClass(), "type", 0);
        setField(term249723, term249723.getClass(), "next", null);
        setField(term249723, term249723.getClass(), "first", null);
        setField(term249723, term249723.getClass(), "last", null);
        setField(term249723, term249723.getClass(), "propListHead", null);
        setIntField(term249723, term249723.getClass(), "sourcePosition", 0);
        setField(term249723, term249723.getClass(), "jsType", null);
        setField(term249723, term249723.getClass(), "parent", null);
        setField(term249721, term249721.getClass(), "next", term249723);
        setField(term249721, term249721.getClass(), "first", term249721);
        setField(term249721, term249721.getClass(), "last", null);
        setField(term249721, term249721.getClass(), "propListHead", null);
        setIntField(term249721, term249721.getClass(), "sourcePosition", 0);
        setField(term249721, term249721.getClass(), "jsType", null);
        setField(term249721, term249721.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term249644;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term249552, args);
        assertTrue(recursiveEquals(term249552, term249742));
        assertTrue(recursiveEquals(term249644, term249743));
        assertTrue(recursiveEquals(retValue, term249721));
    }

};


