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

public class TypeCheck_visit_859524784387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106508;
     Object term106600;

    public TypeCheck_visit_859524784387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106508 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term106600 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term106692 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term106600, term106600.getClass(), "type", 46);
        setField(term106600, term106600.getClass(), "first", term106692);
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
        args[1] = term106600;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term106508, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


