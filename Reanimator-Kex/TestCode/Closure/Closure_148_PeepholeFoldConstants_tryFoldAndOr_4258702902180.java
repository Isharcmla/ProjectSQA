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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594508;
     Object term594594;
     Object term594680;
     Object term594766;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term594508 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term594594 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term594594, term594594.getClass(), "parent", null);
        setIntField(term594594, term594594.getClass(), "type", 0);
        term594680 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term594680, term594680.getClass(), "type", 63);
        term594766 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term594594;
        args[1] = term594680;
        args[2] = term594766;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term594508, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


