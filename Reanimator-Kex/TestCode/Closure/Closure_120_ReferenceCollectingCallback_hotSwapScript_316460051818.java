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

public class ReferenceCollectingCallback_hotSwapScript_316460051818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318662;
     Object term318904;

    public ReferenceCollectingCallback_hotSwapScript_316460051818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318662 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term318742 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term318834 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term318742, term318742.getClass(), "phaseOptimizer", term318834);
        setField(term318662, term318662.getClass(), "compiler", term318742);
        term318904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term319006 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term318904, term318904.getClass(), "type", 132);
        setIntField(term319006, term319006.getClass(), "propType", -54);
        setField(term319006, term319006.getClass(), "next", null);
        setField(term318904, term318904.getClass(), "propListHead", term319006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term318904;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term318662, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


