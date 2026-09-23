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

public class ProcessClosurePrimitives_process_1779090349120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48935;
     Object term49085;

    public ProcessClosurePrimitives_process_1779090349120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48935 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term49015 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term48935, term48935.getClass(), "compiler", term49015);
        term49085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49085, term49085.getClass(), "type", 130);
        setField(term49155, term49155.getClass(), "next", term49225);
        setIntField(term49155, term49155.getClass(), "type", 37);
        setField(term49155, term49155.getClass(), "first", null);
        setField(term49085, term49085.getClass(), "first", term49155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term49085;
        callMethod(klass, "process", argTypes, term48935, args);
    }

};


