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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term440559;
     Object term440645;
     Object term440731;
     Object term440817;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term440559 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term440645 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term440645, term440645.getClass(), "parent", null);
        setIntField(term440645, term440645.getClass(), "type", 0);
        term440731 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term440731, term440731.getClass(), "type", 0);
        term440817 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term440817, term440817.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term440645;
        args[1] = term440731;
        args[2] = term440817;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term440559, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


