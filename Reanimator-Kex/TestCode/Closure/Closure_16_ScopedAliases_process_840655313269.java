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

public class ScopedAliases_process_840655313269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172363;
     Object term172455;

    public ScopedAliases_process_840655313269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172363 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term172363, term172363.getClass(), "compiler", null);
        term172455 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172547 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term172455, term172455.getClass(), "type", 0);
        setIntField(term172547, term172547.getClass(), "type", 37);
        setField(term172547, term172547.getClass(), "parent", null);
        setField(term172455, term172455.getClass(), "parent", term172547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term172455;
        try {
            callMethod(klass, "process", argTypes, term172363, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


