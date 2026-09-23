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

public class PeepholeFoldConstants_tryFoldKnownMethods_88946908375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12989;
     Object term13059;
     Object term13752;
     Object term13753;
     Object term13723;

    public PeepholeFoldConstants_tryFoldKnownMethods_88946908375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12989 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term13059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13059, term13059.getClass(), "first", term13059);
        setField(term13059, term13059.getClass(), "next", null);
        setIntField(term13059, term13059.getClass(), "type", 37);
        term13752 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term13752, term13752.getClass(), "currentTraversal", null);
        term13753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13753, term13753.getClass(), "type", 37);
        setField(term13753, term13753.getClass(), "next", null);
        setField(term13753, term13753.getClass(), "first", term13753);
        setField(term13753, term13753.getClass(), "last", null);
        setField(term13753, term13753.getClass(), "propListHead", null);
        setIntField(term13753, term13753.getClass(), "sourcePosition", 0);
        setField(term13753, term13753.getClass(), "jsType", null);
        setField(term13753, term13753.getClass(), "parent", null);
        term13723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13723, term13723.getClass(), "type", 37);
        setField(term13723, term13723.getClass(), "next", null);
        setField(term13723, term13723.getClass(), "first", term13723);
        setField(term13723, term13723.getClass(), "last", null);
        setField(term13723, term13723.getClass(), "propListHead", null);
        setIntField(term13723, term13723.getClass(), "sourcePosition", 0);
        setField(term13723, term13723.getClass(), "jsType", null);
        setField(term13723, term13723.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13059;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term12989, args);
        assertTrue(recursiveEquals(term12989, term13752));
        assertTrue(recursiveEquals(term13059, term13753));
        assertTrue(recursiveEquals(retValue, term13723));
    }

};


