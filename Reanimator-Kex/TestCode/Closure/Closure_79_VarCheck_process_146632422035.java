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

public class VarCheck_process_146632422035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10105;
     Object term10175;

    public VarCheck_process_146632422035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10105 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term10105, term10105.getClass(), "sanityCheck", false);
        setField(term10105, term10105.getClass(), "compiler", null);
        term10175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10175, term10175.getClass(), "type", 0);
        setField(term10245, term10245.getClass(), "next", term10315);
        setIntField(term10245, term10245.getClass(), "type", 0);
        setField(term10245, term10245.getClass(), "first", null);
        setField(term10175, term10175.getClass(), "first", term10245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term10175;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term10105, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


