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

public class ReferenceCollectingCallback_visit_872273174278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56317;
     Object term56409;
     Object term56501;

    public ReferenceCollectingCallback_visit_872273174278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56317 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term56409 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term56409, term56409.getClass(), "type", 100);
        term56501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term56501, term56501.getClass(), "type", 100);
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
        args[1] = term56409;
        args[2] = term56501;
        try {
            callMethod(klass, "visit", argTypes, term56317, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


