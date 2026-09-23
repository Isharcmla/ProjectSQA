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

public class ReferenceCollectingCallback_hotSwapScript_316460051863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351634;
     Object term351990;

    public ReferenceCollectingCallback_hotSwapScript_316460051863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351634 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term351714 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term351806 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term351898 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setBooleanField(term351806, term351806.getClass(), "inLoop", true);
        setField(term351806, term351806.getClass(), "jsRoot", term351898);
        setField(term351714, term351714.getClass(), "phaseOptimizer", term351806);
        setField(term351634, term351634.getClass(), "compiler", term351714);
        term351990 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term352082 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term351990, term351990.getClass(), "type", 132);
        setField(term351990, term351990.getClass(), "propListHead", null);
        setIntField(term352082, term352082.getClass(), "type", 105);
        setField(term351990, term351990.getClass(), "parent", term352082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term351990;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term351634, args);
    }

};


