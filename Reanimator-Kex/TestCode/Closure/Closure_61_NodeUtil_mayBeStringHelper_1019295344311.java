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

public class NodeUtil_mayBeStringHelper_1019295344311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26030;
     Object term26300;

    public NodeUtil_mayBeStringHelper_1019295344311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26030, term26030.getClass(), "type", 24);
        term26300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26300, term26300.getClass(), "type", 24);
        setField(term26300, term26300.getClass(), "next", null);
        setField(term26300, term26300.getClass(), "first", null);
        setField(term26300, term26300.getClass(), "last", null);
        setField(term26300, term26300.getClass(), "propListHead", null);
        setIntField(term26300, term26300.getClass(), "sourcePosition", 0);
        setField(term26300, term26300.getClass(), "jsType", null);
        setField(term26300, term26300.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26030;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term26030, term26300));
        assertTrue(recursiveEquals(retValue, false));
    }

};


