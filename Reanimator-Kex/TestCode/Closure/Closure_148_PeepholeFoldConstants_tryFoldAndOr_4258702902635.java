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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldAndOr_4258702902635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term750869;
     Object term750955;
     Object term751139;
     Object term751231;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term750869 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term750955 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term751047 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term751047, term751047.getClass(), "type", 108);
        setField(term750955, term750955.getClass(), "parent", term751047);
        setIntField(term750955, term750955.getClass(), "type", 100);
        term751139 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term751139, term751139.getClass(), "type", 97);
        term751231 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term751231, term751231.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term750955;
        args[1] = term751139;
        args[2] = term751231;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term750869, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


