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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_visit_8722731741286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390107;
     Object term390197;
     Object term390337;

    public ReferenceCollectingCallback_visit_8722731741286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390107 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque term390251 = new ArrayDeque();
        term390197 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term390197, term390197.getClass(), "scopes", term390251);
        term390337 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term390337, term390337.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term390197;
        args[1] = term390337;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term390107, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


