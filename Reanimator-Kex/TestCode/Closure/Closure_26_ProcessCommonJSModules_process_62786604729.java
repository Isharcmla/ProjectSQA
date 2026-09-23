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

public class ProcessCommonJSModules_process_62786604729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13878;
     Object term14028;

    public ProcessCommonJSModules_process_62786604729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13878 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term13958 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13878, term13878.getClass(), "compiler", term13958);
        term14028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14028, term14028.getClass(), "type", 0);
        setField(term14028, term14028.getClass(), "parent", null);
        setField(term14098, term14098.getClass(), "next", term14168);
        setIntField(term14098, term14098.getClass(), "type", 0);
        setField(term14238, term14238.getClass(), "next", term14308);
        setIntField(term14238, term14238.getClass(), "type", 33);
        setField(term14238, term14238.getClass(), "first", null);
        setField(term14098, term14098.getClass(), "first", term14238);
        setField(term14028, term14028.getClass(), "first", term14098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14028;
        try {
            callMethod(klass, "process", argTypes, term13878, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


