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

public class PeepholeFoldConstants_tryFoldStringIndexOf_101844866071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12024;
     Object term12094;
     Object term12865;
     Object term12866;
     Object term12857;

    public PeepholeFoldConstants_tryFoldStringIndexOf_101844866071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12024 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term12094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12094, term12094.getClass(), "type", 37);
        term12865 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term12865, term12865.getClass(), "currentTraversal", null);
        term12866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12866, term12866.getClass(), "type", 37);
        setField(term12866, term12866.getClass(), "next", null);
        setField(term12866, term12866.getClass(), "first", null);
        setField(term12866, term12866.getClass(), "last", null);
        setField(term12866, term12866.getClass(), "propListHead", null);
        setIntField(term12866, term12866.getClass(), "sourcePosition", 0);
        setField(term12866, term12866.getClass(), "jsType", null);
        setField(term12866, term12866.getClass(), "parent", null);
        term12857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12857, term12857.getClass(), "type", 37);
        setField(term12857, term12857.getClass(), "next", null);
        setField(term12857, term12857.getClass(), "first", null);
        setField(term12857, term12857.getClass(), "last", null);
        setField(term12857, term12857.getClass(), "propListHead", null);
        setIntField(term12857, term12857.getClass(), "sourcePosition", 0);
        setField(term12857, term12857.getClass(), "jsType", null);
        setField(term12857, term12857.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12094;
        Object retValue = callMethod(klass, "tryFoldStringIndexOf", argTypes, term12024, args);
        assertTrue(recursiveEquals(term12024, term12865));
        assertTrue(recursiveEquals(term12094, term12866));
        assertTrue(recursiveEquals(retValue, term12857));
    }

};


