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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3555969;
     Object term3556061;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3555969 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3556061 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3556153 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3556245 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3556337 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3556061, term3556061.getClass(), "type", 37);
        setIntField(term3556153, term3556153.getClass(), "type", 35);
        setIntField(term3556337, term3556337.getClass(), "type", 40);
        setField(term3556337, term3556337.getClass(), "str", "toLowerCase");
        setField(term3556245, term3556245.getClass(), "next", term3556337);
        setIntField(term3556245, term3556245.getClass(), "type", 40);
        setField(term3556153, term3556153.getClass(), "first", term3556245);
        setField(term3556153, term3556153.getClass(), "next", null);
        setField(term3556061, term3556061.getClass(), "first", term3556153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3556061;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3555969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


