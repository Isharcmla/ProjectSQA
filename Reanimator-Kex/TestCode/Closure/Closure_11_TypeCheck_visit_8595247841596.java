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

public class TypeCheck_visit_8595247841596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504514;
     Object term504606;

    public TypeCheck_visit_8595247841596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term504514 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term504606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term504698 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term504798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term504890 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term504606, term504606.getClass(), "type", 12);
        setIntField(term504698, term504698.getClass(), "type", 369387648);
        setField(term504698, term504698.getClass(), "jsType", term504798);
        setField(term504606, term504606.getClass(), "first", term504698);
        setIntField(term504890, term504890.getClass(), "type", 536876655);
        setField(term504890, term504890.getClass(), "jsType", term504798);
        setField(term504606, term504606.getClass(), "last", term504890);
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
        args[1] = term504606;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term504514, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


