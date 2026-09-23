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

public class ProcessClosurePrimitives_processBaseClassCall_81421833272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32344;
     Object term32514;
     Object term32584;

    public ProcessClosurePrimitives_processBaseClassCall_81421833272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32344 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term32424 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term32344, term32344.getClass(), "compiler", term32424);
        term32514 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term32514, term32514.getClass(), "sourceName", null);
        term32584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32584, term32584.getClass(), "first", term32584);
        setField(term32584, term32584.getClass(), "next", null);
        setIntField(term32584, term32584.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term32514;
        args[1] = term32584;
        try {
            callMethod(klass, "processBaseClassCall", argTypes, term32344, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


