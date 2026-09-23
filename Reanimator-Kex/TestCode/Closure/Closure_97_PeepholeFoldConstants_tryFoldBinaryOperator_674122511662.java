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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171631;
     Object term171723;
     Object term172095;
     Object term172096;
     Object term172066;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171631 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term171723 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term171815 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term171907 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term171815, term171815.getClass(), "next", term171907);
        setIntField(term171815, term171815.getClass(), "type", 39);
        setField(term171723, term171723.getClass(), "first", term171815);
        setIntField(term171723, term171723.getClass(), "type", 24);
        term172095 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term172095, term172095.getClass(), "currentTraversal", null);
        term172096 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172097 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172098 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term172096, term172096.getClass(), "str", null);
        setIntField(term172096, term172096.getClass(), "type", 24);
        setField(term172096, term172096.getClass(), "next", null);
        setField(term172097, term172097.getClass(), "str", null);
        setIntField(term172097, term172097.getClass(), "type", 39);
        setField(term172098, term172098.getClass(), "str", null);
        setIntField(term172098, term172098.getClass(), "type", 0);
        setField(term172098, term172098.getClass(), "next", null);
        setField(term172098, term172098.getClass(), "first", null);
        setField(term172098, term172098.getClass(), "last", null);
        setField(term172098, term172098.getClass(), "propListHead", null);
        setIntField(term172098, term172098.getClass(), "sourcePosition", 0);
        setField(term172098, term172098.getClass(), "jsType", null);
        setField(term172098, term172098.getClass(), "parent", null);
        setField(term172097, term172097.getClass(), "next", term172098);
        setField(term172097, term172097.getClass(), "first", null);
        setField(term172097, term172097.getClass(), "last", null);
        setField(term172097, term172097.getClass(), "propListHead", null);
        setIntField(term172097, term172097.getClass(), "sourcePosition", 0);
        setField(term172097, term172097.getClass(), "jsType", null);
        setField(term172097, term172097.getClass(), "parent", null);
        setField(term172096, term172096.getClass(), "first", term172097);
        setField(term172096, term172096.getClass(), "last", null);
        setField(term172096, term172096.getClass(), "propListHead", null);
        setIntField(term172096, term172096.getClass(), "sourcePosition", 0);
        setField(term172096, term172096.getClass(), "jsType", null);
        setField(term172096, term172096.getClass(), "parent", null);
        term172066 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172068 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172070 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term172066, term172066.getClass(), "str", null);
        setIntField(term172066, term172066.getClass(), "type", 24);
        setField(term172066, term172066.getClass(), "next", null);
        setField(term172068, term172068.getClass(), "str", null);
        setIntField(term172068, term172068.getClass(), "type", 39);
        setField(term172070, term172070.getClass(), "str", null);
        setIntField(term172070, term172070.getClass(), "type", 0);
        setField(term172070, term172070.getClass(), "next", null);
        setField(term172070, term172070.getClass(), "first", null);
        setField(term172070, term172070.getClass(), "last", null);
        setField(term172070, term172070.getClass(), "propListHead", null);
        setIntField(term172070, term172070.getClass(), "sourcePosition", 0);
        setField(term172070, term172070.getClass(), "jsType", null);
        setField(term172070, term172070.getClass(), "parent", null);
        setField(term172068, term172068.getClass(), "next", term172070);
        setField(term172068, term172068.getClass(), "first", null);
        setField(term172068, term172068.getClass(), "last", null);
        setField(term172068, term172068.getClass(), "propListHead", null);
        setIntField(term172068, term172068.getClass(), "sourcePosition", 0);
        setField(term172068, term172068.getClass(), "jsType", null);
        setField(term172068, term172068.getClass(), "parent", null);
        setField(term172066, term172066.getClass(), "first", term172068);
        setField(term172066, term172066.getClass(), "last", null);
        setField(term172066, term172066.getClass(), "propListHead", null);
        setIntField(term172066, term172066.getClass(), "sourcePosition", 0);
        setField(term172066, term172066.getClass(), "jsType", null);
        setField(term172066, term172066.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term171723;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term171631, args);
        assertTrue(recursiveEquals(term171631, term172095));
        assertTrue(recursiveEquals(term171723, term172096));
        assertTrue(recursiveEquals(retValue, term172066));
    }

};


