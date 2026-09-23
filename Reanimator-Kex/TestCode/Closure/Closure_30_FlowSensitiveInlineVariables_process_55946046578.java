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

public class FlowSensitiveInlineVariables_process_55946046578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21488;
     Object term21638;

    public FlowSensitiveInlineVariables_process_55946046578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21488 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        Object term21568 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term21488, term21488.getClass(), "compiler", term21568);
        term21638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21638, term21638.getClass(), "type", 0);
        setField(term21638, term21638.getClass(), "parent", null);
        setField(term21708, term21708.getClass(), "next", term21778);
        setIntField(term21708, term21708.getClass(), "type", 0);
        setField(term21848, term21848.getClass(), "next", null);
        setIntField(term21848, term21848.getClass(), "type", 132);
        setField(term21708, term21708.getClass(), "first", term21848);
        setField(term21638, term21638.getClass(), "first", term21708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term21638;
        callMethod(klass, "process", argTypes, term21488, args);
    }

};


