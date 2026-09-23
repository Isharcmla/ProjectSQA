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

public class PeepholeFoldConstants_tryFoldComparison_848443179582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127169;
     Object term127344;
     Object term127309;
     Object term127443;
     Object term127444;
     Object term127445;
     Object term127446;
     Object term127428;

    public PeepholeFoldConstants_tryFoldComparison_848443179582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127169 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term127344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127344, term127344.getClass(), "type", 16);
        term127309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127309, term127309.getClass(), "type", 16);
        term127443 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term127443, term127443.getClass(), "currentTraversal", null);
        term127444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127444, term127444.getClass(), "type", 16);
        setField(term127444, term127444.getClass(), "next", null);
        setField(term127444, term127444.getClass(), "first", null);
        setField(term127444, term127444.getClass(), "last", null);
        setField(term127444, term127444.getClass(), "propListHead", null);
        setIntField(term127444, term127444.getClass(), "sourcePosition", 0);
        setField(term127444, term127444.getClass(), "jsType", null);
        setField(term127444, term127444.getClass(), "parent", null);
        term127445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127445, term127445.getClass(), "type", 16);
        setField(term127445, term127445.getClass(), "next", null);
        setField(term127445, term127445.getClass(), "first", null);
        setField(term127445, term127445.getClass(), "last", null);
        setField(term127445, term127445.getClass(), "propListHead", null);
        setIntField(term127445, term127445.getClass(), "sourcePosition", 0);
        setField(term127445, term127445.getClass(), "jsType", null);
        setField(term127445, term127445.getClass(), "parent", null);
        term127446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127446, term127446.getClass(), "type", 16);
        setField(term127446, term127446.getClass(), "next", null);
        setField(term127446, term127446.getClass(), "first", null);
        setField(term127446, term127446.getClass(), "last", null);
        setField(term127446, term127446.getClass(), "propListHead", null);
        setIntField(term127446, term127446.getClass(), "sourcePosition", 0);
        setField(term127446, term127446.getClass(), "jsType", null);
        setField(term127446, term127446.getClass(), "parent", null);
        term127428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127428, term127428.getClass(), "type", 16);
        setField(term127428, term127428.getClass(), "next", null);
        setField(term127428, term127428.getClass(), "first", null);
        setField(term127428, term127428.getClass(), "last", null);
        setField(term127428, term127428.getClass(), "propListHead", null);
        setIntField(term127428, term127428.getClass(), "sourcePosition", 0);
        setField(term127428, term127428.getClass(), "jsType", null);
        setField(term127428, term127428.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term127344;
        args[1] = term127309;
        args[2] = term127344;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term127169, args);
        assertTrue(recursiveEquals(term127169, term127443));
        assertTrue(recursiveEquals(term127344, term127444));
        assertTrue(recursiveEquals(term127309, term127445));
        assertTrue(recursiveEquals(term127344, term127446));
        assertTrue(recursiveEquals(retValue, term127428));
    }

};


