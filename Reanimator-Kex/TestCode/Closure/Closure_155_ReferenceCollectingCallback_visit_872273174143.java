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

public class ReferenceCollectingCallback_visit_872273174143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30892;
     Object term30978;
     Object term31064;

    public ReferenceCollectingCallback_visit_872273174143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30892 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term30978 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term30978, term30978.getClass(), "type", 119);
        term31064 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term31064, term31064.getClass(), "type", 119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term30978;
        args[2] = term31064;
        try {
            callMethod(klass, "visit", argTypes, term30892, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


