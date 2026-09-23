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

public class Normalize_process_1693239666104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2009442;
     Object term2009592;

    public Normalize_process_1693239666104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2009442 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2009522 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2009442, term2009442.getClass(), "compiler", term2009522);
        setBooleanField(term2009442, term2009442.getClass(), "assertOnChange", false);
        term2009592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2009678 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2009764 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2009834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2009592, term2009592.getClass(), "type", 0);
        setField(term2009678, term2009678.getClass(), "next", term2009764);
        setIntField(term2009678, term2009678.getClass(), "type", 0);
        setField(term2009678, term2009678.getClass(), "first", term2009834);
        setField(term2009592, term2009592.getClass(), "first", term2009678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2009592;
        callMethod(klass, "process", argTypes, term2009442, args);
    }

};


