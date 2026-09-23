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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3629681;
     Object term3629767;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3629681 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3629767 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3629859 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3629951 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3630043 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3630129 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3629767, term3629767.getClass(), "type", 37);
        setIntField(term3629859, term3629859.getClass(), "type", 35);
        setIntField(term3630043, term3630043.getClass(), "type", 40);
        setField(term3630043, term3630043.getClass(), "str", null);
        setField(term3629951, term3629951.getClass(), "next", term3630043);
        setIntField(term3629951, term3629951.getClass(), "type", 40);
        setField(term3629859, term3629859.getClass(), "first", term3629951);
        setIntField(term3630129, term3630129.getClass(), "type", 41);
        setField(term3629859, term3629859.getClass(), "next", term3630129);
        setField(term3629767, term3629767.getClass(), "first", term3629859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3629767;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3629681, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


