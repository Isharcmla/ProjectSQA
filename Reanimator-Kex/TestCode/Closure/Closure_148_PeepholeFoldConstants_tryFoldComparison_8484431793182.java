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

public class PeepholeFoldConstants_tryFoldComparison_8484431793182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943866;
     Object term943936;
     Object term944006;
     Object term944076;
     Object term945204;
     Object term945205;
     Object term945206;
     Object term945207;
     Object term945182;

    public PeepholeFoldConstants_tryFoldComparison_8484431793182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943866 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term943936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term943936, term943936.getClass(), "type", 14);
        term944006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term944006, term944006.getClass(), "type", 42);
        term944076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term944076, term944076.getClass(), "type", 42);
        term945204 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term945204, term945204.getClass(), "currentTraversal", null);
        term945205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term945205, term945205.getClass(), "type", 42);
        setField(term945205, term945205.getClass(), "next", null);
        setField(term945205, term945205.getClass(), "first", null);
        setField(term945205, term945205.getClass(), "last", null);
        setField(term945205, term945205.getClass(), "propListHead", null);
        setIntField(term945205, term945205.getClass(), "sourcePosition", 0);
        setField(term945205, term945205.getClass(), "jsType", null);
        setField(term945205, term945205.getClass(), "parent", null);
        term945206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term945206, term945206.getClass(), "type", 14);
        setField(term945206, term945206.getClass(), "next", null);
        setField(term945206, term945206.getClass(), "first", null);
        setField(term945206, term945206.getClass(), "last", null);
        setField(term945206, term945206.getClass(), "propListHead", null);
        setIntField(term945206, term945206.getClass(), "sourcePosition", 0);
        setField(term945206, term945206.getClass(), "jsType", null);
        setField(term945206, term945206.getClass(), "parent", null);
        term945207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term945207, term945207.getClass(), "type", 42);
        setField(term945207, term945207.getClass(), "next", null);
        setField(term945207, term945207.getClass(), "first", null);
        setField(term945207, term945207.getClass(), "last", null);
        setField(term945207, term945207.getClass(), "propListHead", null);
        setIntField(term945207, term945207.getClass(), "sourcePosition", 0);
        setField(term945207, term945207.getClass(), "jsType", null);
        setField(term945207, term945207.getClass(), "parent", null);
        term945182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term945182, term945182.getClass(), "type", 14);
        setField(term945182, term945182.getClass(), "next", null);
        setField(term945182, term945182.getClass(), "first", null);
        setField(term945182, term945182.getClass(), "last", null);
        setField(term945182, term945182.getClass(), "propListHead", null);
        setIntField(term945182, term945182.getClass(), "sourcePosition", 0);
        setField(term945182, term945182.getClass(), "jsType", null);
        setField(term945182, term945182.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term943936;
        args[1] = term944006;
        args[2] = term944076;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term943866, args);
        assertTrue(recursiveEquals(term943866, term945204));
        assertTrue(recursiveEquals(term943936, term945205));
        assertTrue(recursiveEquals(term944006, term945206));
        assertTrue(recursiveEquals(term944076, term945207));
        assertTrue(recursiveEquals(retValue, term945182));
    }

};


