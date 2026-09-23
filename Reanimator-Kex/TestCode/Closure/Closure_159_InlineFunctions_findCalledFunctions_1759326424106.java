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
import java.util.HashSet;

public class InlineFunctions_findCalledFunctions_1759326424106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17319;
     Object term17405;
     Object term17453;

    public InlineFunctions_findCalledFunctions_1759326424106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17319 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term17405 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term17405, term17405.getClass(), "type", 37);
        term17453 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term17405;
        args[1] = term17453;
        try {
            callMethod(klass, "findCalledFunctions", argTypes, term17319, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


