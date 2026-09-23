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

public class TypeCheck_visit_8595247841470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472428;
     Object term472520;

    public TypeCheck_visit_8595247841470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term472428 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term472520 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term472612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term472520, term472520.getClass(), "type", 87);
        setField(term472520, term472520.getClass(), "first", term472612);
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
        args[1] = term472520;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term472428, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


