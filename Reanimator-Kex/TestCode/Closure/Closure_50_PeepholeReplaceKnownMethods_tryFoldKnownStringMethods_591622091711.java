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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3616232;
     Object term3616318;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3616232 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3616318 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3616410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3616502 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3616594 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3616762 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3616318, term3616318.getClass(), "type", 37);
        setIntField(term3616410, term3616410.getClass(), "type", 35);
        setIntField(term3616594, term3616594.getClass(), "type", 40);
        setField(term3616594, term3616594.getClass(), "str", "lastIndexOf");
        setField(term3616502, term3616502.getClass(), "next", term3616594);
        setIntField(term3616502, term3616502.getClass(), "type", 40);
        setField(term3616502, term3616502.getClass(), "str", "");
        setField(term3616410, term3616410.getClass(), "first", term3616502);
        setIntField(term3616762, term3616762.getClass(), "type", 41);
        setField(term3616762, term3616762.getClass(), "next", null);
        setField(term3616410, term3616410.getClass(), "next", term3616762);
        setField(term3616318, term3616318.getClass(), "first", term3616410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3616318;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3616232, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


