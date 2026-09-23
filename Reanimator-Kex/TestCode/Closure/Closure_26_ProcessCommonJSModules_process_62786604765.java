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

public class ProcessCommonJSModules_process_62786604765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34477;
     Object term34627;

    public ProcessCommonJSModules_process_62786604765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34477 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term34557 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term34477, term34477.getClass(), "compiler", term34557);
        term34627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34627, term34627.getClass(), "type", 0);
        setField(term34627, term34627.getClass(), "parent", null);
        setField(term34697, term34697.getClass(), "next", null);
        setIntField(term34697, term34697.getClass(), "type", 0);
        setField(term34837, term34837.getClass(), "next", term34907);
        setIntField(term34837, term34837.getClass(), "type", 33);
        setField(term34837, term34837.getClass(), "first", null);
        setField(term34767, term34767.getClass(), "next", term34837);
        setIntField(term34767, term34767.getClass(), "type", 0);
        setField(term34767, term34767.getClass(), "first", null);
        setField(term34697, term34697.getClass(), "first", term34767);
        setField(term34627, term34627.getClass(), "first", term34697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34627;
        try {
            callMethod(klass, "process", argTypes, term34477, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


