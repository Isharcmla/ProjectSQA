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
import java.lang.Object;

public class ProcessClosurePrimitives_process_1779090349115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47422;
     Object term47572;

    public ProcessClosurePrimitives_process_1779090349115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47422 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term47502 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term47422, term47422.getClass(), "compiler", term47502);
        term47572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47572, term47572.getClass(), "type", 86);
        setField(term47642, term47642.getClass(), "next", null);
        setIntField(term47642, term47642.getClass(), "type", 0);
        setField(term47642, term47642.getClass(), "first", null);
        setField(term47572, term47572.getClass(), "first", term47642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term47572;
        callMethod(klass, "process", argTypes, term47422, args);
    }

};


