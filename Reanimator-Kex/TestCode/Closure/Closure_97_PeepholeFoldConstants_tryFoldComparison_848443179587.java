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

public class PeepholeFoldConstants_tryFoldComparison_848443179587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153999;
     Object term154091;
     Object term154183;

    public PeepholeFoldConstants_tryFoldComparison_848443179587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153999 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term154091 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term154091, term154091.getClass(), "type", 14);
        term154183 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term154183, term154183.getClass(), "type", 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term154091;
        args[1] = term154183;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldComparison", argTypes, term153999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


