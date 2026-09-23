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

public class RemoveUnusedVars_traverseFunction_28788501894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25266;
     Object term25336;

    public RemoveUnusedVars_traverseFunction_28788501894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25266 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term25336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term25406, term25406.getClass(), "next", term25336);
        setField(term25336, term25336.getClass(), "first", term25406);
        setField(term25336, term25336.getClass(), "next", term25336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term25336;
        args[1] = null;
        callMethod(klass, "traverseFunction", argTypes, term25266, args);
    }

};


