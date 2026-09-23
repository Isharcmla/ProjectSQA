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

public class TypeCheck_visit_8595247841118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322612;
     Object term322704;

    public TypeCheck_visit_8595247841118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322612 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term322704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term322796 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term322888 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term322704, term322704.getClass(), "type", 12);
        setIntField(term322796, term322796.getClass(), "type", 12);
        setField(term322704, term322704.getClass(), "first", term322796);
        setField(term322704, term322704.getClass(), "last", term322888);
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
        args[1] = term322704;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term322612, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


