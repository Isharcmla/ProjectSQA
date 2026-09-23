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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3515939;
     Object term3516031;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3515939 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3516031 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3516123 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3516215 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3516307 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3516437 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3516123, term3516123.getClass(), "type", 35);
        setIntField(term3516307, term3516307.getClass(), "type", 40);
        setField(term3516307, term3516307.getClass(), "str", "lastIndexOf");
        setField(term3516215, term3516215.getClass(), "next", term3516307);
        setIntField(term3516215, term3516215.getClass(), "type", 40);
        setField(term3516123, term3516123.getClass(), "first", term3516215);
        setIntField(term3516437, term3516437.getClass(), "type", 41);
        setField(term3516123, term3516123.getClass(), "next", term3516437);
        setField(term3516031, term3516031.getClass(), "first", term3516123);
        setIntField(term3516031, term3516031.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3516031;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3515939, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


