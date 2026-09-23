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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221110;
     Object term221202;

    public ProcessCommonJSModules_process_627866047410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221110 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term221110, term221110.getClass(), "compiler", null);
        term221202 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term221294 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term221386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term221202, term221202.getClass(), "type", 0);
        setField(term221202, term221202.getClass(), "parent", null);
        setField(term221386, term221386.getClass(), "next", null);
        setIntField(term221386, term221386.getClass(), "type", 132);
        setField(term221294, term221294.getClass(), "next", term221386);
        setIntField(term221294, term221294.getClass(), "type", 0);
        setField(term221294, term221294.getClass(), "first", null);
        setField(term221202, term221202.getClass(), "first", term221294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term221202;
        try {
            callMethod(klass, "process", argTypes, term221110, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


