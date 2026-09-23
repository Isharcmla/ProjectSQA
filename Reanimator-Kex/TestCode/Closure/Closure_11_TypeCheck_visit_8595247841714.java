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

public class TypeCheck_visit_8595247841714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554588;
     Object term554680;

    public TypeCheck_visit_8595247841714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term554588 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term554680 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term554772 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term554864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term554680, term554680.getClass(), "type", 12);
        setField(term554680, term554680.getClass(), "first", term554772);
        setField(term554680, term554680.getClass(), "last", term554864);
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
        args[1] = term554680;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term554588, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


