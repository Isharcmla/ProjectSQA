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

public class ProcessClosurePrimitives_processBaseClassCall_814218332108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45215;
     Object term45305;
     Object term45375;

    public ProcessClosurePrimitives_processBaseClassCall_814218332108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45215 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term45305 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term45375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45515, term45515.getClass(), "type", 42);
        setField(term45445, term45445.getClass(), "next", term45515);
        setField(term45375, term45375.getClass(), "first", term45445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term45305;
        args[1] = term45375;
        callMethod(klass, "processBaseClassCall", argTypes, term45215, args);
    }

};


