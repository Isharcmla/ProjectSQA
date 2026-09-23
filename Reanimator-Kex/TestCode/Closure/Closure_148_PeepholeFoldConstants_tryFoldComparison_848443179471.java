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

public class PeepholeFoldConstants_tryFoldComparison_848443179471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97054;
     Object term97146;
     Object term97238;

    public PeepholeFoldConstants_tryFoldComparison_848443179471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97054 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term97146 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term97146, term97146.getClass(), "type", 16);
        term97238 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term97238, term97238.getClass(), "type", 16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term97146;
        args[1] = term97238;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldComparison", argTypes, term97054, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


