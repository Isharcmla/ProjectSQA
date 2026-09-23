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

public class Normalize_process_1693239666165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2242012;
     Object term2242098;

    public Normalize_process_1693239666165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2242012 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2242012, term2242012.getClass(), "compiler", null);
        setBooleanField(term2242012, term2242012.getClass(), "assertOnChange", false);
        term2242098 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2242184 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2242098, term2242098.getClass(), "type", 113);
        setField(term2242184, term2242184.getClass(), "next", null);
        setIntField(term2242184, term2242184.getClass(), "type", 0);
        setField(term2242184, term2242184.getClass(), "first", null);
        setField(term2242098, term2242098.getClass(), "first", term2242184);
        setField(term2242098, term2242098.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2242098;
        try {
            callMethod(klass, "process", argTypes, term2242012, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


