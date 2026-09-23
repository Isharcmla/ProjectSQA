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
import java.util.HashSet;

public class InlineFunctions_findCalledFunctions_1759326424114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19521;
     Object term19591;
     Object term19779;

    public InlineFunctions_findCalledFunctions_1759326424114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19521 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term19591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19591, term19591.getClass(), "type", 0);
        setIntField(term19661, term19661.getClass(), "type", 0);
        setIntField(term19731, term19731.getClass(), "type", 37);
        setField(term19661, term19661.getClass(), "first", term19731);
        setField(term19591, term19591.getClass(), "first", term19661);
        term19779 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term19591;
        args[1] = term19779;
        try {
            callMethod(klass, "findCalledFunctions", argTypes, term19521, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


