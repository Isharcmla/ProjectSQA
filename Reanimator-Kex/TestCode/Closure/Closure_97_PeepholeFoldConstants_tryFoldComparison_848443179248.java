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

public class PeepholeFoldConstants_tryFoldComparison_848443179248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49248;
     Object term49318;
     Object term49388;
     Object term49458;
     Object term49518;
     Object term49519;
     Object term49520;
     Object term49521;
     Object term49495;

    public PeepholeFoldConstants_tryFoldComparison_848443179248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49248 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term49318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49318, term49318.getClass(), "type", 16);
        term49388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49388, term49388.getClass(), "type", 42);
        term49458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49458, term49458.getClass(), "type", 16);
        term49518 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term49518, term49518.getClass(), "currentTraversal", null);
        term49519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49519, term49519.getClass(), "type", 42);
        setField(term49519, term49519.getClass(), "next", null);
        setField(term49519, term49519.getClass(), "first", null);
        setField(term49519, term49519.getClass(), "last", null);
        setField(term49519, term49519.getClass(), "propListHead", null);
        setIntField(term49519, term49519.getClass(), "sourcePosition", 0);
        setField(term49519, term49519.getClass(), "jsType", null);
        setField(term49519, term49519.getClass(), "parent", null);
        term49520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49520, term49520.getClass(), "type", 16);
        setField(term49520, term49520.getClass(), "next", null);
        setField(term49520, term49520.getClass(), "first", null);
        setField(term49520, term49520.getClass(), "last", null);
        setField(term49520, term49520.getClass(), "propListHead", null);
        setIntField(term49520, term49520.getClass(), "sourcePosition", 0);
        setField(term49520, term49520.getClass(), "jsType", null);
        setField(term49520, term49520.getClass(), "parent", null);
        term49521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49521, term49521.getClass(), "type", 16);
        setField(term49521, term49521.getClass(), "next", null);
        setField(term49521, term49521.getClass(), "first", null);
        setField(term49521, term49521.getClass(), "last", null);
        setField(term49521, term49521.getClass(), "propListHead", null);
        setIntField(term49521, term49521.getClass(), "sourcePosition", 0);
        setField(term49521, term49521.getClass(), "jsType", null);
        setField(term49521, term49521.getClass(), "parent", null);
        term49495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49495, term49495.getClass(), "type", 16);
        setField(term49495, term49495.getClass(), "next", null);
        setField(term49495, term49495.getClass(), "first", null);
        setField(term49495, term49495.getClass(), "last", null);
        setField(term49495, term49495.getClass(), "propListHead", null);
        setIntField(term49495, term49495.getClass(), "sourcePosition", 0);
        setField(term49495, term49495.getClass(), "jsType", null);
        setField(term49495, term49495.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term49318;
        args[1] = term49388;
        args[2] = term49458;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term49248, args);
        assertTrue(recursiveEquals(term49248, term49518));
        assertTrue(recursiveEquals(term49318, term49519));
        assertTrue(recursiveEquals(term49388, term49520));
        assertTrue(recursiveEquals(term49458, term49521));
        assertTrue(recursiveEquals(retValue, term49495));
    }

};


