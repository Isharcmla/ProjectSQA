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

public class TypeCheck_visit_859524784654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167242;
     Object term167312;

    public TypeCheck_visit_859524784654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167242 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term167312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term167382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term167478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term167312, term167312.getClass(), "type", 11);
        setField(term167382, term167382.getClass(), "jsType", term167478);
        setField(term167312, term167312.getClass(), "first", term167382);
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
        args[1] = term167312;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term167242, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


