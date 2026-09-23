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

public class ProcessCommonJSModules_process_627866047177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90143;
     Object term90315;

    public ProcessCommonJSModules_process_627866047177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90143 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term90223 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term90143, term90143.getClass(), "compiler", term90223);
        term90315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90407 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90569 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term90315, term90315.getClass(), "type", 37);
        setField(term90315, term90315.getClass(), "parent", null);
        setField(term90477, term90477.getClass(), "next", null);
        setIntField(term90477, term90477.getClass(), "type", 0);
        setField(term90477, term90477.getClass(), "first", null);
        setField(term90407, term90407.getClass(), "next", term90477);
        setIntField(term90407, term90407.getClass(), "type", 37);
        setField(term90569, term90569.getClass(), "next", null);
        setIntField(term90569, term90569.getClass(), "type", 37);
        setField(term90569, term90569.getClass(), "first", null);
        setField(term90407, term90407.getClass(), "first", term90569);
        setField(term90315, term90315.getClass(), "first", term90407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term90315;
        callMethod(klass, "process", argTypes, term90143, args);
    }

};


