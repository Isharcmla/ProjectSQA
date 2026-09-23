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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324598;
     Object term324690;
     Object term324776;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324598 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term324690 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term324690, term324690.getClass(), "parent", null);
        setIntField(term324690, term324690.getClass(), "type", 0);
        term324776 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term324690;
        args[1] = term324776;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term324598, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


