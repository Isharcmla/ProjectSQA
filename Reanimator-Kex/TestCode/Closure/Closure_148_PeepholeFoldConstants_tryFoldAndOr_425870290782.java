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

public class PeepholeFoldConstants_tryFoldAndOr_425870290782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176430;
     Object term176522;
     Object term176614;

    public PeepholeFoldConstants_tryFoldAndOr_425870290782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176430 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term176522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term176522, term176522.getClass(), "parent", null);
        setIntField(term176522, term176522.getClass(), "type", 0);
        term176614 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term176522;
        args[1] = term176614;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term176430, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


