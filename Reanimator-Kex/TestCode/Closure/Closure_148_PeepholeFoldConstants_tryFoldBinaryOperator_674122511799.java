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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180591;
     Object term180661;
     Object term181238;
     Object term181239;
     Object term181209;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180591 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term180661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term180731, term180731.getClass(), "next", term180801);
        setIntField(term180731, term180731.getClass(), "type", 39);
        setField(term180661, term180661.getClass(), "first", term180731);
        setIntField(term180661, term180661.getClass(), "type", 19);
        term181238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term181238, term181238.getClass(), "currentTraversal", null);
        term181239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term181239, term181239.getClass(), "type", 19);
        setField(term181239, term181239.getClass(), "next", null);
        setIntField(term181240, term181240.getClass(), "type", 39);
        setIntField(term181241, term181241.getClass(), "type", 0);
        setField(term181241, term181241.getClass(), "next", null);
        setField(term181241, term181241.getClass(), "first", null);
        setField(term181241, term181241.getClass(), "last", null);
        setField(term181241, term181241.getClass(), "propListHead", null);
        setIntField(term181241, term181241.getClass(), "sourcePosition", 0);
        setField(term181241, term181241.getClass(), "jsType", null);
        setField(term181241, term181241.getClass(), "parent", null);
        setField(term181240, term181240.getClass(), "next", term181241);
        setField(term181240, term181240.getClass(), "first", null);
        setField(term181240, term181240.getClass(), "last", null);
        setField(term181240, term181240.getClass(), "propListHead", null);
        setIntField(term181240, term181240.getClass(), "sourcePosition", 0);
        setField(term181240, term181240.getClass(), "jsType", null);
        setField(term181240, term181240.getClass(), "parent", null);
        setField(term181239, term181239.getClass(), "first", term181240);
        setField(term181239, term181239.getClass(), "last", null);
        setField(term181239, term181239.getClass(), "propListHead", null);
        setIntField(term181239, term181239.getClass(), "sourcePosition", 0);
        setField(term181239, term181239.getClass(), "jsType", null);
        setField(term181239, term181239.getClass(), "parent", null);
        term181209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term181209, term181209.getClass(), "type", 19);
        setField(term181209, term181209.getClass(), "next", null);
        setIntField(term181211, term181211.getClass(), "type", 39);
        setIntField(term181213, term181213.getClass(), "type", 0);
        setField(term181213, term181213.getClass(), "next", null);
        setField(term181213, term181213.getClass(), "first", null);
        setField(term181213, term181213.getClass(), "last", null);
        setField(term181213, term181213.getClass(), "propListHead", null);
        setIntField(term181213, term181213.getClass(), "sourcePosition", 0);
        setField(term181213, term181213.getClass(), "jsType", null);
        setField(term181213, term181213.getClass(), "parent", null);
        setField(term181211, term181211.getClass(), "next", term181213);
        setField(term181211, term181211.getClass(), "first", null);
        setField(term181211, term181211.getClass(), "last", null);
        setField(term181211, term181211.getClass(), "propListHead", null);
        setIntField(term181211, term181211.getClass(), "sourcePosition", 0);
        setField(term181211, term181211.getClass(), "jsType", null);
        setField(term181211, term181211.getClass(), "parent", null);
        setField(term181209, term181209.getClass(), "first", term181211);
        setField(term181209, term181209.getClass(), "last", null);
        setField(term181209, term181209.getClass(), "propListHead", null);
        setIntField(term181209, term181209.getClass(), "sourcePosition", 0);
        setField(term181209, term181209.getClass(), "jsType", null);
        setField(term181209, term181209.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term180661;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term180591, args);
        assertTrue(recursiveEquals(term180591, term181238));
        assertTrue(recursiveEquals(term180661, term181239));
        assertTrue(recursiveEquals(retValue, term181209));
    }

};


