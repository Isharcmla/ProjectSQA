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

public class ProcessClosurePrimitives_verifyProvide_122111013396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41036;
     Object term41206;
     Object term41314;
     Object term41384;

    public ProcessClosurePrimitives_verifyProvide_122111013396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41036 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term41116 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term41036, term41036.getClass(), "compiler", term41116);
        term41206 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term41206, term41206.getClass(), "sourceName", "");
        term41314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41314, term41314.getClass(), "type", 0);
        setIntField(term41314, term41314.getClass(), "sourcePosition", 0);
        term41384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41384, term41384.getClass(), "type", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term41206;
        args[1] = term41314;
        args[2] = term41384;
        callMethod(klass, "verifyProvide", argTypes, term41036, args);
    }

};


