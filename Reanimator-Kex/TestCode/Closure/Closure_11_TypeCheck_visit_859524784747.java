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

public class TypeCheck_visit_859524784747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189394;
     Object term189486;

    public TypeCheck_visit_859524784747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189394 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term189394, term189394.getClass(), "validator", null);
        term189486 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term189578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term189486, term189486.getClass(), "type", 28);
        setField(term189486, term189486.getClass(), "first", term189578);
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
        args[1] = term189486;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term189394, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


