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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3598992;
     Object term3599078;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3598992 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3599078 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3599170 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3599262 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3599392 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3599078, term3599078.getClass(), "type", 37);
        setIntField(term3599170, term3599170.getClass(), "type", 33);
        setField(term3599262, term3599262.getClass(), "next", term3599262);
        setIntField(term3599262, term3599262.getClass(), "type", 40);
        setField(term3599262, term3599262.getClass(), "str", "substr");
        setField(term3599170, term3599170.getClass(), "first", term3599262);
        setIntField(term3599392, term3599392.getClass(), "type", 39);
        setField(term3599170, term3599170.getClass(), "next", term3599392);
        setField(term3599078, term3599078.getClass(), "first", term3599170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3599078;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3598992, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


