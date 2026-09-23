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

public class ReferenceCollectingCallback_hotSwapScript_316460051825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325392;
     Object term325564;

    public ReferenceCollectingCallback_hotSwapScript_316460051825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325392 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term325472 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term325392, term325392.getClass(), "compiler", term325472);
        term325564 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term325656 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term325748 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term325564, term325564.getClass(), "type", 0);
        setIntField(term325656, term325656.getClass(), "type", 0);
        setIntField(term325748, term325748.getClass(), "type", 0);
        setField(term325748, term325748.getClass(), "parent", null);
        setField(term325656, term325656.getClass(), "parent", term325748);
        setField(term325564, term325564.getClass(), "parent", term325656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term325564;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term325392, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


