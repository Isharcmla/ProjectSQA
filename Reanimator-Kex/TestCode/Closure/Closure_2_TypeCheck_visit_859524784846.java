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

public class TypeCheck_visit_859524784846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230810;
     Object term231006;

    public TypeCheck_visit_859524784846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230810 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term230914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term230810, term230810.getClass(), "typeRegistry", term230914);
        term231006 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term231098 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term231006, term231006.getClass(), "type", 52);
        setField(term231006, term231006.getClass(), "first", null);
        setField(term231098, term231098.getClass(), "jsType", null);
        setField(term231006, term231006.getClass(), "last", term231098);
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
        args[1] = term231006;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term230810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


