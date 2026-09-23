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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3648654;
     Object term3648740;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3648654 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3648740 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3648832 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3648924 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3649016 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3649184 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3649270 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3648740, term3648740.getClass(), "type", 37);
        setIntField(term3648832, term3648832.getClass(), "type", 35);
        setIntField(term3649016, term3649016.getClass(), "type", 40);
        setField(term3649016, term3649016.getClass(), "str", "indexOf");
        setField(term3648924, term3648924.getClass(), "next", term3649016);
        setIntField(term3648924, term3648924.getClass(), "type", 40);
        setField(term3648924, term3648924.getClass(), "str", "");
        setField(term3648832, term3648832.getClass(), "first", term3648924);
        setIntField(term3649184, term3649184.getClass(), "type", 41);
        setField(term3649184, term3649184.getClass(), "next", null);
        setField(term3648832, term3648832.getClass(), "next", term3649184);
        setField(term3648740, term3648740.getClass(), "first", term3648832);
        setField(term3648740, term3648740.getClass(), "parent", term3649270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3648740;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3648654, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


