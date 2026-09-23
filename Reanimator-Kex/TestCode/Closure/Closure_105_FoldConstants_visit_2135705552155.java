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

public class FoldConstants_visit_2135705552155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34342;
     Object term34412;
     Object term34430;
     Object term34431;

    public FoldConstants_visit_2135705552155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34342 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term34412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34412, term34412.getClass(), "type", 125);
        term34430 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term34430, term34430.getClass(), "compiler", null);
        term34431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34431, term34431.getClass(), "type", 125);
        setField(term34431, term34431.getClass(), "next", null);
        setField(term34431, term34431.getClass(), "first", null);
        setField(term34431, term34431.getClass(), "last", null);
        setField(term34431, term34431.getClass(), "propListHead", null);
        setIntField(term34431, term34431.getClass(), "sourcePosition", 0);
        setField(term34431, term34431.getClass(), "jsType", null);
        setField(term34431, term34431.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term34412;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term34342, args);
        assertTrue(recursiveEquals(term34342, term34430));
        assertTrue(recursiveEquals(term34412, null));
    }

};


