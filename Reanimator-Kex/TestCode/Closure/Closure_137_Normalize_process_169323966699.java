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

public class Normalize_process_169323966699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2006281;
     Object term2006351;

    public Normalize_process_169323966699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2006281 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2006281, term2006281.getClass(), "compiler", null);
        setBooleanField(term2006281, term2006281.getClass(), "assertOnChange", false);
        term2006351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2006351, term2006351.getClass(), "type", 126);
        setIntField(term2006443, term2006443.getClass(), "type", 116);
        setField(term2006351, term2006351.getClass(), "last", term2006443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2006351;
        try {
            callMethod(klass, "process", argTypes, term2006281, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


