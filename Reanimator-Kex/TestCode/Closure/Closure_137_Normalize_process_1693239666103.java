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

public class Normalize_process_1693239666103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2008358;
     Object term2008444;

    public Normalize_process_1693239666103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2008358 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2008358, term2008358.getClass(), "compiler", null);
        setBooleanField(term2008358, term2008358.getClass(), "assertOnChange", false);
        term2008444 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2008536 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2008444, term2008444.getClass(), "type", 126);
        setField(term2008444, term2008444.getClass(), "last", term2008536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2008444;
        try {
            callMethod(klass, "process", argTypes, term2008358, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


