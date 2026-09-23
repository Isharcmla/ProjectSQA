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

public class PeepholeFoldConstants_compareToUndefined_1311665781251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40730;
     Object term40800;
     Object term41305;
     Object term41306;

    public PeepholeFoldConstants_compareToUndefined_1311665781251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40730 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term40800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40800, term40800.getClass(), "type", 0);
        term41305 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term41305, term41305.getClass(), "currentTraversal", null);
        term41306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41306, term41306.getClass(), "type", 0);
        setField(term41306, term41306.getClass(), "next", null);
        setField(term41306, term41306.getClass(), "first", null);
        setField(term41306, term41306.getClass(), "last", null);
        setField(term41306, term41306.getClass(), "propListHead", null);
        setIntField(term41306, term41306.getClass(), "sourcePosition", 0);
        setField(term41306, term41306.getClass(), "jsType", null);
        setField(term41306, term41306.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term40800;
        args[1] = 15;
        Object retValue = callMethod(klass, "compareToUndefined", argTypes, term40730, args);
        assertTrue(recursiveEquals(term40730, term41305));
        assertTrue(recursiveEquals(term40800, term41306));
        assertTrue(recursiveEquals(retValue, false));
    }

};


