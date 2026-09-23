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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionToBlockMutator_mutate_93484811960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16283;
     Object term16449;

    public FunctionToBlockMutator_mutate_93484811960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16283 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        Object term16363 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term16283, term16283.getClass(), "compiler", term16363);
        term16449 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term16541 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term16541, term16541.getClass(), "first", null);
        setField(term16541, term16541.getClass(), "next", null);
        setField(term16449, term16449.getClass(), "first", term16541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term16449;
        args[2] = null;
        args[3] = null;
        args[4] = false;
        args[5] = false;
        try {
            callMethod(klass, "mutate", argTypes, term16283, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


