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

public class CheckAccessControls_process_381406339170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46273;
     Object term46343;

    public CheckAccessControls_process_381406339170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46273 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term46273, term46273.getClass(), "compiler", null);
        term46343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46343, term46343.getClass(), "type", 0);
        setField(term46413, term46413.getClass(), "next", null);
        setIntField(term46413, term46413.getClass(), "type", 38);
        setField(term46413, term46413.getClass(), "first", null);
        setField(term46343, term46343.getClass(), "first", term46413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term46343;
        try {
            callMethod(klass, "process", argTypes, term46273, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


