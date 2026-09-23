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

public class CheckSideEffects_process_152266774640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17386;
     Object term17536;

    public CheckSideEffects_process_152266774640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17386 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term17466 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17386, term17386.getClass(), "compiler", term17466);
        setBooleanField(term17386, term17386.getClass(), "protectSideEffectFreeCode", true);
        term17536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17536, term17536.getClass(), "type", 0);
        setField(term17536, term17536.getClass(), "parent", null);
        setField(term17606, term17606.getClass(), "next", null);
        setIntField(term17606, term17606.getClass(), "type", 0);
        setField(term17606, term17606.getClass(), "first", null);
        setField(term17536, term17536.getClass(), "first", term17606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17536;
        try {
            callMethod(klass, "process", argTypes, term17386, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


