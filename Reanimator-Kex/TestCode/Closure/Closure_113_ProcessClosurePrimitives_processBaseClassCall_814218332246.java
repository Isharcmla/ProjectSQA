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

public class ProcessClosurePrimitives_processBaseClassCall_814218332246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71796;
     Object term71966;
     Object term72036;

    public ProcessClosurePrimitives_processBaseClassCall_814218332246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71796 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term71876 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term71796, term71796.getClass(), "compiler", term71876);
        term71966 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term72036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72176, term72176.getClass(), "type", -43);
        setField(term72106, term72106.getClass(), "next", term72176);
        setField(term72036, term72036.getClass(), "first", term72106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term71966;
        args[1] = term72036;
        callMethod(klass, "processBaseClassCall", argTypes, term71796, args);
    }

};


