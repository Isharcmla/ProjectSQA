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

public class InlineFunctions_findCalledFunctions_1759326424100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21880;
     Object term21966;
     Object term22106;

    public InlineFunctions_findCalledFunctions_1759326424100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21880 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term21966 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term22058 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term21966, term21966.getClass(), "type", -38);
        setField(term21966, term21966.getClass(), "first", term22058);
        term22106 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term21966;
        args[1] = term22106;
        callMethod(klass, "findCalledFunctions", argTypes, term21880, args);
    }

};


