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

public class PeepholeFoldConstants_tryFoldGetElem_393512537193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36617;
     Object term36687;
     Object term36757;
     Object term36827;
     Object term37075;
     Object term37076;
     Object term37077;
     Object term37078;
     Object term37058;

    public PeepholeFoldConstants_tryFoldGetElem_393512537193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36617 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term36687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36687, term36687.getClass(), "type", 35);
        term36757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36757, term36757.getClass(), "type", 63);
        term36827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term37075 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term37075, term37075.getClass(), "currentTraversal", null);
        term37076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37076, term37076.getClass(), "type", 35);
        setField(term37076, term37076.getClass(), "next", null);
        setField(term37076, term37076.getClass(), "first", null);
        setField(term37076, term37076.getClass(), "last", null);
        setField(term37076, term37076.getClass(), "propListHead", null);
        setIntField(term37076, term37076.getClass(), "sourcePosition", 0);
        setField(term37076, term37076.getClass(), "jsType", null);
        setField(term37076, term37076.getClass(), "parent", null);
        term37077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37077, term37077.getClass(), "type", 63);
        setField(term37077, term37077.getClass(), "next", null);
        setField(term37077, term37077.getClass(), "first", null);
        setField(term37077, term37077.getClass(), "last", null);
        setField(term37077, term37077.getClass(), "propListHead", null);
        setIntField(term37077, term37077.getClass(), "sourcePosition", 0);
        setField(term37077, term37077.getClass(), "jsType", null);
        setField(term37077, term37077.getClass(), "parent", null);
        term37078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37078, term37078.getClass(), "type", 0);
        setField(term37078, term37078.getClass(), "next", null);
        setField(term37078, term37078.getClass(), "first", null);
        setField(term37078, term37078.getClass(), "last", null);
        setField(term37078, term37078.getClass(), "propListHead", null);
        setIntField(term37078, term37078.getClass(), "sourcePosition", 0);
        setField(term37078, term37078.getClass(), "jsType", null);
        setField(term37078, term37078.getClass(), "parent", null);
        term37058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37058, term37058.getClass(), "type", 35);
        setField(term37058, term37058.getClass(), "next", null);
        setField(term37058, term37058.getClass(), "first", null);
        setField(term37058, term37058.getClass(), "last", null);
        setField(term37058, term37058.getClass(), "propListHead", null);
        setIntField(term37058, term37058.getClass(), "sourcePosition", 0);
        setField(term37058, term37058.getClass(), "jsType", null);
        setField(term37058, term37058.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term36687;
        args[1] = term36757;
        args[2] = term36827;
        Object retValue = callMethod(klass, "tryFoldGetElem", argTypes, term36617, args);
        assertTrue(recursiveEquals(term36617, term37075));
        assertTrue(recursiveEquals(term36687, term37076));
        assertTrue(recursiveEquals(term36757, term37077));
        assertTrue(recursiveEquals(term36827, term37078));
        assertTrue(recursiveEquals(retValue, term37058));
    }

};


