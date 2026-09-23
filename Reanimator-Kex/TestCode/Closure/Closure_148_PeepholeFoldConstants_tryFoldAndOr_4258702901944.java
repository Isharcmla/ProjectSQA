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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldAndOr_4258702901944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517330;
     Object term517422;
     Object term517584;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term517330 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term517422 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term517422, term517422.getClass(), "parent", null);
        setIntField(term517422, term517422.getClass(), "type", 100);
        setField(term517422, term517422.getClass(), "first", term517492);
        term517584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term517584, term517584.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term517422;
        args[1] = term517584;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term517330, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


