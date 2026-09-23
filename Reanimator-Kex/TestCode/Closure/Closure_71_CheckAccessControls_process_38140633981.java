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

public class CheckAccessControls_process_38140633981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21841;
     Object term21911;

    public CheckAccessControls_process_38140633981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21841 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term21841, term21841.getClass(), "compiler", null);
        term21911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21911, term21911.getClass(), "type", 0);
        setField(term21981, term21981.getClass(), "next", null);
        setIntField(term21981, term21981.getClass(), "type", 33);
        setField(term21981, term21981.getClass(), "first", null);
        setField(term21911, term21911.getClass(), "first", term21981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term21911;
        try {
            callMethod(klass, "process", argTypes, term21841, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


