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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35225;
     Object term35295;
     Object term35418;
     Object term35419;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35225 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term35295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35295, term35295.getClass(), "first", term35295);
        setField(term35295, term35295.getClass(), "next", term35365);
        setIntField(term35295, term35295.getClass(), "type", 39);
        term35418 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term35418, term35418.getClass(), "currentTraversal", null);
        term35419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35419, term35419.getClass(), "type", 39);
        setIntField(term35420, term35420.getClass(), "type", 0);
        setField(term35420, term35420.getClass(), "next", null);
        setField(term35420, term35420.getClass(), "first", null);
        setField(term35420, term35420.getClass(), "last", null);
        setField(term35420, term35420.getClass(), "propListHead", null);
        setIntField(term35420, term35420.getClass(), "sourcePosition", 0);
        setField(term35420, term35420.getClass(), "jsType", null);
        setField(term35420, term35420.getClass(), "parent", null);
        setField(term35419, term35419.getClass(), "next", term35420);
        setField(term35419, term35419.getClass(), "first", term35419);
        setField(term35419, term35419.getClass(), "last", null);
        setField(term35419, term35419.getClass(), "propListHead", null);
        setIntField(term35419, term35419.getClass(), "sourcePosition", 0);
        setField(term35419, term35419.getClass(), "jsType", null);
        setField(term35419, term35419.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35295;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term35225, args);
        assertTrue(recursiveEquals(term35225, term35418));
        assertTrue(recursiveEquals(term35295, term35419));
    }

};


