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

public class ProcessCommonJSModules_process_627866047228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117451;
     Object term117521;

    public ProcessCommonJSModules_process_627866047228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117451 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term117451, term117451.getClass(), "compiler", null);
        term117521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term117521, term117521.getClass(), "type", 0);
        setField(term117521, term117521.getClass(), "parent", null);
        setField(term117731, term117731.getClass(), "next", term117801);
        setIntField(term117731, term117731.getClass(), "type", 37);
        setField(term117731, term117731.getClass(), "first", null);
        setField(term117661, term117661.getClass(), "next", term117731);
        setIntField(term117661, term117661.getClass(), "type", 37);
        setField(term117661, term117661.getClass(), "first", null);
        setField(term117591, term117591.getClass(), "next", term117661);
        setIntField(term117591, term117591.getClass(), "type", 0);
        setField(term117941, term117941.getClass(), "next", null);
        setIntField(term117941, term117941.getClass(), "type", 0);
        setField(term117941, term117941.getClass(), "first", null);
        setField(term117871, term117871.getClass(), "next", term117941);
        setIntField(term117871, term117871.getClass(), "type", 37);
        setField(term117871, term117871.getClass(), "first", null);
        setField(term117591, term117591.getClass(), "first", term117871);
        setField(term117521, term117521.getClass(), "first", term117591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term117521;
        callMethod(klass, "process", argTypes, term117451, args);
    }

};


