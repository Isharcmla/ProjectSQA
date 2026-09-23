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

public class ScopedAliases_process_84065531372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33994;
     Object term34144;

    public ScopedAliases_process_84065531372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33994 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term34074 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term33994, term33994.getClass(), "compiler", term34074);
        term34144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34144, term34144.getClass(), "type", 0);
        setField(term34144, term34144.getClass(), "parent", null);
        setField(term34214, term34214.getClass(), "next", term34284);
        setIntField(term34214, term34214.getClass(), "type", 37);
        setField(term34214, term34214.getClass(), "first", null);
        setField(term34144, term34144.getClass(), "first", term34214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34144;
        try {
            callMethod(klass, "process", argTypes, term33994, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


