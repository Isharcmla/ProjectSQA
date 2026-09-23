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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3478542;
     Object term3478628;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3478542 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3478628 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3478720 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3478812 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3478904 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3478974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3478628, term3478628.getClass(), "type", 37);
        setIntField(term3478720, term3478720.getClass(), "type", 35);
        setIntField(term3478904, term3478904.getClass(), "type", 40);
        setField(term3478904, term3478904.getClass(), "str", null);
        setField(term3478812, term3478812.getClass(), "next", term3478904);
        setIntField(term3478812, term3478812.getClass(), "type", 40);
        setField(term3478720, term3478720.getClass(), "first", term3478812);
        setIntField(term3478974, term3478974.getClass(), "type", 39);
        setField(term3478720, term3478720.getClass(), "next", term3478974);
        setField(term3478628, term3478628.getClass(), "first", term3478720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3478628;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3478542, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


