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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3212385;
     Object term3212477;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3212385 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3212477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3212569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3212661 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3212753 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3212823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3212477, term3212477.getClass(), "type", 37);
        setIntField(term3212569, term3212569.getClass(), "type", 35);
        setIntField(term3212753, term3212753.getClass(), "type", 40);
        setField(term3212753, term3212753.getClass(), "str", null);
        setField(term3212661, term3212661.getClass(), "next", term3212753);
        setIntField(term3212661, term3212661.getClass(), "type", 40);
        setField(term3212569, term3212569.getClass(), "first", term3212661);
        setIntField(term3212823, term3212823.getClass(), "type", 44);
        setField(term3212569, term3212569.getClass(), "next", term3212823);
        setField(term3212477, term3212477.getClass(), "first", term3212569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3212477;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3212385, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


