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

public class ProcessClosurePrimitives_processDefineCall_229233239261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76563;
     Object term76733;
     Object term76803;

    public ProcessClosurePrimitives_processDefineCall_229233239261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76563 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term76643 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term76563, term76563.getClass(), "compiler", term76643);
        term76733 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term76803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76873, term76873.getClass(), "next", null);
        setIntField(term76873, term76873.getClass(), "type", 0);
        setField(term76803, term76803.getClass(), "first", term76873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term76733;
        args[1] = term76803;
        args[2] = null;
        callMethod(klass, "processDefineCall", argTypes, term76563, args);
    }

};


