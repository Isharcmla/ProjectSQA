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

public class FlowSensitiveInlineVariables_process_55946046577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20916;
     Object term20986;

    public FlowSensitiveInlineVariables_process_55946046577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20916 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term20916, term20916.getClass(), "compiler", null);
        term20986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20986, term20986.getClass(), "type", 0);
        setIntField(term21056, term21056.getClass(), "type", 0);
        setField(term21056, term21056.getClass(), "parent", term21126);
        setField(term20986, term20986.getClass(), "parent", term21056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20986;
        callMethod(klass, "process", argTypes, term20916, args);
    }

};


