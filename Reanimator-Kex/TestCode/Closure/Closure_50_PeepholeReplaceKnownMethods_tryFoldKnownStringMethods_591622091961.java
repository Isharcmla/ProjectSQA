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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3802373;
     Object term3802459;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3802373 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3802459 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3802551 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3802643 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3802735 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3802865 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3802459, term3802459.getClass(), "type", 37);
        setIntField(term3802551, term3802551.getClass(), "type", 33);
        setIntField(term3802735, term3802735.getClass(), "type", 40);
        setField(term3802735, term3802735.getClass(), "str", "lastIndexOf");
        setField(term3802643, term3802643.getClass(), "next", term3802735);
        setIntField(term3802643, term3802643.getClass(), "type", 40);
        setField(term3802551, term3802551.getClass(), "first", term3802643);
        setIntField(term3802865, term3802865.getClass(), "type", 39);
        setField(term3802551, term3802551.getClass(), "next", term3802865);
        setField(term3802459, term3802459.getClass(), "first", term3802551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3802459;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3802373, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


