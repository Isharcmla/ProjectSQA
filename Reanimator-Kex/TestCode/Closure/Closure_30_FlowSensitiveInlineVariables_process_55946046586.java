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

public class FlowSensitiveInlineVariables_process_55946046586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26227;
     Object term26377;

    public FlowSensitiveInlineVariables_process_55946046586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26227 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        Object term26307 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26227, term26227.getClass(), "compiler", term26307);
        term26377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26377, term26377.getClass(), "type", 0);
        setField(term26377, term26377.getClass(), "parent", null);
        setField(term26517, term26517.getClass(), "next", null);
        setIntField(term26517, term26517.getClass(), "type", 105);
        setField(term26517, term26517.getClass(), "first", term26587);
        setField(term26447, term26447.getClass(), "next", term26517);
        setIntField(term26447, term26447.getClass(), "type", 0);
        setField(term26657, term26657.getClass(), "next", null);
        setIntField(term26657, term26657.getClass(), "type", 0);
        setField(term26657, term26657.getClass(), "first", null);
        setField(term26447, term26447.getClass(), "first", term26657);
        setField(term26377, term26377.getClass(), "first", term26447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term26377;
        callMethod(klass, "process", argTypes, term26227, args);
    }

};


