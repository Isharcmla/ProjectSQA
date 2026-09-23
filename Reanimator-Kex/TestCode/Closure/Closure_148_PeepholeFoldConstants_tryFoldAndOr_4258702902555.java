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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722757;
     Object term722849;
     Object term722941;
     Object term723033;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term722757 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term722849 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term722849, term722849.getClass(), "parent", null);
        setIntField(term722849, term722849.getClass(), "type", 0);
        term722941 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term722941, term722941.getClass(), "type", 0);
        term723033 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term723033, term723033.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term722849;
        args[1] = term722941;
        args[2] = term723033;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term722757, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


