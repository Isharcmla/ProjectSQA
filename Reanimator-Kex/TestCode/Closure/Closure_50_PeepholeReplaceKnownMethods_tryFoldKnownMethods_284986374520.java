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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3497598;
     Object term3497690;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3497598 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3497690 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3497782 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3497874 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3497966 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3498096 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3497782, term3497782.getClass(), "type", 35);
        setIntField(term3497966, term3497966.getClass(), "type", 40);
        setField(term3497966, term3497966.getClass(), "str", "indexOf");
        setField(term3497874, term3497874.getClass(), "next", term3497966);
        setIntField(term3497874, term3497874.getClass(), "type", 40);
        setField(term3497874, term3497874.getClass(), "str", null);
        setField(term3497782, term3497782.getClass(), "first", term3497874);
        setIntField(term3498096, term3498096.getClass(), "type", 40);
        setField(term3498096, term3498096.getClass(), "next", null);
        setField(term3498096, term3498096.getClass(), "str", "");
        setField(term3497782, term3497782.getClass(), "next", term3498096);
        setField(term3497690, term3497690.getClass(), "first", term3497782);
        setIntField(term3497690, term3497690.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3497690;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3497598, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


