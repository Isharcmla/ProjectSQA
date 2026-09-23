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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20278;
     Object term20488;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term20348, term20348.getClass(), "parent", term20348);
        setField(term20348, term20348.getClass(), "first", term20418);
        setField(term20278, term20278.getClass(), "parent", term20348);
        term20488 = newInstance(Class.forName("com.google.common.collect.Maps$4"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term20278;
        args[1] = null;
        args[2] = term20488;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


