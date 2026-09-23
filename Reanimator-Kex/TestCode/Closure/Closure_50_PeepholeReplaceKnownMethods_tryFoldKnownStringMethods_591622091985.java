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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3819215;
     Object term3819301;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3819215 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3819301 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3819393 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3819485 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3819609 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3819301, term3819301.getClass(), "type", 37);
        setIntField(term3819393, term3819393.getClass(), "type", 35);
        setField(term3819485, term3819485.getClass(), "next", term3819485);
        setIntField(term3819485, term3819485.getClass(), "type", 40);
        setField(term3819485, term3819485.getClass(), "str", "indexOf");
        setField(term3819393, term3819393.getClass(), "first", term3819485);
        setIntField(term3819609, term3819609.getClass(), "type", 44);
        setField(term3819393, term3819393.getClass(), "next", term3819609);
        setField(term3819301, term3819301.getClass(), "first", term3819393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3819301;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3819215, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


