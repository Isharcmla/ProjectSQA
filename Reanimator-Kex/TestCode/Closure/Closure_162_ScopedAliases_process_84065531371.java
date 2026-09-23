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

public class ScopedAliases_process_84065531371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34549;
     Object term34619;

    public ScopedAliases_process_84065531371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34549 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term34549, term34549.getClass(), "compiler", null);
        term34619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34619, term34619.getClass(), "type", 0);
        setField(term34619, term34619.getClass(), "parent", null);
        setField(term34689, term34689.getClass(), "next", term34619);
        setIntField(term34689, term34689.getClass(), "type", 132);
        setField(term34619, term34619.getClass(), "first", term34689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34619;
        callMethod(klass, "process", argTypes, term34549, args);
    }

};


