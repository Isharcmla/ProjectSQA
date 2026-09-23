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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3696980;
     Object term3697072;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3696980 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3697072 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3697164 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3697256 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3697348 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3697472 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3697164, term3697164.getClass(), "type", 35);
        setIntField(term3697348, term3697348.getClass(), "type", 40);
        setField(term3697348, term3697348.getClass(), "str", "lastIndexOf");
        setField(term3697256, term3697256.getClass(), "next", term3697348);
        setIntField(term3697256, term3697256.getClass(), "type", 40);
        setField(term3697164, term3697164.getClass(), "first", term3697256);
        setIntField(term3697472, term3697472.getClass(), "type", 41);
        setField(term3697164, term3697164.getClass(), "next", term3697472);
        setField(term3697072, term3697072.getClass(), "first", term3697164);
        setIntField(term3697072, term3697072.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3697072;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3696980, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


