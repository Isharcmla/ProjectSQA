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

public class CheckAccessControls_hotSwapScript_739486180267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79750;
     Object term79820;

    public CheckAccessControls_hotSwapScript_739486180267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79750 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term79750, term79750.getClass(), "compiler", null);
        term79820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79820, term79820.getClass(), "type", 38);
        setField(term79890, term79890.getClass(), "next", null);
        setIntField(term79890, term79890.getClass(), "type", 30);
        setField(term79890, term79890.getClass(), "first", null);
        setField(term79890, term79890.getClass(), "jsType", null);
        setField(term79820, term79820.getClass(), "first", term79890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term79820;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term79750, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


