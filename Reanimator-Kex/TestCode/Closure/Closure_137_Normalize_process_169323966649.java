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

public class Normalize_process_169323966649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1192839;
     Object term1192909;

    public Normalize_process_169323966649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1192839 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term1192839, term1192839.getClass(), "compiler", null);
        setBooleanField(term1192839, term1192839.getClass(), "assertOnChange", false);
        term1192909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1193001 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term1192909, term1192909.getClass(), "type", 126);
        setField(term1192909, term1192909.getClass(), "last", term1193001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1192909;
        try {
            callMethod(klass, "process", argTypes, term1192839, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


