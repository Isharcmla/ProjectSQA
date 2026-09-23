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

public class ReferenceCollectingCallback_visit_872273174227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54430;
     Object term54522;
     Object term54614;

    public ReferenceCollectingCallback_visit_872273174227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54430 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term54522 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term54522, term54522.getClass(), "type", 101);
        term54614 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term54614, term54614.getClass(), "type", 101);
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
        args[1] = term54522;
        args[2] = term54614;
        try {
            callMethod(klass, "visit", argTypes, term54430, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


