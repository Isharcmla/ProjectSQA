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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_62786604779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42332;
     Object term42482;

    public ProcessCommonJSModules_process_62786604779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42332 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term42412 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term42332, term42332.getClass(), "compiler", term42412);
        term42482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42574 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term42644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42482, term42482.getClass(), "type", 0);
        setField(term42482, term42482.getClass(), "parent", null);
        setField(term42574, term42574.getClass(), "next", term42574);
        setIntField(term42574, term42574.getClass(), "type", 0);
        setField(term42644, term42644.getClass(), "next", term42714);
        setIntField(term42644, term42644.getClass(), "type", 33);
        setField(term42644, term42644.getClass(), "first", null);
        setField(term42574, term42574.getClass(), "first", term42644);
        setField(term42482, term42482.getClass(), "first", term42574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term42482;
        try {
            callMethod(klass, "process", argTypes, term42332, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


