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

public class ScopedAliases_process_84065531327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14147;
     Object term14239;

    public ScopedAliases_process_84065531327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14147 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term14147, term14147.getClass(), "compiler", null);
        term14239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term14239, term14239.getClass(), "type", -133);
        setField(term14239, term14239.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14239;
        try {
            callMethod(klass, "process", argTypes, term14147, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


