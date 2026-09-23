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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609089;
     Object term609175;
     Object term609331;
     Object term609417;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term609089 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term609175 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term609245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term609245, term609245.getClass(), "type", 108);
        setField(term609175, term609175.getClass(), "parent", term609245);
        setIntField(term609175, term609175.getClass(), "type", 0);
        term609331 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term609331, term609331.getClass(), "type", 94);
        term609417 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term609417, term609417.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term609175;
        args[1] = term609331;
        args[2] = term609417;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term609089, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


