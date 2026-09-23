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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79029;
     Object term79121;
     Object term79222;
     Object term79223;
     Object term79199;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79029 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term79121 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term79191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79121, term79121.getClass(), "first", term79121);
        setField(term79121, term79121.getClass(), "next", term79191);
        setIntField(term79121, term79121.getClass(), "type", 19);
        term79222 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term79222, term79222.getClass(), "currentTraversal", null);
        term79223 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term79224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term79223, term79223.getClass(), "number", 0.0);
        setIntField(term79223, term79223.getClass(), "type", 19);
        setIntField(term79224, term79224.getClass(), "type", 0);
        setField(term79224, term79224.getClass(), "next", null);
        setField(term79224, term79224.getClass(), "first", null);
        setField(term79224, term79224.getClass(), "last", null);
        setField(term79224, term79224.getClass(), "propListHead", null);
        setIntField(term79224, term79224.getClass(), "sourcePosition", 0);
        setField(term79224, term79224.getClass(), "jsType", null);
        setField(term79224, term79224.getClass(), "parent", null);
        setField(term79223, term79223.getClass(), "next", term79224);
        setField(term79223, term79223.getClass(), "first", term79223);
        setField(term79223, term79223.getClass(), "last", null);
        setField(term79223, term79223.getClass(), "propListHead", null);
        setIntField(term79223, term79223.getClass(), "sourcePosition", 0);
        setField(term79223, term79223.getClass(), "jsType", null);
        setField(term79223, term79223.getClass(), "parent", null);
        term79199 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term79202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term79199, term79199.getClass(), "number", 0.0);
        setIntField(term79199, term79199.getClass(), "type", 19);
        setIntField(term79202, term79202.getClass(), "type", 0);
        setField(term79202, term79202.getClass(), "next", null);
        setField(term79202, term79202.getClass(), "first", null);
        setField(term79202, term79202.getClass(), "last", null);
        setField(term79202, term79202.getClass(), "propListHead", null);
        setIntField(term79202, term79202.getClass(), "sourcePosition", 0);
        setField(term79202, term79202.getClass(), "jsType", null);
        setField(term79202, term79202.getClass(), "parent", null);
        setField(term79199, term79199.getClass(), "next", term79202);
        setField(term79199, term79199.getClass(), "first", term79199);
        setField(term79199, term79199.getClass(), "last", null);
        setField(term79199, term79199.getClass(), "propListHead", null);
        setIntField(term79199, term79199.getClass(), "sourcePosition", 0);
        setField(term79199, term79199.getClass(), "jsType", null);
        setField(term79199, term79199.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term79121;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term79029, args);
        assertTrue(recursiveEquals(term79029, term79222));
        assertTrue(recursiveEquals(term79121, term79223));
        assertTrue(recursiveEquals(retValue, term79199));
    }

};


