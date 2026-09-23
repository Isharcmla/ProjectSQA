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

public class FlowSensitiveInlineVariables_process_55946046593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29736;
     Object term29828;

    public FlowSensitiveInlineVariables_process_55946046593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29736 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term29736, term29736.getClass(), "compiler", null);
        term29828 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term29920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term29828, term29828.getClass(), "type", -133);
        setField(term29828, term29828.getClass(), "parent", term29920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29828;
        callMethod(klass, "process", argTypes, term29736, args);
    }

};


