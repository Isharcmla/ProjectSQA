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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3816305;
     Object term3816391;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3816305 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3816391 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3816483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3816575 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3816699 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3816391, term3816391.getClass(), "type", 37);
        setIntField(term3816483, term3816483.getClass(), "type", 33);
        setField(term3816575, term3816575.getClass(), "next", term3816575);
        setIntField(term3816575, term3816575.getClass(), "type", 40);
        setField(term3816575, term3816575.getClass(), "str", "indexOf");
        setField(term3816483, term3816483.getClass(), "first", term3816575);
        setIntField(term3816699, term3816699.getClass(), "type", 44);
        setField(term3816483, term3816483.getClass(), "next", term3816699);
        setField(term3816391, term3816391.getClass(), "first", term3816483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3816391;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3816305, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


