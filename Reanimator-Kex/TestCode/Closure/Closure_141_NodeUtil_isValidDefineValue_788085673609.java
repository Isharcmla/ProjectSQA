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

public class NodeUtil_isValidDefineValue_788085673609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54352;
     Object term54439;

    public NodeUtil_isValidDefineValue_788085673609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54352, term54352.getClass(), "type", 9);
        setField(term54352, term54352.getClass(), "first", term54422);
        term54439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54439, term54439.getClass(), "type", 9);
        setField(term54439, term54439.getClass(), "next", null);
        setIntField(term54440, term54440.getClass(), "type", 0);
        setField(term54440, term54440.getClass(), "next", null);
        setField(term54440, term54440.getClass(), "first", null);
        setField(term54440, term54440.getClass(), "last", null);
        setField(term54440, term54440.getClass(), "propListHead", null);
        setIntField(term54440, term54440.getClass(), "sourcePosition", 0);
        setField(term54440, term54440.getClass(), "jsType", null);
        setField(term54440, term54440.getClass(), "parent", null);
        setField(term54439, term54439.getClass(), "first", term54440);
        setField(term54439, term54439.getClass(), "last", null);
        setField(term54439, term54439.getClass(), "propListHead", null);
        setIntField(term54439, term54439.getClass(), "sourcePosition", 0);
        setField(term54439, term54439.getClass(), "jsType", null);
        setField(term54439, term54439.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term54352;
        args[1] = null;
        Object retValue = callMethod(klass, "isValidDefineValue", argTypes, null, args);
        assertTrue(recursiveEquals(term54352, term54439));
        assertTrue(recursiveEquals(retValue, false));
    }

};


