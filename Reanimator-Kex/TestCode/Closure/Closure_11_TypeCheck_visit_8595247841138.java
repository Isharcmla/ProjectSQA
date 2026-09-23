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

public class TypeCheck_visit_8595247841138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330011;
     Object term330207;

    public TypeCheck_visit_8595247841138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330011 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term330115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term330011, term330011.getClass(), "typeRegistry", term330115);
        term330207 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term330299 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term330207, term330207.getClass(), "type", 85);
        setField(term330299, term330299.getClass(), "jsType", null);
        setField(term330207, term330207.getClass(), "last", term330299);
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
        args[1] = term330207;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term330011, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


