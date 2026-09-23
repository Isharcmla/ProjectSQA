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

public class NodeUtil_getLoopCodeBlock_1295091610318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26716;
     Object term26809;

    public NodeUtil_getLoopCodeBlock_1295091610318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26716, term26716.getClass(), "type", 114);
        term26809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26809, term26809.getClass(), "type", 114);
        setField(term26809, term26809.getClass(), "next", null);
        setField(term26809, term26809.getClass(), "first", null);
        setField(term26809, term26809.getClass(), "last", null);
        setField(term26809, term26809.getClass(), "propListHead", null);
        setIntField(term26809, term26809.getClass(), "sourcePosition", 0);
        setField(term26809, term26809.getClass(), "jsType", null);
        setField(term26809, term26809.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26716;
        Object retValue = callMethod(klass, "getLoopCodeBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term26716, term26809));
        assertTrue(recursiveEquals(retValue, null));
    }

};


