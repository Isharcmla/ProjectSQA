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

public class PeepholeFoldConstants_tryFoldKnownMethods_889469083128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21341;
     Object term21411;
     Object term21615;
     Object term21616;
     Object term21602;

    public PeepholeFoldConstants_tryFoldKnownMethods_889469083128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21341 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term21411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term21411, term21411.getClass(), "first", null);
        term21615 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term21615, term21615.getClass(), "currentTraversal", null);
        term21616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21616, term21616.getClass(), "type", 0);
        setField(term21616, term21616.getClass(), "next", null);
        setField(term21616, term21616.getClass(), "first", null);
        setField(term21616, term21616.getClass(), "last", null);
        setField(term21616, term21616.getClass(), "propListHead", null);
        setIntField(term21616, term21616.getClass(), "sourcePosition", 0);
        setField(term21616, term21616.getClass(), "jsType", null);
        setField(term21616, term21616.getClass(), "parent", null);
        term21602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21602, term21602.getClass(), "type", 0);
        setField(term21602, term21602.getClass(), "next", null);
        setField(term21602, term21602.getClass(), "first", null);
        setField(term21602, term21602.getClass(), "last", null);
        setField(term21602, term21602.getClass(), "propListHead", null);
        setIntField(term21602, term21602.getClass(), "sourcePosition", 0);
        setField(term21602, term21602.getClass(), "jsType", null);
        setField(term21602, term21602.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21411;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term21341, args);
        assertTrue(recursiveEquals(term21341, term21615));
        assertTrue(recursiveEquals(term21411, term21616));
        assertTrue(recursiveEquals(retValue, term21602));
    }

};


