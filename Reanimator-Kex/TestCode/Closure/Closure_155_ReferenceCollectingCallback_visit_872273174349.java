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

public class ReferenceCollectingCallback_visit_872273174349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80867;
     Object term80953;
     Object term81045;

    public ReferenceCollectingCallback_visit_872273174349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80867 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term80953 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term80953, term80953.getClass(), "type", 0);
        term81045 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term81045, term81045.getClass(), "type", 114);
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
        args[1] = term80953;
        args[2] = term81045;
        try {
            callMethod(klass, "visit", argTypes, term80867, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


