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

public class ProcessClosurePrimitives_processSetCssNameMapping_1886071692260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76001;
     Object term76171;
     Object term76241;

    public ProcessClosurePrimitives_processSetCssNameMapping_1886071692260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76001 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term76081 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term76001, term76001.getClass(), "compiler", term76081);
        term76171 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term76241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76413 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term76311, term76311.getClass(), "next", null);
        setIntField(term76311, term76311.getClass(), "type", 0);
        setField(term76311, term76311.getClass(), "propListHead", term76413);
        setField(term76241, term76241.getClass(), "first", term76311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term76171;
        args[1] = term76241;
        args[2] = null;
        callMethod(klass, "processSetCssNameMapping", argTypes, term76001, args);
    }

};


