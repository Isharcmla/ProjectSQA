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

public class PeepholeFoldConstants_tryFoldStringIndexOf_1018448660506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106732;
     Object term106802;
     Object term106826;
     Object term106827;
     Object term106804;

    public PeepholeFoldConstants_tryFoldStringIndexOf_1018448660506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106732 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term106802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106802, term106802.getClass(), "type", 37);
        setField(term106802, term106802.getClass(), "first", term106802);
        setField(term106802, term106802.getClass(), "next", term106802);
        term106826 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term106826, term106826.getClass(), "currentTraversal", null);
        term106827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106827, term106827.getClass(), "type", 37);
        setField(term106827, term106827.getClass(), "next", term106827);
        setField(term106827, term106827.getClass(), "first", term106827);
        setField(term106827, term106827.getClass(), "last", null);
        setField(term106827, term106827.getClass(), "propListHead", null);
        setIntField(term106827, term106827.getClass(), "sourcePosition", 0);
        setField(term106827, term106827.getClass(), "jsType", null);
        setField(term106827, term106827.getClass(), "parent", null);
        term106804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106804, term106804.getClass(), "type", 37);
        setField(term106804, term106804.getClass(), "next", term106804);
        setField(term106804, term106804.getClass(), "first", term106804);
        setField(term106804, term106804.getClass(), "last", null);
        setField(term106804, term106804.getClass(), "propListHead", null);
        setIntField(term106804, term106804.getClass(), "sourcePosition", 0);
        setField(term106804, term106804.getClass(), "jsType", null);
        setField(term106804, term106804.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term106802;
        Object retValue = callMethod(klass, "tryFoldStringIndexOf", argTypes, term106732, args);
        assertTrue(recursiveEquals(term106732, term106826));
        assertTrue(recursiveEquals(term106802, term106827));
        assertTrue(recursiveEquals(retValue, term106804));
    }

};


