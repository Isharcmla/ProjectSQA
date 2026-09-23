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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447947;
     Object term448033;
     Object term448189;
     Object term448275;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term447947 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term448033 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term448103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term448103, term448103.getClass(), "type", 108);
        setField(term448033, term448033.getClass(), "parent", term448103);
        setIntField(term448033, term448033.getClass(), "type", 0);
        term448189 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term448189, term448189.getClass(), "type", 96);
        term448275 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term448275, term448275.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term448033;
        args[1] = term448189;
        args[2] = term448275;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term447947, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


