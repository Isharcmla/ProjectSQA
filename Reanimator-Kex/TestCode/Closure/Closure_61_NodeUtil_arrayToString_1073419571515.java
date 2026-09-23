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

public class NodeUtil_arrayToString_1073419571515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45336;
     Object term52480;

    public NodeUtil_arrayToString_1073419571515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45406, term45406.getClass(), "type", 63);
        setField(term45336, term45336.getClass(), "first", term45406);
        term52480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52480, term52480.getClass(), "type", 0);
        setField(term52480, term52480.getClass(), "next", null);
        setIntField(term52481, term52481.getClass(), "type", 63);
        setField(term52481, term52481.getClass(), "next", null);
        setField(term52481, term52481.getClass(), "first", null);
        setField(term52481, term52481.getClass(), "last", null);
        setField(term52481, term52481.getClass(), "propListHead", null);
        setIntField(term52481, term52481.getClass(), "sourcePosition", 0);
        setField(term52481, term52481.getClass(), "jsType", null);
        setField(term52481, term52481.getClass(), "parent", null);
        setField(term52480, term52480.getClass(), "first", term52481);
        setField(term52480, term52480.getClass(), "last", null);
        setField(term52480, term52480.getClass(), "propListHead", null);
        setIntField(term52480, term52480.getClass(), "sourcePosition", 0);
        setField(term52480, term52480.getClass(), "jsType", null);
        setField(term52480, term52480.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45336;
        Object retValue = callMethod(klass, "arrayToString", argTypes, null, args);
        assertTrue(recursiveEquals(term45336, term52480));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


