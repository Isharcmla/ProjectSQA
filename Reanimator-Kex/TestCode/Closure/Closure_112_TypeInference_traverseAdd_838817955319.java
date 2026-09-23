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

public class TypeInference_traverseAdd_838817955319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516769;
     Object term516839;

    public TypeInference_traverseAdd_838817955319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516769 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term516839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term516909, term516909.getClass(), "next", term516979);
        setIntField(term516909, term516909.getClass(), "type", 14);
        setIntField(term517049, term517049.getClass(), "type", 14);
        setIntField(term517119, term517119.getClass(), "type", 14);
        setIntField(term517189, term517189.getClass(), "type", 14);
        setIntField(term517259, term517259.getClass(), "type", 14);
        setIntField(term517329, term517329.getClass(), "type", 14);
        setIntField(term517399, term517399.getClass(), "type", 131);
        setField(term517329, term517329.getClass(), "first", term517399);
        setField(term517259, term517259.getClass(), "first", term517329);
        setField(term517189, term517189.getClass(), "first", term517259);
        setField(term517119, term517119.getClass(), "first", term517189);
        setField(term517049, term517049.getClass(), "first", term517119);
        setField(term516909, term516909.getClass(), "first", term517049);
        setField(term516839, term516839.getClass(), "first", term516909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term516839;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term516769, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


