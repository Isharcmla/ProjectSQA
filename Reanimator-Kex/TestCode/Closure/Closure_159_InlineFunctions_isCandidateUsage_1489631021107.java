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
import java.lang.Object;

public class InlineFunctions_isCandidateUsage_1489631021107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17546;
     Object term35931;

    public InlineFunctions_isCandidateUsage_1489631021107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17616, term17616.getClass(), "type", 105);
        setField(term17546, term17546.getClass(), "parent", term17616);
        setIntField(term17546, term17546.getClass(), "type", 38);
        term35931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35931, term35931.getClass(), "type", 38);
        setField(term35931, term35931.getClass(), "next", null);
        setField(term35931, term35931.getClass(), "first", null);
        setField(term35931, term35931.getClass(), "last", null);
        setField(term35931, term35931.getClass(), "propListHead", null);
        setIntField(term35931, term35931.getClass(), "sourcePosition", 0);
        setField(term35931, term35931.getClass(), "jsType", null);
        setIntField(term35932, term35932.getClass(), "type", 105);
        setField(term35932, term35932.getClass(), "next", null);
        setField(term35932, term35932.getClass(), "first", null);
        setField(term35932, term35932.getClass(), "last", null);
        setField(term35932, term35932.getClass(), "propListHead", null);
        setIntField(term35932, term35932.getClass(), "sourcePosition", 0);
        setField(term35932, term35932.getClass(), "jsType", null);
        setField(term35932, term35932.getClass(), "parent", null);
        setField(term35931, term35931.getClass(), "parent", term35932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17546;
        Object retValue = callMethod(klass, "isCandidateUsage", argTypes, null, args);
        assertTrue(recursiveEquals(term17546, term35931));
        assertTrue(recursiveEquals(retValue, true));
    }

};


