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

public class FlowSensitiveInlineVariables_process_559460465100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32679;
     Object term32771;

    public FlowSensitiveInlineVariables_process_559460465100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32679 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term32679, term32679.getClass(), "compiler", null);
        term32771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term32841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32771, term32771.getClass(), "type", 0);
        setIntField(term32841, term32841.getClass(), "type", 0);
        setField(term32841, term32841.getClass(), "parent", null);
        setField(term32771, term32771.getClass(), "parent", term32841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term32771;
        callMethod(klass, "process", argTypes, term32679, args);
    }

};


