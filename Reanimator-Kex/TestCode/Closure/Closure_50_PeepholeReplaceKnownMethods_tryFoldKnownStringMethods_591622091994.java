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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201274;
     Object term4201360;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201274 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4201360 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4201452 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4201544 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4201636 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4201766 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4201360, term4201360.getClass(), "type", 37);
        setIntField(term4201452, term4201452.getClass(), "type", 35);
        setIntField(term4201636, term4201636.getClass(), "type", 40);
        setField(term4201636, term4201636.getClass(), "str", "lastIndexOf");
        setField(term4201544, term4201544.getClass(), "next", term4201636);
        setIntField(term4201544, term4201544.getClass(), "type", 40);
        setField(term4201452, term4201452.getClass(), "first", term4201544);
        setIntField(term4201766, term4201766.getClass(), "type", 44);
        setField(term4201452, term4201452.getClass(), "next", term4201766);
        setField(term4201360, term4201360.getClass(), "first", term4201452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4201360;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4201274, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


