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

public class ReferenceCollectingCallback_isBlockBoundary_684698721874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226096;
     Object term226188;
     Object term226305;
     Object term226306;

    public ReferenceCollectingCallback_isBlockBoundary_684698721874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term226188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term226188, term226188.getClass(), "type", 12);
        term226305 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term226305, term226305.getClass(), "str", null);
        setIntField(term226305, term226305.getClass(), "type", 12);
        setField(term226305, term226305.getClass(), "next", null);
        setField(term226305, term226305.getClass(), "first", null);
        setField(term226305, term226305.getClass(), "last", null);
        setField(term226305, term226305.getClass(), "propListHead", null);
        setIntField(term226305, term226305.getClass(), "sourcePosition", 0);
        setField(term226305, term226305.getClass(), "jsType", null);
        setField(term226305, term226305.getClass(), "parent", null);
        term226306 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term226306, term226306.getClass(), "number", 0.0);
        setIntField(term226306, term226306.getClass(), "type", 0);
        setField(term226306, term226306.getClass(), "next", null);
        setField(term226306, term226306.getClass(), "first", null);
        setField(term226306, term226306.getClass(), "last", null);
        setField(term226306, term226306.getClass(), "propListHead", null);
        setIntField(term226306, term226306.getClass(), "sourcePosition", 0);
        setField(term226306, term226306.getClass(), "jsType", null);
        setField(term226306, term226306.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term226096;
        args[1] = term226188;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term226096, term226305));
        assertTrue(recursiveEquals(term226188, term226306));
        assertTrue(recursiveEquals(retValue, false));
    }

};


