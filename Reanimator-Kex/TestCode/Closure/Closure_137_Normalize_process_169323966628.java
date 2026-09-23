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

public class Normalize_process_169323966628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term790082;
     Object term790152;

    public Normalize_process_169323966628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term790082 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term790082, term790082.getClass(), "compiler", null);
        setBooleanField(term790082, term790082.getClass(), "assertOnChange", false);
        term790152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term790222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term790152, term790152.getClass(), "type", 105);
        setField(term790152, term790152.getClass(), "last", term790222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term790152;
        try {
            callMethod(klass, "process", argTypes, term790082, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


