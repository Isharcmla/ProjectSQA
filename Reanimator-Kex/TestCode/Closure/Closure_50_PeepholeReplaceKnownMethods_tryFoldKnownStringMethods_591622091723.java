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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3625640;
     Object term3625726;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3625640 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3625726 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3625818 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3625910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3626002 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3626126 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3625726, term3625726.getClass(), "type", 37);
        setIntField(term3625818, term3625818.getClass(), "type", 35);
        setIntField(term3626002, term3626002.getClass(), "type", 40);
        setField(term3626002, term3626002.getClass(), "str", "lastIndexOf");
        setField(term3625910, term3625910.getClass(), "next", term3626002);
        setIntField(term3625910, term3625910.getClass(), "type", 40);
        setField(term3625818, term3625818.getClass(), "first", term3625910);
        setIntField(term3626126, term3626126.getClass(), "type", 44);
        setField(term3625818, term3625818.getClass(), "next", term3626126);
        setField(term3625726, term3625726.getClass(), "first", term3625818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3625726;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3625640, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


