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

public class InlineFunctions_findCalledFunctions_1759326424116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20245;
     Object term20331;
     Object term20379;

    public InlineFunctions_findCalledFunctions_1759326424116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20245 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term20331 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term20331, term20331.getClass(), "type", 37);
        term20379 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term20331;
        args[1] = term20379;
        try {
            callMethod(klass, "findCalledFunctions", argTypes, term20245, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


