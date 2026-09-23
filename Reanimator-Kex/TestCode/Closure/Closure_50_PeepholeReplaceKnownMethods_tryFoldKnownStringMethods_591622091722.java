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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3624875;
     Object term3624961;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3624875 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3624961 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3625053 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3625145 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3625237 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3625367 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3624961, term3624961.getClass(), "type", 37);
        setIntField(term3625053, term3625053.getClass(), "type", 35);
        setIntField(term3625237, term3625237.getClass(), "type", 40);
        setField(term3625237, term3625237.getClass(), "str", "lastIndexOf");
        setField(term3625145, term3625145.getClass(), "next", term3625237);
        setIntField(term3625145, term3625145.getClass(), "type", 40);
        setField(term3625053, term3625053.getClass(), "first", term3625145);
        setIntField(term3625367, term3625367.getClass(), "type", 43);
        setField(term3625053, term3625053.getClass(), "next", term3625367);
        setField(term3624961, term3624961.getClass(), "first", term3625053);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3624961;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3624875, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


