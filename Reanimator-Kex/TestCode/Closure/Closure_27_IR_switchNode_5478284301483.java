package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_switchNode_5478284301483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250556;

    public IR_switchNode_5478284301483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term250556, term250556.getClass(), "type", 52);
        setField(term250556, term250556.getClass(), "parent", null);
        setField(term250556, term250556.getClass(), "next", term250626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term250556;
        args[1] = null;
        try {
            callMethod(klass, "switchNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


