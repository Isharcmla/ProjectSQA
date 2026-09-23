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

public class ProcessClosurePrimitives_processRequireCall_1518508139195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55890;
     Object term55982;

    public ProcessClosurePrimitives_processRequireCall_1518508139195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55890 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term55982 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term55982, term55982.getClass(), "first", term55982);
        setField(term55982, term55982.getClass(), "next", term55982);
        setIntField(term55982, term55982.getClass(), "type", 40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term55982;
        args[2] = null;
        try {
            callMethod(klass, "processRequireCall", argTypes, term55890, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


