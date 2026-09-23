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

public class FoldConstants_process_1962761263244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63709;
     Object term63779;

    public FoldConstants_process_1962761263244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63709 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term63709, term63709.getClass(), "compiler", null);
        term63779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63779, term63779.getClass(), "type", 125);
        setField(term63849, term63849.getClass(), "next", null);
        setIntField(term63849, term63849.getClass(), "type", 87);
        setField(term63849, term63849.getClass(), "first", null);
        setField(term63779, term63779.getClass(), "first", term63849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term63779;
        try {
            callMethod(klass, "process", argTypes, term63709, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


