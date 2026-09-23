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

public class TypeCheck_visit_8595247841627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547391;
     Object term547483;

    public TypeCheck_visit_8595247841627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547391 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term547483 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term547575 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term547687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term547483, term547483.getClass(), "type", 37);
        setField(term547575, term547575.getClass(), "jsType", term547687);
        setField(term547483, term547483.getClass(), "first", term547575);
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
        args[1] = term547483;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term547391, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


