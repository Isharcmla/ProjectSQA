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

public class ReferenceCollectingCallback_isBlockBoundary_684698721663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223814;
     Object term223906;
     Object term224019;
     Object term224021;

    public ReferenceCollectingCallback_isBlockBoundary_684698721663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223814 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term223906 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223998 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term223906, term223906.getClass(), "type", 108);
        setField(term223906, term223906.getClass(), "first", term223998);
        term224019 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term224020 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term224019, term224019.getClass(), "str", null);
        setIntField(term224019, term224019.getClass(), "type", 108);
        setField(term224019, term224019.getClass(), "next", null);
        setField(term224020, term224020.getClass(), "str", null);
        setIntField(term224020, term224020.getClass(), "type", 0);
        setField(term224020, term224020.getClass(), "next", null);
        setField(term224020, term224020.getClass(), "first", null);
        setField(term224020, term224020.getClass(), "last", null);
        setField(term224020, term224020.getClass(), "propListHead", null);
        setIntField(term224020, term224020.getClass(), "sourcePosition", 0);
        setField(term224020, term224020.getClass(), "jsType", null);
        setField(term224020, term224020.getClass(), "parent", null);
        setField(term224019, term224019.getClass(), "first", term224020);
        setField(term224019, term224019.getClass(), "last", null);
        setField(term224019, term224019.getClass(), "propListHead", null);
        setIntField(term224019, term224019.getClass(), "sourcePosition", 0);
        setField(term224019, term224019.getClass(), "jsType", null);
        setField(term224019, term224019.getClass(), "parent", null);
        term224021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term224021, term224021.getClass(), "str", null);
        setIntField(term224021, term224021.getClass(), "type", 0);
        setField(term224021, term224021.getClass(), "next", null);
        setField(term224021, term224021.getClass(), "first", null);
        setField(term224021, term224021.getClass(), "last", null);
        setField(term224021, term224021.getClass(), "propListHead", null);
        setIntField(term224021, term224021.getClass(), "sourcePosition", 0);
        setField(term224021, term224021.getClass(), "jsType", null);
        setField(term224021, term224021.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term223814;
        args[1] = term223906;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term223814, term224019));
        assertTrue(recursiveEquals(term223906, term224021));
        assertTrue(recursiveEquals(retValue, true));
    }

};


