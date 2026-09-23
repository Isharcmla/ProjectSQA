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

public class PeepholeFoldConstants_compareToUndefined_1311665781166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26635;
     Object term26705;
     Object term26911;
     Object term26912;

    public PeepholeFoldConstants_compareToUndefined_1311665781166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26635 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term26705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26705, term26705.getClass(), "type", 0);
        term26911 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term26911, term26911.getClass(), "currentTraversal", null);
        term26912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26912, term26912.getClass(), "type", 0);
        setField(term26912, term26912.getClass(), "next", null);
        setField(term26912, term26912.getClass(), "first", null);
        setField(term26912, term26912.getClass(), "last", null);
        setField(term26912, term26912.getClass(), "propListHead", null);
        setIntField(term26912, term26912.getClass(), "sourcePosition", 0);
        setField(term26912, term26912.getClass(), "jsType", null);
        setField(term26912, term26912.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term26705;
        args[1] = 46;
        Object retValue = callMethod(klass, "compareToUndefined", argTypes, term26635, args);
        assertTrue(recursiveEquals(term26635, term26911));
        assertTrue(recursiveEquals(term26705, term26912));
        assertTrue(recursiveEquals(retValue, true));
    }

};


