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

public class ProcessClosurePrimitives_handleTypedefDefinition_388552868213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60888;
     Object term60978;
     Object term61048;

    public ProcessClosurePrimitives_handleTypedefDefinition_388552868213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60888 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term60978 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term61048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61048, term61048.getClass(), "first", term61048);
        setField(term61048, term61048.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term60978;
        args[1] = term61048;
        try {
            callMethod(klass, "handleTypedefDefinition", argTypes, term60888, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


