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

public class TypeCheck_visit_8595247841052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300680;
     Object term300772;

    public TypeCheck_visit_8595247841052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300680 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term300772 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term300864 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term300956 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term300772, term300772.getClass(), "type", 12);
        setField(term300772, term300772.getClass(), "first", term300864);
        setField(term300772, term300772.getClass(), "last", term300956);
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
        args[1] = term300772;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term300680, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


