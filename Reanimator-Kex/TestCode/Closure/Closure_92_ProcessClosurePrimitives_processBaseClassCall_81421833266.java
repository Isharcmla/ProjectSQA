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

public class ProcessClosurePrimitives_processBaseClassCall_81421833266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30364;
     Object term30434;

    public ProcessClosurePrimitives_processBaseClassCall_81421833266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30364 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term30434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term30434, term30434.getClass(), "first", term30434);
        setField(term30434, term30434.getClass(), "next", term30434);
        setIntField(term30434, term30434.getClass(), "type", 42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term30434;
        try {
            callMethod(klass, "processBaseClassCall", argTypes, term30364, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


