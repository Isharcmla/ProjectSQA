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

public class PeepholeFoldConstants_tryFoldLeftChildAdd_1163340824128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24917;
     Object term24987;
     Object term24997;
     Object term24998;

    public PeepholeFoldConstants_tryFoldLeftChildAdd_1163340824128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24917 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term24987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term24997 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term24997, term24997.getClass(), "currentTraversal", null);
        term24998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24998, term24998.getClass(), "type", 0);
        setField(term24998, term24998.getClass(), "next", null);
        setField(term24998, term24998.getClass(), "first", null);
        setField(term24998, term24998.getClass(), "last", null);
        setField(term24998, term24998.getClass(), "propListHead", null);
        setIntField(term24998, term24998.getClass(), "sourcePosition", 0);
        setField(term24998, term24998.getClass(), "jsType", null);
        setField(term24998, term24998.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term24987;
        Object retValue = callMethod(klass, "tryFoldLeftChildAdd", argTypes, term24917, args);
        assertTrue(recursiveEquals(term24917, term24997));
        assertTrue(recursiveEquals(term24987, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


