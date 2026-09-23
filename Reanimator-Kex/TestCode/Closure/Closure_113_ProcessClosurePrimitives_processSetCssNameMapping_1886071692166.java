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

public class ProcessClosurePrimitives_processSetCssNameMapping_1886071692166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47412;
     Object term47582;
     Object term47652;

    public ProcessClosurePrimitives_processSetCssNameMapping_1886071692166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47412 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term47492 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term47412, term47412.getClass(), "compiler", term47492);
        term47582 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term47652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47722, term47722.getClass(), "next", null);
        setIntField(term47722, term47722.getClass(), "type", 0);
        setField(term47652, term47652.getClass(), "first", term47722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term47582;
        args[1] = term47652;
        args[2] = null;
        try {
            callMethod(klass, "processSetCssNameMapping", argTypes, term47412, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


