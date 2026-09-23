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

public class ReferenceCollectingCallback_hotSwapScript_316460051705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248981;
     Object term249315;

    public ReferenceCollectingCallback_hotSwapScript_316460051705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248981 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term249061 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term249153 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term249223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term249153, term249153.getClass(), "inLoop", true);
        setField(term249153, term249153.getClass(), "jsRoot", term249223);
        setField(term249153, term249153.getClass(), "currentScope", null);
        setField(term249061, term249061.getClass(), "phaseOptimizer", term249153);
        setField(term248981, term248981.getClass(), "compiler", term249061);
        term249315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term249315, term249315.getClass(), "type", 0);
        setField(term249315, term249315.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term249315;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term248981, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


