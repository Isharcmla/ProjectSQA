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
import java.util.HashSet;

public class FunctionToBlockMutator_aliasAndInlineArguments_38898233172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22538;
     Object term22630;
     Object term22840;

    public FunctionToBlockMutator_aliasAndInlineArguments_38898233172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22538 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        term22630 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22722 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term22792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22630, term22630.getClass(), "type", 0);
        setIntField(term22722, term22722.getClass(), "type", 0);
        setField(term22722, term22722.getClass(), "first", null);
        setField(term22722, term22722.getClass(), "next", term22792);
        setField(term22630, term22630.getClass(), "first", term22722);
        term22840 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.LinkedHashMap");
        argTypes[2] = Class.forName("java.util.Set");
        Object[] args = new Object[3];
        args[0] = term22630;
        args[1] = null;
        args[2] = term22840;
        callMethod(klass, "aliasAndInlineArguments", argTypes, term22538, args);
    }

};


