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

public class ProcessClosurePrimitives_verifyArgument_95535072176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34188;
     Object term34358;
     Object term34466;
     Object term34536;

    public ProcessClosurePrimitives_verifyArgument_95535072176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34188 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term34268 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term34188, term34188.getClass(), "compiler", term34268);
        term34358 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term34358, term34358.getClass(), "sourceName", "");
        term34466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34466, term34466.getClass(), "type", 0);
        setIntField(term34466, term34466.getClass(), "sourcePosition", 0);
        term34536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34536, term34536.getClass(), "type", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term34358;
        args[1] = term34466;
        args[2] = term34536;
        args[3] = -1;
        try {
            callMethod(klass, "verifyArgument", argTypes, term34188, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


