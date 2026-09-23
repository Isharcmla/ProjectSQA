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

public class VarCheck_process_146632422021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4773;
     Object term4843;

    public VarCheck_process_146632422021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4773 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term4773, term4773.getClass(), "sanityCheck", false);
        setField(term4773, term4773.getClass(), "compiler", null);
        term4843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4843, term4843.getClass(), "type", 0);
        setField(term4843, term4843.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term4843;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term4773, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


