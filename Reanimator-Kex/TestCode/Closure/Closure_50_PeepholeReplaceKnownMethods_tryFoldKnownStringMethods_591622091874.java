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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3728640;
     Object term3728726;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3728640 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3728726 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3728818 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3728910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3729002 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3729126 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3728726, term3728726.getClass(), "type", 37);
        setIntField(term3728818, term3728818.getClass(), "type", 35);
        setIntField(term3729002, term3729002.getClass(), "type", 40);
        setField(term3729002, term3729002.getClass(), "str", "lastIndexOf");
        setField(term3728910, term3728910.getClass(), "next", term3729002);
        setIntField(term3728910, term3728910.getClass(), "type", 40);
        setField(term3728818, term3728818.getClass(), "first", term3728910);
        setIntField(term3729126, term3729126.getClass(), "type", 40);
        setField(term3728818, term3728818.getClass(), "next", term3729126);
        setField(term3728726, term3728726.getClass(), "first", term3728818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3728726;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3728640, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


