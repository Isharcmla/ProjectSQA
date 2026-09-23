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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReferenceCollectingCallback_hotSwapScript_316460051856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347945;
     Object term348209;

    public ReferenceCollectingCallback_hotSwapScript_316460051856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347945 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term348025 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term348117 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term348117, term348117.getClass(), "inLoop", true);
        setField(term348025, term348025.getClass(), "phaseOptimizer", term348117);
        setField(term347945, term347945.getClass(), "compiler", term348025);
        term348209 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term348301 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term348209, term348209.getClass(), "type", 0);
        setIntField(term348301, term348301.getClass(), "type", 0);
        setField(term348301, term348301.getClass(), "parent", null);
        setField(term348209, term348209.getClass(), "parent", term348301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term348209;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term347945, args);
    }

};


