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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3621351;
     Object term3621437;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3621351 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3621437 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3621529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3621621 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3621713 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3621837 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3621437, term3621437.getClass(), "type", 37);
        setIntField(term3621529, term3621529.getClass(), "type", 33);
        setIntField(term3621713, term3621713.getClass(), "type", 40);
        setField(term3621713, term3621713.getClass(), "str", "lastIndexOf");
        setField(term3621621, term3621621.getClass(), "next", term3621713);
        setIntField(term3621621, term3621621.getClass(), "type", 40);
        setField(term3621529, term3621529.getClass(), "first", term3621621);
        setIntField(term3621837, term3621837.getClass(), "type", 40);
        setField(term3621529, term3621529.getClass(), "next", term3621837);
        setField(term3621437, term3621437.getClass(), "first", term3621529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3621437;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3621351, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


