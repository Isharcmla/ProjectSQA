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

public class FlowSensitiveInlineVariables_process_55946046588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27372;
     Object term27522;

    public FlowSensitiveInlineVariables_process_55946046588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27372 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        Object term27452 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27372, term27372.getClass(), "compiler", term27452);
        term27522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27614 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term27684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27776 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term27522, term27522.getClass(), "type", 0);
        setField(term27522, term27522.getClass(), "parent", null);
        setField(term27614, term27614.getClass(), "next", term27684);
        setIntField(term27614, term27614.getClass(), "type", 0);
        setField(term27614, term27614.getClass(), "first", term27776);
        setField(term27522, term27522.getClass(), "first", term27614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term27522;
        callMethod(klass, "process", argTypes, term27372, args);
    }

};


