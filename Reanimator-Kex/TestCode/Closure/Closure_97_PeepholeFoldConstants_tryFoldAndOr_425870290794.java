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

public class PeepholeFoldConstants_tryFoldAndOr_425870290794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229094;
     Object term229186;
     Object term229272;

    public PeepholeFoldConstants_tryFoldAndOr_425870290794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229094 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term229186 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term229186, term229186.getClass(), "parent", null);
        setIntField(term229186, term229186.getClass(), "type", 0);
        term229272 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term229186;
        args[1] = term229272;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term229094, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


