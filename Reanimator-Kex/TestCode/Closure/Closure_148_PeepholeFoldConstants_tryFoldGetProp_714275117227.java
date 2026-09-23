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

public class PeepholeFoldConstants_tryFoldGetProp_714275117227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42842;
     Object term42947;
     Object term43413;
     Object term43414;
     Object term43415;
     Object term43404;

    public PeepholeFoldConstants_tryFoldGetProp_714275117227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42842 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term42947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42947, term42947.getClass(), "type", 33);
        term43413 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term43413, term43413.getClass(), "currentTraversal", null);
        term43414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43414, term43414.getClass(), "type", 33);
        setField(term43414, term43414.getClass(), "next", null);
        setField(term43414, term43414.getClass(), "first", null);
        setField(term43414, term43414.getClass(), "last", null);
        setField(term43414, term43414.getClass(), "propListHead", null);
        setIntField(term43414, term43414.getClass(), "sourcePosition", 0);
        setField(term43414, term43414.getClass(), "jsType", null);
        setField(term43414, term43414.getClass(), "parent", null);
        term43415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43415, term43415.getClass(), "type", 33);
        setField(term43415, term43415.getClass(), "next", null);
        setField(term43415, term43415.getClass(), "first", null);
        setField(term43415, term43415.getClass(), "last", null);
        setField(term43415, term43415.getClass(), "propListHead", null);
        setIntField(term43415, term43415.getClass(), "sourcePosition", 0);
        setField(term43415, term43415.getClass(), "jsType", null);
        setField(term43415, term43415.getClass(), "parent", null);
        term43404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43404, term43404.getClass(), "type", 33);
        setField(term43404, term43404.getClass(), "next", null);
        setField(term43404, term43404.getClass(), "first", null);
        setField(term43404, term43404.getClass(), "last", null);
        setField(term43404, term43404.getClass(), "propListHead", null);
        setIntField(term43404, term43404.getClass(), "sourcePosition", 0);
        setField(term43404, term43404.getClass(), "jsType", null);
        setField(term43404, term43404.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term42947;
        args[1] = null;
        args[2] = term42947;
        Object retValue = callMethod(klass, "tryFoldGetProp", argTypes, term42842, args);
        assertTrue(recursiveEquals(term42842, term43413));
        assertTrue(recursiveEquals(term42947, term43414));
        assertTrue(recursiveEquals(term42947, null));
        assertTrue(recursiveEquals(retValue, term43404));
    }

};


