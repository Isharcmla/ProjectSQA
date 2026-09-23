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

public class InlineFunctions_findCalledFunctions_175932642497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20525;
     Object term20595;
     Object term20783;

    public InlineFunctions_findCalledFunctions_175932642497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20525 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term20595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20595, term20595.getClass(), "type", 0);
        setIntField(term20665, term20665.getClass(), "type", 0);
        setField(term20665, term20665.getClass(), "first", null);
        setIntField(term20735, term20735.getClass(), "type", 0);
        setField(term20735, term20735.getClass(), "first", term20665);
        setField(term20665, term20665.getClass(), "next", term20735);
        setField(term20595, term20595.getClass(), "first", term20665);
        term20783 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term20595;
        args[1] = term20783;
        callMethod(klass, "findCalledFunctions", argTypes, term20525, args);
    }

};


