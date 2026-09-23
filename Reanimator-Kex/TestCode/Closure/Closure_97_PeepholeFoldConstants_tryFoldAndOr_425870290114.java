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

public class PeepholeFoldConstants_tryFoldAndOr_425870290114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21375;
     Object term21461;
     Object term21547;

    public PeepholeFoldConstants_tryFoldAndOr_425870290114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21375 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term21461 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term21461, term21461.getClass(), "parent", null);
        setIntField(term21461, term21461.getClass(), "type", 0);
        term21547 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term21461;
        args[1] = term21547;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term21375, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


