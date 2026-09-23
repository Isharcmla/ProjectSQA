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

public class TypeInference_traverseAssign_157422923105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55252;
     Object term55322;

    public TypeInference_traverseAssign_157422923105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55252 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term55322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55392, term55392.getClass(), "type", 51);
        setField(term55322, term55322.getClass(), "first", term55392);
        setField(term55322, term55322.getClass(), "last", term55462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term55322;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term55252, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


