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

public class TypeCheck_visit_859524784939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261943;
     Object term262035;

    public TypeCheck_visit_859524784939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261943 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term262035 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term262127 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term262225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        Object term262317 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term262035, term262035.getClass(), "type", 45);
        setIntField(term262127, term262127.getClass(), "type", 369387648);
        setField(term262127, term262127.getClass(), "jsType", term262225);
        setField(term262035, term262035.getClass(), "first", term262127);
        setIntField(term262317, term262317.getClass(), "type", 536876655);
        setField(term262317, term262317.getClass(), "jsType", term262225);
        setField(term262035, term262035.getClass(), "last", term262317);
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
        args[1] = term262035;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term261943, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


