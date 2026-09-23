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
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3683304;
     Object term3683396;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3683304 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3683396 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3683488 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3683580 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3683672 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3683840 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3683932 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3683488, term3683488.getClass(), "type", 35);
        setIntField(term3683672, term3683672.getClass(), "type", 40);
        setField(term3683672, term3683672.getClass(), "str", "lastIndexOf");
        setField(term3683580, term3683580.getClass(), "next", term3683672);
        setIntField(term3683580, term3683580.getClass(), "type", 40);
        setField(term3683580, term3683580.getClass(), "str", "         ");
        setField(term3683488, term3683488.getClass(), "first", term3683580);
        setIntField(term3683840, term3683840.getClass(), "type", 40);
        setField(term3683932, term3683932.getClass(), "next", null);
        setIntField(term3683932, term3683932.getClass(), "type", 39);
        setField(term3683840, term3683840.getClass(), "next", term3683932);
        setField(term3683840, term3683840.getClass(), "str", "");
        setField(term3683488, term3683488.getClass(), "next", term3683840);
        setField(term3683396, term3683396.getClass(), "first", term3683488);
        setIntField(term3683396, term3683396.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3683396;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3683304, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


