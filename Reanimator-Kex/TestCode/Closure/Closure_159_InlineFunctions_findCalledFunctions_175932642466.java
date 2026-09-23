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

public class InlineFunctions_findCalledFunctions_175932642466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11099;
     Object term11169;
     Object term11217;

    public InlineFunctions_findCalledFunctions_175932642466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11099 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term11169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11169, term11169.getClass(), "type", 37);
        term11217 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term11169;
        args[1] = term11217;
        try {
            callMethod(klass, "findCalledFunctions", argTypes, term11099, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


