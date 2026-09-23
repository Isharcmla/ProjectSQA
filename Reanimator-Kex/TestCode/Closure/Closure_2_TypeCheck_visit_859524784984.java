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

public class TypeCheck_visit_859524784984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279496;
     Object term279670;

    public TypeCheck_visit_859524784984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279496 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term279600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term279496, term279496.getClass(), "typeRegistry", term279600);
        term279670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term279670, term279670.getClass(), "type", 92);
        setIntField(term279740, term279740.getClass(), "type", 0);
        setField(term279740, term279740.getClass(), "jsType", null);
        setField(term279670, term279670.getClass(), "first", term279740);
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
        args[1] = term279670;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term279496, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


