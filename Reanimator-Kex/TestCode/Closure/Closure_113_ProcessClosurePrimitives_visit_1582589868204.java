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

public class ProcessClosurePrimitives_visit_1582589868204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57526;
     Object term57616;
     Object term57686;

    public ProcessClosurePrimitives_visit_1582589868204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57526 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term57616 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term57686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57686, term57686.getClass(), "type", 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term57616;
        args[1] = term57686;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term57526, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


