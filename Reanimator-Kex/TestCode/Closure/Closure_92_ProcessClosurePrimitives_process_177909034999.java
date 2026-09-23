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

public class ProcessClosurePrimitives_process_177909034999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42010;
     Object term42160;

    public ProcessClosurePrimitives_process_177909034999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42010 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term42090 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term42010, term42010.getClass(), "compiler", term42090);
        term42160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42160, term42160.getClass(), "type", 0);
        setField(term42230, term42230.getClass(), "next", term42300);
        setIntField(term42230, term42230.getClass(), "type", 33);
        setField(term42230, term42230.getClass(), "first", null);
        setField(term42160, term42160.getClass(), "first", term42230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term42160;
        callMethod(klass, "process", argTypes, term42010, args);
    }

};


