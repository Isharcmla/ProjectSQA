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

public class VarCheck_process_146632422054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16770;
     Object term16920;

    public VarCheck_process_146632422054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16770 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term16850 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term16770, term16770.getClass(), "sanityCheck", false);
        setField(term16770, term16770.getClass(), "compiler", term16850);
        term16920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17080 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term17170 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term16920, term16920.getClass(), "type", 0);
        setField(term16990, term16990.getClass(), "next", term17080);
        setIntField(term16990, term16990.getClass(), "type", 0);
        setField(term16990, term16990.getClass(), "first", term17170);
        setField(term16920, term16920.getClass(), "first", term16990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term16920;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term16770, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


