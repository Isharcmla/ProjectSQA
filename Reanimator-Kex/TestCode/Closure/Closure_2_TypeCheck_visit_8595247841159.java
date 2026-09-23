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

public class TypeCheck_visit_8595247841159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332042;
     Object term332134;

    public TypeCheck_visit_8595247841159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332042 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term332134 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term332226 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term332134, term332134.getClass(), "type", 119);
        setField(term332134, term332134.getClass(), "first", term332226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term332134;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term332042, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


