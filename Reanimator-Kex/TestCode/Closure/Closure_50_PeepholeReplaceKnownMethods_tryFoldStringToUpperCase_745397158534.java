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

public class PeepholeReplaceKnownMethods_tryFoldStringToUpperCase_745397158534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3507087;
     Object term3507157;
     Object term3507341;

    public PeepholeReplaceKnownMethods_tryFoldStringToUpperCase_745397158534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3507087 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3507157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3507249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3507157, term3507157.getClass(), "parent", term3507249);
        term3507341 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3507341, term3507341.getClass(), "str", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term3507157;
        args[1] = term3507341;
        try {
            callMethod(klass, "tryFoldStringToUpperCase", argTypes, term3507087, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


