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
import java.lang.Object;

public class ProcessClosurePrimitives_processRequireCall_1518508139162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45974;
     Object term46144;
     Object term46214;

    public ProcessClosurePrimitives_processRequireCall_1518508139162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45974 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term46054 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term45974, term45974.getClass(), "compiler", term46054);
        term46144 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term46214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46284, term46284.getClass(), "next", null);
        setIntField(term46284, term46284.getClass(), "type", 0);
        setField(term46214, term46214.getClass(), "first", term46284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term46144;
        args[1] = term46214;
        args[2] = null;
        try {
            callMethod(klass, "processRequireCall", argTypes, term45974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


