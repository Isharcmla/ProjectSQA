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

public class ProcessClosurePrimitives_verifyProvide_1221110133214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61460;
     Object term61630;
     Object term61700;

    public ProcessClosurePrimitives_verifyProvide_1221110133214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61460 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term61540 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term61460, term61460.getClass(), "compiler", term61540);
        term61630 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term61700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61802 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term61700, term61700.getClass(), "type", 0);
        setField(term61700, term61700.getClass(), "propListHead", term61802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term61630;
        args[1] = term61700;
        args[2] = null;
        callMethod(klass, "verifyProvide", argTypes, term61460, args);
    }

};


