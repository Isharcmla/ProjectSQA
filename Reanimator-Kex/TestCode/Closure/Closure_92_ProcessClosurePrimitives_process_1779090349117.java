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

public class ProcessClosurePrimitives_process_1779090349117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48003;
     Object term48153;

    public ProcessClosurePrimitives_process_1779090349117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48003 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term48083 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term48003, term48003.getClass(), "compiler", term48083);
        term48153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48153, term48153.getClass(), "type", 0);
        setField(term48223, term48223.getClass(), "next", term48293);
        setIntField(term48223, term48223.getClass(), "type", 30);
        setField(term48223, term48223.getClass(), "first", null);
        setField(term48153, term48153.getClass(), "first", term48223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term48153;
        callMethod(klass, "process", argTypes, term48003, args);
    }

};


