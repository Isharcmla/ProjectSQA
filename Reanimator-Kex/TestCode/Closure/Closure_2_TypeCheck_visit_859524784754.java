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

public class TypeCheck_visit_859524784754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204181;
     Object term204273;

    public TypeCheck_visit_859524784754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204181 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term204273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204365 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term204561 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term204273, term204273.getClass(), "type", 45);
        setIntField(term204365, term204365.getClass(), "type", 45);
        setField(term204365, term204365.getClass(), "jsType", term204469);
        setField(term204273, term204273.getClass(), "first", term204365);
        setIntField(term204561, term204561.getClass(), "type", 45);
        setField(term204273, term204273.getClass(), "last", term204561);
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
        args[1] = term204273;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term204181, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


