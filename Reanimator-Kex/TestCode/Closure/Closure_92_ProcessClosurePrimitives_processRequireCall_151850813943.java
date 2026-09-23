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

public class ProcessClosurePrimitives_processRequireCall_151850813943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21957;
     Object term22127;
     Object term22235;

    public ProcessClosurePrimitives_processRequireCall_151850813943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21957 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term22037 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term21957, term21957.getClass(), "compiler", term22037);
        term22127 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term22127, term22127.getClass(), "sourceName", "");
        term22235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22305, term22305.getClass(), "next", null);
        setIntField(term22305, term22305.getClass(), "type", 0);
        setIntField(term22305, term22305.getClass(), "sourcePosition", 0);
        setField(term22235, term22235.getClass(), "first", term22305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term22127;
        args[1] = term22235;
        args[2] = null;
        try {
            callMethod(klass, "processRequireCall", argTypes, term21957, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


