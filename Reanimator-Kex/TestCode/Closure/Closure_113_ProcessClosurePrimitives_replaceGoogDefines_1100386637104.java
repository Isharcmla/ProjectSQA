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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProcessClosurePrimitives_replaceGoogDefines_1100386637104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29880;
     Object term29950;

    public ProcessClosurePrimitives_replaceGoogDefines_1100386637104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29880 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term29950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term29950, term29950.getClass(), "parent", term29950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29950;
        try {
            callMethod(klass, "replaceGoogDefines", argTypes, term29880, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


