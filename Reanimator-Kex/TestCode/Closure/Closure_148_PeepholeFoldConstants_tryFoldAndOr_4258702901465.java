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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362690;
     Object term362776;
     Object term362866;
     Object term362952;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term362690 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term362776 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term362776, term362776.getClass(), "parent", null);
        setIntField(term362776, term362776.getClass(), "type", 0);
        term362866 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term362866, term362866.getClass(), "type", 0);
        term362952 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term362952, term362952.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term362776;
        args[1] = term362866;
        args[2] = term362952;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term362690, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


