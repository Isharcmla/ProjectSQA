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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Normalize_process_169323966693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2001617;
     Object term2001783;

    public Normalize_process_169323966693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2001617 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2001697 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2001617, term2001617.getClass(), "compiler", term2001697);
        setBooleanField(term2001617, term2001617.getClass(), "assertOnChange", false);
        term2001783 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2001869 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2001783, term2001783.getClass(), "type", 126);
        setIntField(term2001869, term2001869.getClass(), "type", 0);
        setField(term2001869, term2001869.getClass(), "propListHead", null);
        setIntField(term2001869, term2001869.getClass(), "sourcePosition", 0);
        setField(term2001869, term2001869.getClass(), "next", null);
        setField(term2001783, term2001783.getClass(), "last", term2001869);
        setField(term2001783, term2001783.getClass(), "first", term2001869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2001783;
        try {
            callMethod(klass, "process", argTypes, term2001617, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


