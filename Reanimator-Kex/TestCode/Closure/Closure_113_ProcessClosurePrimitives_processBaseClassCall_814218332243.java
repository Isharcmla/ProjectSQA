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

public class ProcessClosurePrimitives_processBaseClassCall_814218332243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70443;
     Object term70535;

    public ProcessClosurePrimitives_processBaseClassCall_814218332243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70443 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term70535 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term70627 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term70719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term70627, term70627.getClass(), "next", term70719);
        setField(term70535, term70535.getClass(), "first", term70627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term70535;
        callMethod(klass, "processBaseClassCall", argTypes, term70443, args);
    }

};


