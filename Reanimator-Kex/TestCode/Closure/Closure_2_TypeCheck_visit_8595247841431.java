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

public class TypeCheck_visit_8595247841431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453571;
     Object term453663;
     Object term453755;

    public TypeCheck_visit_8595247841431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453571 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term453663 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term453663, term453663.getClass(), "type", 111);
        term453755 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term453825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term453755, term453755.getClass(), "first", term453825);
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
        args[1] = term453663;
        args[2] = term453755;
        try {
            callMethod(klass, "visit", argTypes, term453571, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


