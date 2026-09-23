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

public class Normalize_process_1693239666117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2211947;
     Object term2212037;

    public Normalize_process_1693239666117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2211947 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2211947, term2211947.getClass(), "compiler", null);
        setBooleanField(term2211947, term2211947.getClass(), "assertOnChange", false);
        term2212037 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term2212129 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2212037, term2212037.getClass(), "type", 126);
        setField(term2212037, term2212037.getClass(), "last", term2212129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2212037;
        try {
            callMethod(klass, "process", argTypes, term2211947, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


