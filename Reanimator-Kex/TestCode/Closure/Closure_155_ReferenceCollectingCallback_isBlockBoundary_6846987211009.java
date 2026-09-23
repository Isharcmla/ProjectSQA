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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256522;
     Object term256614;
     Object term257318;
     Object term257319;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256522 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term256614 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term256614, term256614.getClass(), "type", 12);
        term257318 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term257318, term257318.getClass(), "str", null);
        setIntField(term257318, term257318.getClass(), "type", 12);
        setField(term257318, term257318.getClass(), "next", null);
        setField(term257318, term257318.getClass(), "first", null);
        setField(term257318, term257318.getClass(), "last", null);
        setField(term257318, term257318.getClass(), "propListHead", null);
        setIntField(term257318, term257318.getClass(), "sourcePosition", 0);
        setField(term257318, term257318.getClass(), "jsType", null);
        setField(term257318, term257318.getClass(), "parent", null);
        term257319 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term257319, term257319.getClass(), "str", null);
        setIntField(term257319, term257319.getClass(), "type", 0);
        setField(term257319, term257319.getClass(), "next", null);
        setField(term257319, term257319.getClass(), "first", null);
        setField(term257319, term257319.getClass(), "last", null);
        setField(term257319, term257319.getClass(), "propListHead", null);
        setIntField(term257319, term257319.getClass(), "sourcePosition", 0);
        setField(term257319, term257319.getClass(), "jsType", null);
        setField(term257319, term257319.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term256522;
        args[1] = term256614;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term256522, term257318));
        assertTrue(recursiveEquals(term256614, term257319));
        assertTrue(recursiveEquals(retValue, false));
    }

};


