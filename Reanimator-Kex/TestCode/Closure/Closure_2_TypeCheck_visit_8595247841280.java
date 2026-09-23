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

public class TypeCheck_visit_8595247841280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384315;
     Object term384385;

    public TypeCheck_visit_8595247841280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384315 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term384385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term384385, term384385.getClass(), "type", 25);
        setField(term384455, term384455.getClass(), "jsType", term384569);
        setField(term384385, term384385.getClass(), "first", term384455);
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
        args[1] = term384385;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term384315, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


