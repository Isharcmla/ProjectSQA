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

public class PeepholeFoldConstants_tryFoldComparison_848443179348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80328;
     Object term80420;
     Object term80512;

    public PeepholeFoldConstants_tryFoldComparison_848443179348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80328 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term80420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term80420, term80420.getClass(), "type", 14);
        term80512 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term80512, term80512.getClass(), "type", 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term80420;
        args[1] = term80512;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldComparison", argTypes, term80328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


