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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3657816;
     Object term3657902;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3657816 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3657902 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3657994 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3658086 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3658210 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3657902, term3657902.getClass(), "type", 37);
        setIntField(term3657994, term3657994.getClass(), "type", 33);
        setField(term3658086, term3658086.getClass(), "next", term3658086);
        setIntField(term3658086, term3658086.getClass(), "type", 40);
        setField(term3658086, term3658086.getClass(), "str", "indexOf");
        setField(term3657994, term3657994.getClass(), "first", term3658086);
        setIntField(term3658210, term3658210.getClass(), "type", 39);
        setField(term3657994, term3657994.getClass(), "next", term3658210);
        setField(term3657902, term3657902.getClass(), "first", term3657994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3657902;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3657816, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


