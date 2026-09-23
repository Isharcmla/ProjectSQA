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

public class ReferenceCollectingCallback_hotSwapScript_316460051787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297058;
     Object term297128;

    public ReferenceCollectingCallback_hotSwapScript_316460051787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297058 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term297058, term297058.getClass(), "compiler", null);
        term297128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term297128, term297128.getClass(), "type", 0);
        setIntField(term297198, term297198.getClass(), "type", 132);
        setField(term297198, term297198.getClass(), "propListHead", null);
        setField(term297128, term297128.getClass(), "parent", term297198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term297128;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term297058, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


