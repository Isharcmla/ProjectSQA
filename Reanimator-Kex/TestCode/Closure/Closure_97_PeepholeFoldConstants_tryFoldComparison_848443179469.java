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

public class PeepholeFoldConstants_tryFoldComparison_848443179469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108305;
     Object term108375;
     Object term108445;
     Object term108515;
     Object term108991;
     Object term108992;
     Object term108993;
     Object term108994;
     Object term108971;

    public PeepholeFoldConstants_tryFoldComparison_848443179469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108305 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term108375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108375, term108375.getClass(), "type", 14);
        term108445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108445, term108445.getClass(), "type", 14);
        term108515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term108991 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term108991, term108991.getClass(), "currentTraversal", null);
        term108992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108992, term108992.getClass(), "type", 14);
        setField(term108992, term108992.getClass(), "next", null);
        setField(term108992, term108992.getClass(), "first", null);
        setField(term108992, term108992.getClass(), "last", null);
        setField(term108992, term108992.getClass(), "propListHead", null);
        setIntField(term108992, term108992.getClass(), "sourcePosition", 0);
        setField(term108992, term108992.getClass(), "jsType", null);
        setField(term108992, term108992.getClass(), "parent", null);
        term108993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108993, term108993.getClass(), "type", 14);
        setField(term108993, term108993.getClass(), "next", null);
        setField(term108993, term108993.getClass(), "first", null);
        setField(term108993, term108993.getClass(), "last", null);
        setField(term108993, term108993.getClass(), "propListHead", null);
        setIntField(term108993, term108993.getClass(), "sourcePosition", 0);
        setField(term108993, term108993.getClass(), "jsType", null);
        setField(term108993, term108993.getClass(), "parent", null);
        term108994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108994, term108994.getClass(), "type", 0);
        setField(term108994, term108994.getClass(), "next", null);
        setField(term108994, term108994.getClass(), "first", null);
        setField(term108994, term108994.getClass(), "last", null);
        setField(term108994, term108994.getClass(), "propListHead", null);
        setIntField(term108994, term108994.getClass(), "sourcePosition", 0);
        setField(term108994, term108994.getClass(), "jsType", null);
        setField(term108994, term108994.getClass(), "parent", null);
        term108971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108971, term108971.getClass(), "type", 14);
        setField(term108971, term108971.getClass(), "next", null);
        setField(term108971, term108971.getClass(), "first", null);
        setField(term108971, term108971.getClass(), "last", null);
        setField(term108971, term108971.getClass(), "propListHead", null);
        setIntField(term108971, term108971.getClass(), "sourcePosition", 0);
        setField(term108971, term108971.getClass(), "jsType", null);
        setField(term108971, term108971.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term108375;
        args[1] = term108445;
        args[2] = term108515;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term108305, args);
        assertTrue(recursiveEquals(term108305, term108991));
        assertTrue(recursiveEquals(term108375, term108992));
        assertTrue(recursiveEquals(term108445, term108993));
        assertTrue(recursiveEquals(term108515, term108994));
        assertTrue(recursiveEquals(retValue, term108971));
    }

};


