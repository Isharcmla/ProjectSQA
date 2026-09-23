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

public class ReferenceCollectingCallback_hotSwapScript_316460051399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92722;
     Object term92872;

    public ReferenceCollectingCallback_hotSwapScript_316460051399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92722 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term92802 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term92722, term92722.getClass(), "compiler", term92802);
        term92872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term92872, term92872.getClass(), "type", 0);
        setIntField(term92942, term92942.getClass(), "type", 0);
        setField(term92942, term92942.getClass(), "parent", null);
        setField(term92872, term92872.getClass(), "parent", term92942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term92872;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term92722, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


