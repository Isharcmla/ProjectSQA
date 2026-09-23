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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeExits_1223942745389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149635;
     Object term149705;

    public MinimizeExitPoints_tryMinimizeExits_1223942745389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149635 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term149705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term149705, term149705.getClass(), "type", -5);
        setField(term149705, term149705.getClass(), "first", term149775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term149705;
        args[1] = -5;
        args[2] = "";
        try {
            callMethod(klass, "tryMinimizeExits", argTypes, term149635, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


